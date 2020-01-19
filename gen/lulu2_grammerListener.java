// Generated from D:/Intelli j/lulu2_final/src\lulu2_grammer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lulu2_grammerParser}.
 */
public interface lulu2_grammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(lulu2_grammerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(lulu2_grammerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#ft_dcl}.
	 * @param ctx the parse tree
	 */
	void enterFt_dcl(lulu2_grammerParser.Ft_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#ft_dcl}.
	 * @param ctx the parse tree
	 */
	void exitFt_dcl(lulu2_grammerParser.Ft_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#func_dcl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_dcl(lulu2_grammerParser.Func_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#func_dcl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_dcl(lulu2_grammerParser.Func_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(lulu2_grammerParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(lulu2_grammerParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#args_var}.
	 * @param ctx the parse tree
	 */
	void enterArgs_var(lulu2_grammerParser.Args_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#args_var}.
	 * @param ctx the parse tree
	 */
	void exitArgs_var(lulu2_grammerParser.Args_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#type_dcl}.
	 * @param ctx the parse tree
	 */
	void enterType_dcl(lulu2_grammerParser.Type_dclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#type_dcl}.
	 * @param ctx the parse tree
	 */
	void exitType_dcl(lulu2_grammerParser.Type_dclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(lulu2_grammerParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(lulu2_grammerParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#var_val}.
	 * @param ctx the parse tree
	 */
	void enterVar_val(lulu2_grammerParser.Var_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#var_val}.
	 * @param ctx the parse tree
	 */
	void exitVar_val(lulu2_grammerParser.Var_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#ft_def}.
	 * @param ctx the parse tree
	 */
	void enterFt_def(lulu2_grammerParser.Ft_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#ft_def}.
	 * @param ctx the parse tree
	 */
	void exitFt_def(lulu2_grammerParser.Ft_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterType_def(lulu2_grammerParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitType_def(lulu2_grammerParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(lulu2_grammerParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(lulu2_grammerParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(lulu2_grammerParser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(lulu2_grammerParser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void enterFun_def(lulu2_grammerParser.Fun_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#fun_def}.
	 * @param ctx the parse tree
	 */
	void exitFun_def(lulu2_grammerParser.Fun_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(lulu2_grammerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(lulu2_grammerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(lulu2_grammerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(lulu2_grammerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(lulu2_grammerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(lulu2_grammerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(lulu2_grammerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(lulu2_grammerParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(lulu2_grammerParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(lulu2_grammerParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(lulu2_grammerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(lulu2_grammerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(lulu2_grammerParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(lulu2_grammerParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(lulu2_grammerParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(lulu2_grammerParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#handle_call}.
	 * @param ctx the parse tree
	 */
	void enterHandle_call(lulu2_grammerParser.Handle_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#handle_call}.
	 * @param ctx the parse tree
	 */
	void exitHandle_call(lulu2_grammerParser.Handle_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(lulu2_grammerParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(lulu2_grammerParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCond_stmt(lulu2_grammerParser.Cond_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCond_stmt(lulu2_grammerParser.Cond_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(lulu2_grammerParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(lulu2_grammerParser.Switch_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(lulu2_grammerParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(lulu2_grammerParser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(lulu2_grammerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(lulu2_grammerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#const_val}.
	 * @param ctx the parse tree
	 */
	void enterConst_val(lulu2_grammerParser.Const_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#const_val}.
	 * @param ctx the parse tree
	 */
	void exitConst_val(lulu2_grammerParser.Const_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(lulu2_grammerParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(lulu2_grammerParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(lulu2_grammerParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(lulu2_grammerParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(lulu2_grammerParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(lulu2_grammerParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(lulu2_grammerParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(lulu2_grammerParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#op4}.
	 * @param ctx the parse tree
	 */
	void enterOp4(lulu2_grammerParser.Op4Context ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#op4}.
	 * @param ctx the parse tree
	 */
	void exitOp4(lulu2_grammerParser.Op4Context ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(lulu2_grammerParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(lulu2_grammerParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link lulu2_grammerParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(lulu2_grammerParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lulu2_grammerParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(lulu2_grammerParser.LogicalContext ctx);
}