// Generated from PATO.G4 by ANTLR 4.7.2

package GCCC130.src;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PATOLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Tipo=3, Numero=4, RTN=5, AQ=6, FQ=7, AP=8, FP=9, OpRel=10, 
		OpBool=11, Cond=12, OpArit=13, DELIM=14, COMMA=15, Atr=16, QIN=17, QOUT=18, 
		OPIN=19, OPOUT=20, Var=21, NumI=22, NumR=23, COMMENT=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Tipo", "Numero", "RTN", "AQ", "FQ", "AP", "FP", "OpRel", 
			"OpBool", "Cond", "OpArit", "DELIM", "COMMA", "Atr", "QIN", "QOUT", "OPIN", 
			"OPOUT", "Var", "NumI", "NumR", "LETRA", "DIGITO", "COMMENT", "WS"
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


	public PATOLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PATO.G4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00e3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\5\3\5\5\5`\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u0088\n\13\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0095\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u00ba"+
		"\n\26\f\26\16\26\u00bd\13\26\3\27\3\27\3\30\6\30\u00c2\n\30\r\30\16\30"+
		"\u00c3\3\30\3\30\6\30\u00c8\n\30\r\30\16\30\u00c9\5\30\u00cc\n\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00d6\n\33\f\33\16\33\u00d9\13"+
		"\33\3\33\3\33\3\34\6\34\u00de\n\34\r\34\16\34\u00df\3\34\3\34\2\2\35\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\32\67\33\3\2\7\6\2\'"+
		"\',-//\61\61\4\2C\\c|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00f3"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5?\3\2\2\2\7[\3\2\2\2\t_\3\2\2"+
		"\2\13a\3\2\2\2\rg\3\2\2\2\17o\3\2\2\2\21x\3\2\2\2\23z\3\2\2\2\25\u0087"+
		"\3\2\2\2\27\u008c\3\2\2\2\31\u0094\3\2\2\2\33\u0096\3\2\2\2\35\u0098\3"+
		"\2\2\2\37\u009a\3\2\2\2!\u009c\3\2\2\2#\u009f\3\2\2\2%\u00a7\3\2\2\2\'"+
		"\u00b0\3\2\2\2)\u00b3\3\2\2\2+\u00b6\3\2\2\2-\u00be\3\2\2\2/\u00c1\3\2"+
		"\2\2\61\u00cd\3\2\2\2\63\u00cf\3\2\2\2\65\u00d1\3\2\2\2\67\u00dd\3\2\2"+
		"\29:\7s\2\2:;\7e\2\2;<\7j\2\2<=\7c\2\2=>\7t\2\2>\4\3\2\2\2?@\7$\2\2@\6"+
		"\3\2\2\2AB\7s\2\2BC\7k\2\2CD\7p\2\2D\\\7v\2\2EF\7s\2\2FG\7d\2\2GH\7q\2"+
		"\2HI\7q\2\2I\\\7n\2\2JK\7s\2\2KL\7f\2\2LM\7q\2\2MN\7w\2\2NO\7d\2\2OP\7"+
		"n\2\2P\\\7g\2\2QR\7s\2\2RS\7e\2\2ST\7j\2\2TU\7c\2\2U\\\7t\2\2VW\7s\2\2"+
		"WX\7x\2\2XY\7q\2\2YZ\7k\2\2Z\\\7f\2\2[A\3\2\2\2[E\3\2\2\2[J\3\2\2\2[Q"+
		"\3\2\2\2[V\3\2\2\2\\\b\3\2\2\2]`\5-\27\2^`\5/\30\2_]\3\2\2\2_^\3\2\2\2"+
		"`\n\3\2\2\2ab\7s\2\2bc\7w\2\2cd\7g\2\2de\7e\2\2ef\7m\2\2f\f\3\2\2\2gh"+
		"\7>\2\2hi\7s\2\2ij\7w\2\2jk\7c\2\2kl\7e\2\2lm\7m\2\2mn\7@\2\2n\16\3\2"+
		"\2\2op\7>\2\2pq\7\61\2\2qr\7s\2\2rs\7w\2\2st\7c\2\2tu\7e\2\2uv\7m\2\2"+
		"vw\7@\2\2w\20\3\2\2\2xy\7*\2\2y\22\3\2\2\2z{\7+\2\2{\24\3\2\2\2|\u0088"+
		"\7>\2\2}~\7>\2\2~\u0088\7@\2\2\177\u0080\7>\2\2\u0080\u0081\7#\2\2\u0081"+
		"\u0088\7@\2\2\u0082\u0088\7@\2\2\u0083\u0084\7@\2\2\u0084\u0088\7?\2\2"+
		"\u0085\u0086\7>\2\2\u0086\u0088\7?\2\2\u0087|\3\2\2\2\u0087}\3\2\2\2\u0087"+
		"\177\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2"+
		"\2\u0088\26\3\2\2\2\u0089\u008d\7G\2\2\u008a\u008b\7Q\2\2\u008b\u008d"+
		"\7W\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008d\30\3\2\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0095\7h\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2"+
		"\u0092\u0093\7u\2\2\u0093\u0095\7g\2\2\u0094\u008e\3\2\2\2\u0094\u0090"+
		"\3\2\2\2\u0095\32\3\2\2\2\u0096\u0097\t\2\2\2\u0097\34\3\2\2\2\u0098\u0099"+
		"\7=\2\2\u0099\36\3\2\2\2\u009a\u009b\7.\2\2\u009b \3\2\2\2\u009c\u009d"+
		"\7>\2\2\u009d\u009e\7/\2\2\u009e\"\3\2\2\2\u009f\u00a0\7s\2\2\u00a0\u00a1"+
		"\7w\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7m\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7s\2\2\u00a8"+
		"\u00a9\7w\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7m\2\2"+
		"\u00ac\u00ad\7q\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7v\2\2\u00af&\3\2\2"+
		"\2\u00b0\u00b1\7@\2\2\u00b1\u00b2\7@\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7"+
		">\2\2\u00b4\u00b5\7>\2\2\u00b5*\3\2\2\2\u00b6\u00bb\5\61\31\2\u00b7\u00ba"+
		"\5\63\32\2\u00b8\u00ba\5\61\31\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc,"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\5\63\32\2\u00bf.\3\2\2\2\u00c0"+
		"\u00c2\5\63\32\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cb\3\2\2\2\u00c5\u00c7\7\60\2\2\u00c6"+
		"\u00c8\5\63\32\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\t\3\2\2\u00ce\62\3\2\2\2\u00cf"+
		"\u00d0\t\4\2\2\u00d0\64\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\61"+
		"\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\n\5\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\b\33\2\2\u00db\66\3\2\2\2\u00dc\u00de"+
		"\t\6\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\34\2\2\u00e28\3\2\2\2"+
		"\17\2[_\u0087\u008c\u0094\u00b9\u00bb\u00c3\u00c9\u00cb\u00d7\u00df\3"+
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