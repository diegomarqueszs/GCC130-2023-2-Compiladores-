// Generated from c:/Users/55359/Desktop/semestre-atual/Compiladores/Trabalho/GCC130-compiladores/patolang/src/main/PatoGr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PatoGrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEC=1, ALG=2, TIPO=3, ATR=4, A=5, AP=6, FP=7, ESC=8, ID=9, NUM=10, OP_ARIT=11, 
		OP_LOG=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEC", "ALG", "TIPO", "ATR", "A", "AP", "FP", "ESC", "ID", "NUM", "OP_ARIT", 
			"OP_LOG", "LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARACOES'", "'ALGORITMO'", null, "'<-'", "'a'", "'('", "')'", 
			"'ESCREVA'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEC", "ALG", "TIPO", "ATR", "A", "AP", "FP", "ESC", "ID", "NUM", 
			"OP_ARIT", "OP_LOG", "WS"
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


	public PatoGrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PatoGr.g4"; }

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
		"\u0004\u0000\rx\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\bS\b\b\n\b\f\bV\t\b\u0001\t\u0004\tY\b\t\u000b"+
		"\t\f\tZ\u0001\t\u0001\t\u0004\t_\b\t\u000b\t\f\t`\u0003\tc\b\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000bl\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0004\u000e"+
		"s\b\u000e\u000b\u000e\f\u000et\u0001\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\u0000\u001b\u0000"+
		"\u001d\r\u0001\u0000\u0004\u0003\u0000*+--//\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  }\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000"+
		"\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005<\u0001\u0000\u0000\u0000"+
		"\u0007>\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bC\u0001"+
		"\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000"+
		"\u0000\u0011O\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015"+
		"d\u0001\u0000\u0000\u0000\u0017k\u0001\u0000\u0000\u0000\u0019m\u0001"+
		"\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000\u001dr\u0001\u0000\u0000"+
		"\u0000\u001f \u0005D\u0000\u0000 !\u0005E\u0000\u0000!\"\u0005C\u0000"+
		"\u0000\"#\u0005L\u0000\u0000#$\u0005A\u0000\u0000$%\u0005R\u0000\u0000"+
		"%&\u0005A\u0000\u0000&\'\u0005C\u0000\u0000\'(\u0005O\u0000\u0000()\u0005"+
		"E\u0000\u0000)*\u0005S\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005"+
		"A\u0000\u0000,-\u0005L\u0000\u0000-.\u0005G\u0000\u0000./\u0005O\u0000"+
		"\u0000/0\u0005R\u0000\u000001\u0005I\u0000\u000012\u0005T\u0000\u0000"+
		"23\u0005M\u0000\u000034\u0005O\u0000\u00004\u0004\u0001\u0000\u0000\u0000"+
		"56\u0005i\u0000\u000067\u0005n\u0000\u00007=\u0005t\u0000\u000089\u0005"+
		"r\u0000\u00009:\u0005e\u0000\u0000:;\u0005a\u0000\u0000;=\u0005l\u0000"+
		"\u0000<5\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000=\u0006\u0001"+
		"\u0000\u0000\u0000>?\u0005<\u0000\u0000?@\u0005-\u0000\u0000@\b\u0001"+
		"\u0000\u0000\u0000AB\u0005a\u0000\u0000B\n\u0001\u0000\u0000\u0000CD\u0005"+
		"(\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005)\u0000\u0000F\u000e\u0001"+
		"\u0000\u0000\u0000GH\u0005E\u0000\u0000HI\u0005S\u0000\u0000IJ\u0005C"+
		"\u0000\u0000JK\u0005R\u0000\u0000KL\u0005E\u0000\u0000LM\u0005V\u0000"+
		"\u0000MN\u0005A\u0000\u0000N\u0010\u0001\u0000\u0000\u0000OT\u0003\u0019"+
		"\f\u0000PS\u0003\u001b\r\u0000QS\u0003\u0019\f\u0000RP\u0001\u0000\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0012\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WY\u0003\u001b\r\u0000XW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[b\u0001\u0000\u0000\u0000\\^\u0005.\u0000\u0000]_\u0003\u001b\r"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b\\\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0014\u0001\u0000\u0000"+
		"\u0000de\u0007\u0000\u0000\u0000e\u0016\u0001\u0000\u0000\u0000fg\u0005"+
		"<\u0000\u0000gh\u0005!\u0000\u0000hl\u0005>\u0000\u0000ij\u0005<\u0000"+
		"\u0000jl\u0005>\u0000\u0000kf\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000l\u0018\u0001\u0000\u0000\u0000mn\u0007\u0001\u0000\u0000n\u001a"+
		"\u0001\u0000\u0000\u0000op\u0007\u0002\u0000\u0000p\u001c\u0001\u0000"+
		"\u0000\u0000qs\u0007\u0003\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0006\u000e\u0000\u0000w\u001e\u0001\u0000"+
		"\u0000\u0000\t\u0000<RTZ`bkt\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}