// Generated from Parser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserParser extends Parser {
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
	public static final int
		RULE_s = 0, RULE_programa = 1, RULE_inicio = 2, RULE_finale = 3, RULE_sentencia = 4, 
		RULE_declaracionvar = 5, RULE_variable = 6, RULE_asignvar = 7, RULE_operaciones = 8, 
		RULE_operador = 9, RULE_whiles = 10, RULE_bloque = 11, RULE_sumas = 12, 
		RULE_muestra = 13, RULE_leer = 14, RULE_fors = 15, RULE_condicional = 16, 
		RULE_bloque_condicional = 17, RULE_switchz = 18, RULE_casos_switch = 19, 
		RULE_r = 20;
	public static final String[] ruleNames = {
		"s", "programa", "inicio", "finale", "sentencia", "declaracionvar", "variable", 
		"asignvar", "operaciones", "operador", "whiles", "bloque", "sumas", "muestra", 
		"leer", "fors", "condicional", "bloque_condicional", "switchz", "casos_switch", 
		"r"
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

	@Override
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParserParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			sentencia();
			setState(43);
			match(EOF);
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

	public static class ProgramaContext extends ParserRuleContext {
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public FinaleContext finale() {
			return getRuleContext(FinaleContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			inicio();
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				sentencia();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << REAL) | (1L << ENTERO) | (1L << BOOL) | (1L << STRING) | (1L << MUESTRA) | (1L << IF) | (1L << FOR) | (1L << PI))) != 0) );
			setState(51);
			finale();
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

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserParser.BEGIN, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(BEGIN);
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

	public static class FinaleContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(ParserParser.END, 0); }
		public FinaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finale; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFinale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinaleContext finale() throws RecognitionException {
		FinaleContext _localctx = new FinaleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_finale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(END);
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

	public static class SentenciaContext extends ParserRuleContext {
		public DeclaracionvarContext declaracionvar() {
			return getRuleContext(DeclaracionvarContext.class,0);
		}
		public AsignvarContext asignvar() {
			return getRuleContext(AsignvarContext.class,0);
		}
		public MuestraContext muestra() {
			return getRuleContext(MuestraContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public ForsContext fors() {
			return getRuleContext(ForsContext.class,0);
		}
		public SwitchzContext switchz() {
			return getRuleContext(SwitchzContext.class,0);
		}
		public WhilesContext whiles() {
			return getRuleContext(WhilesContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				declaracionvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				asignvar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				muestra();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				leer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				condicional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				operaciones(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				fors();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				switchz();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(65);
				whiles();
				}
				break;
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

	public static class DeclaracionvarContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode SALTO() { return getToken(ParserParser.SALTO, 0); }
		public AsignvarContext asignvar() {
			return getRuleContext(AsignvarContext.class,0);
		}
		public DeclaracionvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionvar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitDeclaracionvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionvarContext declaracionvar() throws RecognitionException {
		DeclaracionvarContext _localctx = new DeclaracionvarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracionvar);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				variable();
				setState(69);
				match(ID);
				setState(70);
				match(SALTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				variable();
				setState(73);
				asignvar();
				setState(74);
				match(SALTO);
				}
				break;
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(ParserParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(ParserParser.BOOL, 0); }
		public TerminalNode ENTERO() { return getToken(ParserParser.ENTERO, 0); }
		public TerminalNode STRING() { return getToken(ParserParser.STRING, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << ENTERO) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class AsignvarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode ASIGN() { return getToken(ParserParser.ASIGN, 0); }
		public TerminalNode NUM() { return getToken(ParserParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(ParserParser.BOOL, 0); }
		public TerminalNode ENTERO() { return getToken(ParserParser.ENTERO, 0); }
		public TerminalNode STRING() { return getToken(ParserParser.STRING, 0); }
		public AsignvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignvar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitAsignvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignvarContext asignvar() throws RecognitionException {
		AsignvarContext _localctx = new AsignvarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignvar);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(ID);
				setState(81);
				match(ASIGN);
				setState(82);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(ID);
				setState(84);
				match(ASIGN);
				setState(85);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(ID);
				setState(87);
				match(ASIGN);
				setState(88);
				match(ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(ID);
				setState(90);
				match(ASIGN);
				setState(91);
				match(STRING);
				}
				break;
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

	public static class OperacionesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode NUM() { return getToken(ParserParser.NUM, 0); }
		public TerminalNode PI() { return getToken(ParserParser.PI, 0); }
		public List<OperacionesContext> operaciones() {
			return getRuleContexts(OperacionesContext.class);
		}
		public OperacionesContext operaciones(int i) {
			return getRuleContext(OperacionesContext.class,i);
		}
		public TerminalNode PD() { return getToken(ParserParser.PD, 0); }
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		return operaciones(0);
	}

	private OperacionesContext operaciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionesContext _localctx = new OperacionesContext(_ctx, _parentState);
		OperacionesContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_operaciones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(95);
				match(ID);
				}
				break;
			case NUM:
				{
				setState(96);
				match(NUM);
				}
				break;
			case PI:
				{
				setState(97);
				match(PI);
				setState(98);
				operaciones(0);
				setState(99);
				match(PD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operaciones);
					setState(103);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(104);
					operador();
					setState(105);
					operaciones(5);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ParserParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(ParserParser.MENOR, 0); }
		public TerminalNode MAIG() { return getToken(ParserParser.MAIG, 0); }
		public TerminalNode MEIG() { return getToken(ParserParser.MEIG, 0); }
		public TerminalNode IG() { return getToken(ParserParser.IG, 0); }
		public TerminalNode NIG() { return getToken(ParserParser.NIG, 0); }
		public TerminalNode SUMA() { return getToken(ParserParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(ParserParser.RESTA, 0); }
		public TerminalNode DIV() { return getToken(ParserParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(ParserParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(ParserParser.MOD, 0); }
		public TerminalNode AND() { return getToken(ParserParser.AND, 0); }
		public TerminalNode OR() { return getToken(ParserParser.OR, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << AND) | (1L << OR) | (1L << MAYOR) | (1L << MENOR) | (1L << MAIG) | (1L << MEIG) | (1L << IG) | (1L << NIG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class WhilesContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(ParserParser.PI, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PD() { return getToken(ParserParser.PD, 0); }
		public TerminalNode LLI() { return getToken(ParserParser.LLI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LLD() { return getToken(ParserParser.LLD, 0); }
		public WhilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiles; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitWhiles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilesContext whiles() throws RecognitionException {
		WhilesContext _localctx = new WhilesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whiles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PI);
			setState(115);
			operaciones(0);
			setState(116);
			match(PD);
			setState(117);
			match(LLI);
			setState(118);
			bloque();
			setState(119);
			match(LLD);
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

	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << REAL) | (1L << ENTERO) | (1L << BOOL) | (1L << STRING) | (1L << MUESTRA) | (1L << IF) | (1L << FOR) | (1L << PI))) != 0)) {
				{
				{
				setState(121);
				sentencia();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SumasContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserParser.ID, i);
		}
		public TerminalNode SUMA() { return getToken(ParserParser.SUMA, 0); }
		public List<TerminalNode> NUM() { return getTokens(ParserParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ParserParser.NUM, i);
		}
		public SumasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSumas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumasContext sumas() throws RecognitionException {
		SumasContext _localctx = new SumasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sumas);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(ID);
				setState(128);
				match(SUMA);
				setState(129);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(ID);
				setState(131);
				match(SUMA);
				setState(132);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(NUM);
				setState(134);
				match(SUMA);
				setState(135);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(NUM);
				setState(137);
				match(SUMA);
				setState(138);
				match(NUM);
				}
				break;
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

	public static class MuestraContext extends ParserRuleContext {
		public TerminalNode MUESTRA() { return getToken(ParserParser.MUESTRA, 0); }
		public List<TerminalNode> COM() { return getTokens(ParserParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(ParserParser.COM, i);
		}
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode SALTO() { return getToken(ParserParser.SALTO, 0); }
		public MuestraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muestra; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitMuestra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MuestraContext muestra() throws RecognitionException {
		MuestraContext _localctx = new MuestraContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_muestra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(MUESTRA);
			setState(142);
			match(COM);
			setState(143);
			match(ID);
			setState(144);
			match(COM);
			setState(145);
			match(SALTO);
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode ASIGN() { return getToken(ParserParser.ASIGN, 0); }
		public TerminalNode LEE() { return getToken(ParserParser.LEE, 0); }
		public TerminalNode SALTO() { return getToken(ParserParser.SALTO, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			match(ASIGN);
			setState(149);
			match(LEE);
			setState(150);
			match(SALTO);
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

	public static class ForsContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserParser.FOR, 0); }
		public AsignvarContext asignvar() {
			return getRuleContext(AsignvarContext.class,0);
		}
		public TerminalNode PIP() { return getToken(ParserParser.PIP, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode LLI() { return getToken(ParserParser.LLI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LLD() { return getToken(ParserParser.LLD, 0); }
		public ForsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fors; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitFors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForsContext fors() throws RecognitionException {
		ForsContext _localctx = new ForsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(FOR);
			setState(153);
			asignvar();
			setState(154);
			match(PIP);
			setState(155);
			operaciones(0);
			setState(156);
			match(LLI);
			setState(157);
			bloque();
			setState(158);
			match(LLD);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserParser.IF, 0); }
		public List<Bloque_condicionalContext> bloque_condicional() {
			return getRuleContexts(Bloque_condicionalContext.class);
		}
		public Bloque_condicionalContext bloque_condicional(int i) {
			return getRuleContext(Bloque_condicionalContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ParserParser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IF);
			setState(161);
			bloque_condicional();
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(162);
				match(ELSE);
				setState(163);
				bloque_condicional();
				}
				break;
			}
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

	public static class Bloque_condicionalContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(ParserParser.PI, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PD() { return getToken(ParserParser.PD, 0); }
		public TerminalNode LLI() { return getToken(ParserParser.LLI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LLD() { return getToken(ParserParser.LLD, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Bloque_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitBloque_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionalContext bloque_condicional() throws RecognitionException {
		Bloque_condicionalContext _localctx = new Bloque_condicionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bloque_condicional);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(PI);
				setState(167);
				operaciones(0);
				setState(168);
				match(PD);
				setState(169);
				match(LLI);
				setState(170);
				bloque();
				setState(171);
				match(LLD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(PI);
				setState(174);
				operaciones(0);
				setState(175);
				match(PD);
				setState(176);
				sentencia();
				}
				break;
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

	public static class SwitchzContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(ParserParser.PI, 0); }
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public TerminalNode PD() { return getToken(ParserParser.PD, 0); }
		public TerminalNode LLI() { return getToken(ParserParser.LLI, 0); }
		public TerminalNode LLD() { return getToken(ParserParser.LLD, 0); }
		public List<Casos_switchContext> casos_switch() {
			return getRuleContexts(Casos_switchContext.class);
		}
		public Casos_switchContext casos_switch(int i) {
			return getRuleContext(Casos_switchContext.class,i);
		}
		public SwitchzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchz; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitSwitchz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchzContext switchz() throws RecognitionException {
		SwitchzContext _localctx = new SwitchzContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(PI);
			setState(181);
			match(ID);
			setState(182);
			match(PD);
			setState(183);
			match(LLI);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				casos_switch();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(189);
			match(LLD);
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

	public static class Casos_switchContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ParserParser.CASE, 0); }
		public TerminalNode NUM() { return getToken(ParserParser.NUM, 0); }
		public TerminalNode DP() { return getToken(ParserParser.DP, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ParserParser.DEFAULT, 0); }
		public Casos_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos_switch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitCasos_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Casos_switchContext casos_switch() throws RecognitionException {
		Casos_switchContext _localctx = new Casos_switchContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_casos_switch);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(CASE);
				setState(192);
				match(NUM);
				setState(193);
				match(DP);
				setState(194);
				sentencia();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(DEFAULT);
				setState(196);
				match(DP);
				setState(197);
				sentencia();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserParser.ID, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserVisitor ) return ((ParserVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__0);
			setState(201);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return operaciones_sempred((OperacionesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operaciones_sempred(OperacionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u00ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\6\3\62\n"+
		"\3\r\3\16\3\63\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6E\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\nh\n\n\3\n\3\n\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008e\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00a7\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b5\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\6\24\u00bc\n\24\r\24\16\24\u00bd\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u00c9\n\25\3\26\3\26\3\26\3\26\2\3\22\27"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\4\3\2\13\16\4\2\21\27"+
		"\31\36\u00d0\2,\3\2\2\2\4/\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\nD\3\2\2\2"+
		"\fN\3\2\2\2\16P\3\2\2\2\20^\3\2\2\2\22g\3\2\2\2\24r\3\2\2\2\26t\3\2\2"+
		"\2\30~\3\2\2\2\32\u008d\3\2\2\2\34\u008f\3\2\2\2\36\u0095\3\2\2\2 \u009a"+
		"\3\2\2\2\"\u00a2\3\2\2\2$\u00b4\3\2\2\2&\u00b6\3\2\2\2(\u00c8\3\2\2\2"+
		"*\u00ca\3\2\2\2,-\5\n\6\2-.\7\2\2\3.\3\3\2\2\2/\61\5\6\4\2\60\62\5\n\6"+
		"\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2"+
		"\2\65\66\5\b\5\2\66\5\3\2\2\2\678\7\64\2\28\7\3\2\2\29:\7\65\2\2:\t\3"+
		"\2\2\2;E\5\f\7\2<E\5\20\t\2=E\5\34\17\2>E\5\36\20\2?E\5\"\22\2@E\5\22"+
		"\n\2AE\5 \21\2BE\5&\24\2CE\5\26\f\2D;\3\2\2\2D<\3\2\2\2D=\3\2\2\2D>\3"+
		"\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\13\3\2\2\2F"+
		"G\5\16\b\2GH\7\4\2\2HI\7\6\2\2IO\3\2\2\2JK\5\16\b\2KL\5\20\t\2LM\7\6\2"+
		"\2MO\3\2\2\2NF\3\2\2\2NJ\3\2\2\2O\r\3\2\2\2PQ\t\2\2\2Q\17\3\2\2\2RS\7"+
		"\4\2\2ST\7*\2\2T_\7\7\2\2UV\7\4\2\2VW\7*\2\2W_\7\r\2\2XY\7\4\2\2YZ\7*"+
		"\2\2Z_\7\f\2\2[\\\7\4\2\2\\]\7*\2\2]_\7\16\2\2^R\3\2\2\2^U\3\2\2\2^X\3"+
		"\2\2\2^[\3\2\2\2_\21\3\2\2\2`a\b\n\1\2ah\7\4\2\2bh\7\7\2\2cd\7-\2\2de"+
		"\5\22\n\2ef\7.\2\2fh\3\2\2\2g`\3\2\2\2gb\3\2\2\2gc\3\2\2\2ho\3\2\2\2i"+
		"j\f\6\2\2jk\5\24\13\2kl\5\22\n\7ln\3\2\2\2mi\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2p\23\3\2\2\2qo\3\2\2\2rs\t\3\2\2s\25\3\2\2\2tu\7-\2\2uv\5"+
		"\22\n\2vw\7.\2\2wx\7+\2\2xy\5\30\r\2yz\7,\2\2z\27\3\2\2\2{}\5\n\6\2|{"+
		"\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\31\3\2\2\2\u0080~\3"+
		"\2\2\2\u0081\u0082\7\4\2\2\u0082\u0083\7\21\2\2\u0083\u008e\7\4\2\2\u0084"+
		"\u0085\7\4\2\2\u0085\u0086\7\21\2\2\u0086\u008e\7\7\2\2\u0087\u0088\7"+
		"\7\2\2\u0088\u0089\7\21\2\2\u0089\u008e\7\4\2\2\u008a\u008b\7\7\2\2\u008b"+
		"\u008c\7\21\2\2\u008c\u008e\7\7\2\2\u008d\u0081\3\2\2\2\u008d\u0084\3"+
		"\2\2\2\u008d\u0087\3\2\2\2\u008d\u008a\3\2\2\2\u008e\33\3\2\2\2\u008f"+
		"\u0090\7\17\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7\4\2\2\u0092\u0093\7"+
		"\61\2\2\u0093\u0094\7\6\2\2\u0094\35\3\2\2\2\u0095\u0096\7\4\2\2\u0096"+
		"\u0097\7*\2\2\u0097\u0098\7\20\2\2\u0098\u0099\7\6\2\2\u0099\37\3\2\2"+
		"\2\u009a\u009b\7#\2\2\u009b\u009c\5\20\t\2\u009c\u009d\7\62\2\2\u009d"+
		"\u009e\5\22\n\2\u009e\u009f\7+\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\7"+
		",\2\2\u00a1!\3\2\2\2\u00a2\u00a3\7\37\2\2\u00a3\u00a6\5$\23\2\u00a4\u00a5"+
		"\7 \2\2\u00a5\u00a7\5$\23\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"#\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\u00aa\5\22\n\2\u00aa\u00ab\7.\2\2\u00ab"+
		"\u00ac\7+\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7,\2\2\u00ae\u00b5\3\2"+
		"\2\2\u00af\u00b0\7-\2\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\7.\2\2\u00b2"+
		"\u00b3\5\n\6\2\u00b3\u00b5\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00af\3\2"+
		"\2\2\u00b5%\3\2\2\2\u00b6\u00b7\7-\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00b9"+
		"\7.\2\2\u00b9\u00bb\7+\2\2\u00ba\u00bc\5(\25\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\7,\2\2\u00c0\'\3\2\2\2\u00c1\u00c2\7\66\2\2\u00c2\u00c3"+
		"\7\7\2\2\u00c3\u00c4\7\63\2\2\u00c4\u00c9\5\n\6\2\u00c5\u00c6\7\67\2\2"+
		"\u00c6\u00c7\7\63\2\2\u00c7\u00c9\5\n\6\2\u00c8\u00c1\3\2\2\2\u00c8\u00c5"+
		"\3\2\2\2\u00c9)\3\2\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00cc\7\4\2\2\u00cc"+
		"+\3\2\2\2\16\63DN^go~\u008d\u00a6\u00b4\u00bd\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}