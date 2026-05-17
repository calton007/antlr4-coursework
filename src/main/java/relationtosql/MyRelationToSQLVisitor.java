package relationtosql;

import java.util.ArrayList;
import java.util.List;

public class MyRelationToSQLVisitor extends RelationToSQLBaseVisitor<String> {
    @Override
    public String visitProg(RelationToSQLParser.ProgContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public String visitExpression(RelationToSQLParser.ExpressionContext ctx) {
        return visit(ctx.setExpression());
    }

    @Override
    public String visitSetExpression(RelationToSQLParser.SetExpressionContext ctx) {
        String sql = visit(ctx.joinExpression(0));
        for (int i = 1; i < ctx.joinExpression().size(); i++) {
            int operatorType = ctx.getChild(2 * i - 1).getPayload() instanceof org.antlr.v4.runtime.Token token
                    ? token.getType()
                    : -1;
            if (operatorType == RelationToSQLParser.CHU) {
                throw new RelationToSqlException("unsupported operation: division");
            }
            String operator = operatorType == RelationToSQLParser.BING ? "UNION" : "INTERSECT";
            sql = "(" + sql + ") " + operator + " (" + visit(ctx.joinExpression(i)) + ")";
        }
        return sql;
    }

    @Override
    public String visitJoinExpression(RelationToSQLParser.JoinExpressionContext ctx) {
        String sql = visit(ctx.unaryExpression(0));
        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            sql = "(" + sql + ") NATURAL JOIN (" + visit(ctx.unaryExpression(i)) + ")";
        }
        return sql;
    }

    @Override
    public String visitUnaryExpression(RelationToSQLParser.UnaryExpressionContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitProject(RelationToSQLParser.ProjectContext ctx) {
        return "SELECT " + visit(ctx.columnList()) + " FROM (" + visit(ctx.expression()) + ")";
    }

    @Override
    public String visitChoose(RelationToSQLParser.ChooseContext ctx) {
        return "SELECT * FROM (" + visit(ctx.expression()) + ") WHERE " + visit(ctx.condition());
    }

    @Override
    public String visitAtom(RelationToSQLParser.AtomContext ctx) {
        if (ctx.ident != null) {
            return ctx.ident.getText();
        }
        return visit(ctx.expression());
    }

    @Override
    public String visitColumnList(RelationToSQLParser.ColumnListContext ctx) {
        List<String> columns = new ArrayList<>();
        for (var token : ctx.IDENT()) {
            columns.add(token.getText());
        }
        return String.join(",", columns);
    }

    @Override
    public String visitCondition(RelationToSQLParser.ConditionContext ctx) {
        StringBuilder condition = new StringBuilder(visit(ctx.predicate(0)));
        for (int i = 1; i < ctx.predicate().size(); i++) {
            int operatorType = ctx.getChild(2 * i - 1).getPayload() instanceof org.antlr.v4.runtime.Token token
                    ? token.getType()
                    : -1;
            condition.append(operatorType == RelationToSQLParser.AND ? " AND " : " OR ");
            condition.append(visit(ctx.predicate(i)));
        }
        return condition.toString();
    }

    @Override
    public String visitPredicate(RelationToSQLParser.PredicateContext ctx) {
        return ctx.ident.getText() + ctx.operator.getText() + ctx.num.getText();
    }
}
