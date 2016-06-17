// Generated from C:\Users\Calton\Desktop\编译原理课程设计\计算器\Calc\Calc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#agmt}.
	 * @param ctx the parse tree
	 */
	void enterAgmt(@NotNull CalcParser.AgmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#agmt}.
	 * @param ctx the parse tree
	 */
	void exitAgmt(@NotNull CalcParser.AgmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#agmts}.
	 * @param ctx the parse tree
	 */
	void enterAgmts(@NotNull CalcParser.AgmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#agmts}.
	 * @param ctx the parse tree
	 */
	void exitAgmts(@NotNull CalcParser.AgmtsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull CalcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull CalcParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#getExpr}.
	 * @param ctx the parse tree
	 */
	void enterGetExpr(@NotNull CalcParser.GetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#getExpr}.
	 * @param ctx the parse tree
	 */
	void exitGetExpr(@NotNull CalcParser.GetExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull CalcParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull CalcParser.FuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CalcParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#powExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(@NotNull CalcParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#powExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(@NotNull CalcParser.PowExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull CalcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull CalcParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(@NotNull CalcParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(@NotNull CalcParser.MultExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(@NotNull CalcParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(@NotNull CalcParser.SetExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull CalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull CalcParser.AssignContext ctx);
}