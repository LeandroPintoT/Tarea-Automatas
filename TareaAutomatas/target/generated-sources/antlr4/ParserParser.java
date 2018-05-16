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
		PCI=45, PCD=46, COM=47, PIP=48, BEGIN=49, END=50;
	public static final int
		RULE_s = 0, RULE_programa = 1, RULE_inicio = 2, RULE_finale = 3, RULE_sentencia = 4, 
		RULE_declaracionvar = 5, RULE_variable = 6, RULE_asignvar = 7, RULE_operaciones = 8, 
		RULE_operador = 9, RULE_whiles = 10, RULE_bloque = 11, RULE_sumas = 12, 
		RULE_muestra = 13, RULE_leer = 14, RULE_fors = 15, RULE_condicional = 16, 
		RULE_bloque_condicional = 17, RULE_r = 18;
	public static final String[] ruleNames = {
		"s", "programa", "inicio", "finale", "sentencia", "declaracionvar", "variable", 
		"asignvar", "operaciones", "operador", "whiles", "bloque", "sumas", "muestra", 
		"leer", "fors", "condicional", "bloque_condicional", "r"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", null, null, "'\n'", null, null, null, null, "'real'", 
		"'int'", "'bool'", "'string'", "'muestra'", "'leer'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'and'", "'or'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='", "'if'", "'else'", "'switch'", "'while'", "'for'", "'sqrt'", "'fiboniichan'", 
		"'cos'", "'oppai'", "'itoko'", "'pou'", "'='", "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "'\"'", "'|'", "'introIngInf'", "'proyTi'"
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
			setState(38);
			sentencia();
			setState(39);
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
			setState(41);
			inicio();
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				sentencia();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << REAL) | (1L << ENTERO) | (1L << BOOL) | (1L << STRING) | (1L << MUESTRA) | (1L << IF) | (1L << FOR) | (1L << PI))) != 0) );
			setState(47);
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
			setState(49);
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
			setState(51);
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				declaracionvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				asignvar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				muestra();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				leer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				condicional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				operaciones(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				fors();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				variable();
				setState(64);
				match(ID);
				setState(65);
				match(SALTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				variable();
				setState(68);
				asignvar();
				setState(69);
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
			setState(73);
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
		public TerminalNode SINO() { return getToken(ParserParser.SINO, 0); }
		public TerminalNode STR() { return getToken(ParserParser.STR, 0); }
		public TerminalNode FLOAT() { return getToken(ParserParser.FLOAT, 0); }
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(ID);
				setState(76);
				match(ASIGN);
				setState(77);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(ID);
				setState(79);
				match(ASIGN);
				setState(80);
				match(SINO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(ID);
				setState(82);
				match(ASIGN);
				setState(83);
				match(STR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(ID);
				setState(85);
				match(ASIGN);
				setState(86);
				match(FLOAT);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(90);
				match(ID);
				}
				break;
			case NUM:
				{
				setState(91);
				match(NUM);
				}
				break;
			case PI:
				{
				setState(92);
				match(PI);
				setState(93);
				operaciones(0);
				setState(94);
				match(PD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
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
					setState(98);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(99);
					operador();
					setState(100);
					operaciones(5);
					}
					} 
				}
				setState(106);
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
			setState(107);
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
			setState(109);
			match(PI);
			setState(110);
			operaciones(0);
			setState(111);
			match(PD);
			setState(112);
			match(LLI);
			setState(113);
			bloque();
			setState(114);
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << REAL) | (1L << ENTERO) | (1L << BOOL) | (1L << STRING) | (1L << MUESTRA) | (1L << IF) | (1L << FOR) | (1L << PI))) != 0)) {
				{
				{
				setState(116);
				sentencia();
				}
				}
				setState(121);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(ID);
				setState(123);
				match(SUMA);
				setState(124);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(ID);
				setState(126);
				match(SUMA);
				setState(127);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(NUM);
				setState(129);
				match(SUMA);
				setState(130);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(NUM);
				setState(132);
				match(SUMA);
				setState(133);
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
			setState(136);
			match(MUESTRA);
			setState(137);
			match(COM);
			setState(138);
			match(ID);
			setState(139);
			match(COM);
			setState(140);
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
			setState(142);
			match(ID);
			setState(143);
			match(ASIGN);
			setState(144);
			match(LEE);
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
			setState(147);
			match(FOR);
			setState(148);
			asignvar();
			setState(149);
			match(PIP);
			setState(150);
			operaciones(0);
			setState(151);
			match(LLI);
			setState(152);
			bloque();
			setState(153);
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
			setState(155);
			match(IF);
			setState(156);
			bloque_condicional();
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(157);
				match(ELSE);
				setState(158);
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
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(PI);
				setState(162);
				operaciones(0);
				setState(163);
				match(PD);
				setState(164);
				match(LLI);
				setState(165);
				bloque();
				setState(166);
				match(LLD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(PI);
				setState(169);
				operaciones(0);
				setState(170);
				match(PD);
				setState(171);
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
		enterRule(_localctx, 36, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__0);
			setState(176);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u00b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\6\3.\n\3\r\3\16\3/\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7J\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nc\n\n\3\n\3\n\3"+
		"\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\7\rx\n\r\f\r\16\r{\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\5\22\u00a2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00b0\n\23\3\24\3\24\3\24\3\24\2\3\22\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\13\16\4\2\21\27\31\36\u00b6\2(\3"+
		"\2\2\2\4+\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n?\3\2\2\2\fI\3\2\2\2\16K"+
		"\3\2\2\2\20Y\3\2\2\2\22b\3\2\2\2\24m\3\2\2\2\26o\3\2\2\2\30y\3\2\2\2\32"+
		"\u0088\3\2\2\2\34\u008a\3\2\2\2\36\u0090\3\2\2\2 \u0095\3\2\2\2\"\u009d"+
		"\3\2\2\2$\u00af\3\2\2\2&\u00b1\3\2\2\2()\5\n\6\2)*\7\2\2\3*\3\3\2\2\2"+
		"+-\5\6\4\2,.\5\n\6\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3"+
		"\2\2\2\61\62\5\b\5\2\62\5\3\2\2\2\63\64\7\63\2\2\64\7\3\2\2\2\65\66\7"+
		"\64\2\2\66\t\3\2\2\2\67@\5\f\7\28@\5\20\t\29@\5\34\17\2:@\5\36\20\2;@"+
		"\5\"\22\2<@\5\22\n\2=@\5 \21\2>@\5\26\f\2?\67\3\2\2\2?8\3\2\2\2?9\3\2"+
		"\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\13\3\2\2\2AB\5"+
		"\16\b\2BC\7\4\2\2CD\7\6\2\2DJ\3\2\2\2EF\5\16\b\2FG\5\20\t\2GH\7\6\2\2"+
		"HJ\3\2\2\2IA\3\2\2\2IE\3\2\2\2J\r\3\2\2\2KL\t\2\2\2L\17\3\2\2\2MN\7\4"+
		"\2\2NO\7*\2\2OZ\7\7\2\2PQ\7\4\2\2QR\7*\2\2RZ\7\t\2\2ST\7\4\2\2TU\7*\2"+
		"\2UZ\7\n\2\2VW\7\4\2\2WX\7*\2\2XZ\7\b\2\2YM\3\2\2\2YP\3\2\2\2YS\3\2\2"+
		"\2YV\3\2\2\2Z\21\3\2\2\2[\\\b\n\1\2\\c\7\4\2\2]c\7\7\2\2^_\7-\2\2_`\5"+
		"\22\n\2`a\7.\2\2ac\3\2\2\2b[\3\2\2\2b]\3\2\2\2b^\3\2\2\2cj\3\2\2\2de\f"+
		"\6\2\2ef\5\24\13\2fg\5\22\n\7gi\3\2\2\2hd\3\2\2\2il\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2k\23\3\2\2\2lj\3\2\2\2mn\t\3\2\2n\25\3\2\2\2op\7-\2\2pq\5\22"+
		"\n\2qr\7.\2\2rs\7+\2\2st\5\30\r\2tu\7,\2\2u\27\3\2\2\2vx\5\n\6\2wv\3\2"+
		"\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\31\3\2\2\2{y\3\2\2\2|}\7\4\2\2}~\7"+
		"\21\2\2~\u0089\7\4\2\2\177\u0080\7\4\2\2\u0080\u0081\7\21\2\2\u0081\u0089"+
		"\7\7\2\2\u0082\u0083\7\7\2\2\u0083\u0084\7\21\2\2\u0084\u0089\7\4\2\2"+
		"\u0085\u0086\7\7\2\2\u0086\u0087\7\21\2\2\u0087\u0089\7\7\2\2\u0088|\3"+
		"\2\2\2\u0088\177\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089"+
		"\33\3\2\2\2\u008a\u008b\7\17\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7\4"+
		"\2\2\u008d\u008e\7\61\2\2\u008e\u008f\7\6\2\2\u008f\35\3\2\2\2\u0090\u0091"+
		"\7\4\2\2\u0091\u0092\7*\2\2\u0092\u0093\7\20\2\2\u0093\u0094\7\6\2\2\u0094"+
		"\37\3\2\2\2\u0095\u0096\7#\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7\62\2"+
		"\2\u0098\u0099\5\22\n\2\u0099\u009a\7+\2\2\u009a\u009b\5\30\r\2\u009b"+
		"\u009c\7,\2\2\u009c!\3\2\2\2\u009d\u009e\7\37\2\2\u009e\u00a1\5$\23\2"+
		"\u009f\u00a0\7 \2\2\u00a0\u00a2\5$\23\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2#\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4\u00a5\5\22\n\2\u00a5"+
		"\u00a6\7.\2\2\u00a6\u00a7\7+\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7,\2"+
		"\2\u00a9\u00b0\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad"+
		"\7.\2\2\u00ad\u00ae\5\n\6\2\u00ae\u00b0\3\2\2\2\u00af\u00a3\3\2\2\2\u00af"+
		"\u00aa\3\2\2\2\u00b0%\3\2\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b3\7\4\2\2"+
		"\u00b3\'\3\2\2\2\f/?IYbjy\u0088\u00a1\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}