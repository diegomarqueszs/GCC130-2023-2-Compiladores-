// Generated from PATO.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PATOParser}.
 */
public interface PATOListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PATOParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(PATOParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(PATOParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#blocoFunc}.
	 * @param ctx the parse tree
	 */
	void enterBlocoFunc(PATOParser.BlocoFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#blocoFunc}.
	 * @param ctx the parse tree
	 */
	void exitBlocoFunc(PATOParser.BlocoFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(PATOParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(PATOParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#escopoFunc}.
	 * @param ctx the parse tree
	 */
	void enterEscopoFunc(PATOParser.EscopoFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#escopoFunc}.
	 * @param ctx the parse tree
	 */
	void exitEscopoFunc(PATOParser.EscopoFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(PATOParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(PATOParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(PATOParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(PATOParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(PATOParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(PATOParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(PATOParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(PATOParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(PATOParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(PATOParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(PATOParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(PATOParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(PATOParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(PATOParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#condicoes}.
	 * @param ctx the parse tree
	 */
	void enterCondicoes(PATOParser.CondicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#condicoes}.
	 * @param ctx the parse tree
	 */
	void exitCondicoes(PATOParser.CondicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(PATOParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(PATOParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(PATOParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(PATOParser.OutputContext ctx);
}