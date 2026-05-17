package calculator;

public class MyCalcVisitor extends CalcBaseVisitor<Double> {
    private final Context context;

    public MyCalcVisitor(Context context) {
        this.context = context;
    }

    @Override
    public Double visitStatement(CalcParser.StatementContext ctx) {
        if (ctx.setStatement() != null) {
            visit(ctx.setStatement());
            return null;
        }
        return visit(ctx.expr());
    }

    @Override
    public Double visitSetStatement(CalcParser.SetStatementContext ctx) {
        visit(ctx.assignments());
        return null;
    }

    @Override
    public Double visitAssignments(CalcParser.AssignmentsContext ctx) {
        for (CalcParser.AssignmentContext assignment : ctx.assignment()) {
            visit(assignment);
        }
        return null;
    }

    @Override
    public Double visitAssignment(CalcParser.AssignmentContext ctx) {
        context.setContext(ctx.id.getText(), visit(ctx.expr()));
        return null;
    }

    @Override
    public Double visitExpr(CalcParser.ExprContext ctx) {
        return visit(ctx.additive());
    }

    @Override
    public Double visitAdditive(CalcParser.AdditiveContext ctx) {
        double result = visit(ctx.multiplicative(0));
        for (int i = 1; i < ctx.multiplicative().size(); i++) {
            String operator = ctx.getChild(2 * i - 1).getText();
            double value = visit(ctx.multiplicative(i));
            if ("+".equals(operator)) {
                result += value;
            } else {
                result -= value;
            }
        }
        return result;
    }

    @Override
    public Double visitMultiplicative(CalcParser.MultiplicativeContext ctx) {
        double result = visit(ctx.unary(0));
        for (int i = 1; i < ctx.unary().size(); i++) {
            String operator = ctx.getChild(2 * i - 1).getText();
            double value = visit(ctx.unary(i));
            if ("*".equals(operator)) {
                result *= value;
            } else {
                if (value == 0.0d) {
                    throw new CalculatorException("division by zero");
                }
                result /= value;
            }
        }
        return result;
    }

    @Override
    public Double visitUnary(CalcParser.UnaryContext ctx) {
        if (ctx.MINUS() != null) {
            return -visit(ctx.unary());
        }
        return visit(ctx.power());
    }

    @Override
    public Double visitPower(CalcParser.PowerContext ctx) {
        if (ctx.unary() == null) {
            return visit(ctx.atom());
        }
        return checkedMath(Math.pow(visit(ctx.atom()), visit(ctx.unary())));
    }

    @Override
    public Double visitAtom(CalcParser.AtomContext ctx) {
        if (ctx.n != null) {
            return visit(ctx.number());
        }
        if (ctx.id != null) {
            return context.getValue(ctx.id.getText());
        }
        if (ctx.expr() != null) {
            return visit(ctx.expr());
        }
        return visit(ctx.func());
    }

    @Override
    public Double visitFunc(CalcParser.FuncContext ctx) {
        double argument = visit(ctx.expr());
        double result;
        switch (ctx.funcname.getType()) {
            case CalcParser.COS:
                result = Math.cos(argument);
                break;
            case CalcParser.TAN:
                result = Math.tan(argument);
                break;
            case CalcParser.SIN:
                result = Math.sin(argument);
                break;
            case CalcParser.ACOS:
                result = Math.acos(argument);
                break;
            case CalcParser.ATAN:
                result = Math.atan(argument);
                break;
            case CalcParser.ASIN:
                result = Math.asin(argument);
                break;
            case CalcParser.LOG:
                result = Math.log10(argument);
                break;
            case CalcParser.LN:
                result = Math.log(argument);
                break;
            default:
                throw new CalculatorException("unknown function");
        }
        return checkedMath(result);
    }

    @Override
    public Double visitNumber(CalcParser.NumberContext ctx) {
        return Double.valueOf(ctx.getText());
    }

    private Double checkedMath(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new CalculatorException("math domain error");
        }
        return value;
    }
}
