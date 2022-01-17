package comp;

import gen.languageBaseVisitor;
import gen.languageParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class LanguageVisitor extends languageBaseVisitor<VisitorDataTransmiter>
{
    DataHandler dataHandler = new DataHandler();
    CodeGenerator cg = new CodeGenerator(dataHandler);

    String lastPID = "";
    @Override public VisitorDataTransmiter visitDeclare_Start(languageParser.Declare_StartContext ctx)
    {
        this.visit(ctx.declarations());
        VisitorDataTransmiter var = this.visit(ctx.commands());
        cg.wholeCodeBuilder.addAll(var.codeHandler);
        cg.writeEnd();
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        ret.codeHandler = cg.wholeCodeBuilder;
        ret.dh = dataHandler;
        return ret;
    }

    @Override public VisitorDataTransmiter visitNodeclare_Start(languageParser.Nodeclare_StartContext ctx)
    {
        VisitorDataTransmiter var = this.visit(ctx.commands());
        cg.wholeCodeBuilder.addAll(var.codeHandler);
        cg.writeEnd();
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        ret.codeHandler = cg.wholeCodeBuilder;
        ret.dh = dataHandler;
        return ret;
    }

    @Override
    public VisitorDataTransmiter visitPut_Table1(languageParser.Put_Table1Context ctx)
    {
        dataHandler.setLocation(ctx.PIDENTIFIER().getSymbol().getLine(), ctx.PIDENTIFIER().getSymbol().getCharPositionInLine());
        dataHandler.addArray(ctx.PIDENTIFIER().getText(), Integer.parseInt(ctx.left.getText()), Integer.parseInt(ctx.right.getText()));
        this.visit(ctx.declarations());
        return null;
    }

    @Override
    public VisitorDataTransmiter visitPut_Symbol1(languageParser.Put_Symbol1Context ctx)
    {
        dataHandler.setLocation(ctx.PIDENTIFIER().getSymbol().getLine(), ctx.PIDENTIFIER().getSymbol().getCharPositionInLine());
        dataHandler.addSymbol(ctx.PIDENTIFIER().getText());
        this.visit(ctx.declarations());
        return null;
    }

    @Override
    public VisitorDataTransmiter visitPut_Table2(languageParser.Put_Table2Context ctx)
    {
        dataHandler.setLocation(ctx.PIDENTIFIER().getSymbol().getLine(), ctx.PIDENTIFIER().getSymbol().getCharPositionInLine());
        dataHandler.addArray(ctx.PIDENTIFIER().getText(), Integer.parseInt(ctx.left.getText()), Integer.parseInt(ctx.right.getText()));
        return null;
    }

    @Override public VisitorDataTransmiter visitPut_Symbol2(languageParser.Put_Symbol2Context ctx)
    {
        dataHandler.setLocation(ctx.PIDENTIFIER().getSymbol().getLine(), ctx.PIDENTIFIER().getSymbol().getCharPositionInLine());
        dataHandler.addSymbol(ctx.PIDENTIFIER().getText());
        return null;
    }

    @Override
    public VisitorDataTransmiter visitGetCommands(languageParser.GetCommandsContext ctx)
    {
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        VisitorDataTransmiter vRec = this.visit(ctx.commands());
        VisitorDataTransmiter vTer = this.visit(ctx.command());
        ret.codeHandler.addAll(vRec.codeHandler);
        ret.codeHandler.addAll(vTer.codeHandler);

        return ret;
    }

    @Override
    public VisitorDataTransmiter visitGetCommand(languageParser.GetCommandContext ctx)
    {
        return this.visit(ctx.command());
    }

    @Override public VisitorDataTransmiter visitAssign_Statement(languageParser.Assign_StatementContext ctx)
    {

        VisitorDataTransmiter ex = this.visit(ctx.identifier());
        ex.variable = dataHandler.initVariable(ex.variable, lastPID);
        VisitorDataTransmiter v2 = this.visit(ctx.expression());
        ex.codeHandler.addAll(v2.codeHandler);
        ex.offset += cg.assign(ex.variable, ex.codeHandler);
        return (ex);
    }

    @Override
    public VisitorDataTransmiter visitIf_Statement(languageParser.If_StatementContext ctx)
    {

        VisitorDataTransmiter ex = this.visit(ctx.commands());
        VisitorDataTransmiter cond = this.visit(ctx.condition());
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        ret.offset += cg.if_block(ex.codeHandler.size(), cond.codeHandler);
        ret.codeHandler.addAll(cond.codeHandler);
        ret.codeHandler.addAll(ex.codeHandler);
        return ret;
    }

    @Override
    public VisitorDataTransmiter visitIfElse_Statement(languageParser.IfElse_StatementContext ctx)
    {
        VisitorDataTransmiter ifblock = this.visit(ctx.ifblock);
        VisitorDataTransmiter elseblock = this.visit(ctx.elseblock);
        VisitorDataTransmiter cond = this.visit(ctx.condition());

        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        cg.if_else_block_first(ifblock.codeHandler.size(), cond.codeHandler);
        cg.if_else_block_second(elseblock.codeHandler.size(), ifblock.codeHandler);
        ret.codeHandler.addAll(cond.codeHandler);
        ret.codeHandler.addAll(ifblock.codeHandler);
        ret.codeHandler.addAll(elseblock.codeHandler);
        return ret;
    }

    @Override
    public VisitorDataTransmiter visitWhile_Statement(languageParser.While_StatementContext ctx)
    {
        VisitorDataTransmiter ex = this.visit(ctx.commands());
        VisitorDataTransmiter cond = this.visit(ctx.condition());
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        cg.while_block_first(ex.codeHandler.size(), cond.codeHandler);
        cg.while_block_second(ex.codeHandler.size(), cond.codeHandler.size(), ex.codeHandler);
        ret.codeHandler.addAll(cond.codeHandler);
        ret.codeHandler.addAll(ex.codeHandler);
        return ret;
    }

    @Override
    public VisitorDataTransmiter visitRepeat_Statement(languageParser.Repeat_StatementContext ctx)
    {
        VisitorDataTransmiter ex = this.visit(ctx.commands());
        VisitorDataTransmiter cond = this.visit(ctx.condition());
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        cg.repeat_block(ex.codeHandler.size(), cond.codeHandler.size(), cond.codeHandler);
        ret.codeHandler.addAll(ex.codeHandler);
        ret.codeHandler.addAll(cond.codeHandler);
        return ret;
    }

    @Override
    public VisitorDataTransmiter visitFor_Statement(languageParser.For_StatementContext ctx)
    {
        dataHandler.addIterator(ctx.PIDENTIFIER().getText());
        VisitorDataTransmiter var1 = this.visit(ctx.v1);
        VisitorDataTransmiter var2 = this.visit(ctx.v2);
        VisitorDataTransmiter com = this.visit(ctx.commands());
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        ArrayList<String> tempHolder = new ArrayList<>();
        ForLabel label = dataHandler.createForLabel(ctx.PIDENTIFIER().getText(), var1.variable, var2.variable);
        cg.for_block_init(label, ret.codeHandler);

        switch (ctx.direction.getText()) {
            case "TO" -> {
                cg.for_to_block_first(label, tempHolder);
                cg.for_to_block_second(label, com.codeHandler, tempHolder.size());
            }
            case "DOWNTO" -> {
                cg.for_downto_block_first(label, tempHolder);
                cg.for_downto_block_second(label, com.codeHandler, tempHolder.size());
            }
        }

        cg.for_block_addJump(com.codeHandler.size(), tempHolder);
        ret.codeHandler.addAll(tempHolder);
        ret.codeHandler.addAll(com.codeHandler);
        return ret;
    }

    @Override
    public VisitorDataTransmiter visitRead_Statement(languageParser.Read_StatementContext ctx)
    {
        VisitorDataTransmiter var = this.visit(ctx.identifier());
        cg.read(var.variable, var.codeHandler);
        return var;
    }

    @Override
    public VisitorDataTransmiter visitWrite_Statement(languageParser.Write_StatementContext ctx)
    {
        VisitorDataTransmiter var = this.visit(ctx.value());
        cg.write(var.variable, var.codeHandler);
        return var;
    }




    @Override
    public VisitorDataTransmiter visitEval_Value(languageParser.Eval_ValueContext ctx)
    {
        VisitorDataTransmiter var1 = this.visit(ctx.value());
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        if(var1 != null) {
            ret.codeHandler.addAll(var1.codeHandler);
            cg.getConstant(this.visit(ctx.value()).variable, ret.codeHandler);
        }
        return ret;
    }

    @Override
    public VisitorDataTransmiter visitCalculate_Value(languageParser.Calculate_ValueContext ctx)
    {
        VisitorDataTransmiter var1 = this.visit(ctx.left);
        VisitorDataTransmiter var2 = this.visit(ctx.right);
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        ret.codeHandler.addAll(var1.codeHandler);
        ret.codeHandler.addAll(var2.codeHandler);
        switch (ctx.operator.getText()) {
            case "PLUS" -> cg.add(var1.variable ,var2.variable, ret.codeHandler);
            case "MINUS" ->  cg.sub(var1.variable ,var2.variable, ret.codeHandler);
            case "TIMES" -> cg.mul(var1.variable ,var2.variable, ret.codeHandler);
            case "DIV" -> cg.div(var1.variable ,var2.variable, ret.codeHandler);
            case "MOD" -> cg.mod(var1.variable ,var2.variable, ret.codeHandler);
        }
        return ret;
    }

    @Override
    public VisitorDataTransmiter visitCalculate_Bool(languageParser.Calculate_BoolContext ctx)
    {
        VisitorDataTransmiter var1 = this.visit(ctx.left);
        VisitorDataTransmiter var2 = this.visit(ctx.right);
        VisitorDataTransmiter ret = new VisitorDataTransmiter();
        ret.codeHandler.addAll(var1.codeHandler);
        ret.codeHandler.addAll(var2.codeHandler);
        switch (ctx.oparator.getText()) {
            case "EQ" -> cg.eq(var1.variable ,var2.variable, ret.codeHandler);
            case "NEQ" -> cg.neq(var1.variable ,var2.variable, ret.codeHandler);
            case "LEQ" -> cg.leq(var1.variable ,var2.variable, ret.codeHandler);
            case "GEQ" -> cg.geq(var1.variable ,var2.variable, ret.codeHandler);
            case "LE" -> cg.le(var1.variable ,var2.variable, ret.codeHandler);
            case "GE" -> cg.ge(var1.variable ,var2.variable, ret.codeHandler);
        }
        return ret;
    }

    @Override
    public VisitorDataTransmiter visitGet_Number(languageParser.Get_NumberContext ctx)
    {
        return new VisitorDataTransmiter(dataHandler.getValue(Integer.parseInt(ctx.NUM().getText())));
    }

    @Override
    public VisitorDataTransmiter visitGet_Identifier(languageParser.Get_IdentifierContext ctx)
    {
        this.visit(ctx.identifier());
        if(dataHandler.checkVariable(lastPID))
        {
            return this.visit(ctx.identifier());
        }

        return null;
    }

    @Override
    public VisitorDataTransmiter visitGet_PIDENTIFIER(languageParser.Get_PIDENTIFIERContext ctx)
    {
        dataHandler.setLocation(ctx.PIDENTIFIER().getSymbol().getLine(), ctx.PIDENTIFIER().getSymbol().getCharPositionInLine());
        lastPID = ctx.PIDENTIFIER().getText();
        return new VisitorDataTransmiter(dataHandler.getVariable(ctx.PIDENTIFIER().getText()));
    }

    @Override
    public VisitorDataTransmiter visitGet_ArrayMemberByPID(languageParser.Get_ArrayMemberByPIDContext ctx)
    {
        List<TerminalNode> pidList = ctx.PIDENTIFIER();
        dataHandler.setLocation(pidList.get(0).getSymbol().getLine(), pidList.get(0).getSymbol().getCharPositionInLine());
        lastPID = pidList.get(1).getText();
        return new VisitorDataTransmiter(dataHandler.getArrValVar(pidList.get(0).getText(), pidList.get(1).getText()));
    }

    @Override
    public VisitorDataTransmiter visitGet_ArrayMemberByVal(languageParser.Get_ArrayMemberByValContext ctx)
    {
        dataHandler.setLocation(ctx.PIDENTIFIER().getSymbol().getLine(), ctx.PIDENTIFIER().getSymbol().getCharPositionInLine());
        lastPID = ctx.PIDENTIFIER().getText();
        return new VisitorDataTransmiter(dataHandler.getArrValNum(ctx.PIDENTIFIER().getText(), Integer.parseInt(ctx.NUM().getText())));
    }

}
