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
            if(ctx.Atr()!=null){
                if(verificaTipo(ctx.Tipo().getText(), ctx.expressao().getText())){
                    tabelaSimbolos.put(var,tipo);
                }else{
                    hasError = true;
                    erros += ("\n└──ERRO 402 - O VALOR ATRIBUIDO A [ " + var + " ] NÃO É DO TIPO [ " + tipo + " ]" );
                }
            }
            else{
                tabelaSimbolos.put(var,tipo);
            }
        }
    }



    @Override
    public void exitRegraAtribuicao(PATOParser.RegraAtribuicaoContext ctx) {
        super.enterRegraAtribuicao(ctx);
        String var = ctx.Var().getText();
        String tipo = tabelaSimbolos.get(var);
        String valor = ctx.expressao().getText();
        if(var!=null){
            if (!tabelaSimbolos.containsKey(var)){
                hasError = true;
                erros += ("\n└──ERRO 403 - VARIAVEL [ " + var + " ] NÃO DECLARADA!");
            }
            else{

                if(!verificaTipo(tipo, valor)){
                    hasError = true;
                    erros += ("\n└──ERRO 402 - O VALOR ATRIBUIDO A [ " + var + " ] NÃO É DO TIPO [ " + tipo + " ]" );
                }
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
            System.out.print("ERROS: ");
            System.out.println(erros);
        }
    }

    // Função auxiliar para verificar se uma string representa um número
    private boolean isNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean verificaTipo(String tipo, String valor){
        if(tipo.equals("qint") || tipo.equals("qdouble")){
            return isNumero(valor);
        } else if (tipo.equals("qbool")) {
            return valor.equals("False") || valor.equals("True");
        } else {
            return tipo.equals("qchar");
        }
    }

}
