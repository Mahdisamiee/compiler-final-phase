package lulu2_package;// Generated from D:/Intelli j/lulu2_final/src\lulu2_grammer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lulu2_grammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lulu2_grammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(lulu2_grammerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#ft_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFt_dcl(lulu2_grammerParser.Ft_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#func_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_dcl(lulu2_grammerParser.Func_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(lulu2_grammerParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#args_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_var(lulu2_grammerParser.Args_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#type_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_dcl(lulu2_grammerParser.Type_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(lulu2_grammerParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#var_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_val(lulu2_grammerParser.Var_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#ft_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFt_def(lulu2_grammerParser.Ft_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_def(lulu2_grammerParser.Type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(lulu2_grammerParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifier(lulu2_grammerParser.Access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#fun_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_def(lulu2_grammerParser.Fun_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(lulu2_grammerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(lulu2_grammerParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(lulu2_grammerParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(lulu2_grammerParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(lulu2_grammerParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(lulu2_grammerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(lulu2_grammerParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(lulu2_grammerParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#handle_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandle_call(lulu2_grammerParser.Handle_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(lulu2_grammerParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#cond_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_stmt(lulu2_grammerParser.Cond_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#switch_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_body(lulu2_grammerParser.Switch_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(lulu2_grammerParser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(lulu2_grammerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#const_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_val(lulu2_grammerParser.Const_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(lulu2_grammerParser.Unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(lulu2_grammerParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(lulu2_grammerParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(lulu2_grammerParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp4(lulu2_grammerParser.Op4Context ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwise(lulu2_grammerParser.BitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link lulu2_grammerParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(lulu2_grammerParser.LogicalContext ctx);
}