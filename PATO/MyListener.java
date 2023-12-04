package GCCC130;

import GCCC130.src.PATOBaseListener;
import GCCC130.src.PATOParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;


public class MyListener extends PATOBaseListener implements ParseTreeListener {
    private String erros = " ";
    private boolean hasError = false;
    private void Quack(){
        System.out.println("                                                                                                    \n" +
                "      :---:     --.   :-:    .---.      .---.      .---.      .:--:.  --:   --: :--   :-- :-- .--.  \n" +
                "    =@@@#%@@*  .@@*   @@@    %@%@%      %@%@%      @@%@%    :#@@%%@#  @@# :%@%. #@@..#@@- @@@ =@@=  \n" +
                "   -@@#   =@@* .@@*   @@@   +@@.@@*    +@@.@@+    *@@.@@=  .@@%.      @@#+@@+   #@@-@@#.  #@@ -@@-  \n" +
                "   +@@=   :@@# .@@*   @@@  :@@* +@@:  :@@+ +@@.  -@@+ *@@. :@@*       @@@@@@.   #@@@@@=   *@% :@@:  \n" +
                "   :@@%: .*@@+  @@%. :@@%  #@@@@@@@%  %@@@@@@@%  @@@@@@@@#  @@@:  ..  @@%.#@@-  #@@:+@@+  .-:  --   \n" +
                "    :#@@@@@@=   :#@@@@@*. =@@+   =@@++@@+   +@@+*@@=   +@@+ .*@@@@@*  @@#  #@@= #@@. =@@# %@@ =@@-  \n" +
                "       ..*@@+      ...                                         ...                         .   ..   \n" +
                "          :--:                                                                                      \n");
    }

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    @Override
    public void enterNRegraIinicio(PATOParser.NRegraIinicioContext ctx) {
        super.enterNRegraIinicio(ctx);
        //System.out.println("In inicio:" +ctx.getText());
    }

    public void exitNRegraIinicio(PATOParser.NRegraIinicioContext ctx) {
        super.enterNRegraIinicio(ctx);
        //System.out.println("In inicio:" +ctx.getText());
    }


    //Verifica variável duplicada
    @Override
    public void exitRegraDeclaracao(PATOParser.RegraDeclaracaoContext ctx) {
        super.exitRegraDeclaracao(ctx);
        System.out.println("Out declaração: "+ctx.getText());
        String tipo = ctx.Tipo().getText();
        String var = ctx.Var().toString();
        if (tabelaSimbolos.containsKey(var)){
            hasError = true;
            erros += ("\n└──ERRO 401 - Declaração duplicada! Variável " + var + " já declarada");
        }
        else {

            tabelaSimbolos.put(var,tipo);
        }
    }

//    @Override
//    public void exitRegraOutput(PATOParser.RegraOutputContext ctx) {
//        super.exitRegraOutput(ctx);
//        System.out.println("Out declaração: "+ctx.getText());
//        String tipo = ctx.expressao().enterRule(enterRegraTermo());
//        };
//        System.out.println("variavel: " + tipo);
//        if(tabelaSimbolos.containsKey(tipo)){
//            System.out.println("Variavel existe");
//        }else{
//            System.out.println("Variavel não existe");
//        }



//    @Override
//    public void exitRegraFatorVariavel(PATOParser.RegraFatorVariavelContext ctx) {
//        super.enterRegraFatorVariavel(ctx);
//
//        System.out.println("Out declaração: "+ctx.getText());
//        String var = ctx.Var().getText();
//        System.out.println("variavel: " + var);
//        System.out.println(tabelaSimbolos.toString());
//        if (tabelaSimbolos.containsKey(var)){
//            System.out.println("Variavel existe");
//        }else{
//            System.out.println("Variavel não existe");
//        }
//    }


    @Override
    public void exitRegraAtribuicao(PATOParser.RegraAtribuicaoContext ctx) {
        super.enterRegraAtribuicao(ctx);
        String var = ctx.Var().getText();
        if(var!=null){
            hasError = true;
            if (!tabelaSimbolos.containsKey(var)){
                erros += ("\n└──ERRO 403 - VARIAVEL [ " + var + " ] NÃO DECLARADA!");
            }
        }
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        //System.out.println("Entrou na regra:" +parserRuleContext.getText());
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

    //VERIFICA SE HÁ ERROS
    public void HasERROR(){
        if(hasError){
            Quack();
            System.out.println("ERROS: ");
            System.out.println(erros);
        }
    }
}
