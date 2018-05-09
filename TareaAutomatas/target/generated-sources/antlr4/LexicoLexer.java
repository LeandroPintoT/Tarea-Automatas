// Generated from Lexico.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexicoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, WS=3, NUM=4, FLOAT=5, SINO=6, STR=7, MAIN=8, REAL=9, ENTERO=10, 
		BOOL=11, STRING=12, MUESTRA=13, LEE=14, SUMA=15, RESTA=16, MULT=17, DIV=18, 
		MOD=19, AND=20, OR=21, NOT=22, MAYOR=23, MENOR=24, MAIG=25, MEIG=26, IG=27, 
		NIG=28, IF=29, ELSE=30, SWITCH=31, WHILE=32, FOR=33, SQRT=34, FIB=35, 
		COS=36, SEN=37, PRIM=38, POT=39, ASIGN=40, LLI=41, LLD=42, PI=43, PD=44, 
		PCI=45, PCD=46, BEGIN=47, END=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ID", "WS", "SALTO", "DIG", "PUNTO", "TRUE", "NOTRUE", "NUM", 
		"FLOAT", "SINO", "STR", "MAIN", "REAL", "ENTERO", "BOOL", "STRING", "MUESTRA", 
		"LEE", "SUMA", "RESTA", "MULT", "DIV", "MOD", "AND", "OR", "NOT", "MAYOR", 
		"MENOR", "MAIG", "MEIG", "IG", "NIG", "IF", "ELSE", "SWITCH", "WHILE", 
		"FOR", "SQRT", "FIB", "COS", "SEN", "PRIM", "POT", "ASIGN", "LLI", "LLD", 
		"PI", "PD", "PCI", "PCD", "BEGIN", "END"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", null, null, null, null, null, null, "'main'", "'real'", 
		"'int'", "'bool'", "'string'", "'muestra'", "'leer'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'and'", "'or'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='", "'if'", "'else'", "'switch'", "'while'", "'for'", "'sqrt'", "'fib'", 
		"'cos'", "'sin'", "'prim'", "'pou'", "'='", "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "'introIngInf'", "'proyTi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ID", "WS", "NUM", "FLOAT", "SINO", "STR", "MAIN", "REAL", 
		"ENTERO", "BOOL", "STRING", "MUESTRA", "LEE", "SUMA", "RESTA", "MULT", 
		"DIV", "MOD", "AND", "OR", "NOT", "MAYOR", "MENOR", "MAIG", "MEIG", "IG", 
		"NIG", "IF", "ELSE", "SWITCH", "WHILE", "FOR", "SQRT", "FIB", "COS", "SEN", 
		"PRIM", "POT", "ASIGN", "LLI", "LLD", "PI", "PD", "PCI", "PCD", "BEGIN", 
		"END"
	};
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


	public LexicoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexico.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u014e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3u\n\3\r\3\16"+
		"\3v\3\3\7\3z\n\3\f\3\16\3}\13\3\3\4\6\4\u0080\n\4\r\4\16\4\u0081\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\6\n\u009c\n\n\r\n\16\n\u009d\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\u00ab\2\67\3\3\5\4\7\5\t"+
		"\2\13\2\r\2\17\2\21\2\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'"+
		"\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37"+
		"G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k\62\3\2\6\4\2C\\c|\6\2//\62"+
		";C\\c|\5\2\13\13\17\17\"\"\3\2\62;\u014e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5t\3\2\2\2\7\177\3\2"+
		"\2\2\t\u0085\3\2\2\2\13\u0087\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2\2"+
		"\21\u0093\3\2\2\2\23\u009b\3\2\2\2\25\u009f\3\2\2\2\27\u00a5\3\2\2\2\31"+
		"\u00a7\3\2\2\2\33\u00b0\3\2\2\2\35\u00b5\3\2\2\2\37\u00ba\3\2\2\2!\u00be"+
		"\3\2\2\2#\u00c3\3\2\2\2%\u00ca\3\2\2\2\'\u00d2\3\2\2\2)\u00d7\3\2\2\2"+
		"+\u00d9\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63\u00e1"+
		"\3\2\2\2\65\u00e5\3\2\2\2\67\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2"+
		"\2=\u00ee\3\2\2\2?\u00f1\3\2\2\2A\u00f4\3\2\2\2C\u00f7\3\2\2\2E\u00fa"+
		"\3\2\2\2G\u00fd\3\2\2\2I\u0102\3\2\2\2K\u0109\3\2\2\2M\u010f\3\2\2\2O"+
		"\u0113\3\2\2\2Q\u0118\3\2\2\2S\u011c\3\2\2\2U\u0120\3\2\2\2W\u0124\3\2"+
		"\2\2Y\u0129\3\2\2\2[\u012d\3\2\2\2]\u012f\3\2\2\2_\u0131\3\2\2\2a\u0133"+
		"\3\2\2\2c\u0135\3\2\2\2e\u0137\3\2\2\2g\u0139\3\2\2\2i\u013b\3\2\2\2k"+
		"\u0147\3\2\2\2mn\7j\2\2no\7g\2\2op\7n\2\2pq\7n\2\2qr\7q\2\2r\4\3\2\2\2"+
		"su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xz\t\3\2\2"+
		"yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\6\3\2\2\2}{\3\2\2\2~\u0080\t"+
		"\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\4\2\2\u0084\b\3\2\2\2\u0085"+
		"\u0086\7\f\2\2\u0086\n\3\2\2\2\u0087\u0088\t\5\2\2\u0088\f\3\2\2\2\u0089"+
		"\u008a\7\60\2\2\u008a\16\3\2\2\2\u008b\u008c\7p\2\2\u008c\u008d\7q\2\2"+
		"\u008d\u008e\7v\2\2\u008e\u008f\7g\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7o\2\2\u0091\u0092\7c\2\2\u0092\20\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095"+
		"\7w\2\2\u0095\u0096\7c\2\2\u0096\u0097\7o\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7t\2\2\u0099\22\3\2\2\2\u009a\u009c\5\13\6\2\u009b\u009a\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\24"+
		"\3\2\2\2\u009f\u00a0\5\23\n\2\u00a0\u00a1\5\r\7\2\u00a1\u00a2\5\23\n\2"+
		"\u00a2\26\3\2\2\2\u00a3\u00a6\5\17\b\2\u00a4\u00a6\5\21\t\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\30\3\2\2\2\u00a7\u00ab\7$\2\2\u00a8"+
		"\u00aa\13\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7$\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7t\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9\36\3\2\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd \3\2\2\2\u00be"+
		"\u00bf\7d\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7n\2\2"+
		"\u00c2\"\3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7t"+
		"\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7i\2\2\u00c9$\3"+
		"\2\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7c\2\2"+
		"\u00d1&\3\2\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7g\2"+
		"\2\u00d5\u00d6\7t\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8*\3\2\2\2"+
		"\u00d9\u00da\7/\2\2\u00da,\3\2\2\2\u00db\u00dc\7,\2\2\u00dc.\3\2\2\2\u00dd"+
		"\u00de\7\61\2\2\u00de\60\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0\62\3\2\2\2"+
		"\u00e1\u00e2\7c\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7f\2\2\u00e4\64\3\2"+
		"\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7t\2\2\u00e7\66\3\2\2\2\u00e8\u00e9"+
		"\7#\2\2\u00e98\3\2\2\2\u00ea\u00eb\7@\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7"+
		">\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\7?\2\2\u00f0>\3\2"+
		"\2\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7?\2\2\u00f3@\3\2\2\2\u00f4\u00f5"+
		"\7?\2\2\u00f5\u00f6\7?\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7h\2\2\u00fcF\3"+
		"\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7u\2\2\u0100"+
		"\u0101\7g\2\2\u0101H\3\2\2\2\u0102\u0103\7u\2\2\u0103\u0104\7y\2\2\u0104"+
		"\u0105\7k\2\2\u0105\u0106\7v\2\2\u0106\u0107\7e\2\2\u0107\u0108\7j\2\2"+
		"\u0108J\3\2\2\2\u0109\u010a\7y\2\2\u010a\u010b\7j\2\2\u010b\u010c\7k\2"+
		"\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2\u010eL\3\2\2\2\u010f\u0110\7"+
		"h\2\2\u0110\u0111\7q\2\2\u0111\u0112\7t\2\2\u0112N\3\2\2\2\u0113\u0114"+
		"\7u\2\2\u0114\u0115\7s\2\2\u0115\u0116\7t\2\2\u0116\u0117\7v\2\2\u0117"+
		"P\3\2\2\2\u0118\u0119\7h\2\2\u0119\u011a\7k\2\2\u011a\u011b\7d\2\2\u011b"+
		"R\3\2\2\2\u011c\u011d\7e\2\2\u011d\u011e\7q\2\2\u011e\u011f\7u\2\2\u011f"+
		"T\3\2\2\2\u0120\u0121\7u\2\2\u0121\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123"+
		"V\3\2\2\2\u0124\u0125\7r\2\2\u0125\u0126\7t\2\2\u0126\u0127\7k\2\2\u0127"+
		"\u0128\7o\2\2\u0128X\3\2\2\2\u0129\u012a\7r\2\2\u012a\u012b\7q\2\2\u012b"+
		"\u012c\7w\2\2\u012cZ\3\2\2\2\u012d\u012e\7?\2\2\u012e\\\3\2\2\2\u012f"+
		"\u0130\7}\2\2\u0130^\3\2\2\2\u0131\u0132\7\177\2\2\u0132`\3\2\2\2\u0133"+
		"\u0134\7*\2\2\u0134b\3\2\2\2\u0135\u0136\7+\2\2\u0136d\3\2\2\2\u0137\u0138"+
		"\7]\2\2\u0138f\3\2\2\2\u0139\u013a\7_\2\2\u013ah\3\2\2\2\u013b\u013c\7"+
		"k\2\2\u013c\u013d\7p\2\2\u013d\u013e\7v\2\2\u013e\u013f\7t\2\2\u013f\u0140"+
		"\7q\2\2\u0140\u0141\7K\2\2\u0141\u0142\7p\2\2\u0142\u0143\7i\2\2\u0143"+
		"\u0144\7K\2\2\u0144\u0145\7p\2\2\u0145\u0146\7h\2\2\u0146j\3\2\2\2\u0147"+
		"\u0148\7r\2\2\u0148\u0149\7t\2\2\u0149\u014a\7q\2\2\u014a\u014b\7{\2\2"+
		"\u014b\u014c\7V\2\2\u014c\u014d\7k\2\2\u014dl\3\2\2\2\t\2v{\u0081\u009d"+
		"\u00a5\u00ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}