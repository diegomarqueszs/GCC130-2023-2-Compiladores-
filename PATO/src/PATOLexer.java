// Generated from PATO.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PATOLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Tipo=1, Numero=2, RTN=3, AQ=4, FQ=5, AP=6, FP=7, OpRel=8, OpBool=9, Cond=10, 
		OpArit=11, DELIM=12, COMMA=13, Atr=14, QIN=15, QOUT=16, OPIN=17, OPOUT=18, 
		Var=19, NumI=20, NumR=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Tipo", "Numero", "RTN", "AQ", "FQ", "AP", "FP", "OpRel", "OpBool", "Cond", 
			"OpArit", "DELIM", "COMMA", "Atr", "QIN", "QOUT", "OPIN", "OPOUT", "Var", 
			"NumI", "NumR", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'queck'", "'<quack>'", "'</quack>'", "'('", "')'", 
			null, null, null, null, "';'", "','", "'<-'", "'quackin'", "'quackout'", 
			"'>>'", "'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Tipo", "Numero", "RTN", "AQ", "FQ", "AP", "FP", "OpRel", "OpBool", 
			"Cond", "OpArit", "DELIM", "COMMA", "Atr", "QIN", "QOUT", "OPIN", "OPOUT", 
			"Var", "NumI", "NumR", "WS"
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


	public PATOLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PATO.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00ca\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2N\n\2\3\3\3\3\5\3R\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\tz\n\t\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0087\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00ac\n\24\f\24"+
		"\16\24\u00af\13\24\3\25\3\25\3\26\6\26\u00b4\n\26\r\26\16\26\u00b5\3\26"+
		"\3\26\6\26\u00ba\n\26\r\26\16\26\u00bb\5\26\u00be\n\26\3\27\3\27\3\30"+
		"\3\30\3\31\6\31\u00c5\n\31\r\31\16\31\u00c6\3\31\3\31\2\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\2/\2\61\30\3\2\6\6\2\'\',-//\61\61\4\2C\\c|\3\2"+
		"\62;\5\2\13\f\17\17\"\"\2\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2\61\3\2\2\2\3M\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tY\3\2\2\2\13"+
		"a\3\2\2\2\rj\3\2\2\2\17l\3\2\2\2\21y\3\2\2\2\23~\3\2\2\2\25\u0086\3\2"+
		"\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2"+
		"\2\37\u0091\3\2\2\2!\u0099\3\2\2\2#\u00a2\3\2\2\2%\u00a5\3\2\2\2\'\u00a8"+
		"\3\2\2\2)\u00b0\3\2\2\2+\u00b3\3\2\2\2-\u00bf\3\2\2\2/\u00c1\3\2\2\2\61"+
		"\u00c4\3\2\2\2\63\64\7s\2\2\64\65\7k\2\2\65\66\7p\2\2\66N\7v\2\2\678\7"+
		"s\2\289\7d\2\29:\7q\2\2:;\7q\2\2;N\7n\2\2<=\7s\2\2=>\7f\2\2>?\7q\2\2?"+
		"@\7w\2\2@A\7d\2\2AB\7n\2\2BN\7g\2\2CD\7s\2\2DE\7e\2\2EF\7j\2\2FG\7c\2"+
		"\2GN\7t\2\2HI\7s\2\2IJ\7x\2\2JK\7q\2\2KL\7k\2\2LN\7f\2\2M\63\3\2\2\2M"+
		"\67\3\2\2\2M<\3\2\2\2MC\3\2\2\2MH\3\2\2\2N\4\3\2\2\2OR\5)\25\2PR\5+\26"+
		"\2QO\3\2\2\2QP\3\2\2\2R\6\3\2\2\2ST\7s\2\2TU\7w\2\2UV\7g\2\2VW\7e\2\2"+
		"WX\7m\2\2X\b\3\2\2\2YZ\7>\2\2Z[\7s\2\2[\\\7w\2\2\\]\7c\2\2]^\7e\2\2^_"+
		"\7m\2\2_`\7@\2\2`\n\3\2\2\2ab\7>\2\2bc\7\61\2\2cd\7s\2\2de\7w\2\2ef\7"+
		"c\2\2fg\7e\2\2gh\7m\2\2hi\7@\2\2i\f\3\2\2\2jk\7*\2\2k\16\3\2\2\2lm\7+"+
		"\2\2m\20\3\2\2\2nz\7>\2\2op\7>\2\2pz\7@\2\2qr\7>\2\2rs\7#\2\2sz\7@\2\2"+
		"tz\7@\2\2uv\7@\2\2vz\7?\2\2wx\7>\2\2xz\7?\2\2yn\3\2\2\2yo\3\2\2\2yq\3"+
		"\2\2\2yt\3\2\2\2yu\3\2\2\2yw\3\2\2\2z\22\3\2\2\2{\177\7G\2\2|}\7Q\2\2"+
		"}\177\7W\2\2~{\3\2\2\2~|\3\2\2\2\177\24\3\2\2\2\u0080\u0081\7k\2\2\u0081"+
		"\u0087\7h\2\2\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2"+
		"\u0085\u0087\7g\2\2\u0086\u0080\3\2\2\2\u0086\u0082\3\2\2\2\u0087\26\3"+
		"\2\2\2\u0088\u0089\t\2\2\2\u0089\30\3\2\2\2\u008a\u008b\7=\2\2\u008b\32"+
		"\3\2\2\2\u008c\u008d\7.\2\2\u008d\34\3\2\2\2\u008e\u008f\7>\2\2\u008f"+
		"\u0090\7/\2\2\u0090\36\3\2\2\2\u0091\u0092\7s\2\2\u0092\u0093\7w\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7e\2\2\u0095\u0096\7m\2\2\u0096\u0097\7k\2\2"+
		"\u0097\u0098\7p\2\2\u0098 \3\2\2\2\u0099\u009a\7s\2\2\u009a\u009b\7w\2"+
		"\2\u009b\u009c\7c\2\2\u009c\u009d\7e\2\2\u009d\u009e\7m\2\2\u009e\u009f"+
		"\7q\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7v\2\2\u00a1\"\3\2\2\2\u00a2\u00a3"+
		"\7@\2\2\u00a3\u00a4\7@\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7"+
		"\7>\2\2\u00a7&\3\2\2\2\u00a8\u00ad\5-\27\2\u00a9\u00ac\5/\30\2\u00aa\u00ac"+
		"\5-\27\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae(\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00b0\u00b1\5/\30\2\u00b1*\3\2\2\2\u00b2\u00b4\5/\30\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00bd\3\2\2\2\u00b7\u00b9\7\60\2\2\u00b8\u00ba\5/\30\2\u00b9\u00b8\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00be\3\2\2\2\u00be,\3\2\2\2"+
		"\u00bf\u00c0\t\3\2\2\u00c0.\3\2\2\2\u00c1\u00c2\t\4\2\2\u00c2\60\3\2\2"+
		"\2\u00c3\u00c5\t\5\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\31\2\2"+
		"\u00c9\62\3\2\2\2\16\2MQy~\u0086\u00ab\u00ad\u00b5\u00bb\u00bd\u00c6\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}