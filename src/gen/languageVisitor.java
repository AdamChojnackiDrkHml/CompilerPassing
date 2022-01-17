package gen;// Generated from /home/adam/Uczelnia/JFTT/L3/Compiler/src/main/language.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link languageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface languageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link languageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(languageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declare_Start}
	 * labeled alternative in {@link languageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_Start(languageParser.Declare_StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nodeclare_Start}
	 * labeled alternative in {@link languageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeclare_Start(languageParser.Nodeclare_StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Put_Table1}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_Table1(languageParser.Put_Table1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Put_Symbol1}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_Symbol1(languageParser.Put_Symbol1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Put_Table2}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_Table2(languageParser.Put_Table2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Put_Symbol2}
	 * labeled alternative in {@link languageParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_Symbol2(languageParser.Put_Symbol2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code GetCommand}
	 * labeled alternative in {@link languageParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetCommand(languageParser.GetCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetCommands}
	 * labeled alternative in {@link languageParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetCommands(languageParser.GetCommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_Statement(languageParser.Assign_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_Statement(languageParser.If_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElse_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse_Statement(languageParser.IfElse_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_Statement(languageParser.While_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Repeat_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_Statement(languageParser.Repeat_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_Statement(languageParser.For_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Read_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_Statement(languageParser.Read_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Write_Statement}
	 * labeled alternative in {@link languageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_Statement(languageParser.Write_StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eval_Value}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_Value(languageParser.Eval_ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Calculate_Value}
	 * labeled alternative in {@link languageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate_Value(languageParser.Calculate_ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Calculate_Bool}
	 * labeled alternative in {@link languageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate_Bool(languageParser.Calculate_BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get_Number}
	 * labeled alternative in {@link languageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_Number(languageParser.Get_NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get_Identifier}
	 * labeled alternative in {@link languageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_Identifier(languageParser.Get_IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get_PIDENTIFIER}
	 * labeled alternative in {@link languageParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_PIDENTIFIER(languageParser.Get_PIDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get_ArrayMemberByPID}
	 * labeled alternative in {@link languageParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_ArrayMemberByPID(languageParser.Get_ArrayMemberByPIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get_ArrayMemberByVal}
	 * labeled alternative in {@link languageParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_ArrayMemberByVal(languageParser.Get_ArrayMemberByValContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#possibleWhitespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleWhitespace(languageParser.PossibleWhitespaceContext ctx);
}