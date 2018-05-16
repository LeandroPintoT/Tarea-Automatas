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
		PCI=45, PCD=46, COM=47, PIP=48, DP=49, BEGIN=50, END=51, CASE=52, DEFAULT=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ID", "WS", "DIG", "PUNTO", "TRUE", "NOTRUE", "SALTO", "NUM", 
		"FLOAT", "SINO", "STR", "REAL", "ENTERO", "BOOL", "STRING", "MUESTRA", 
		"LEE", "SUMA", "RESTA", "MULT", "DIV", "MOD", "AND", "OR", "NOT", "MAYOR", 
		"MENOR", "MAIG", "MEIG", "IG", "NIG", "IF", "ELSE", "SWITCH", "WHILE", 
		"FOR", "SQRT", "FIB", "COS", "SEN", "PRIM", "POT", "ASIGN", "LLI", "LLD", 
		"PI", "PD", "PCI", "PCD", "COM", "PIP", "DP", "BEGIN", "END", "CASE", 
		"DEFAULT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", null, null, "'\n'", null, null, null, null, "'real'", 
		"'int'", "'bool'", "'string'", "'muestra'", "'leer'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'and'", "'or'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='", "'if'", "'else'", "'switch'", "'while'", "'for'", "'sqrt'", "'fiboo'", 
		null, "'sin'", null, "'pou'", "'='", "'{'", "'}'", "'('", "')'", "'['", 
		"']'", "'\"'", "'|'", "':'", "'introIngInf'", "'proyTi'", "'caso'", "'defecto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ID", "WS", "SALTO", "NUM", "FLOAT", "SINO", "STR", "REAL", 
		"ENTERO", "BOOL", "STRING", "MUESTRA", "LEE", "SUMA", "RESTA", "MULT", 
		"DIV", "MOD", "AND", "OR", "NOT", "MAYOR", "MENOR", "MAIG", "MEIG", "IG", 
		"NIG", "IF", "ELSE", "SWITCH", "WHILE", "FOR", "SQRT", "FIB", "COS", "SEN", 
		"PRIM", "POT", "ASIGN", "LLI", "LLD", "PI", "PD", "PCI", "PCD", "COM", 
		"PIP", "DP", "BEGIN", "END", "CASE", "DEFAULT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\6\3}\n\3\r\3\16\3~\3\3\7\3\u0082\n\3\f\3\16\3\u0085\13\3"+
		"\3\4\6\4\u0088\n\4\r\4\16\4\u0089\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\6\n\u00a4"+
		"\n\n\r\n\16\n\u00a5\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00ae\n\f\3\r\3\r"+
		"\7\r\u00b2\n\r\f\r\16\r\u00b5\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3\u00b3\2;\3\3\5\4"+
		"\7\5\t\2\13\2\r\2\17\2\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17"+
		"%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36"+
		"C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63m\64o\65q\66s\67"+
		"\3\2\6\4\2C\\c|\6\2//\62;C\\c|\5\2\13\13\17\17\"\"\3\2\62;\u0166\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5|\3\2\2"+
		"\2\7\u0087\3\2\2\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2\2\2\17"+
		"\u0099\3\2\2\2\21\u00a0\3\2\2\2\23\u00a3\3\2\2\2\25\u00a7\3\2\2\2\27\u00ad"+
		"\3\2\2\2\31\u00af\3\2\2\2\33\u00b8\3\2\2\2\35\u00bd\3\2\2\2\37\u00c1\3"+
		"\2\2\2!\u00c6\3\2\2\2#\u00cd\3\2\2\2%\u00d5\3\2\2\2\'\u00da\3\2\2\2)\u00dc"+
		"\3\2\2\2+\u00de\3\2\2\2-\u00e0\3\2\2\2/\u00e2\3\2\2\2\61\u00e4\3\2\2\2"+
		"\63\u00e8\3\2\2\2\65\u00eb\3\2\2\2\67\u00ed\3\2\2\29\u00ef\3\2\2\2;\u00f1"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00f7\3\2\2\2A\u00fa\3\2\2\2C\u00fd\3\2\2\2E"+
		"\u0100\3\2\2\2G\u0105\3\2\2\2I\u010c\3\2\2\2K\u0112\3\2\2\2M\u0116\3\2"+
		"\2\2O\u011b\3\2\2\2Q\u0121\3\2\2\2S\u0125\3\2\2\2U\u0129\3\2\2\2W\u012d"+
		"\3\2\2\2Y\u0131\3\2\2\2[\u0133\3\2\2\2]\u0135\3\2\2\2_\u0137\3\2\2\2a"+
		"\u0139\3\2\2\2c\u013b\3\2\2\2e\u013d\3\2\2\2g\u013f\3\2\2\2i\u0141\3\2"+
		"\2\2k\u0143\3\2\2\2m\u0145\3\2\2\2o\u0151\3\2\2\2q\u0158\3\2\2\2s\u015d"+
		"\3\2\2\2uv\7j\2\2vw\7g\2\2wx\7n\2\2xy\7n\2\2yz\7q\2\2z\4\3\2\2\2{}\t\2"+
		"\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0083\3\2\2\2\u0080"+
		"\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\6\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088"+
		"\t\4\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\4\2\2\u008c\b\3\2\2\2"+
		"\u008d\u008e\t\5\2\2\u008e\n\3\2\2\2\u008f\u0090\7\60\2\2\u0090\f\3\2"+
		"\2\2\u0091\u0092\7p\2\2\u0092\u0093\7q\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7c\2\2\u0096\u0097\7o\2\2\u0097\u0098\7c\2\2\u0098"+
		"\16\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b\7w\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7o\2\2\u009d\u009e\7q\2\2\u009e\u009f\7t\2\2\u009f\20\3\2\2\2\u00a0"+
		"\u00a1\7\f\2\2\u00a1\22\3\2\2\2\u00a2\u00a4\5\t\5\2\u00a3\u00a2\3\2\2"+
		"\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\24"+
		"\3\2\2\2\u00a7\u00a8\5\23\n\2\u00a8\u00a9\5\13\6\2\u00a9\u00aa\5\23\n"+
		"\2\u00aa\26\3\2\2\2\u00ab\u00ae\5\r\7\2\u00ac\u00ae\5\17\b\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\30\3\2\2\2\u00af\u00b3\7$\2\2\u00b0"+
		"\u00b2\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\7$\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7v\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7n\2\2\u00c5 \3\2\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7p\2\2\u00cb\u00cc\7i\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\7o"+
		"\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7c\2\2\u00d4$\3\2\2\2\u00d5\u00d6"+
		"\7n\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"&\3\2\2\2\u00da\u00db\7-\2\2\u00db(\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd*"+
		"\3\2\2\2\u00de\u00df\7,\2\2\u00df,\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1"+
		".\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\u00e7\7f\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7q\2\2\u00e9"+
		"\u00ea\7t\2\2\u00ea\64\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec\66\3\2\2\2\u00ed"+
		"\u00ee\7@\2\2\u00ee8\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0:\3\2\2\2\u00f1\u00f2"+
		"\7@\2\2\u00f2\u00f3\7?\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7?\2\2\u00f8\u00f9\7?\2\2\u00f9@\3"+
		"\2\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\7?\2\2\u00fcB\3\2\2\2\u00fd\u00fe"+
		"\7k\2\2\u00fe\u00ff\7h\2\2\u00ffD\3\2\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7n\2\2\u0102\u0103\7u\2\2\u0103\u0104\7g\2\2\u0104F\3\2\2\2\u0105\u0106"+
		"\7u\2\2\u0106\u0107\7y\2\2\u0107\u0108\7k\2\2\u0108\u0109\7v\2\2\u0109"+
		"\u010a\7e\2\2\u010a\u010b\7j\2\2\u010bH\3\2\2\2\u010c\u010d\7y\2\2\u010d"+
		"\u010e\7j\2\2\u010e\u010f\7k\2\2\u010f\u0110\7n\2\2\u0110\u0111\7g\2\2"+
		"\u0111J\3\2\2\2\u0112\u0113\7h\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2"+
		"\2\u0115L\3\2\2\2\u0116\u0117\7u\2\2\u0117\u0118\7s\2\2\u0118\u0119\7"+
		"t\2\2\u0119\u011a\7v\2\2\u011aN\3\2\2\2\u011b\u011c\7h\2\2\u011c\u011d"+
		"\7k\2\2\u011d\u011e\7d\2\2\u011e\u011f\7q\2\2\u011f\u0120\7q\2\2\u0120"+
		"P\3\2\2\2\u0121\u0122\7e\2\2\u0122\u0123\7q\2\2\u0123\u0124\7u\2\2\u0124"+
		"R\3\2\2\2\u0125\u0126\7u\2\2\u0126\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128"+
		"T\3\2\2\2\u0129\u012a\7e\2\2\u012a\u012b\7q\2\2\u012b\u012c\7u\2\2\u012c"+
		"V\3\2\2\2\u012d\u012e\7r\2\2\u012e\u012f\7q\2\2\u012f\u0130\7w\2\2\u0130"+
		"X\3\2\2\2\u0131\u0132\7?\2\2\u0132Z\3\2\2\2\u0133\u0134\7}\2\2\u0134\\"+
		"\3\2\2\2\u0135\u0136\7\177\2\2\u0136^\3\2\2\2\u0137\u0138\7*\2\2\u0138"+
		"`\3\2\2\2\u0139\u013a\7+\2\2\u013ab\3\2\2\2\u013b\u013c\7]\2\2\u013cd"+
		"\3\2\2\2\u013d\u013e\7_\2\2\u013ef\3\2\2\2\u013f\u0140\7$\2\2\u0140h\3"+
		"\2\2\2\u0141\u0142\7~\2\2\u0142j\3\2\2\2\u0143\u0144\7<\2\2\u0144l\3\2"+
		"\2\2\u0145\u0146\7k\2\2\u0146\u0147\7p\2\2\u0147\u0148\7v\2\2\u0148\u0149"+
		"\7t\2\2\u0149\u014a\7q\2\2\u014a\u014b\7K\2\2\u014b\u014c\7p\2\2\u014c"+
		"\u014d\7i\2\2\u014d\u014e\7K\2\2\u014e\u014f\7p\2\2\u014f\u0150\7h\2\2"+
		"\u0150n\3\2\2\2\u0151\u0152\7r\2\2\u0152\u0153\7t\2\2\u0153\u0154\7q\2"+
		"\2\u0154\u0155\7{\2\2\u0155\u0156\7V\2\2\u0156\u0157\7k\2\2\u0157p\3\2"+
		"\2\2\u0158\u0159\7e\2\2\u0159\u015a\7c\2\2\u015a\u015b\7u\2\2\u015b\u015c"+
		"\7q\2\2\u015cr\3\2\2\2\u015d\u015e\7f\2\2\u015e\u015f\7g\2\2\u015f\u0160"+
		"\7h\2\2\u0160\u0161\7g\2\2\u0161\u0162\7e\2\2\u0162\u0163\7v\2\2\u0163"+
		"\u0164\7q\2\2\u0164t\3\2\2\2\t\2~\u0083\u0089\u00a5\u00ad\u00b3\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}