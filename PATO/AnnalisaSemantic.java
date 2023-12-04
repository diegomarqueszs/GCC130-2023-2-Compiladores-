package GCCC130;

import GCCC130.src.PATOLexer;
import GCCC130.src.PATOParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

;



public class AnnalisaSemantic {
    public static void main(String[] args){
        //parsing the input
        PATOParser parser = getParser("F:\\GCC130-compiladores\\PATO\\test\\variavel_inexistente.txt");

        //obter arvore sintatica abstrata
        ParseTree ast = parser.main();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolos().toString());
        listener.HasERROR();
    }


    //método para executar o lexer e o parser sobre o arquivo de entrada
    private static PATOParser getParser(String fileName){
        PATOParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            PATOLexer lexer = new PATOLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new PATOParser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }

}
