import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import PATOParser;
import java.util.HashMap;
import java.util.Map;

public class MyListener extends PATOBaseListener {

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();


//
//    @Override
//    public void enterNDeclaracao(PATOParser.NDeclaracaoContext ctx) {
//        System.out.println("In declaração: "+ctx.getText());
//
//    }
//
//    @Override
//    public void exitNDeclaracao(PATOParser.NDeclaracaoContext ctx) {
//        System.out.println("Out declaração: "+ctx.getText());
//        String tipo = ctx.TIPO().getText();
//        String id = ctx.ID().getText();
//        if (tabelaSimbolos.containsKey(id)){
//            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
//        } else {
//            tabelaSimbolos.put(id,tipo);
//        }
//    }
    @Override
    public void enterNDeclaracao(PATOParser.NDeclaracaoContext ctx) {
        System.out.println("In declaração: "+ctx.getText());

    }

    @Override
    public void exitNDeclaracao(PATOParser.NDeclaracaoContext ctx) {
        System.out.println("Out declaração: "+ctx.getText());
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
        }
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }


}
