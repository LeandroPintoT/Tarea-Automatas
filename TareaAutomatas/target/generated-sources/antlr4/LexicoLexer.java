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
		T__0=1, ID=2, WS=3, SALTO=4, NUM=5, FLOAT=6, SINO=7, STR=8, REAL=9, ENTERO=10, 
		BOOL=11, STRING=12, MUESTRA=13, LEE=14, SUMA=15, RESTA=16, MULT=17, DIV=18, 
		MOD=19, AND=20, OR=21, NOT=22, MAYOR=23, MENOR=24, MAIG=25, MEIG=26, IG=27, 
		NIG=28, IF=29, ELSE=30, SWITCH=31, WHILE=32, FOR=33, SQRT=34, FIB=35, 
		COS=36, SEN=37, PRIM=38, POT=39, ASIGN=40, LLI=41, LLD=42, PI=43, PD=44, 
		PCI=45, PCD=46, COM=47, PIP=48, BEGIN=49, END=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ID", "WS", "DIG", "PUNTO", "TRUE", "NOTRUE", "SALTO", "NUM", 
		"FLOAT", "SINO", "STR", "REAL", "ENTERO", "BOOL", "STRING", "MUESTRA", 
		"LEE", "SUMA", "RESTA", "MULT", "DIV", "MOD", "AND", "OR", "NOT", "MAYOR", 
		"MENOR", "MAIG", "MEIG", "IG", "NIG", "IF", "ELSE", "SWITCH", "WHILE", 
		"FOR", "SQRT", "FIB", "COS", "SEN", "PRIM", "POT", "ASIGN", "LLI", "LLD", 
		"PI", "PD", "PCI", "PCD", "COM", "PIP", "BEGIN", "END"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", null, null, "'\n'", null, null, null, null, "'real'", 
		"'int'", "'bool'", "'string'", "'muestra'", "'leer'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'and'", "'or'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='", "'if'", "'else'", "'switch'", "'while'", "'for'", "'sqrt'", "'fiboo'", 
		null, "'sin'", null, "'pou'", "'='", "'{'", "'}'", "'('", "')'", "'['", 
		"']'", "'\"'", "'|'", "'introIngInf'", "'proyTi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ID", "WS", "SALTO", "NUM", "FLOAT", "SINO", "STR", "REAL", 
		"ENTERO", "BOOL", "STRING", "MUESTRA", "LEE", "SUMA", "RESTA", "MULT", 
		"DIV", "MOD", "AND", "OR", "NOT", "MAYOR", "MENOR", "MAIG", "MEIG", "IG", 
		"NIG", "IF", "ELSE", "SWITCH", "WHILE", "FOR", "SQRT", "FIB", "COS", "SEN", 
		"PRIM", "POT", "ASIGN", "LLI", "LLD", "PI", "PD", "PCI", "PCD", "COM", 
		"PIP", "BEGIN", "END"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u0150\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3w\n"+
		"\3\r\3\16\3x\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\4\6\4\u0082\n\4\r\4\16\4"+
		"\u0083\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\6\n\u009e\n\n\r\n\16\n\u009f\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\7\r\u00ac\n\r\f\r\16\r\u00af"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\u00ad\28\3\3"+
		"\5\4\7\5\t\2\13\2\r\2\17\2\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16"+
		"#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35"+
		"A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63m\64\3\2\6\4"+
		"\2C\\c|\6\2//\62;C\\c|\5\2\13\13\17\17\"\"\3\2\62;\u0151\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\3o\3\2\2\2\5v\3\2\2\2\7\u0081\3\2\2\2\t\u0087\3\2\2\2\13\u0089"+
		"\3\2\2\2\r\u008b\3\2\2\2\17\u0093\3\2\2\2\21\u009a\3\2\2\2\23\u009d\3"+
		"\2\2\2\25\u00a1\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9\3\2\2\2\33\u00b2\3\2"+
		"\2\2\35\u00b7\3\2\2\2\37\u00bb\3\2\2\2!\u00c0\3\2\2\2#\u00c7\3\2\2\2%"+
		"\u00cf\3\2\2\2\'\u00d4\3\2\2\2)\u00d6\3\2\2\2+\u00d8\3\2\2\2-\u00da\3"+
		"\2\2\2/\u00dc\3\2\2\2\61\u00de\3\2\2\2\63\u00e2\3\2\2\2\65\u00e5\3\2\2"+
		"\2\67\u00e7\3\2\2\29\u00e9\3\2\2\2;\u00eb\3\2\2\2=\u00ee\3\2\2\2?\u00f1"+
		"\3\2\2\2A\u00f4\3\2\2\2C\u00f7\3\2\2\2E\u00fa\3\2\2\2G\u00ff\3\2\2\2I"+
		"\u0106\3\2\2\2K\u010c\3\2\2\2M\u0110\3\2\2\2O\u0115\3\2\2\2Q\u011b\3\2"+
		"\2\2S\u011f\3\2\2\2U\u0123\3\2\2\2W\u0127\3\2\2\2Y\u012b\3\2\2\2[\u012d"+
		"\3\2\2\2]\u012f\3\2\2\2_\u0131\3\2\2\2a\u0133\3\2\2\2c\u0135\3\2\2\2e"+
		"\u0137\3\2\2\2g\u0139\3\2\2\2i\u013b\3\2\2\2k\u013d\3\2\2\2m\u0149\3\2"+
		"\2\2op\7j\2\2pq\7g\2\2qr\7n\2\2rs\7n\2\2st\7q\2\2t\4\3\2\2\2uw\t\2\2\2"+
		"vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y}\3\2\2\2z|\t\3\2\2{z\3\2\2\2"+
		"|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\6\3\2\2\2\177}\3\2\2\2\u0080\u0082"+
		"\t\4\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\4\2\2\u0086\b\3\2\2\2"+
		"\u0087\u0088\t\5\2\2\u0088\n\3\2\2\2\u0089\u008a\7\60\2\2\u008a\f\3\2"+
		"\2\2\u008b\u008c\7p\2\2\u008c\u008d\7q\2\2\u008d\u008e\7v\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7c\2\2\u0090\u0091\7o\2\2\u0091\u0092\7c\2\2\u0092"+
		"\16\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7w\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7o\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099\20\3\2\2\2\u009a"+
		"\u009b\7\f\2\2\u009b\22\3\2\2\2\u009c\u009e\5\t\5\2\u009d\u009c\3\2\2"+
		"\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\24"+
		"\3\2\2\2\u00a1\u00a2\5\23\n\2\u00a2\u00a3\5\13\6\2\u00a3\u00a4\5\23\n"+
		"\2\u00a4\26\3\2\2\2\u00a5\u00a8\5\r\7\2\u00a6\u00a8\5\17\b\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\30\3\2\2\2\u00a9\u00ad\7$\2\2\u00aa"+
		"\u00ac\13\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\7$\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\7d\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7n\2\2\u00bf \3\2\2\2\u00c0"+
		"\u00c1\7u\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2"+
		"\u00c4\u00c5\7p\2\2\u00c5\u00c6\7i\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7o"+
		"\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc"+
		"\7v\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7c\2\2\u00ce$\3\2\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"&\3\2\2\2\u00d4\u00d5\7-\2\2\u00d5(\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7*"+
		"\3\2\2\2\u00d8\u00d9\7,\2\2\u00d9,\3\2\2\2\u00da\u00db\7\61\2\2\u00db"+
		".\3\2\2\2\u00dc\u00dd\7\'\2\2\u00dd\60\3\2\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7q\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6\66\3\2\2\2\u00e7"+
		"\u00e8\7@\2\2\u00e88\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea:\3\2\2\2\u00eb\u00ec"+
		"\7@\2\2\u00ec\u00ed\7?\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7>\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f3\7?\2\2\u00f3@\3"+
		"\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7?\2\2\u00f6B\3\2\2\2\u00f7\u00f8"+
		"\7k\2\2\u00f8\u00f9\7h\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00feF\3\2\2\2\u00ff\u0100"+
		"\7u\2\2\u0100\u0101\7y\2\2\u0101\u0102\7k\2\2\u0102\u0103\7v\2\2\u0103"+
		"\u0104\7e\2\2\u0104\u0105\7j\2\2\u0105H\3\2\2\2\u0106\u0107\7y\2\2\u0107"+
		"\u0108\7j\2\2\u0108\u0109\7k\2\2\u0109\u010a\7n\2\2\u010a\u010b\7g\2\2"+
		"\u010bJ\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7q\2\2\u010e\u010f\7t\2"+
		"\2\u010fL\3\2\2\2\u0110\u0111\7u\2\2\u0111\u0112\7s\2\2\u0112\u0113\7"+
		"t\2\2\u0113\u0114\7v\2\2\u0114N\3\2\2\2\u0115\u0116\7h\2\2\u0116\u0117"+
		"\7k\2\2\u0117\u0118\7d\2\2\u0118\u0119\7q\2\2\u0119\u011a\7q\2\2\u011a"+
		"P\3\2\2\2\u011b\u011c\7e\2\2\u011c\u011d\7q\2\2\u011d\u011e\7u\2\2\u011e"+
		"R\3\2\2\2\u011f\u0120\7u\2\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122"+
		"T\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125\7q\2\2\u0125\u0126\7u\2\2\u0126"+
		"V\3\2\2\2\u0127\u0128\7r\2\2\u0128\u0129\7q\2\2\u0129\u012a\7w\2\2\u012a"+
		"X\3\2\2\2\u012b\u012c\7?\2\2\u012cZ\3\2\2\2\u012d\u012e\7}\2\2\u012e\\"+
		"\3\2\2\2\u012f\u0130\7\177\2\2\u0130^\3\2\2\2\u0131\u0132\7*\2\2\u0132"+
		"`\3\2\2\2\u0133\u0134\7+\2\2\u0134b\3\2\2\2\u0135\u0136\7]\2\2\u0136d"+
		"\3\2\2\2\u0137\u0138\7_\2\2\u0138f\3\2\2\2\u0139\u013a\7$\2\2\u013ah\3"+
		"\2\2\2\u013b\u013c\7~\2\2\u013cj\3\2\2\2\u013d\u013e\7k\2\2\u013e\u013f"+
		"\7p\2\2\u013f\u0140\7v\2\2\u0140\u0141\7t\2\2\u0141\u0142\7q\2\2\u0142"+
		"\u0143\7K\2\2\u0143\u0144\7p\2\2\u0144\u0145\7i\2\2\u0145\u0146\7K\2\2"+
		"\u0146\u0147\7p\2\2\u0147\u0148\7h\2\2\u0148l\3\2\2\2\u0149\u014a\7r\2"+
		"\2\u014a\u014b\7t\2\2\u014b\u014c\7q\2\2\u014c\u014d\7{\2\2\u014d\u014e"+
		"\7V\2\2\u014e\u014f\7k\2\2\u014fn\3\2\2\2\t\2x}\u0083\u009f\u00a7\u00ad"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}