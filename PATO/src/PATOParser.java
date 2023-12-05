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
		RULE_declaracao = 4, RULE_retorno = 5, RULE_funcao = 6, RULE_atribuicao = 7, 
		RULE_string = 8, RULE_expressao = 9, RULE_termo = 10, RULE_fator = 11, 
		RULE_comandos = 12, RULE_condicoes = 13, RULE_parametrosCondicao = 14, 
		RULE_input = 15, RULE_output = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "blocoFunc", "parametros", "escopoFunc", "declaracao", "retorno", 
			"funcao", "atribuicao", "string", "expressao", "termo", "fator", "comandos", 
			"condicoes", "parametrosCondicao", "input", "output"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tipo) {
				{
				{
				setState(34);
				blocoFunc();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(42);
			match(Tipo);
			setState(43);
			match(Var);
			setState(44);
			match(AP);
			setState(45);
			parametros();
			setState(46);
			match(FP);
			setState(47);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tipo) {
				{
				setState(49);
				match(Tipo);
				setState(50);
				match(Var);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(51);
					match(COMMA);
					setState(52);
					match(Tipo);
					setState(53);
					match(Var);
					}
					}
					setState(58);
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
			setState(61);
			match(AQ);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(62);
					declaracao();
					}
					break;
				case 2:
					{
					setState(63);
					comandos();
					}
					break;
				case 3:
					{
					setState(64);
					condicoes();
					}
					break;
				case 4:
					{
					setState(65);
					retorno();
					}
					break;
				case 5:
					{
					setState(66);
					atribuicao();
					}
					break;
				case 6:
					{
					setState(67);
					funcao();
					}
					break;
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Tipo) | (1L << RTN) | (1L << Cond) | (1L << QIN) | (1L << QOUT) | (1L << Var))) != 0) );
			setState(72);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tipo:
				_localctx = new RegraDeclaracaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(Tipo);
				setState(75);
				match(Var);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Atr) {
					{
					setState(76);
					match(Atr);
					setState(77);
					expressao();
					}
				}

				setState(80);
				match(DELIM);
				}
				break;
			case T__0:
				_localctx = new RegraDeclaracaoStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
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
			setState(84);
			match(RTN);
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(85);
				expressao();
				}
				break;
			case 2:
				{
				setState(86);
				atribuicao();
				}
				break;
			case 3:
				{
				setState(87);
				match(AP);
				setState(88);
				funcao();
				setState(89);
				match(OpArit);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Var) {
					{
					setState(90);
					funcao();
					}
				}

				setState(93);
				match(FP);
				}
				break;
			}
			setState(97);
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
			setState(99);
			match(Var);
			setState(100);
			match(AP);
			setState(101);
			expressao();
			setState(102);
			match(FP);
			setState(103);
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
		enterRule(_localctx, 14, RULE_atribuicao);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				_localctx = new RegraAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(Var);
				setState(106);
				match(Atr);
				setState(107);
				expressao();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(108);
					match(DELIM);
					}
					break;
				}
				}
				break;
			case T__0:
				_localctx = new RegraAtribuicaoStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
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
		enterRule(_localctx, 16, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__0);
			setState(115);
			match(Var);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Atr) {
				{
				setState(116);
				match(Atr);
				setState(117);
				match(T__1);
				setState(118);
				match(Var);
				setState(119);
				match(T__1);
				}
			}

			setState(122);
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
		enterRule(_localctx, 18, RULE_expressao);
		int _la;
		try {
			_localctx = new RegraExpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			termo();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpArit) {
				{
				{
				setState(125);
				match(OpArit);
				setState(126);
				termo();
				}
				}
				setState(131);
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
		enterRule(_localctx, 20, RULE_termo);
		try {
			int _alt;
			_localctx = new RegraTermoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			fator();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(OpArit);
					setState(134);
					fator();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class RegraFatorFuncaoContext extends FatorContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public RegraFatorFuncaoContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRegraFatorFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRegraFatorFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PATOVisitor ) return ((PATOVisitor<? extends T>)visitor).visitRegraFatorFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fator);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new RegraFatorVariavelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(Var);
				}
				break;
			case 2:
				_localctx = new RegraFatorNumeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(Numero);
				}
				break;
			case 3:
				_localctx = new RegraFatorFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				funcao();
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
		enterRule(_localctx, 24, RULE_comandos);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QIN:
				_localctx = new RegraComandosInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				input();
				}
				break;
			case QOUT:
				_localctx = new RegraComandosOutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
		enterRule(_localctx, 26, RULE_condicoes);
		int _la;
		try {
			_localctx = new RegraCondicoesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Cond);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AP) {
				{
				setState(150);
				match(AP);
				setState(151);
				parametrosCondicao();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpBool) {
					{
					{
					setState(152);
					match(OpBool);
					setState(153);
					parametrosCondicao();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(FP);
				}
			}

			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RTN:
				{
				setState(163);
				retorno();
				}
				break;
			case AQ:
				{
				setState(164);
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
		enterRule(_localctx, 28, RULE_parametrosCondicao);
		try {
			_localctx = new RegraParametrosDeCondicoesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			expressao();
			setState(168);
			match(OpRel);
			setState(169);
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
		enterRule(_localctx, 30, RULE_input);
		int _la;
		try {
			_localctx = new RegraInputContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(QIN);
			setState(172);
			match(OPIN);
			setState(173);
			match(Var);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPIN) {
				{
				{
				setState(174);
				match(OPIN);
				setState(175);
				match(Var);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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
		enterRule(_localctx, 32, RULE_output);
		try {
			_localctx = new RegraOutputContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(QOUT);
			setState(184);
			match(OPOUT);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(185);
				expressao();
				}
				break;
			case 2:
				{
				setState(186);
				match(Var);
				}
				break;
			}
			setState(189);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\6\5G\n\5\r\5\16\5H\3\5\3\5\3\6\3\6\3\6\3\6\5\6Q\n\6\3\6\3\6\5\6"+
		"U\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\3\7\5\7b\n\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tp\n\t\3\t\5\ts\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n{\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u0082\n\13\f\13\16"+
		"\13\u0085\13\13\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f\3\r\3\r"+
		"\3\r\5\r\u0092\n\r\3\16\3\16\5\16\u0096\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u009d\n\17\f\17\16\17\u00a0\13\17\3\17\3\17\5\17\u00a4\n\17\3\17"+
		"\3\17\5\17\u00a8\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00b3\n\21\f\21\16\21\u00b6\13\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22"+
		"\u00be\n\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"\2\2\2\u00cb\2\'\3\2\2\2\4,\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nT\3\2"+
		"\2\2\fV\3\2\2\2\16e\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24~\3\2\2\2\26\u0086"+
		"\3\2\2\2\30\u0091\3\2\2\2\32\u0095\3\2\2\2\34\u0097\3\2\2\2\36\u00a9\3"+
		"\2\2\2 \u00ad\3\2\2\2\"\u00b9\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,-\7\5\2"+
		"\2-.\7\27\2\2./\7\n\2\2/\60\5\6\4\2\60\61\7\13\2\2\61\62\5\b\5\2\62\5"+
		"\3\2\2\2\63\64\7\5\2\2\64:\7\27\2\2\65\66\7\21\2\2\66\67\7\5\2\2\679\7"+
		"\27\2\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"=\63\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?F\7\b\2\2@G\5\n\6\2AG\5\32\16\2BG\5"+
		"\34\17\2CG\5\f\7\2DG\5\20\t\2EG\5\16\b\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2"+
		"FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2"+
		"JK\7\t\2\2K\t\3\2\2\2LM\7\5\2\2MP\7\27\2\2NO\7\22\2\2OQ\5\24\13\2PN\3"+
		"\2\2\2PQ\3\2\2\2QR\3\2\2\2RU\7\20\2\2SU\5\22\n\2TL\3\2\2\2TS\3\2\2\2U"+
		"\13\3\2\2\2Va\7\7\2\2Wb\5\24\13\2Xb\5\20\t\2YZ\7\n\2\2Z[\5\16\b\2[]\7"+
		"\17\2\2\\^\5\16\b\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\13\2\2`b\3\2\2"+
		"\2aW\3\2\2\2aX\3\2\2\2aY\3\2\2\2bc\3\2\2\2cd\7\20\2\2d\r\3\2\2\2ef\7\27"+
		"\2\2fg\7\n\2\2gh\5\24\13\2hi\7\13\2\2ij\7\20\2\2j\17\3\2\2\2kl\7\27\2"+
		"\2lm\7\22\2\2mo\5\24\13\2np\7\20\2\2on\3\2\2\2op\3\2\2\2ps\3\2\2\2qs\5"+
		"\22\n\2rk\3\2\2\2rq\3\2\2\2s\21\3\2\2\2tu\7\3\2\2uz\7\27\2\2vw\7\22\2"+
		"\2wx\7\4\2\2xy\7\27\2\2y{\7\4\2\2zv\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\20"+
		"\2\2}\23\3\2\2\2~\u0083\5\26\f\2\177\u0080\7\17\2\2\u0080\u0082\5\26\f"+
		"\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\25\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008b\5\30\r\2\u0087"+
		"\u0088\7\17\2\2\u0088\u008a\5\30\r\2\u0089\u0087\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0092\7\27\2\2\u008f\u0092\7\6\2\2\u0090\u0092\5"+
		"\16\b\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\31\3\2\2\2\u0093\u0096\5 \21\2\u0094\u0096\5\"\22\2\u0095\u0093\3\2\2"+
		"\2\u0095\u0094\3\2\2\2\u0096\33\3\2\2\2\u0097\u00a3\7\16\2\2\u0098\u0099"+
		"\7\n\2\2\u0099\u009e\5\36\20\2\u009a\u009b\7\r\2\2\u009b\u009d\5\36\20"+
		"\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\13\2\2"+
		"\u00a2\u00a4\3\2\2\2\u00a3\u0098\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a8\5\f\7\2\u00a6\u00a8\5\b\5\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\7\f"+
		"\2\2\u00ab\u00ac\5\24\13\2\u00ac\37\3\2\2\2\u00ad\u00ae\7\23\2\2\u00ae"+
		"\u00af\7\25\2\2\u00af\u00b4\7\27\2\2\u00b0\u00b1\7\25\2\2\u00b1\u00b3"+
		"\7\27\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8"+
		"\7\20\2\2\u00b8!\3\2\2\2\u00b9\u00ba\7\24\2\2\u00ba\u00bd\7\26\2\2\u00bb"+
		"\u00be\5\24\13\2\u00bc\u00be\7\27\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\20\2\2\u00c0#\3\2\2\2\27\'"+
		":=FHPT]aorz\u0083\u008b\u0091\u0095\u009e\u00a3\u00a7\u00b4\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}