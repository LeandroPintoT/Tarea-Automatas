// Generated from Parser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(ParserParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ParserParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(ParserParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#finale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinale(ParserParser.FinaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(ParserParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#declaracionvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionvar(ParserParser.DeclaracionvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ParserParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#asignvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignvar(ParserParser.AsignvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(ParserParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(ParserParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#whiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiles(ParserParser.WhilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(ParserParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#sumas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumas(ParserParser.SumasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#muestra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuestra(ParserParser.MuestraContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(ParserParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#fors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFors(ParserParser.ForsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(ParserParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#bloque_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_condicional(ParserParser.Bloque_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#switchz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchz(ParserParser.SwitchzContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#casos_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos_switch(ParserParser.Casos_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(ParserParser.RContext ctx);
}