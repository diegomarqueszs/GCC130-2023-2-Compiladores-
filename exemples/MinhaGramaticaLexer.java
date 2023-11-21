package exemples;// Generated from .\MinhaGramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEC=1, ALG=2, TIPO=3, ATR=4, A=5, AP=6, FP=7, ESC=8, ID=9, NUM=10, OP_ARIT=11, 
		WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEC", "ALG", "TIPO", "ATR", "A", "AP", "FP", "ESC", "ID", "NUM", "OP_ARIT", 
			"LETRA", "DIGITO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARACOES'", "'ALGORITMO'", null, "'atribuir'", "'a'", "'('", 
			"')'", "'ESCREVA'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEC", "ALG", "TIPO", "ATR", "A", "AP", "FP", "ESC", "ID", "NUM", 
			"OP_ARIT", "WS"
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


	public MinhaGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "exemples/MinhaGramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nY\n\n"+
		"\f\n\16\n\\\13\n\3\13\6\13_\n\13\r\13\16\13`\3\13\3\13\6\13e\n\13\r\13"+
		"\16\13f\5\13i\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17r\n\17\r\17\16\17"+
		"s\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\2\33\2\35\16\3\2\6\5\2,-//\61\61\4\2C\\c|\3\2\62;\5\2\13\f\17\17\""+
		"\"\2{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5+\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13G\3"+
		"\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23U\3\2\2\2\25^\3\2\2\2\27j"+
		"\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35q\3\2\2\2\37 \7F\2\2 !\7G\2\2!\"\7"+
		"E\2\2\"#\7N\2\2#$\7C\2\2$%\7T\2\2%&\7C\2\2&\'\7E\2\2\'(\7Q\2\2()\7G\2"+
		"\2)*\7U\2\2*\4\3\2\2\2+,\7C\2\2,-\7N\2\2-.\7I\2\2./\7Q\2\2/\60\7T\2\2"+
		"\60\61\7K\2\2\61\62\7V\2\2\62\63\7O\2\2\63\64\7Q\2\2\64\6\3\2\2\2\65\66"+
		"\7k\2\2\66\67\7p\2\2\67=\7v\2\289\7t\2\29:\7g\2\2:;\7c\2\2;=\7n\2\2<\65"+
		"\3\2\2\2<8\3\2\2\2=\b\3\2\2\2>?\7c\2\2?@\7v\2\2@A\7t\2\2AB\7k\2\2BC\7"+
		"d\2\2CD\7w\2\2DE\7k\2\2EF\7t\2\2F\n\3\2\2\2GH\7c\2\2H\f\3\2\2\2IJ\7*\2"+
		"\2J\16\3\2\2\2KL\7+\2\2L\20\3\2\2\2MN\7G\2\2NO\7U\2\2OP\7E\2\2PQ\7T\2"+
		"\2QR\7G\2\2RS\7X\2\2ST\7C\2\2T\22\3\2\2\2UZ\5\31\r\2VY\5\33\16\2WY\5\31"+
		"\r\2XV\3\2\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\24\3\2\2\2\\"+
		"Z\3\2\2\2]_\5\33\16\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ah\3\2\2"+
		"\2bd\7\60\2\2ce\5\33\16\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3"+
		"\2\2\2hb\3\2\2\2hi\3\2\2\2i\26\3\2\2\2jk\t\2\2\2k\30\3\2\2\2lm\t\3\2\2"+
		"m\32\3\2\2\2no\t\4\2\2o\34\3\2\2\2pr\t\5\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tu\3\2\2\2uv\b\17\2\2v\36\3\2\2\2\n\2<XZ`fhs\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}