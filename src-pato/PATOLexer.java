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
		OpArit=11, DELIM=12, COMMA=13, Atr=14, QIN=15, QOUT=16, OPIO=17, Var=18, 
		NumI=19, NumR=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Tipo", "Numero", "RTN", "AQ", "FQ", "AP", "FP", "OpRel", "OpBool", "Cond", 
			"OpArit", "DELIM", "COMMA", "Atr", "QIN", "QOUT", "OPIO", "Var", "NumI", 
			"NumR", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'queck'", "'<quack>'", "'</quack>'", "'('", "')'", 
			null, null, null, null, "';'", "','", "'<-'", "'quackin'", "'quackout'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Tipo", "Numero", "RTN", "AQ", "FQ", "AP", "FP", "OpRel", "OpBool", 
			"Cond", "OpArit", "DELIM", "COMMA", "Atr", "QIN", "QOUT", "OPIO", "Var", 
			"NumI", "NumR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00c8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2L\n\2\3\3\3\3\5\3P\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tx\n\t\3\n\3\n\3\n\5\n}\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0085"+
		"\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00a5\n\22\3\23\3\23\3\23\7\23\u00aa\n\23\f\23\16\23\u00ad"+
		"\13\23\3\24\3\24\3\25\6\25\u00b2\n\25\r\25\16\25\u00b3\3\25\3\25\6\25"+
		"\u00b8\n\25\r\25\16\25\u00b9\5\25\u00bc\n\25\3\26\3\26\3\27\3\27\3\30"+
		"\6\30\u00c3\n\30\r\30\16\30\u00c4\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\2-\2/\27\3\2\6\6\2\'\',-//\61\61\4\2C\\c|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u00d8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2/\3\2\2\2\3K\3\2"+
		"\2\2\5O\3\2\2\2\7Q\3\2\2\2\tW\3\2\2\2\13_\3\2\2\2\rh\3\2\2\2\17j\3\2\2"+
		"\2\21w\3\2\2\2\23|\3\2\2\2\25\u0084\3\2\2\2\27\u0086\3\2\2\2\31\u0088"+
		"\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u008f\3\2\2\2!\u0097\3\2"+
		"\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00ae\3\2\2\2)\u00b1\3\2\2\2+\u00bd"+
		"\3\2\2\2-\u00bf\3\2\2\2/\u00c2\3\2\2\2\61\62\7s\2\2\62\63\7k\2\2\63\64"+
		"\7p\2\2\64L\7v\2\2\65\66\7s\2\2\66\67\7d\2\2\678\7q\2\289\7q\2\29L\7n"+
		"\2\2:;\7s\2\2;<\7f\2\2<=\7q\2\2=>\7w\2\2>?\7d\2\2?@\7n\2\2@L\7g\2\2AB"+
		"\7s\2\2BC\7e\2\2CD\7j\2\2DE\7c\2\2EL\7t\2\2FG\7s\2\2GH\7x\2\2HI\7q\2\2"+
		"IJ\7k\2\2JL\7f\2\2K\61\3\2\2\2K\65\3\2\2\2K:\3\2\2\2KA\3\2\2\2KF\3\2\2"+
		"\2L\4\3\2\2\2MP\5\'\24\2NP\5)\25\2OM\3\2\2\2ON\3\2\2\2P\6\3\2\2\2QR\7"+
		"s\2\2RS\7w\2\2ST\7g\2\2TU\7e\2\2UV\7m\2\2V\b\3\2\2\2WX\7>\2\2XY\7s\2\2"+
		"YZ\7w\2\2Z[\7c\2\2[\\\7e\2\2\\]\7m\2\2]^\7@\2\2^\n\3\2\2\2_`\7>\2\2`a"+
		"\7\61\2\2ab\7s\2\2bc\7w\2\2cd\7c\2\2de\7e\2\2ef\7m\2\2fg\7@\2\2g\f\3\2"+
		"\2\2hi\7*\2\2i\16\3\2\2\2jk\7+\2\2k\20\3\2\2\2lx\7>\2\2mn\7>\2\2nx\7@"+
		"\2\2op\7>\2\2pq\7#\2\2qx\7@\2\2rx\7@\2\2st\7@\2\2tx\7?\2\2uv\7>\2\2vx"+
		"\7?\2\2wl\3\2\2\2wm\3\2\2\2wo\3\2\2\2wr\3\2\2\2ws\3\2\2\2wu\3\2\2\2x\22"+
		"\3\2\2\2y}\7G\2\2z{\7Q\2\2{}\7W\2\2|y\3\2\2\2|z\3\2\2\2}\24\3\2\2\2~\177"+
		"\7k\2\2\177\u0085\7h\2\2\u0080\u0081\7g\2\2\u0081\u0082\7n\2\2\u0082\u0083"+
		"\7u\2\2\u0083\u0085\7g\2\2\u0084~\3\2\2\2\u0084\u0080\3\2\2\2\u0085\26"+
		"\3\2\2\2\u0086\u0087\t\2\2\2\u0087\30\3\2\2\2\u0088\u0089\7=\2\2\u0089"+
		"\32\3\2\2\2\u008a\u008b\7.\2\2\u008b\34\3\2\2\2\u008c\u008d\7>\2\2\u008d"+
		"\u008e\7/\2\2\u008e\36\3\2\2\2\u008f\u0090\7s\2\2\u0090\u0091\7w\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7e\2\2\u0093\u0094\7m\2\2\u0094\u0095\7k\2\2"+
		"\u0095\u0096\7p\2\2\u0096 \3\2\2\2\u0097\u0098\7s\2\2\u0098\u0099\7w\2"+
		"\2\u0099\u009a\7c\2\2\u009a\u009b\7e\2\2\u009b\u009c\7m\2\2\u009c\u009d"+
		"\7q\2\2\u009d\u009e\7w\2\2\u009e\u009f\7v\2\2\u009f\"\3\2\2\2\u00a0\u00a1"+
		"\7>\2\2\u00a1\u00a5\7>\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a5\7@\2\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5$\3\2\2\2\u00a6\u00ab\5+\26\2"+
		"\u00a7\u00aa\5-\27\2\u00a8\u00aa\5+\26\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"&\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5-\27\2\u00af(\3\2\2\2\u00b0"+
		"\u00b2\5-\27\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00bb\3\2\2\2\u00b5\u00b7\7\60\2\2\u00b6"+
		"\u00b8\5-\27\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc*\3\2\2\2\u00bd\u00be\t\3\2\2\u00be,\3\2\2\2\u00bf"+
		"\u00c0\t\4\2\2\u00c0.\3\2\2\2\u00c1\u00c3\t\5\2\2\u00c2\u00c1\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\b\30\2\2\u00c7\60\3\2\2\2\17\2KOw|\u0084\u00a4\u00a9"+
		"\u00ab\u00b3\u00b9\u00bb\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}