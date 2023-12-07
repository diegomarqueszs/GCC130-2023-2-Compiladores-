package GCCC130;

import GCCC130.src.PATOBaseListener;
import GCCC130.src.PATOParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


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

    private Stack<Map<String, String>> tabelaSimbolosStack = new Stack<>();

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolosStack.isEmpty() ? new HashMap<>() : tabelaSimbolosStack.peek();
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


    //Verifica variável duplicada toda vez que entra na regra de declracao
    @Override
    public void exitRegraDeclaracao(PATOParser.RegraDeclaracaoContext ctx) {
        super.exitRegraDeclaracao(ctx);
        //System.out.println("Out declaração: "+ctx.getText());
        String tipo = ctx.Tipo().getText();
        String var = ctx.Var().toString();
        Map<String, String> escopoAtual = tabelaSimbolosStack.peek();
        if (escopoAtual.containsKey(var)){
            hasError = true;
            erros += ("\n└──ERRO 401 - Declaração duplicada! Variável " + var + " já declarada");
        }
        else {
            if(ctx.Atr()!=null){
                if(verificaTipo(ctx.Tipo().getText(), ctx.expressao().getText())){
                    escopoAtual.put(var,tipo);
                }else{
                    hasError = true;
                    erros += ("\n└──ERRO 402 - O VALOR ATRIBUIDO A [ " + var + " ] NÃO É DO TIPO [ " + tipo + " ]" );
                }
            }
            else{
                escopoAtual.put(var,tipo);
            }
        }
    }


    //Verifica variável não declaradas toda vez que sai da regra de atribuição
    @Override
    public void exitRegraAtribuicao(PATOParser.RegraAtribuicaoContext ctx) {
        super.enterRegraAtribuicao(ctx);
        String var = ctx.Var().getText();
        Map<String, String> escopoAtual = tabelaSimbolosStack.peek();
        String tipo = escopoAtual.get(var);
        String valor = ctx.expressao().getText();
        if(var!=null){
            if (!escopoAtual.containsKey(var)){
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

    //Verifica variável não declaradas toda vez que sai da regra de "output"
    @Override
    public void exitRegraOutput(PATOParser.RegraOutputContext ctx) {
        super.exitRegraOutput(ctx);
        String var = ctx.expressao().getText();
        Map<String, String> escopoAtual = tabelaSimbolosStack.peek();
        if(!escopoAtual.containsKey(var)){
            hasError = true;
            erros += ("\n└──ERRO 403 - VARIAVEL [ " + var + " ] NÃO DECLARADA!");
        }
    }

    //Verifica variável não declaradas toda vez que entra na regra de "input"
    @Override
    public void enterRegraInput(PATOParser.RegraInputContext ctx) {
        super.exitRegraInput(ctx);
        List<TerminalNode> varList = ctx.Var().stream().toList();
        for (TerminalNode v : varList) {
            String var = v.getText();
            Map<String, String> escopoAtual = tabelaSimbolosStack.peek();
            if(!escopoAtual.containsKey(var)) {
                hasError = true;
                erros += ("\n└──ERRO 403 - VARIAVEL [ " + var + " ] NÃO DECLARADA!");
            }
        }
    }

    //Verifica variável não declaradas toda vez que sai da regra de fator
    @Override
    public void enterRegraFatorVariavel(PATOParser.RegraFatorVariavelContext ctx) {
        super.enterRegraFatorVariavel(ctx);
        String var = ctx.Var().getText();
        Map<String, String> escopoAtual = tabelaSimbolosStack.peek();
        if(!var.equals("False") && !var.equals("True")){
            if(!escopoAtual.containsKey(var)){
                hasError = true;
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


    @Override
    public void enterNRegraBlocoDeFuncao(PATOParser.NRegraBlocoDeFuncaoContext ctx) {
        super.enterNRegraBlocoDeFuncao(ctx);
        tabelaSimbolosStack.push(new HashMap<>());
    }

    @Override
    public void exitNRegraBlocoDeFuncao(PATOParser.NRegraBlocoDeFuncaoContext ctx) {
        super.exitNRegraBlocoDeFuncao(ctx);
        tabelaSimbolosStack.pop();
    }

    @Override
    public void enterNRegraEscopoDeclaracao(PATOParser.NRegraEscopoDeclaracaoContext ctx) {
        super.enterNRegraEscopoDeclaracao(ctx);
        tabelaSimbolosStack.push(new HashMap<>());
    }

    @Override
    public void exitNRegraEscopoDeclaracao(PATOParser.NRegraEscopoDeclaracaoContext ctx) {
        super.enterNRegraEscopoDeclaracao(ctx);
        tabelaSimbolosStack.pop();
    }



    //VERIFICA SE HÁ ERROS
    private void HasERROR(){
        if(hasError){
            Quack();
            System.out.print("ERROS: ");
            System.out.println(erros);
        }
    }

    public boolean getError(){
        HasERROR();
        return hasError;
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
