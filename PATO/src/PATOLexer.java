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
		T__0=1, Tipo=2, Numero=3, RTN=4, AQ=5, FQ=6, AP=7, FP=8, OpRel=9, OpBool=10, 
		Cond=11, OpArit=12, DELIM=13, COMMA=14, Atr=15, QIN=16, QOUT=17, OPIN=18, 
		OPOUT=19, Var=20, NumI=21, NumR=22, COMMENT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Tipo", "Numero", "RTN", "AQ", "FQ", "AP", "FP", "OpRel", "OpBool", 
			"Cond", "OpArit", "DELIM", "COMMA", "Atr", "QIN", "QOUT", "OPIN", "OPOUT", 
			"Var", "NumI", "NumR", "LETRA", "DIGITO", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", null, null, "'queck'", "'<quack>'", "'</quack>'", "'('", 
			"')'", null, null, null, null, "';'", "','", "'<-'", "'quackin'", "'quackout'", 
			"'>>'", "'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Tipo", "Numero", "RTN", "AQ", "FQ", "AP", "FP", "OpRel", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00db\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3T\n\3\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\13\3\13\3\13\5\13"+
		"\u0085\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\7\25\u00b2\n\25\f\25\16\25\u00b5\13\25\3\26\3\26\3\27\6"+
		"\27\u00ba\n\27\r\27\16\27\u00bb\3\27\3\27\6\27\u00c0\n\27\r\27\16\27\u00c1"+
		"\5\27\u00c4\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00ce\n"+
		"\32\f\32\16\32\u00d1\13\32\3\32\3\32\3\33\6\33\u00d6\n\33\r\33\16\33\u00d7"+
		"\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\31\65\32"+
		"\3\2\7\6\2\'\',-//\61\61\4\2C\\c|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\2\u00eb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5S\3\2\2\2\7W\3\2\2\2\tY\3\2"+
		"\2\2\13_\3\2\2\2\rg\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23\177\3\2\2\2\25"+
		"\u0084\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0092"+
		"\3\2\2\2\37\u0094\3\2\2\2!\u0097\3\2\2\2#\u009f\3\2\2\2%\u00a8\3\2\2\2"+
		"\'\u00ab\3\2\2\2)\u00ae\3\2\2\2+\u00b6\3\2\2\2-\u00b9\3\2\2\2/\u00c5\3"+
		"\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00d5\3\2\2\2\678\7$\2\28"+
		"\4\3\2\2\29:\7s\2\2:;\7k\2\2;<\7p\2\2<T\7v\2\2=>\7s\2\2>?\7d\2\2?@\7q"+
		"\2\2@A\7q\2\2AT\7n\2\2BC\7s\2\2CD\7f\2\2DE\7q\2\2EF\7w\2\2FG\7d\2\2GH"+
		"\7n\2\2HT\7g\2\2IJ\7s\2\2JK\7e\2\2KL\7j\2\2LM\7c\2\2MT\7t\2\2NO\7s\2\2"+
		"OP\7x\2\2PQ\7q\2\2QR\7k\2\2RT\7f\2\2S9\3\2\2\2S=\3\2\2\2SB\3\2\2\2SI\3"+
		"\2\2\2SN\3\2\2\2T\6\3\2\2\2UX\5+\26\2VX\5-\27\2WU\3\2\2\2WV\3\2\2\2X\b"+
		"\3\2\2\2YZ\7s\2\2Z[\7w\2\2[\\\7g\2\2\\]\7e\2\2]^\7m\2\2^\n\3\2\2\2_`\7"+
		">\2\2`a\7s\2\2ab\7w\2\2bc\7c\2\2cd\7e\2\2de\7m\2\2ef\7@\2\2f\f\3\2\2\2"+
		"gh\7>\2\2hi\7\61\2\2ij\7s\2\2jk\7w\2\2kl\7c\2\2lm\7e\2\2mn\7m\2\2no\7"+
		"@\2\2o\16\3\2\2\2pq\7*\2\2q\20\3\2\2\2rs\7+\2\2s\22\3\2\2\2t\u0080\7>"+
		"\2\2uv\7>\2\2v\u0080\7@\2\2wx\7>\2\2xy\7#\2\2y\u0080\7@\2\2z\u0080\7@"+
		"\2\2{|\7@\2\2|\u0080\7?\2\2}~\7>\2\2~\u0080\7?\2\2\177t\3\2\2\2\177u\3"+
		"\2\2\2\177w\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\24\3"+
		"\2\2\2\u0081\u0085\7G\2\2\u0082\u0083\7Q\2\2\u0083\u0085\7W\2\2\u0084"+
		"\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0085\26\3\2\2\2\u0086\u0087\7k\2\2"+
		"\u0087\u008d\7h\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b"+
		"\7u\2\2\u008b\u008d\7g\2\2\u008c\u0086\3\2\2\2\u008c\u0088\3\2\2\2\u008d"+
		"\30\3\2\2\2\u008e\u008f\t\2\2\2\u008f\32\3\2\2\2\u0090\u0091\7=\2\2\u0091"+
		"\34\3\2\2\2\u0092\u0093\7.\2\2\u0093\36\3\2\2\2\u0094\u0095\7>\2\2\u0095"+
		"\u0096\7/\2\2\u0096 \3\2\2\2\u0097\u0098\7s\2\2\u0098\u0099\7w\2\2\u0099"+
		"\u009a\7c\2\2\u009a\u009b\7e\2\2\u009b\u009c\7m\2\2\u009c\u009d\7k\2\2"+
		"\u009d\u009e\7p\2\2\u009e\"\3\2\2\2\u009f\u00a0\7s\2\2\u00a0\u00a1\7w"+
		"\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7m\2\2\u00a4\u00a5"+
		"\7q\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7v\2\2\u00a7$\3\2\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9\u00aa\7@\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad"+
		"\7>\2\2\u00ad(\3\2\2\2\u00ae\u00b3\5/\30\2\u00af\u00b2\5\61\31\2\u00b0"+
		"\u00b2\5/\30\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4*\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\5\61\31\2\u00b7,\3\2\2\2\u00b8\u00ba\5\61\31\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00c3\3\2\2\2\u00bd\u00bf\7\60\2\2\u00be\u00c0\5\61\31\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		".\3\2\2\2\u00c5\u00c6\t\3\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\t\4\2\2\u00c8"+
		"\62\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cf\3\2"+
		"\2\2\u00cc\u00ce\n\5\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d3\b\32\2\2\u00d3\64\3\2\2\2\u00d4\u00d6\t\6\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\b\33\2\2\u00da\66\3\2\2\2\17\2SW\177\u0084"+
		"\u008c\u00b1\u00b3\u00bb\u00c1\u00c3\u00cf\u00d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}