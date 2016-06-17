public class MyRelationToSQLVisitor extends RelationToSQLBaseVisitor<Object>
{
	@Override
	public Object visitProg(RelationToSQLParser.ProgContext rtx)
	{
		int t = rtx.choose().size() + rtx.project().size();
		for(int i = 0;i < t;i++)
			visit(rtx.getChild(i*2));
		System.out.print("\n;");	
		return null;
	}
	@Override
	public Object visitProjectStart(RelationToSQLParser.ProjectStartContext rtx)
	{
		int t = rtx.projectSub().size() + rtx.chooseSub().size();
		for(int i = 0; i < t ;i++)
		{
			visit(rtx.getChild(1+i));
		}	
		System.out.print("\nFrom " + rtx.ident.getText());		
		return null;		
	}
	@Override
	public Object visitProject(RelationToSQLParser.ProjectContext rtx)
	{
		visit(rtx.getChild(1));
		for(int i = 0; i < rtx.loopProjectColumns().size(); i++)
			visit(rtx.loopProjectColumns(i));
		visit(rtx.projectStart());
		for(int i = 0; i < rtx.relation().size() ; i++)
		{
			visit(rtx.relation(i));
			visit(rtx.exprSub(i));
		}		
		return null;
	}
	@Override
	public Object visitChoose(RelationToSQLParser.ChooseContext rtx)
	{
		visit(rtx.chooseColumns());
		visit(rtx.getChild(2));	
		for(int i = 0; i < rtx.loopChooseColumns().size(); i++)
		{
				visit(rtx.loopChooseColumns(i));
				visit(rtx.chooseColumnsAfterAndOr(i));
				visit(rtx.getChild(5+i*3));
		}
		for(int i = 0; i < rtx.relation().size(); i++)
		{
			visit(rtx.relation(i));
			visit(rtx.exprSub(i));
		}		
		return null;
	}
	@Override
	public Object visitProjectColumns(RelationToSQLParser.ProjectColumnsContext rtx)
	{
		System.out.print("\nSELECT "+rtx.ident.getText());
		return null;
	}
	@Override
	public Object visitChooseColumns(RelationToSQLParser.ChooseColumnsContext rtx)
	{
		System.out.print("\nWHERE "+rtx.ident.getText());
		return null;
	}
	@Override
	public Object visitLoopProjectColumns(RelationToSQLParser.LoopProjectColumnsContext rtx)
	{
		System.out.print(rtx.dou.getText() + rtx.ident.getText());
		return null;
	}
	@Override
	public Object visitRelation(RelationToSQLParser.RelationContext rtx)
	{
		visit(rtx.getChild(0));
		return null;
	}
	@Override
	public Object visitBin(RelationToSQLParser.BinContext rtx)
	{
		System.out.print("\nUNION");
		return null;
	}
	@Override
	public Object visitJia(RelationToSQLParser.JiaContext rtx)
	{
		System.out.print("\nINTERSECTION");
		return null;
	}
	@Override
	public Object visitNjo(RelationToSQLParser.NjoContext rtx)
	{
		System.out.print("\nNJOIN");
		return null;
	}
	@Override
	public Object visitChu(RelationToSQLParser.ChuContext rtx)
	{
		System.out.print("\nCHU");
		return null;
	}
	@Override
	public Object visitExprSub(RelationToSQLParser.ExprSubContext rtx)
	{
		visit(rtx.getChild(0));
		return null;
	}
	@Override
	public Object visitLoopChooseColumns(RelationToSQLParser.LoopChooseColumnsContext rtx)
	{
		if(rtx.t!=null)
		{
			switch(rtx.t.getType()){
			case RelationToSQLParser.AND:
				System.out.print(" AND ");break;
			case RelationToSQLParser.OR:
				System.out.print(" OR ");			
			}
		}
		return null;
	}
	@Override
	public Object visitChooseColumnsAfterAndOr(RelationToSQLParser.ChooseColumnsAfterAndOrContext rtx)
	{
		System.out.print(rtx.ident.getText());
		return null;
	}
	@Override
	public Object visitProjectSub(RelationToSQLParser.ProjectSubContext rtx)
	{
		visit(rtx.projectColumns());
		int t = rtx.projectSub().size() + rtx.chooseSub().size();
		for(int i = 0; i < t; i++)
		{
			visit(rtx.getChild(3 + i));
		}
		System.out.print("\nFROM "+rtx.ident.getText());
		return null;
	}
	@Override
	public Object visitChooseSub(RelationToSQLParser.ChooseSubContext rtx)
	{
		visit(rtx.chooseColumns());
		visit(rtx.getChild(2));
		for(int i = 0; i < rtx.loopChooseColumns().size(); i++)
		{
			visit(rtx.loopChooseColumns(i));
			visit(rtx.chooseColumnsAfterAndOr(i));
			visit(rtx.getChild(5+i*3));			
		}
		return null;
	}
	@Override
	public Object visitEqual(RelationToSQLParser.EqualContext rtx)
	{
		System.out.print(rtx.equ.getText() + rtx.num.getText());
		return null;
	}
	@Override
	public Object visitNotEqual(RelationToSQLParser.NotEqualContext rtx)
	{
		System.out.print(rtx.nequ.getText() + rtx.num.getText());
		return null;
	}
	@Override
	public Object visitSmall(RelationToSQLParser.SmallContext rtx)
	{
		System.out.print(rtx.less.getText() + rtx.num.getText());
		return null;
	}
	@Override
	public Object visitBig(RelationToSQLParser.BigContext rtx)
	{
		System.out.print(rtx.more.getText() + rtx.num.getText());
		return null;
	}
	
}
