public class MyCalcVisitor extends CalcBaseVisitor<Double>{
	@Override
	public Double visitAssign(CalcParser.AssignContext ctx)	{
		return visit(ctx.getChild(0));		
	}
	@Override
	public Double visitSetExpr(CalcParser.SetExprContext ctx)	{
		return visit(ctx.agmts());		
	}
	public Double visitGetExpr(CalcParser.GetExprContext ctx)	{
		return visit(ctx.expr());		
	}
	@Override
	public Double visitAgmts(CalcParser.AgmtsContext ctx)	{
		visit(ctx.agmt());
		if(ctx.agmts()!=null)
			visit(ctx.agmts());
		return null;
		
	}
	@Override
	public Double visitAgmt(CalcParser.AgmtContext ctx)	{
		Context.getInstance().setContext(ctx.id.getText(), visit(ctx.atom()));
        return null;		
	}
	
	@Override
	public Double visitExpr(CalcParser.ExprContext ctx)	{
		Double temp = 0.0;
		int t= ctx.expr().size();
		temp = visit(ctx.multExpr());
		for(int i = 0;i < t;i++)
		{
			if(ctx.getChild(2*i+1).getText().equals("+"))
				temp += visit(ctx.expr(i));
			else if(ctx.getChild(2*i+1).getText().equals("-"))
				temp -= visit(ctx.expr(i));			
		}		
		return temp;		
	}	
	@Override
	public Double visitMultExpr(CalcParser.MultExprContext ctx){
		Double temp = 0.0;
		int t= ctx.powExpr().size();
		temp = visit(ctx.powExpr(0));
		for(int i = 1;i < t;i++)
		{
			if(ctx.getChild(2*i-1).getText().equals("*"))
			{
				temp *= visit(ctx.powExpr(i));
			}
			else if(ctx.getChild(2*i-1).getText().equals("/"))
			{
				temp /= visit(ctx.powExpr(i));	
			}						
		}		
		return temp;			
	}
	@Override
	public Double visitPowExpr(CalcParser.PowExprContext ctx){
		int count = ctx.getChildCount();
		if (count == 1)
			return visit(ctx.getChild(0));
		else
			return Math.pow(visit(ctx.atom()),visit(ctx.expr()));
	}
	@Override
	public Double visitAtom(CalcParser.AtomContext ctx){
		int count = ctx.getChildCount();
		if (count == 3)
			return visit(ctx.expr());
		else{
			if(ctx.n!=null)
			{
				if(ctx.op1!=null)
					return -1 * visit(ctx.number());
				else
					return visit(ctx.number());
			}				
			else if(ctx.id!=null)
			{
				if(ctx.op2!=null)
					return -1 * Context.getInstance().getValue(ctx.getChild(1).getText());
				else
					return Context.getInstance().getValue(ctx.getChild(0).getText());
			} 
			else
				return visit(ctx.func());
		}
	}
	@Override
	public Double visitFunc(CalcParser.FuncContext ctx){
		switch(ctx.funcname.getType()){
			case CalcParser.COS:
				return Math.cos(visit(ctx.expr()));
			case CalcParser.TAN:
				return Math.tan(visit(ctx.expr()));
			case CalcParser.SIN:
				return Math.sin(visit(ctx.expr()));
			case CalcParser.ACOS:
				return Math.acos(visit(ctx.expr()));
			case CalcParser.ATAN:
				return Math.atan(visit(ctx.expr()));
			case CalcParser.ASIN:
				return Math.asin(visit(ctx.expr()));
			case CalcParser.LOG:
				return Math.log10(visit(ctx.expr()));
			case CalcParser.LN:
				return Math.log(visit(ctx.expr()));
			default:
				return null;
		}
	}
	@Override
	public Double visitNumber(CalcParser.NumberContext ctx){
		return Double.valueOf(ctx.getChild(0).getText());
	}

}
