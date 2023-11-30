// Generated from PATO.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PATOParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Tipo=3, Numero=4, Func=5, RTN=6, AQ=7, FQ=8, AP=9, FP=10, 
		OpRel=11, OpBool=12, Cond=13, OpArit=14, DELIM=15, COMMA=16, Atr=17, QIN=18, 
		QOUT=19, OPIO=20, Var=21, NumI=22, NumR=23, WS=24;
	public static final int
		RULE_main = 0, RULE_blocoFunc = 1, RULE_parametros = 2, RULE_escopoFunc = 3, 
		RULE_declaracao = 4, RULE_retorno = 5, RULE_atribuicao = 6, RULE_expressao = 7, 
		RULE_termo = 8, RULE_fator = 9, RULE_comandos = 10, RULE_condicoes = 11, 
		RULE_input = 12, RULE_output = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "blocoFunc", "parametros", "escopoFunc", "declaracao", "retorno", 
			"atribuicao", "expressao", "termo", "fator", "comandos", "condicoes", 
			"input", "output"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", null, null, "'func'", "'return'", "'<quack>'", "'</quack>'", 
			"'('", "')'", null, null, null, null, "';'", "','", "'<-'", "'quackin'", 
			"'quackout'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Tipo", "Numero", "Func", "RTN", "AQ", "FQ", "AP", 
			"FP", "OpRel", "OpBool", "Cond", "OpArit", "DELIM", "COMMA", "Atr", "QIN", 
			"QOUT", "OPIO", "Var", "NumI", "NumR", "WS"
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
	public String getGrammarFileName() { return "PATO.g4"; }

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
		public TerminalNode EOF() { return getToken(PATOParser.EOF, 0); }
		public List<BlocoFuncContext> blocoFunc() {
			return getRuleContexts(BlocoFuncContext.class);
		}
		public BlocoFuncContext blocoFunc(int i) {
			return getRuleContext(BlocoFuncContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Func) {
				{
				{
				setState(28);
				blocoFunc();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
		public TerminalNode Func() { return getToken(PATOParser.Func, 0); }
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
		public BlocoFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterBlocoFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitBlocoFunc(this);
		}
	}

	public final BlocoFuncContext blocoFunc() throws RecognitionException {
		BlocoFuncContext _localctx = new BlocoFuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blocoFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Func);
			setState(37);
			match(Tipo);
			setState(38);
			match(Var);
			setState(39);
			match(AP);
			setState(40);
			parametros();
			setState(41);
			match(FP);
			setState(42);
			match(T__0);
			setState(43);
			escopoFunc();
			setState(44);
			match(T__1);
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
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(Tipo);
			setState(47);
			match(Var);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(48);
				match(COMMA);
				setState(49);
				match(Tipo);
				setState(50);
				match(Var);
				}
				}
				setState(55);
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

	public static class EscopoFuncContext extends ParserRuleContext {
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
		public EscopoFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopoFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterEscopoFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitEscopoFunc(this);
		}
	}

	public final EscopoFuncContext escopoFunc() throws RecognitionException {
		EscopoFuncContext _localctx = new EscopoFuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_escopoFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Tipo:
					{
					setState(56);
					declaracao();
					}
					break;
				case OpArit:
				case QIN:
				case QOUT:
					{
					setState(57);
					comandos();
					}
					break;
				case OpBool:
				case Cond:
					{
					setState(58);
					condicoes();
					}
					break;
				case RTN:
					{
					setState(59);
					retorno();
					}
					break;
				case Var:
					{
					setState(60);
					atribuicao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tipo) | (1L << RTN) | (1L << OpBool) | (1L << Cond) | (1L << OpArit) | (1L << QIN) | (1L << QOUT) | (1L << Var))) != 0) );
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
		public TerminalNode Tipo() { return getToken(PATOParser.Tipo, 0); }
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(Tipo);
			setState(66);
			match(Var);
			setState(67);
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RTN() { return getToken(PATOParser.RTN, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(RTN);
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
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public TerminalNode Atr() { return getToken(PATOParser.Atr, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(Var);
			setState(72);
			match(Atr);
			setState(73);
			expressao();
			setState(74);
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
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			termo();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpArit) {
				{
				{
				setState(77);
				match(OpArit);
				setState(78);
				termo();
				}
				}
				setState(83);
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
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_termo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			fator();
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(OpArit);
					setState(86);
					fator();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public TerminalNode Var() { return getToken(PATOParser.Var, 0); }
		public TerminalNode Numero() { return getToken(PATOParser.Numero, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==Numero || _la==Var) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ComandosContext extends ParserRuleContext {
		public TerminalNode OpArit() { return getToken(PATOParser.OpArit, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandos);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpArit:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(OpArit);
				}
				break;
			case QIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				input();
				}
				break;
			case QOUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
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
		public TerminalNode Cond() { return getToken(PATOParser.Cond, 0); }
		public TerminalNode OpBool() { return getToken(PATOParser.OpBool, 0); }
		public CondicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterCondicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitCondicoes(this);
		}
	}

	public final CondicoesContext condicoes() throws RecognitionException {
		CondicoesContext _localctx = new CondicoesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==OpBool || _la==Cond) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode QIN() { return getToken(PATOParser.QIN, 0); }
		public TerminalNode OPIO() { return getToken(PATOParser.OPIO, 0); }
		public TerminalNode AP() { return getToken(PATOParser.AP, 0); }
		public List<TerminalNode> Var() { return getTokens(PATOParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(PATOParser.Var, i);
		}
		public TerminalNode FP() { return getToken(PATOParser.FP, 0); }
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PATOParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PATOParser.COMMA, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(QIN);
			setState(102);
			match(OPIO);
			setState(103);
			match(AP);
			setState(104);
			match(Var);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(105);
				match(COMMA);
				setState(106);
				match(Var);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(FP);
			setState(113);
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
		public TerminalNode QOUT() { return getToken(PATOParser.QOUT, 0); }
		public TerminalNode OPIO() { return getToken(PATOParser.OPIO, 0); }
		public TerminalNode AP() { return getToken(PATOParser.AP, 0); }
		public List<TerminalNode> Var() { return getTokens(PATOParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(PATOParser.Var, i);
		}
		public TerminalNode FP() { return getToken(PATOParser.FP, 0); }
		public TerminalNode DELIM() { return getToken(PATOParser.DELIM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PATOParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PATOParser.COMMA, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PATOListener ) ((PATOListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(QOUT);
			setState(116);
			match(OPIO);
			setState(117);
			match(AP);
			setState(118);
			match(Var);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(120);
				match(Var);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(FP);
			setState(127);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\66\n\4\f\4\16\49\13\4\3\5\3\5\3\5\3\5\3\5\6\5@\n\5\r\5\16\5A\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tR\n\t\f\t\16\tU"+
		"\13\t\3\n\3\n\3\n\7\nZ\n\n\f\n\16\n]\13\n\3\13\3\13\3\f\3\f\3\f\5\fd\n"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16n\n\16\f\16\16\16q\13\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17|\n\17\f\17\16\17\177"+
		"\13\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\4\4\2\6\6\27\27\3\2\16\17\2\u0082\2!\3\2\2\2\4&\3\2\2\2\6\60\3\2\2"+
		"\2\b?\3\2\2\2\nC\3\2\2\2\fG\3\2\2\2\16I\3\2\2\2\20N\3\2\2\2\22V\3\2\2"+
		"\2\24^\3\2\2\2\26c\3\2\2\2\30e\3\2\2\2\32g\3\2\2\2\34u\3\2\2\2\36 \5\4"+
		"\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2"+
		"\2$%\7\2\2\3%\3\3\2\2\2&\'\7\7\2\2\'(\7\5\2\2()\7\27\2\2)*\7\13\2\2*+"+
		"\5\6\4\2+,\7\f\2\2,-\7\3\2\2-.\5\b\5\2./\7\4\2\2/\5\3\2\2\2\60\61\7\5"+
		"\2\2\61\67\7\27\2\2\62\63\7\22\2\2\63\64\7\5\2\2\64\66\7\27\2\2\65\62"+
		"\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29\67\3\2\2\2"+
		":@\5\n\6\2;@\5\26\f\2<@\5\30\r\2=@\5\f\7\2>@\5\16\b\2?:\3\2\2\2?;\3\2"+
		"\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3"+
		"\2\2\2CD\7\5\2\2DE\7\27\2\2EF\7\21\2\2F\13\3\2\2\2GH\7\b\2\2H\r\3\2\2"+
		"\2IJ\7\27\2\2JK\7\23\2\2KL\5\20\t\2LM\7\21\2\2M\17\3\2\2\2NS\5\22\n\2"+
		"OP\7\20\2\2PR\5\22\n\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\21\3\2"+
		"\2\2US\3\2\2\2V[\5\24\13\2WX\7\20\2\2XZ\5\24\13\2YW\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2[\\\3\2\2\2\\\23\3\2\2\2][\3\2\2\2^_\t\2\2\2_\25\3\2\2\2`d\7"+
		"\20\2\2ad\5\32\16\2bd\5\34\17\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\27\3\2"+
		"\2\2ef\t\3\2\2f\31\3\2\2\2gh\7\24\2\2hi\7\26\2\2ij\7\13\2\2jo\7\27\2\2"+
		"kl\7\22\2\2ln\7\27\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2"+
		"\2qo\3\2\2\2rs\7\f\2\2st\7\21\2\2t\33\3\2\2\2uv\7\25\2\2vw\7\26\2\2wx"+
		"\7\13\2\2x}\7\27\2\2yz\7\22\2\2z|\7\27\2\2{y\3\2\2\2|\177\3\2\2\2}{\3"+
		"\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\f\2\2\u0081"+
		"\u0082\7\21\2\2\u0082\35\3\2\2\2\13!\67?AS[co}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}