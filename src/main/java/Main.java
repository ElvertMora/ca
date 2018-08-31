import com.approximatecomputing.CBaseVisitor;
import com.approximatecomputing.CLexer;
import com.approximatecomputing.CParser;
import com.approximatecomputing.ForVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;


public class Main {

    public static void main(String [] args) {
        try{
// crear un analizador léxico que se alimenta a partir de la entrada (archivo o consola)
            CLexer lexer;

            //String file = "C:\\Users\\eme-0\\IdeaProjects\\ca\\test.txt";
            String file = "test.txt";
            lexer = new CLexer(new ANTLRFileStream(file));

// Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
// Crear el analizador sintáctico que se alimenta a partir del buffer de tokens
            CParser parser = new CParser(tokens);
            ParseTree tree = parser.translationunit(); // comienza el análisis en la regla inicial
            //System.out.println(tree.toStringTree(parser)); // imprime el árbol de derivación en forma textual
            ForVisitor visitor = new ForVisitor();
            visitor.visit(tree);
            List<CParser.IterationstatementContext> lista = visitor.getPilactx();
            for (CParser.IterationstatementContext ctx:lista) {
               System.out.println(ctx.getText());
            }

;        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}
