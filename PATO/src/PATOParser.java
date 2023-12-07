// Generated from PATO.G4 by ANTLR 4.7.2
package GCCC130.src;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PATOParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Tipo=3, Numero=4, RTN=5, AQ=6, FQ=7, AP=8, FP=9, OpRel=10, 
		OpBool=11, Cond=12, OpArit=13, DELIM=14, COMMA=15, Atr=16, QIN=17, QOUT=18, 
		OPIN=19, OPOUT=20, Var=21, NumI=22, NumR=23, COMMENT=24, WS=25;
	public static final int
		RULE_main = 0, RULE_blocoFunc = 1, RULE_parametros = 2, RULE_escopoFunc = 3, 
		RULE_declaracao = 4, RULE_retorno = 5, RULE_funcao = 6, RULE_funcao_encapsulada = 7, 
		RULE_atribuicao = 8, RULE_string = 9, RULE_expressao = 10, RULE_termo = 11, 
		RULE_fator = 12, RULE_comandos = 13, RULE_condicoes = 14, RULE_parametrosCondicao = 15, 
		RULE_input = 16, RULE_output = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "blocoFunc", "parametros", "escopoFunc", "declaracao", "retorno", 
			"funcao", "funcao_encapsulada", "atribuicao", "string", "expressao", 
			"termo", "fator", "comandos", "condicoes", "parametrosCondicao", "input", 
			"output"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'qchar'", "'\"'", null, null, "'queck'", "'<quack>'", "'</quack>'", 
			"'('", "')'", null, null, null, null, "';'", "','", "'<-'", "'quackin'", 
			"'quackout'", "'>>'", "'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Tipo", "Numero", "RTN", "AQ", "FQ", "AP", "FP", "OpRel", 
			"OpBool", "Cond", "OpArit", "DELIM", "COMMA", "Atr", "QIN", "QOUT", "OPIN", 
			"OPOUT", "Var", "NumI", "NumR", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PATO.G4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PATOParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NRegraIinicioContext extends MainContext {
		public TerminalNode EOF() { return getToken(PATOParser.EOF, 0); }
		public List<BlocoFuncContext> blocoFunc() {
			return getRuleContexts(BlocoFuncContext.class);
		}
		public BlocoFuncContext blocoFunc(int i) {
			return getRuleContext(BlocoFuncContext.class,i);
		}
		public NRegraIinicioContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterNRegraIinicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitNRegraIinicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitNRegraIinicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			_localctx = new NRegraIinicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tipo) {
				{
				{
				setState(36);
				blocoFunc();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoFuncContext extends ParserRuleContext {
		public BlocoFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoFunc; }
	 
		public BlocoFuncContext() { }
		public void copyFrom(BlocoFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NRegraBlocoDeFuncaoContext extends BlocoFuncContext {
		public TerminalNode Tipo() { return getToken(PATOParser.Tipo, 0); }
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public TerminalNode AP() { return getToken(PATOParser.AP, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode FP() { return getToken(PATOParser.FP, 0); }
		public EscopoFuncContext escopoFunc() {
			return getRuleContext(EscopoFuncContext.class,0);
		}
		public NRegraBlocoDeFuncaoContext(BlocoFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterNRegraBlocoDeFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitNRegraBlocoDeFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitNRegraBlocoDeFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoFuncContext blocoFunc() throws RecognitionException {
		BlocoFuncContext _localctx = new BlocoFuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blocoFunc);
		try {
			_localctx = new NRegraBlocoDeFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(Tipo);
			setState(45);
			match(Var);
			setState(46);
			match(AP);
			setState(47);
			parametros();
			setState(48);
			match(FP);
			setState(49);
			escopoFunc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	 
		public ParametrosContext() { }
		public void copyFrom(ParametrosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraParametrosContext extends ParametrosContext {
		public List<TerminalNode> Tipo() { return getTokens(PATOParser.Tipo); }
		public TerminalNode Tipo(int i) {
			return getToken(PATOParser.Tipo, i);
		}
		public List<TerminalNode> Var() { return getTokens(PATOParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(PATOParser.Var, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PATOParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PATOParser.COMMA, i);
		}
		public RegraParametrosContext(ParametrosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			_localctx = new RegraParametrosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tipo) {
				{
				setState(51);
				match(Tipo);
				setState(52);
				match(Var);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(53);
					match(COMMA);
					setState(54);
					match(Tipo);
					setState(55);
					match(Var);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscopoFuncContext extends ParserRuleContext {
		public EscopoFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopoFunc; }
	 
		public EscopoFuncContext() { }
		public void copyFrom(EscopoFuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NRegraEscopoDeclaracaoContext extends EscopoFuncContext {
		public TerminalNode AQ() { return getToken(PATOParser.AQ, 0); }
		public TerminalNode FQ() { return getToken(PATOParser.FQ, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<CondicoesContext> condicoes() {
			return getRuleContexts(CondicoesContext.class);
		}
		public CondicoesContext condicoes(int i) {
			return getRuleContext(CondicoesContext.class,i);
		}
		public List<RetornoContext> retorno() {
			return getRuleContexts(RetornoContext.class);
		}
		public RetornoContext retorno(int i) {
			return getRuleContext(RetornoContext.class,i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public NRegraEscopoDeclaracaoContext(EscopoFuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterNRegraEscopoDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitNRegraEscopoDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitNRegraEscopoDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopoFuncContext escopoFunc() throws RecognitionException {
		EscopoFuncContext _localctx = new EscopoFuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_escopoFunc);
		int _la;
		try {
			_localctx = new NRegraEscopoDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(AQ);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(64);
					declaracao();
					}
					break;
				case 2:
					{
					setState(65);
					comandos();
					}
					break;
				case 3:
					{
					setState(66);
					condicoes();
					}
					break;
				case 4:
					{
					setState(67);
					retorno();
					}
					break;
				case 5:
					{
					setState(68);
					atribuicao();
					}
					break;
				case 6:
					{
					setState(69);
					funcao();
					}
					break;
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Tipo) | (1L << RTN) | (1L << Cond) | (1L << QIN) | (1L << QOUT) | (1L << Var))) != 0) );
			setState(74);
			match(FQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraDeclaracaoStringContext extends DeclaracaoContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public RegraDeclaracaoStringContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraDeclaracaoString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraDeclaracaoString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraDeclaracaoString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegraDeclaracaoContext extends DeclaracaoContext {
		public TerminalNode Tipo() { return getToken(PATOParser.Tipo, 0); }
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public TerminalNode Atr() { return getToken(PATOParser.Atr, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RegraDeclaracaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tipo:
				_localctx = new RegraDeclaracaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(Tipo);
				setState(77);
				match(Var);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Atr) {
					{
					setState(78);
					match(Atr);
					setState(79);
					expressao();
					}
				}

				setState(82);
				match(DELIM);
				}
				break;
			case T__0:
			case Var:
				_localctx = new RegraDeclaracaoStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	 
		public RetornoContext() { }
		public void copyFrom(RetornoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraRetornoContext extends RetornoContext {
		public TerminalNode RTN() { return getToken(PATOParser.RTN, 0); }
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public TerminalNode AP() { return getToken(PATOParser.AP, 0); }
		public List<Funcao_encapsuladaContext> funcao_encapsulada() {
			return getRuleContexts(Funcao_encapsuladaContext.class);
		}
		public Funcao_encapsuladaContext funcao_encapsulada(int i) {
			return getRuleContext(Funcao_encapsuladaContext.class,i);
		}
		public TerminalNode OpArit() { return getToken(PATOParser.OpArit, 0); }
		public TerminalNode FP() { return getToken(PATOParser.FP, 0); }
		public RegraRetornoContext(RetornoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_retorno);
		int _la;
		try {
			_localctx = new RegraRetornoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(RTN);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(87);
				expressao();
				}
				break;
			case 2:
				{
				setState(88);
				atribuicao();
				}
				break;
			case 3:
				{
				setState(89);
				match(AP);
				setState(90);
				funcao_encapsulada();
				setState(91);
				match(OpArit);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Var) {
					{
					setState(92);
					funcao_encapsulada();
					}
				}

				setState(95);
				match(FP);
				}
				break;
			}
			setState(99);
			match(DELIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoContext extends ParserRuleContext {
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	 
		public FuncaoContext() { }
		public void copyFrom(FuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraFuncaoContext extends FuncaoContext {
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public TerminalNode AP() { return getToken(PATOParser.AP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(PATOParser.FP, 0); }
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public RegraFuncaoContext(FuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcao);
		try {
			_localctx = new RegraFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Var);
			setState(102);
			match(AP);
			setState(103);
			expressao();
			setState(104);
			match(FP);
			setState(105);
			match(DELIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcao_encapsuladaContext extends ParserRuleContext {
		public Funcao_encapsuladaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_encapsulada; }
	 
		public Funcao_encapsuladaContext() { }
		public void copyFrom(Funcao_encapsuladaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraFuncaoEncapsuladaContext extends Funcao_encapsuladaContext {
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public TerminalNode AP() { return getToken(PATOParser.AP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(PATOParser.FP, 0); }
		public RegraFuncaoEncapsuladaContext(Funcao_encapsuladaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraFuncaoEncapsulada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraFuncaoEncapsulada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraFuncaoEncapsulada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcao_encapsuladaContext funcao_encapsulada() throws RecognitionException {
		Funcao_encapsuladaContext _localctx = new Funcao_encapsuladaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcao_encapsulada);
		try {
			_localctx = new RegraFuncaoEncapsuladaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Var);
			setState(108);
			match(AP);
			setState(109);
			expressao();
			setState(110);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraAtribuicaoContext extends AtribuicaoContext {
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public TerminalNode Atr() { return getToken(PATOParser.Atr, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public RegraAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegraAtribuicaoStringContext extends AtribuicaoContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public RegraAtribuicaoStringContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraAtribuicaoString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraAtribuicaoString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraAtribuicaoString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atribuicao);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new RegraAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(Var);
				setState(113);
				match(Atr);
				setState(114);
				expressao();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(115);
					match(DELIM);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegraAtribuicaoStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> Var() { return getTokens(PATOParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(PATOParser.Var, i);
		}
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public TerminalNode Atr() { return getToken(PATOParser.Atr, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(121);
				match(T__0);
				}
			}

			setState(124);
			match(Var);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Atr) {
				{
				setState(125);
				match(Atr);
				setState(126);
				match(T__1);
				setState(127);
				match(Var);
				setState(128);
				match(T__1);
				}
			}

			setState(131);
			match(DELIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraExpressaoContext extends ExpressaoContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OpArit() { return getTokens(PATOParser.OpArit); }
		public TerminalNode OpArit(int i) {
			return getToken(PATOParser.OpArit, i);
		}
		public RegraExpressaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao);
		int _la;
		try {
			_localctx = new RegraExpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			termo();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpArit) {
				{
				{
				setState(134);
				match(OpArit);
				setState(135);
				termo();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	 
		public TermoContext() { }
		public void copyFrom(TermoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraTermoContext extends TermoContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> OpArit() { return getTokens(PATOParser.OpArit); }
		public TerminalNode OpArit(int i) {
			return getToken(PATOParser.OpArit, i);
		}
		public RegraTermoContext(TermoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		try {
			int _alt;
			_localctx = new RegraTermoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			fator();
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					match(OpArit);
					setState(143);
					fator();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	 
		public FatorContext() { }
		public void copyFrom(FatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraFatorNumeroContext extends FatorContext {
		public TerminalNode Numero() { return getToken(PATOParser.Numero, 0); }
		public RegraFatorNumeroContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraFatorNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraFatorNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraFatorNumero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegraFatorVariavelContext extends FatorContext {
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public RegraFatorVariavelContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraFatorVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraFatorVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraFatorVariavel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegraFatorFuncaoEncapsuladaContext extends FatorContext {
		public Funcao_encapsuladaContext funcao_encapsulada() {
			return getRuleContext(Funcao_encapsuladaContext.class,0);
		}
		public RegraFatorFuncaoEncapsuladaContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraFatorFuncaoEncapsulada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraFatorFuncaoEncapsulada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraFatorFuncaoEncapsulada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fator);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new RegraFatorVariavelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(Var);
				}
				break;
			case 2:
				_localctx = new RegraFatorNumeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(Numero);
				}
				break;
			case 3:
				_localctx = new RegraFatorFuncaoEncapsuladaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				funcao_encapsulada();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	 
		public ComandosContext() { }
		public void copyFrom(ComandosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraComandosInputContext extends ComandosContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public RegraComandosInputContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraComandosInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraComandosInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraComandosInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegraComandosOutputContext extends ComandosContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public RegraComandosOutputContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraComandosOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraComandosOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraComandosOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandos);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QIN:
				_localctx = new RegraComandosInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				input();
				}
				break;
			case QOUT:
				_localctx = new RegraComandosOutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				output();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicoesContext extends ParserRuleContext {
		public CondicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicoes; }
	 
		public CondicoesContext() { }
		public void copyFrom(CondicoesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraCondicoesContext extends CondicoesContext {
		public TerminalNode Cond() { return getToken(PATOParser.Cond, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public EscopoFuncContext escopoFunc() {
			return getRuleContext(EscopoFuncContext.class,0);
		}
		public TerminalNode AP() { return getToken(PATOParser.AP, 0); }
		public List<ParametrosCondicaoContext> parametrosCondicao() {
			return getRuleContexts(ParametrosCondicaoContext.class);
		}
		public ParametrosCondicaoContext parametrosCondicao(int i) {
			return getRuleContext(ParametrosCondicaoContext.class,i);
		}
		public TerminalNode FP() { return getToken(PATOParser.FP, 0); }
		public List<TerminalNode> OpBool() { return getTokens(PATOParser.OpBool); }
		public TerminalNode OpBool(int i) {
			return getToken(PATOParser.OpBool, i);
		}
		public RegraCondicoesContext(CondicoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraCondicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraCondicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraCondicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicoesContext condicoes() throws RecognitionException {
		CondicoesContext _localctx = new CondicoesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicoes);
		int _la;
		try {
			_localctx = new RegraCondicoesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(Cond);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AP) {
				{
				setState(159);
				match(AP);
				setState(160);
				parametrosCondicao();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpBool) {
					{
					{
					setState(161);
					match(OpBool);
					setState(162);
					parametrosCondicao();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(FP);
				}
			}

			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RTN:
				{
				setState(172);
				retorno();
				}
				break;
			case AQ:
				{
				setState(173);
				escopoFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosCondicaoContext extends ParserRuleContext {
		public ParametrosCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosCondicao; }
	 
		public ParametrosCondicaoContext() { }
		public void copyFrom(ParametrosCondicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraParametrosDeCondicoesContext extends ParametrosCondicaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OpRel() { return getToken(PATOParser.OpRel, 0); }
		public RegraParametrosDeCondicoesContext(ParametrosCondicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraParametrosDeCondicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraParametrosDeCondicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraParametrosDeCondicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosCondicaoContext parametrosCondicao() throws RecognitionException {
		ParametrosCondicaoContext _localctx = new ParametrosCondicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametrosCondicao);
		try {
			_localctx = new RegraParametrosDeCondicoesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			expressao();
			setState(177);
			match(OpRel);
			setState(178);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraInputContext extends InputContext {
		public TerminalNode QIN() { return getToken(PATOParser.QIN, 0); }
		public List<TerminalNode> OPIN() { return getTokens(PATOParser.OPIN); }
		public TerminalNode OPIN(int i) {
			return getToken(PATOParser.OPIN, i);
		}
		public List<TerminalNode> Var() { return getTokens(PATOParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(PATOParser.Var, i);
		}
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public RegraInputContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_input);
		int _la;
		try {
			_localctx = new RegraInputContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(QIN);
			setState(181);
			match(OPIN);
			setState(182);
			match(Var);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPIN) {
				{
				{
				setState(183);
				match(OPIN);
				setState(184);
				match(Var);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(DELIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	 
		public OutputContext() { }
		public void copyFrom(OutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegraOutputContext extends OutputContext {
		public TerminalNode QOUT() { return getToken(PATOParser.QOUT, 0); }
		public TerminalNode OPOUT() { return getToken(PATOParser.OPOUT, 0); }
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public RegraOutputContext(OutputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_output);
		try {
			_localctx = new RegraOutputContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(QOUT);
			setState(193);
			match(OPOUT);
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(194);
				expressao();
				}
				break;
			case 2:
				{
				setState(195);
				match(Var);
				}
				break;
			}
			setState(198);
			match(DELIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00cb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\5\4@\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\6\5I\n\5\r\5\16\5J\3\5\3\5\3\6\3\6\3\6\3\6\5\6S\n\6\3"+
		"\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\7\3\7\5\7d\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5"+
		"\nw\n\n\3\n\5\nz\n\n\3\13\5\13}\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u0084"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e\13\f\3\r\3\r"+
		"\3\r\7\r\u0093\n\r\f\r\16\r\u0096\13\r\3\16\3\16\3\16\5\16\u009b\n\16"+
		"\3\17\3\17\5\17\u009f\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u00a6\n\20\f"+
		"\20\16\20\u00a9\13\20\3\20\3\20\5\20\u00ad\n\20\3\20\3\20\5\20\u00b1\n"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00bc\n\22\f\22"+
		"\16\22\u00bf\13\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c7\n\23\3\23"+
		"\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\2\u00d4"+
		"\2)\3\2\2\2\4.\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16"+
		"g\3\2\2\2\20m\3\2\2\2\22y\3\2\2\2\24|\3\2\2\2\26\u0087\3\2\2\2\30\u008f"+
		"\3\2\2\2\32\u009a\3\2\2\2\34\u009e\3\2\2\2\36\u00a0\3\2\2\2 \u00b2\3\2"+
		"\2\2\"\u00b6\3\2\2\2$\u00c2\3\2\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2./\7\5\2\2"+
		"/\60\7\27\2\2\60\61\7\n\2\2\61\62\5\6\4\2\62\63\7\13\2\2\63\64\5\b\5\2"+
		"\64\5\3\2\2\2\65\66\7\5\2\2\66<\7\27\2\2\678\7\21\2\289\7\5\2\29;\7\27"+
		"\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?\65"+
		"\3\2\2\2?@\3\2\2\2@\7\3\2\2\2AH\7\b\2\2BI\5\n\6\2CI\5\34\17\2DI\5\36\20"+
		"\2EI\5\f\7\2FI\5\22\n\2GI\5\16\b\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2\2HE\3\2"+
		"\2\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\t"+
		"\2\2M\t\3\2\2\2NO\7\5\2\2OR\7\27\2\2PQ\7\22\2\2QS\5\26\f\2RP\3\2\2\2R"+
		"S\3\2\2\2ST\3\2\2\2TW\7\20\2\2UW\5\24\13\2VN\3\2\2\2VU\3\2\2\2W\13\3\2"+
		"\2\2Xc\7\7\2\2Yd\5\26\f\2Zd\5\22\n\2[\\\7\n\2\2\\]\5\20\t\2]_\7\17\2\2"+
		"^`\5\20\t\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\13\2\2bd\3\2\2\2cY\3\2\2"+
		"\2cZ\3\2\2\2c[\3\2\2\2de\3\2\2\2ef\7\20\2\2f\r\3\2\2\2gh\7\27\2\2hi\7"+
		"\n\2\2ij\5\26\f\2jk\7\13\2\2kl\7\20\2\2l\17\3\2\2\2mn\7\27\2\2no\7\n\2"+
		"\2op\5\26\f\2pq\7\13\2\2q\21\3\2\2\2rs\7\27\2\2st\7\22\2\2tv\5\26\f\2"+
		"uw\7\20\2\2vu\3\2\2\2vw\3\2\2\2wz\3\2\2\2xz\5\24\13\2yr\3\2\2\2yx\3\2"+
		"\2\2z\23\3\2\2\2{}\7\3\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0083\7\27\2"+
		"\2\177\u0080\7\22\2\2\u0080\u0081\7\4\2\2\u0081\u0082\7\27\2\2\u0082\u0084"+
		"\7\4\2\2\u0083\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\7\20\2\2\u0086\25\3\2\2\2\u0087\u008c\5\30\r\2\u0088\u0089\7\17"+
		"\2\2\u0089\u008b\5\30\r\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e\u008c\3\2\2"+
		"\2\u008f\u0094\5\32\16\2\u0090\u0091\7\17\2\2\u0091\u0093\5\32\16\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\31\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009b\7\27\2\2\u0098\u009b"+
		"\7\6\2\2\u0099\u009b\5\20\t\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\33\3\2\2\2\u009c\u009f\5\"\22\2\u009d\u009f"+
		"\5$\23\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\35\3\2\2\2\u00a0"+
		"\u00ac\7\16\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00a7\5 \21\2\u00a3\u00a4\7"+
		"\r\2\2\u00a4\u00a6\5 \21\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a1\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00b1\5\f\7\2\u00af\u00b1\5\b"+
		"\5\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\37\3\2\2\2\u00b2\u00b3"+
		"\5\26\f\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\5\26\f\2\u00b5!\3\2\2\2\u00b6"+
		"\u00b7\7\23\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00bd\7\27\2\2\u00b9\u00ba"+
		"\7\25\2\2\u00ba\u00bc\7\27\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2"+
		"\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c1\7\20\2\2\u00c1#\3\2\2\2\u00c2\u00c3\7\24\2\2\u00c3"+
		"\u00c6\7\26\2\2\u00c4\u00c7\5\26\f\2\u00c5\u00c7\7\27\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\20\2\2"+
		"\u00c9%\3\2\2\2\30)<?HJRV_cvy|\u0083\u008c\u0094\u009a\u009e\u00a7\u00ac"+
		"\u00b0\u00bd\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}