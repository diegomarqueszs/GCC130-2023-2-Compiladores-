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
		Tipo=1, Rep=2, Atr=3, OpArit=4, AQ=5, FQ=6, AP=7, FP=8, OpRel=9, OpBool=10, 
		Var=11, NumI=12, NumR=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Tipo", "Rep", "Atr", "OpArit", "AQ", "FQ", "AP", "FP", "OpRel", "OpBool", 
			"Var", "NumI", "NumR", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<-'", null, "'<quack>'", "'</quack>'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Tipo", "Rep", "Atr", "OpArit", "AQ", "FQ", "AP", "FP", "OpRel", 
			"OpBool", "Var", "NumI", "NumR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2?\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3I\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nl\n\n\3\13\3\13\3\13\5\13q\n\13\3\f\3\f\3\f\7\fv\n\f\f\f\16"+
		"\fy\13\f\3\r\3\r\3\16\6\16~\n\16\r\16\16\16\177\3\16\3\16\6\16\u0084\n"+
		"\16\r\16\16\16\u0085\5\16\u0088\n\16\3\17\3\17\3\20\3\20\3\21\6\21\u008f"+
		"\n\21\r\21\16\21\u0090\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\20\3\2\6\6\2\'\',-//\61\61"+
		"\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00a1\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2!\3\2\2\2\3>\3\2\2\2\5H\3\2\2\2\7J\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\r"+
		"W\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23k\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2"+
		"\31z\3\2\2\2\33}\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008e\3\2"+
		"\2\2#$\7s\2\2$%\7k\2\2%&\7p\2\2&?\7v\2\2\'(\7s\2\2()\7d\2\2)*\7q\2\2*"+
		"+\7q\2\2+?\7n\2\2,-\7s\2\2-.\7f\2\2./\7q\2\2/\60\7w\2\2\60\61\7d\2\2\61"+
		"\62\7n\2\2\62?\7g\2\2\63\64\7s\2\2\64\65\7e\2\2\65\66\7j\2\2\66\67\7c"+
		"\2\2\67?\7t\2\289\7k\2\29?\7h\2\2:;\7g\2\2;<\7n\2\2<=\7u\2\2=?\7g\2\2"+
		">#\3\2\2\2>\'\3\2\2\2>,\3\2\2\2>\63\3\2\2\2>8\3\2\2\2>:\3\2\2\2?\4\3\2"+
		"\2\2@A\7y\2\2AB\7j\2\2BC\7k\2\2CD\7n\2\2DI\7g\2\2EF\7h\2\2FG\7q\2\2GI"+
		"\7t\2\2H@\3\2\2\2HE\3\2\2\2I\6\3\2\2\2JK\7>\2\2KL\7/\2\2L\b\3\2\2\2MN"+
		"\t\2\2\2N\n\3\2\2\2OP\7>\2\2PQ\7s\2\2QR\7w\2\2RS\7c\2\2ST\7e\2\2TU\7m"+
		"\2\2UV\7@\2\2V\f\3\2\2\2WX\7>\2\2XY\7\61\2\2YZ\7s\2\2Z[\7w\2\2[\\\7c\2"+
		"\2\\]\7e\2\2]^\7m\2\2^_\7@\2\2_\16\3\2\2\2`a\7*\2\2a\20\3\2\2\2bc\7+\2"+
		"\2c\22\3\2\2\2dl\7>\2\2ef\7>\2\2fl\7@\2\2gh\7>\2\2hi\7#\2\2il\7@\2\2j"+
		"l\7@\2\2kd\3\2\2\2ke\3\2\2\2kg\3\2\2\2kj\3\2\2\2l\24\3\2\2\2mq\7G\2\2"+
		"no\7Q\2\2oq\7W\2\2pm\3\2\2\2pn\3\2\2\2q\26\3\2\2\2rw\5\35\17\2sv\5\37"+
		"\20\2tv\5\35\17\2us\3\2\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\30"+
		"\3\2\2\2yw\3\2\2\2z{\5\37\20\2{\32\3\2\2\2|~\5\37\20\2}|\3\2\2\2~\177"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0087\3\2\2\2\u0081\u0083"+
		"\7\60\2\2\u0082\u0084\5\37\20\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0081"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\34\3\2\2\2\u0089\u008a\t\3\2\2\u008a"+
		"\36\3\2\2\2\u008b\u008c\t\4\2\2\u008c \3\2\2\2\u008d\u008f\t\5\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\21\2\2\u0093\"\3\2\2\2\r\2>Hkp"+
		"uw\177\u0085\u0087\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}