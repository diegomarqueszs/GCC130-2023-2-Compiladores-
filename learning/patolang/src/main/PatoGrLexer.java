// Generated from .\PatoGr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PatoGrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nU\n\n\f\n\16\nX\13\n"+
		"\3\13\6\13[\n\13\r\13\16\13\\\3\13\3\13\6\13a\n\13\r\13\16\13b\5\13e\n"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\rn\n\r\3\16\3\16\3\17\3\17\3\20\6\20"+
		"u\n\20\r\20\16\20v\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\2\35\2\37\17\3\2\6\5\2,-//\61\61\4\2C\\c|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2\177\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5"+
		"-\3\2\2\2\7>\3\2\2\2\t@\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21"+
		"I\3\2\2\2\23Q\3\2\2\2\25Z\3\2\2\2\27f\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2"+
		"\35q\3\2\2\2\37t\3\2\2\2!\"\7F\2\2\"#\7G\2\2#$\7E\2\2$%\7N\2\2%&\7C\2"+
		"\2&\'\7T\2\2\'(\7C\2\2()\7E\2\2)*\7Q\2\2*+\7G\2\2+,\7U\2\2,\4\3\2\2\2"+
		"-.\7C\2\2./\7N\2\2/\60\7I\2\2\60\61\7Q\2\2\61\62\7T\2\2\62\63\7K\2\2\63"+
		"\64\7V\2\2\64\65\7O\2\2\65\66\7Q\2\2\66\6\3\2\2\2\678\7k\2\289\7p\2\2"+
		"9?\7v\2\2:;\7t\2\2;<\7g\2\2<=\7c\2\2=?\7n\2\2>\67\3\2\2\2>:\3\2\2\2?\b"+
		"\3\2\2\2@A\7>\2\2AB\7/\2\2B\n\3\2\2\2CD\7c\2\2D\f\3\2\2\2EF\7*\2\2F\16"+
		"\3\2\2\2GH\7+\2\2H\20\3\2\2\2IJ\7G\2\2JK\7U\2\2KL\7E\2\2LM\7T\2\2MN\7"+
		"G\2\2NO\7X\2\2OP\7C\2\2P\22\3\2\2\2QV\5\33\16\2RU\5\35\17\2SU\5\33\16"+
		"\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\24\3\2\2\2XV\3\2"+
		"\2\2Y[\5\35\17\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]d\3\2\2\2"+
		"^`\7\60\2\2_a\5\35\17\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2"+
		"\2\2d^\3\2\2\2de\3\2\2\2e\26\3\2\2\2fg\t\2\2\2g\30\3\2\2\2hi\7>\2\2ij"+
		"\7#\2\2jn\7@\2\2kl\7>\2\2ln\7@\2\2mh\3\2\2\2mk\3\2\2\2n\32\3\2\2\2op\t"+
		"\3\2\2p\34\3\2\2\2qr\t\4\2\2r\36\3\2\2\2su\t\5\2\2ts\3\2\2\2uv\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\20\2\2y \3\2\2\2\13\2>TV\\bdmv\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}