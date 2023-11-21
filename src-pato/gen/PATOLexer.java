// Generated from C:/compilas/GCC130-compiladores/src-pato/PATO.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PATOLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u000e\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"=\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bj\b\b\u0001\t\u0001\t\u0001\t\u0003\to\b\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\nt\b\n\n\n\f\nw\t\n\u0001\u000b\u0001\u000b\u0001\f\u0004\f|\b\f\u000b"+
		"\f\f\f}\u0001\f\u0001\f\u0004\f\u0082\b\f\u000b\f\f\f\u0083\u0003\f\u0086"+
		"\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u008d"+
		"\b\u000f\u000b\u000f\f\u000f\u008e\u0001\u000f\u0001\u000f\u0000\u0000"+
		"\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000"+
		"\u001d\u0000\u001f\u000e\u0001\u0000\u0004\u0004\u0000%%*+--//\u0002\u0000"+
		"AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u009f\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0001<\u0001\u0000\u0000\u0000\u0003"+
		"F\u0001\u0000\u0000\u0000\u0005H\u0001\u0000\u0000\u0000\u0007K\u0001"+
		"\u0000\u0000\u0000\tM\u0001\u0000\u0000\u0000\u000bU\u0001\u0000\u0000"+
		"\u0000\r^\u0001\u0000\u0000\u0000\u000f`\u0001\u0000\u0000\u0000\u0011"+
		"i\u0001\u0000\u0000\u0000\u0013n\u0001\u0000\u0000\u0000\u0015p\u0001"+
		"\u0000\u0000\u0000\u0017x\u0001\u0000\u0000\u0000\u0019{\u0001\u0000\u0000"+
		"\u0000\u001b\u0087\u0001\u0000\u0000\u0000\u001d\u0089\u0001\u0000\u0000"+
		"\u0000\u001f\u008c\u0001\u0000\u0000\u0000!\"\u0005q\u0000\u0000\"#\u0005"+
		"i\u0000\u0000#$\u0005n\u0000\u0000$=\u0005t\u0000\u0000%&\u0005q\u0000"+
		"\u0000&\'\u0005b\u0000\u0000\'(\u0005o\u0000\u0000()\u0005o\u0000\u0000"+
		")=\u0005l\u0000\u0000*+\u0005q\u0000\u0000+,\u0005d\u0000\u0000,-\u0005"+
		"o\u0000\u0000-.\u0005u\u0000\u0000./\u0005b\u0000\u0000/0\u0005l\u0000"+
		"\u00000=\u0005e\u0000\u000012\u0005q\u0000\u000023\u0005c\u0000\u0000"+
		"34\u0005h\u0000\u000045\u0005a\u0000\u00005=\u0005r\u0000\u000067\u0005"+
		"i\u0000\u00007=\u0005f\u0000\u000089\u0005e\u0000\u00009:\u0005l\u0000"+
		"\u0000:;\u0005s\u0000\u0000;=\u0005e\u0000\u0000<!\u0001\u0000\u0000\u0000"+
		"<%\u0001\u0000\u0000\u0000<*\u0001\u0000\u0000\u0000<1\u0001\u0000\u0000"+
		"\u0000<6\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000=\u0002\u0001"+
		"\u0000\u0000\u0000>?\u0005w\u0000\u0000?@\u0005h\u0000\u0000@A\u0005i"+
		"\u0000\u0000AB\u0005l\u0000\u0000BG\u0005e\u0000\u0000CD\u0005f\u0000"+
		"\u0000DE\u0005o\u0000\u0000EG\u0005r\u0000\u0000F>\u0001\u0000\u0000\u0000"+
		"FC\u0001\u0000\u0000\u0000G\u0004\u0001\u0000\u0000\u0000HI\u0005<\u0000"+
		"\u0000IJ\u0005-\u0000\u0000J\u0006\u0001\u0000\u0000\u0000KL\u0007\u0000"+
		"\u0000\u0000L\b\u0001\u0000\u0000\u0000MN\u0005<\u0000\u0000NO\u0005q"+
		"\u0000\u0000OP\u0005u\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005c\u0000"+
		"\u0000RS\u0005k\u0000\u0000ST\u0005>\u0000\u0000T\n\u0001\u0000\u0000"+
		"\u0000UV\u0005<\u0000\u0000VW\u0005/\u0000\u0000WX\u0005q\u0000\u0000"+
		"XY\u0005u\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005"+
		"k\u0000\u0000\\]\u0005>\u0000\u0000]\f\u0001\u0000\u0000\u0000^_\u0005"+
		"(\u0000\u0000_\u000e\u0001\u0000\u0000\u0000`a\u0005)\u0000\u0000a\u0010"+
		"\u0001\u0000\u0000\u0000bj\u0005<\u0000\u0000cd\u0005<\u0000\u0000dj\u0005"+
		">\u0000\u0000ef\u0005<\u0000\u0000fg\u0005!\u0000\u0000gj\u0005>\u0000"+
		"\u0000hj\u0005>\u0000\u0000ib\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000"+
		"\u0000ie\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\u0012\u0001"+
		"\u0000\u0000\u0000ko\u0005E\u0000\u0000lm\u0005O\u0000\u0000mo\u0005U"+
		"\u0000\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000o\u0014"+
		"\u0001\u0000\u0000\u0000pu\u0003\u001b\r\u0000qt\u0003\u001d\u000e\u0000"+
		"rt\u0003\u001b\r\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\u0016\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0003"+
		"\u001d\u000e\u0000y\u0018\u0001\u0000\u0000\u0000z|\u0003\u001d\u000e"+
		"\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0085\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0005.\u0000\u0000\u0080\u0082\u0003\u001d\u000e\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u001a\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0007\u0001\u0000\u0000\u0088\u001c\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0007\u0002\u0000\u0000\u008a\u001e\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0007\u0003\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0006\u000f\u0000\u0000\u0091 \u0001\u0000\u0000\u0000\u000b\u0000"+
		"<Finsu}\u0083\u0085\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}