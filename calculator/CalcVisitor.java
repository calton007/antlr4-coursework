// Generated from C:\Users\Calton\Desktop\编译原理课程设计\计算器\Calc\Calc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#agmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgmt(@NotNull CalcParser.AgmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#agmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgmts(@NotNull CalcParser.AgmtsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull CalcParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#getExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetExpr(@NotNull CalcParser.GetExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull CalcParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull CalcParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#powExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(@NotNull CalcParser.PowExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull CalcParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(@NotNull CalcParser.MultExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(@NotNull CalcParser.SetExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull CalcParser.AssignContext ctx);
}