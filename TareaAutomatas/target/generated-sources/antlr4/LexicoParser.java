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
		T__0=1, ID=2, WS=3, SALTO=4, NUM=5, FLOAT=6, SINO=7, STR=8, MAIN=9, REAL=10, 
		ENTERO=11, BOOL=12, STRING=13, MUESTRA=14, LEE=15, SUMA=16, RESTA=17, 
		MULT=18, DIV=19, MOD=20, AND=21, OR=22, NOT=23, MAYOR=24, MENOR=25, MAIG=26, 
		MEIG=27, IG=28, NIG=29, IF=30, ELSE=31, SWITCH=32, WHILE=33, FOR=34, SQRT=35, 
		FIB=36, COS=37, SEN=38, PRIM=39, POT=40, ASIGN=41, LLI=42, LLD=43, PI=44, 
		PD=45, PCI=46, PCD=47, COM=48, PIP=49, BEGIN=50, END=51;
	public static final int
		RULE_r = 0;
	public static final String[] ruleNames = {
		"r"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", null, null, "'\n'", null, null, null, null, "'main'", 
		"'real'", "'int'", "'bool'", "'string'", "'muestra'", "'leer'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'and'", "'or'", "'!'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'if'", "'else'", "'switch'", "'while'", "'for'", 
		"'sqrt'", "'fiboniichan'", "'cos'", "'oppai'", "'itoko'", "'pou'", "'='", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "'\"'", "'|'", "'introIngInf'", 
		"'proyTi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ID", "WS", "SALTO", "NUM", "FLOAT", "SINO", "STR", "MAIN", 
		"REAL", "ENTERO", "BOOL", "STRING", "MUESTRA", "LEE", "SUMA", "RESTA", 
		"MULT", "DIV", "MOD", "AND", "OR", "NOT", "MAYOR", "MENOR", "MAIG", "MEIG", 
		"IG", "NIG", "IF", "ELSE", "SWITCH", "WHILE", "FOR", "SQRT", "FIB", "COS", 
		"SEN", "PRIM", "POT", "ASIGN", "LLI", "LLD", "PI", "PD", "PCI", "PCD", 
		"COM", "PIP", "BEGIN", "END"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\b\4\2\t\2\3\2"+
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