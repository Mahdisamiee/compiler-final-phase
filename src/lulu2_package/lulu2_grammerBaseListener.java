package lulu2_package;// Generated from D:/Intelli j/lulu2_final/src\lulu2_grammer.g4 by ANTLR 4.8

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

import scopes.scopeClass;
import scopes.scopeTree;
import enums.scopeType;
import scopes.symbolTableRow;
//import enums.scopeType;

/**
 * This class provides an empty implementation of {@link lulu2_grammerListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class lulu2_grammerBaseListener implements lulu2_grammerListener {

	private lulu2_grammerParser parser;

	String id;

	scopeTree scopeTree;
	scopeClass global;
	scopeClass currentScope;
	HashMap<String, symbolTableRow> symbolTable;
	int scopeNumber = 1;

	@Override public void enterProgram(lulu2_grammerParser.ProgramContext ctx) { // we dont need to it. cause we never start with this and first scope that we use is declare
		int childNumber = ctx.getChildCount();
		System.out.println("%%%%%%%%%%%%" + childNumber + "%%%%%%%%%%%%%%");
		System.out.println(id);
		global = new scopeClass(null,"#"+ scopeNumber, scopeType.GLOBAL); //make global scope
		currentScope = global;		//set current scope global cause we are in global;
		scopeNumber++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(lulu2_grammerParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFt_dcl(lulu2_grammerParser.Ft_dclContext ctx) {

		currentScope = new scopeClass(this.currentScope,"#" + scopeNumber,scopeType.DECLARE);
		scopeNumber++;

//		currentScope.setChildrens();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFt_dcl(lulu2_grammerParser.Ft_dclContext ctx) {
//		TokenStream ts = parser.getTokenStream();


		ArrayList<scopeClass> chlidrens;
	}
	public void args(lulu2_grammerParser.ArgsContext ttx ) {
		System.out.println(ttx.type().getText()+"$$$");
		if(ttx.getChildCount() > 1) {
			args(ttx.args());
		}
	}
	@Override public void enterFunc_dcl(lulu2_grammerParser.Func_dclContext ctx) {
//		String functionName = ctx.ID().toString();
//		int cnt = 1;
//		functionName += "#" + cnt;
//		lulu2_grammerParser.ArgsContext returnArgsVar = ctx.args(0);
//		ArrayList<lulu2_grammerParser.ArgsContext> returnArgs = new ArrayList<>();
//		while(returnArgsVar != null){
//			returnArgs.add(returnArgsVar);
//			returnArgsVar = returnArgsVar.args();
//		}
		args(ctx.args(0));
//		ctx.args(0);
//		System.out.println(ctx.args(0));

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_dcl(lulu2_grammerParser.Func_dclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgs(lulu2_grammerParser.ArgsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgs(lulu2_grammerParser.ArgsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArgs_var(lulu2_grammerParser.Args_varContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArgs_var(lulu2_grammerParser.Args_varContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType_dcl(lulu2_grammerParser.Type_dclContext ctx) {
//		String id = ctx.ID().getText();
//		System.out.println(id);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType_dcl(lulu2_grammerParser.Type_dclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_def(lulu2_grammerParser.Var_defContext ctx) {
		String type = ctx.type().getText();
		String d = ctx.var_val().get(0).getText();
		System.out.println("((((((((((((((((" + d);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_def(lulu2_grammerParser.Var_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_val(lulu2_grammerParser.Var_valContext ctx) {
		lulu2_grammerParser.ExprContext m = ctx.expr();
		if(m != null){
			System.out.println(ctx.expr().getChild(0).getText());
		}
//		System.out.println("!!!!!!!!!!!!!" + m);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_val(lulu2_grammerParser.Var_valContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFt_def(lulu2_grammerParser.Ft_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFt_def(lulu2_grammerParser.Ft_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType_def(lulu2_grammerParser.Type_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType_def(lulu2_grammerParser.Type_defContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComponent(lulu2_grammerParser.ComponentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComponent(lulu2_grammerParser.ComponentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAccess_modifier(lulu2_grammerParser.Access_modifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAccess_modifier(lulu2_grammerParser.Access_modifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFun_def(lulu2_grammerParser.Fun_defContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFun_def(lulu2_grammerParser.Fun_defContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlock(lulu2_grammerParser.BlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(lulu2_grammerParser.BlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStmt(lulu2_grammerParser.StmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStmt(lulu2_grammerParser.StmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssign(lulu2_grammerParser.AssignContext ctx) {
		String id;
		if(ctx.expr().func_call() != null ){
			id = ctx.var(0).getText();
			System.out.println("&&&&&&&"+ id);
			if(id != null){
//				symbolTableRow str = scopeTree.find(this.currentScope, id); //this section have error =\
//				if(str != null){
//					//we should return error that "this function should be declared first"
//					System.out.println("***** ---->"+ id +"this is not declared");
//				}
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssign(lulu2_grammerParser.AssignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar(lulu2_grammerParser.VarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar(lulu2_grammerParser.VarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRef(lulu2_grammerParser.RefContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRef(lulu2_grammerParser.RefContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(lulu2_grammerParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(lulu2_grammerParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_call(lulu2_grammerParser.Func_callContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_call(lulu2_grammerParser.Func_callContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterList(lulu2_grammerParser.ListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitList(lulu2_grammerParser.ListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterHandle_call(lulu2_grammerParser.Handle_callContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHandle_call(lulu2_grammerParser.Handle_callContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParams(lulu2_grammerParser.ParamsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParams(lulu2_grammerParser.ParamsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCond_stmt(lulu2_grammerParser.Cond_stmtContext ctx) {
//		String child = ctx.getChild(0).getText();
//		if (child == "if") {
//			Object scopeType;
//			scopeClass if1 = new scopeClass(currentScope,"if1",scopeType.FUNCTION);
//			currentScope = if1;
//			if1.getSymbolTable()
//
//		}
//		System.out.println("****************"+child+"**************");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCond_stmt(lulu2_grammerParser.Cond_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSwitch_body(lulu2_grammerParser.Switch_bodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSwitch_body(lulu2_grammerParser.Switch_bodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoop_stmt(lulu2_grammerParser.Loop_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoop_stmt(lulu2_grammerParser.Loop_stmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType(lulu2_grammerParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType(lulu2_grammerParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConst_val(lulu2_grammerParser.Const_valContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConst_val(lulu2_grammerParser.Const_valContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnary_op(lulu2_grammerParser.Unary_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnary_op(lulu2_grammerParser.Unary_opContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOp1(lulu2_grammerParser.Op1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOp1(lulu2_grammerParser.Op1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOp2(lulu2_grammerParser.Op2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOp2(lulu2_grammerParser.Op2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOp3(lulu2_grammerParser.Op3Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOp3(lulu2_grammerParser.Op3Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOp4(lulu2_grammerParser.Op4Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOp4(lulu2_grammerParser.Op4Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBitwise(lulu2_grammerParser.BitwiseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBitwise(lulu2_grammerParser.BitwiseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLogical(lulu2_grammerParser.LogicalContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLogical(lulu2_grammerParser.LogicalContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}