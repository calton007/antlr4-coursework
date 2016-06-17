// Generated from C:\Users\Calton\Documents\Antlr Projects\RelationToSQL\RelationToSQL.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RelationToSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RelationToSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#small}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall(@NotNull RelationToSQLParser.SmallContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#big}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBig(@NotNull RelationToSQLParser.BigContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#projectColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectColumns(@NotNull RelationToSQLParser.ProjectColumnsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#jia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJia(@NotNull RelationToSQLParser.JiaContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#bin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin(@NotNull RelationToSQLParser.BinContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#chooseColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChooseColumns(@NotNull RelationToSQLParser.ChooseColumnsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#project}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(@NotNull RelationToSQLParser.ProjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#chooseColumnsAfterAndOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChooseColumnsAfterAndOr(@NotNull RelationToSQLParser.ChooseColumnsAfterAndOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#notEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(@NotNull RelationToSQLParser.NotEqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#choose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose(@NotNull RelationToSQLParser.ChooseContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull RelationToSQLParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(@NotNull RelationToSQLParser.RelationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(@NotNull RelationToSQLParser.EqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#chu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChu(@NotNull RelationToSQLParser.ChuContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#exprSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSub(@NotNull RelationToSQLParser.ExprSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#njo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNjo(@NotNull RelationToSQLParser.NjoContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#projectSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectSub(@NotNull RelationToSQLParser.ProjectSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#loopProjectColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopProjectColumns(@NotNull RelationToSQLParser.LoopProjectColumnsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#loopChooseColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopChooseColumns(@NotNull RelationToSQLParser.LoopChooseColumnsContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#chooseSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChooseSub(@NotNull RelationToSQLParser.ChooseSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link RelationToSQLParser#projectStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectStart(@NotNull RelationToSQLParser.ProjectStartContext ctx);
}