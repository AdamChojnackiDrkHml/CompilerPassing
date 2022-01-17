package comp;

import gen.languageLexer;
import gen.languageParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Compilationation {

    public void calculate(String input, String output) throws IOException {

        languageLexer lexer = new languageLexer(CharStreams.fromString(input));
        TokenStream tokens = new CommonTokenStream(lexer);

        languageParser parser = new languageParser(tokens);
        LanguageVisitor calculator = new LanguageVisitor();
        ParseTree tree = parser.start();

        VisitorDataTransmiter v = calculator.visit(tree);

        writeCode(output, v.dh, v.codeHandler);
        
        
    }

    void writeCode(String path, DataHandler dh, ArrayList<String> wholeCodeBuilder) throws IOException {
        if(!dh.isErrorFound()) {
            PrintWriter pW = new PrintWriter(path);
            String s = String.join("", wholeCodeBuilder);
            pW.println(s);
            pW.close();
            return;
        }

        System.out.println("Compilation failed with " + dh.getErrorCounter() + " errors");

    }
}
