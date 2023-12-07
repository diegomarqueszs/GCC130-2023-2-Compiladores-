package GCCC130;

import GCCC130.src.PATOLexer;
import GCCC130.src.PATOParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.Scanner;

public class AnnalisaSemantic {
    private static Scanner entrada = new Scanner(System.in);

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

    public static void analisadorSintatico(String filename){
        try{
            CharStream input = CharStreams.fromFileName(filename);
            PATOLexer lexer = new PATOLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PATOParser parser = new PATOParser(tokens);

            ParseTree ast = parser.main();

            System.out.println(ast.toStringTree());
            System.out.println("QUEEECK: COMPILADO COM SUCESSO!");
        }catch(IOException e){
            throw new RuntimeException("ERRO SINTÂTICO AO TENTAR COMPILAR!");
        }
    }
    public static void analisadorSemantico(String filename){
        PATOParser parser = getParser(filename);
        ParseTree ast = parser.main();
        System.out.println(ast.toStringTree());
        MyListener listener = new MyListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,ast);
        if ( listener.getError() ){
            throw new RuntimeException("ERRO SEMÂNTICO AO TENTAR COMPILAR!");
        }
        else {
            System.out.println("Tabela: " + listener.getTabelaSimbolos().toString());
            System.out.println("QUEEECK: ANALISADO SEMANTICAMENTE COM SUCESSO!");
        }
    }
    public static void analisadorLexico(String filename){

    }

    public static int menu(){
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("║                MENU PRINCIPAL               ║");
        System.out.println("╠═════════════════════════════════════════════╣");
        System.out.println("║ Pressione '1' para o Analisador Léxico      ║");
        System.out.println("║ Pressione '2' para o Analisador Sintático   ║");
        System.out.println("║ Pressione '3' para o Analisador Semântico   ║");
        System.out.println("║ Pressione '0' para Sair                     ║");
        System.out.println("╚═════════════════════════════════════════════╝");
        System.out.print("Sua resposta: ");
        int opcao = Integer.parseInt(entrada.nextLine());
        return opcao;
    }



    public static void main (String[] args){
        System.out.println("BEM VINDO AO PATO! TUDO AQUI FUNCIONA IGUAL UM PATO, TUDO MAIS OU MENOS!");
        int opcao;
        String filename = "F:\\GCC130-compiladores\\PATO\\test\\variavel_inexistente.txt";
        do{
             opcao = menu();
            switch (opcao) {
                case 1:
                    analisadorLexico(filename);
                    break;
                case 2:
                    analisadorSintatico(filename);
                    break;
                case 3:
                    analisadorSemantico(filename);
                    break;
                case 0:
                    System.out.println("Você está saindo da aplicação...");
                    break;
            }
            if(opcao!=0){
                System.out.println("Aperte qualquer tecla para continuar...");
                Scanner scanner = new Scanner(System.in);
                String buffer = scanner.nextLine();
            }
        }while(opcao!=0);
    }

}
