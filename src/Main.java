import java.io.IOException;

import gen.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream stream = CharStreams.fromFileName("src/test.c");
        CLexer lexer = new CLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        CListener listener = new ProgramPrinter();
//        CListener listener = new ProgramPrinter();

        walker.walk(listener, tree);
    }
}
