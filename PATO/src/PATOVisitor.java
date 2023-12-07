// Generated from PATO.G4 by ANTLR 4.7.2
package GCCC130.src;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PATOParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PATOVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code NRegraIinicio}
	 * labeled alternative in {@link PATOParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNRegraIinicio(PATOParser.NRegraIinicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NRegraBlocoDeFuncao}
	 * labeled alternative in {@link PATOParser#blocoFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNRegraBlocoDeFuncao(PATOParser.NRegraBlocoDeFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraParametros}
	 * labeled alternative in {@link PATOParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraParametros(PATOParser.RegraParametrosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NRegraEscopoDeclaracao}
	 * labeled alternative in {@link PATOParser#escopoFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNRegraEscopoDeclaracao(PATOParser.NRegraEscopoDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraDeclaracao}
	 * labeled alternative in {@link PATOParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraDeclaracao(PATOParser.RegraDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraDeclaracaoString}
	 * labeled alternative in {@link PATOParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraDeclaracaoString(PATOParser.RegraDeclaracaoStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraRetorno}
	 * labeled alternative in {@link PATOParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraRetorno(PATOParser.RegraRetornoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraFuncao}
	 * labeled alternative in {@link PATOParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraFuncao(PATOParser.RegraFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraFuncaoEncapsulada}
	 * labeled alternative in {@link PATOParser#funcao_encapsulada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraFuncaoEncapsulada(PATOParser.RegraFuncaoEncapsuladaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraAtribuicao}
	 * labeled alternative in {@link PATOParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraAtribuicao(PATOParser.RegraAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraAtribuicaoString}
	 * labeled alternative in {@link PATOParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraAtribuicaoString(PATOParser.RegraAtribuicaoStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PATOParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PATOParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraExpressao}
	 * labeled alternative in {@link PATOParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraExpressao(PATOParser.RegraExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraTermo}
	 * labeled alternative in {@link PATOParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraTermo(PATOParser.RegraTermoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraFatorVariavel}
	 * labeled alternative in {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraFatorVariavel(PATOParser.RegraFatorVariavelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraFatorNumero}
	 * labeled alternative in {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraFatorNumero(PATOParser.RegraFatorNumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraFatorFuncaoEncapsulada}
	 * labeled alternative in {@link PATOParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraFatorFuncaoEncapsulada(PATOParser.RegraFatorFuncaoEncapsuladaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraComandosInput}
	 * labeled alternative in {@link PATOParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraComandosInput(PATOParser.RegraComandosInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraComandosOutput}
	 * labeled alternative in {@link PATOParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraComandosOutput(PATOParser.RegraComandosOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraCondicoes}
	 * labeled alternative in {@link PATOParser#condicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraCondicoes(PATOParser.RegraCondicoesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraParametrosDeCondicoes}
	 * labeled alternative in {@link PATOParser#parametrosCondicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraParametrosDeCondicoes(PATOParser.RegraParametrosDeCondicoesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraInput}
	 * labeled alternative in {@link PATOParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraInput(PATOParser.RegraInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegraOutput}
	 * labeled alternative in {@link PATOParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegraOutput(PATOParser.RegraOutputContext ctx);
}