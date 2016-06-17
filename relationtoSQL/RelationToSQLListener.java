// Generated from C:\Users\Calton\Documents\Antlr Projects\RelationToSQL\RelationToSQL.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RelationToSQLParser}.
 */
public interface RelationToSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#small}.
	 * @param ctx the parse tree
	 */
	void enterSmall(@NotNull RelationToSQLParser.SmallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#small}.
	 * @param ctx the parse tree
	 */
	void exitSmall(@NotNull RelationToSQLParser.SmallContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#big}.
	 * @param ctx the parse tree
	 */
	void enterBig(@NotNull RelationToSQLParser.BigContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#big}.
	 * @param ctx the parse tree
	 */
	void exitBig(@NotNull RelationToSQLParser.BigContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#projectColumns}.
	 * @param ctx the parse tree
	 */
	void enterProjectColumns(@NotNull RelationToSQLParser.ProjectColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#projectColumns}.
	 * @param ctx the parse tree
	 */
	void exitProjectColumns(@NotNull RelationToSQLParser.ProjectColumnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#jia}.
	 * @param ctx the parse tree
	 */
	void enterJia(@NotNull RelationToSQLParser.JiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#jia}.
	 * @param ctx the parse tree
	 */
	void exitJia(@NotNull RelationToSQLParser.JiaContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#bin}.
	 * @param ctx the parse tree
	 */
	void enterBin(@NotNull RelationToSQLParser.BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#bin}.
	 * @param ctx the parse tree
	 */
	void exitBin(@NotNull RelationToSQLParser.BinContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#chooseColumns}.
	 * @param ctx the parse tree
	 */
	void enterChooseColumns(@NotNull RelationToSQLParser.ChooseColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#chooseColumns}.
	 * @param ctx the parse tree
	 */
	void exitChooseColumns(@NotNull RelationToSQLParser.ChooseColumnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(@NotNull RelationToSQLParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(@NotNull RelationToSQLParser.ProjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#chooseColumnsAfterAndOr}.
	 * @param ctx the parse tree
	 */
	void enterChooseColumnsAfterAndOr(@NotNull RelationToSQLParser.ChooseColumnsAfterAndOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#chooseColumnsAfterAndOr}.
	 * @param ctx the parse tree
	 */
	void exitChooseColumnsAfterAndOr(@NotNull RelationToSQLParser.ChooseColumnsAfterAndOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#notEqual}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(@NotNull RelationToSQLParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#notEqual}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(@NotNull RelationToSQLParser.NotEqualContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#choose}.
	 * @param ctx the parse tree
	 */
	void enterChoose(@NotNull RelationToSQLParser.ChooseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#choose}.
	 * @param ctx the parse tree
	 */
	void exitChoose(@NotNull RelationToSQLParser.ChooseContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull RelationToSQLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull RelationToSQLParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull RelationToSQLParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull RelationToSQLParser.RelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(@NotNull RelationToSQLParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(@NotNull RelationToSQLParser.EqualContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#chu}.
	 * @param ctx the parse tree
	 */
	void enterChu(@NotNull RelationToSQLParser.ChuContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#chu}.
	 * @param ctx the parse tree
	 */
	void exitChu(@NotNull RelationToSQLParser.ChuContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#exprSub}.
	 * @param ctx the parse tree
	 */
	void enterExprSub(@NotNull RelationToSQLParser.ExprSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#exprSub}.
	 * @param ctx the parse tree
	 */
	void exitExprSub(@NotNull RelationToSQLParser.ExprSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#njo}.
	 * @param ctx the parse tree
	 */
	void enterNjo(@NotNull RelationToSQLParser.NjoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#njo}.
	 * @param ctx the parse tree
	 */
	void exitNjo(@NotNull RelationToSQLParser.NjoContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#projectSub}.
	 * @param ctx the parse tree
	 */
	void enterProjectSub(@NotNull RelationToSQLParser.ProjectSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#projectSub}.
	 * @param ctx the parse tree
	 */
	void exitProjectSub(@NotNull RelationToSQLParser.ProjectSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#loopProjectColumns}.
	 * @param ctx the parse tree
	 */
	void enterLoopProjectColumns(@NotNull RelationToSQLParser.LoopProjectColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#loopProjectColumns}.
	 * @param ctx the parse tree
	 */
	void exitLoopProjectColumns(@NotNull RelationToSQLParser.LoopProjectColumnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#loopChooseColumns}.
	 * @param ctx the parse tree
	 */
	void enterLoopChooseColumns(@NotNull RelationToSQLParser.LoopChooseColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#loopChooseColumns}.
	 * @param ctx the parse tree
	 */
	void exitLoopChooseColumns(@NotNull RelationToSQLParser.LoopChooseColumnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#chooseSub}.
	 * @param ctx the parse tree
	 */
	void enterChooseSub(@NotNull RelationToSQLParser.ChooseSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#chooseSub}.
	 * @param ctx the parse tree
	 */
	void exitChooseSub(@NotNull RelationToSQLParser.ChooseSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link RelationToSQLParser#projectStart}.
	 * @param ctx the parse tree
	 */
	void enterProjectStart(@NotNull RelationToSQLParser.ProjectStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationToSQLParser#projectStart}.
	 * @param ctx the parse tree
	 */
	void exitProjectStart(@NotNull RelationToSQLParser.ProjectStartContext ctx);
}