// Generated from Lexico.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexicoParser extends Parser {
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
		PCI=45, PCD=46, COM=47, PIP=48, BEGIN=49, END=50;
	public static final int
		RULE_r = 0;
	public static final String[] ruleNames = {
		"r"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", null, null, null, null, null, null, "'main'", "'real'", 
		"'int'", "'bool'", "'string'", "'muestra'", "'leer'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'and'", "'or'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='", "'if'", "'else'", "'switch'", "'while'", "'for'", "'sqrt'", "'fib'", 
		"'cos'", "'sin'", "'prim'", "'pou'", "'='", "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "'\"'", "'|'", "'introIngInf'", "'proyTi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ID", "WS", "NUM", "FLOAT", "SINO", "STR", "MAIN", "REAL", 
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

	@Override
	public String getGrammarFileName() { return "Lexico.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LexicoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LexicoParser.ID, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexicoVisitor ) return ((LexicoVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
			setState(3);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\b\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\2\2\3\2\2\2\6\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\4\2\2\6\3\3\2"+
		"\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}