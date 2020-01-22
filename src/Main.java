import lulu2_package.*;

import java.lang.NullPointerException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedTokenStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main extends lulu2_grammerBaseVisitor{
    public static void main(String[] args) throws Exception {
        String st = "declare {\n" +
                "int a;\n" +
                "myType;\n" +
                "(int, float, string,bool[]) = f1(float b);\n" +
                "}\n" +
                "type myType {\n" +
                "protected int x;\n" +
                "public (float y) = function myFun(int z){\n" +
                "if (z > this.x) {\n" +
                "y = 23.5; }\n" +
                "else {\n" +
                "y = 15.2; }\n" +
                "}\n" +
                "}\n" +
                "(int r) = function start() {\n" +
                "const float c = 0.23;\n" +
                "int s;\n" +
                "read();\n" +
                "float w;\n" +
                "(r, w) = f1(s);\n" +
                "}";

        CharStream input = CharStreams.fromString(st);
        lulu2_grammerLexer lexer = new lulu2_grammerLexer(input);
        lexer.setTokenFactory(new CommonTokenFactory(true));
        TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lexer);
        lulu2_grammerParser parser = new lulu2_grammerParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();

        lulu2_grammerListener listener = new lulu2_grammerBaseListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }
}