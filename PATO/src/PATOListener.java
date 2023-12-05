// Generated from PATO.G4 by ANTLR 4.7.2

package GCCC130.src;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PATOParser}.
 */
public interface PATOListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NRegraIinicio}
	 * labeled alternative in {@link PATOParser#main}.
	 * @param ctx the parse tree
	 */
	void enterNRegraIinicio(PATOParser.NRegraIinicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NRegraIinicio}
	 * labeled alternative in {@link PATOParser#main}.
	 * @param ctx the parse tree
	 */
	void exitNRegraIinicio(PATOParser.NRegraIinicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NRegraBlocoDeFuncao}
	 * labeled alternative in {@link PATOParser#blocoFunc}.
	 * @param ctx the parse tree
	 */
	void enterNRegraBlocoDeFuncao(PATOParser.NRegraBlocoDeFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NRegraBlocoDeFuncao}
	 * labeled alternative in {@link PATOParser#blocoFunc}.
	 * @param ctx the parse tree
	 */
	void exitNRegraBlocoDeFuncao(PATOParser.NRegraBlocoDeFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraParametros}
	 * labeled alternative in {@link PATOParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterRegraParametros(PATOParser.RegraParametrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraParametros}
	 * labeled alternative in {@link PATOParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitRegraParametros(PATOParser.RegraParametrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NRegraEscopoDeclaracao}
	 * labeled alternative in {@link PATOParser#escopoFunc}.
	 * @param ctx the parse tree
	 */
	void enterNRegraEscopoDeclaracao(PATOParser.NRegraEscopoDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NRegraEscopoDeclaracao}
	 * labeled alternative in {@link PATOParser#escopoFunc}.
	 * @param ctx the parse tree
	 */
	void exitNRegraEscopoDeclaracao(PATOParser.NRegraEscopoDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraDeclaracao}
	 * labeled alternative in {@link PATOParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterRegraDeclaracao(PATOParser.RegraDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraDeclaracao}
	 * labeled alternative in {@link PATOParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitRegraDeclaracao(PATOParser.RegraDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraDeclaracaoString}
	 * labeled alternative in {@link PATOParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterRegraDeclaracaoString(PATOParser.RegraDeclaracaoStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraDeclaracaoString}
	 * labeled alternative in {@link PATOParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitRegraDeclaracaoString(PATOParser.RegraDeclaracaoStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraRetorno}
	 * labeled alternative in {@link PATOParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRegraRetorno(PATOParser.RegraRetornoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraRetorno}
	 * labeled alternative in {@link PATOParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRegraRetorno(PATOParser.RegraRetornoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraFuncao}
	 * labeled alternative in {@link PATOParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterRegraFuncao(PATOParser.RegraFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraFuncao}
	 * labeled alternative in {@link PATOParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitRegraFuncao(PATOParser.RegraFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraAtribuicao}
	 * labeled alternative in {@link PATOParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterRegraAtribuicao(PATOParser.RegraAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraAtribuicao}
	 * labeled alternative in {@link PATOParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitRegraAtribuicao(PATOParser.RegraAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraAtribuicaoString}
	 * labeled alternative in {@link PATOParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterRegraAtribuicaoString(PATOParser.RegraAtribuicaoStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraAtribuicaoString}
	 * labeled alternative in {@link PATOParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitRegraAtribuicaoString(PATOParser.RegraAtribuicaoStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PATOParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PATOParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PATOParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PATOParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraExpressao}
	 * labeled alternative in {@link PATOParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterRegraExpressao(PATOParser.RegraExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraExpressao}
	 * labeled alternative in {@link PATOParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitRegraExpressao(PATOParser.RegraExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraTermo}
	 * labeled alternative in {@link PATOParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterRegraTermo(PATOParser.RegraTermoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraTermo}
	 * labeled alternative in {@link PATOParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitRegraTermo(PATOParser.RegraTermoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraFatorVariavel}
	 * labeled alternative in {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterRegraFatorVariavel(PATOParser.RegraFatorVariavelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraFatorVariavel}
	 * labeled alternative in {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitRegraFatorVariavel(PATOParser.RegraFatorVariavelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraFatorNumero}
	 * labeled alternative in {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterRegraFatorNumero(PATOParser.RegraFatorNumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraFatorNumero}
	 * labeled alternative in {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitRegraFatorNumero(PATOParser.RegraFatorNumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraFatorFuncao}
	 * labeled alternative in {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterRegraFatorFuncao(PATOParser.RegraFatorFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraFatorFuncao}
	 * labeled alternative in {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitRegraFatorFuncao(PATOParser.RegraFatorFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraComandosInput}
	 * labeled alternative in {@link PATOParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterRegraComandosInput(PATOParser.RegraComandosInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraComandosInput}
	 * labeled alternative in {@link PATOParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitRegraComandosInput(PATOParser.RegraComandosInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraComandosOutput}
	 * labeled alternative in {@link PATOParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterRegraComandosOutput(PATOParser.RegraComandosOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraComandosOutput}
	 * labeled alternative in {@link PATOParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitRegraComandosOutput(PATOParser.RegraComandosOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraCondicoes}
	 * labeled alternative in {@link PATOParser#condicoes}.
	 * @param ctx the parse tree
	 */
	void enterRegraCondicoes(PATOParser.RegraCondicoesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraCondicoes}
	 * labeled alternative in {@link PATOParser#condicoes}.
	 * @param ctx the parse tree
	 */
	void exitRegraCondicoes(PATOParser.RegraCondicoesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraParametrosDeCondicoes}
	 * labeled alternative in {@link PATOParser#parametrosCondicao}.
	 * @param ctx the parse tree
	 */
	void enterRegraParametrosDeCondicoes(PATOParser.RegraParametrosDeCondicoesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraParametrosDeCondicoes}
	 * labeled alternative in {@link PATOParser#parametrosCondicao}.
	 * @param ctx the parse tree
	 */
	void exitRegraParametrosDeCondicoes(PATOParser.RegraParametrosDeCondicoesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraInput}
	 * labeled alternative in {@link PATOParser#input}.
	 * @param ctx the parse tree
	 */
	void enterRegraInput(PATOParser.RegraInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraInput}
	 * labeled alternative in {@link PATOParser#input}.
	 * @param ctx the parse tree
	 */
	void exitRegraInput(PATOParser.RegraInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegraOutput}
	 * labeled alternative in {@link PATOParser#output}.
	 * @param ctx the parse tree
	 */
	void enterRegraOutput(PATOParser.RegraOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegraOutput}
	 * labeled alternative in {@link PATOParser#output}.
	 * @param ctx the parse tree
	 */
	void exitRegraOutput(PATOParser.RegraOutputContext ctx);
}