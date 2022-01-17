package gen;// Generated from /home/adam/Uczelnia/JFTT/L3/Compiler/src/main/language.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageParser}.
 */
public interface languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link languageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(languageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(languageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declare_Start}
	 * labeled alternative in {@link languageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_Start(languageParser.Declare_StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declare_Start}
	 * labeled alternative in {@link languageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_Start(languageParser.Declare_StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nodeclare_Start}
	 * labeled alternative in {@link languageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterNodeclare_Start(languageParser.Nodeclare_StartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nodeclare_Start}
	 * labeled alternative in {@link languageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitNodeclare_Start(languageParser.Nodeclare_StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Put_Table1}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterPut_Table1(languageParser.Put_Table1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Put_Table1}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitPut_Table1(languageParser.Put_Table1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Put_Symbol1}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterPut_Symbol1(languageParser.Put_Symbol1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Put_Symbol1}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitPut_Symbol1(languageParser.Put_Symbol1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Put_Table2}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterPut_Table2(languageParser.Put_Table2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Put_Table2}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitPut_Table2(languageParser.Put_Table2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Put_Symbol2}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterPut_Symbol2(languageParser.Put_Symbol2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Put_Symbol2}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitPut_Symbol2(languageParser.Put_Symbol2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code GetCommand}
	 * labeled alternative in {@link languageParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterGetCommand(languageParser.GetCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetCommand}
	 * labeled alternative in {@link languageParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitGetCommand(languageParser.GetCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetCommands}
	 * labeled alternative in {@link languageParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterGetCommands(languageParser.GetCommandsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetCommands}
	 * labeled alternative in {@link languageParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitGetCommands(languageParser.GetCommandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssign_Statement(languageParser.Assign_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssign_Statement(languageParser.Assign_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIf_Statement(languageParser.If_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIf_Statement(languageParser.If_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfElse_Statement(languageParser.IfElse_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfElse_Statement(languageParser.IfElse_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhile_Statement(languageParser.While_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhile_Statement(languageParser.While_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Repeat_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_Statement(languageParser.Repeat_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Repeat_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_Statement(languageParser.Repeat_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterFor_Statement(languageParser.For_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitFor_Statement(languageParser.For_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Read_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterRead_Statement(languageParser.Read_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Read_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitRead_Statement(languageParser.Read_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Write_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWrite_Statement(languageParser.Write_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Write_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWrite_Statement(languageParser.Write_StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eval_Value}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEval_Value(languageParser.Eval_ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eval_Value}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEval_Value(languageParser.Eval_ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Calculate_Value}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCalculate_Value(languageParser.Calculate_ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calculate_Value}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCalculate_Value(languageParser.Calculate_ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Calculate_Bool}
	 * labeled alternative in {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCalculate_Bool(languageParser.Calculate_BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calculate_Bool}
	 * labeled alternative in {@link languageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCalculate_Bool(languageParser.Calculate_BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get_Number}
	 * labeled alternative in {@link languageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterGet_Number(languageParser.Get_NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get_Number}
	 * labeled alternative in {@link languageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitGet_Number(languageParser.Get_NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get_Identifier}
	 * labeled alternative in {@link languageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterGet_Identifier(languageParser.Get_IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get_Identifier}
	 * labeled alternative in {@link languageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitGet_Identifier(languageParser.Get_IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get_PIDENTIFIER}
	 * labeled alternative in {@link languageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterGet_PIDENTIFIER(languageParser.Get_PIDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get_PIDENTIFIER}
	 * labeled alternative in {@link languageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitGet_PIDENTIFIER(languageParser.Get_PIDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get_ArrayMemberByPID}
	 * labeled alternative in {@link languageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterGet_ArrayMemberByPID(languageParser.Get_ArrayMemberByPIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get_ArrayMemberByPID}
	 * labeled alternative in {@link languageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitGet_ArrayMemberByPID(languageParser.Get_ArrayMemberByPIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get_ArrayMemberByVal}
	 * labeled alternative in {@link languageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterGet_ArrayMemberByVal(languageParser.Get_ArrayMemberByValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get_ArrayMemberByVal}
	 * labeled alternative in {@link languageParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitGet_ArrayMemberByVal(languageParser.Get_ArrayMemberByValContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#possibleWhitespace}.
	 * @param ctx the parse tree
	 */
	void enterPossibleWhitespace(languageParser.PossibleWhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#possibleWhitespace}.
	 * @param ctx the parse tree
	 */
	void exitPossibleWhitespace(languageParser.PossibleWhitespaceContext ctx);
}