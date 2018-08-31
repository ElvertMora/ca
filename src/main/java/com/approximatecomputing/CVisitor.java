// Generated from C:/Users/eme-0/IdeaProjects/ca/src/main/resources\C.g4 by ANTLR 4.7
package com.approximatecomputing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#translationunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationunit(CParser.TranslationunitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryexpression(CParser.PrimaryexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#idexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdexpression(CParser.IdexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unqualifiedid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedid(CParser.UnqualifiedidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#qualifiedid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedid(CParser.QualifiedidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestednamespecifier(CParser.NestednamespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#lambdaexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaexpression(CParser.LambdaexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaintroducer(CParser.LambdaintroducerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#lambdacapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdacapture(CParser.LambdacaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#capturedefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapturedefault(CParser.CapturedefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#capturelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapturelist(CParser.CapturelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(CParser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#simplecapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplecapture(CParser.SimplecaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#initcapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitcapture(CParser.InitcaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdadeclarator(CParser.LambdadeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#postfixexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixexpression(CParser.PostfixexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeidofexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeidofexpr(CParser.TypeidofexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeidofthetypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeidofthetypeid(CParser.TypeidofthetypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expressionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionlist(CParser.ExpressionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudodestructorname(CParser.PseudodestructornameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryexpression(CParser.UnaryexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unaryoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryoperator(CParser.UnaryoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#newexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewexpression(CParser.NewexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#newplacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewplacement(CParser.NewplacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#newtypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewtypeid(CParser.NewtypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#newdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewdeclarator(CParser.NewdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrnewdeclarator(CParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#newinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewinitializer(CParser.NewinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#deleteexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteexpression(CParser.DeleteexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#noexceptexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoexceptexpression(CParser.NoexceptexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#castexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastexpression(CParser.CastexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#pmexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPmexpression(CParser.PmexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeexpression(CParser.MultiplicativeexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#additiveexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveexpression(CParser.AdditiveexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#shiftexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftexpression(CParser.ShiftexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#relationalexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalexpression(CParser.RelationalexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#equalityexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityexpression(CParser.EqualityexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#andexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpression(CParser.AndexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveorexpression(CParser.ExclusiveorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveorexpression(CParser.InclusiveorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#logicalandexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalandexpression(CParser.LogicalandexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#logicalorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalorexpression(CParser.LogicalorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conditionalexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalexpression(CParser.ConditionalexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignmentexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentexpression(CParser.AssignmentexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignmentoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentoperator(CParser.AssignmentoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constantexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantexpression(CParser.ConstantexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#labeledstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledstatement(CParser.LabeledstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expressionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionstatement(CParser.ExpressionstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#compoundstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundstatement(CParser.CompoundstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#statementseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementseq(CParser.StatementseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#selectionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionstatement(CParser.SelectionstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#iterationstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationstatement(CParser.IterationstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#forinitstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForinitstatement(CParser.ForinitstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForrangedeclaration(CParser.ForrangedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForrangeinitializer(CParser.ForrangeinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#jumpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpstatement(CParser.JumpstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declarationstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationstatement(CParser.DeclarationstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(CParser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#blockdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockdeclaration(CParser.BlockdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasdeclaration(CParser.AliasdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#simpledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpledeclaration(CParser.SimpledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_assertdeclaration(CParser.Static_assertdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#emptydeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptydeclaration(CParser.EmptydeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#attributedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributedeclaration(CParser.AttributedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclspecifier(CParser.DeclspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declspecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclspecifierseq(CParser.DeclspecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageclassspecifier(CParser.StorageclassspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#functionspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionspecifier(CParser.FunctionspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typedefname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefname(CParser.TypedefnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypespecifier(CParser.TypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingtypespecifier(CParser.TrailingtypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typespecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypespecifierseq(CParser.TypespecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingtypespecifierseq(CParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletypespecifier(CParser.SimpletypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#thetypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThetypename(CParser.ThetypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#decltypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecltypespecifier(CParser.DecltypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedtypespecifier(CParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumname(CParser.EnumnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumspecifier(CParser.EnumspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumhead(CParser.EnumheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueenumdeclaration(CParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumkey(CParser.EnumkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumbase(CParser.EnumbaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumeratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorlist(CParser.EnumeratorlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratordefinition(CParser.EnumeratordefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(CParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#namespacename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacename(CParser.NamespacenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#originalnamespacename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalnamespacename(CParser.OriginalnamespacenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#namespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacedefinition(CParser.NamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamednamespacedefinition(CParser.NamednamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalnamespacedefinition(CParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionnamespacedefinition(CParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamednamespacedefinition(CParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#namespacebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacebody(CParser.NamespacebodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#namespacealias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacealias(CParser.NamespacealiasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacealiasdefinition(CParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiednamespacespecifier(CParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#usingdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingdeclaration(CParser.UsingdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#usingdirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingdirective(CParser.UsingdirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#asmdefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmdefinition(CParser.AsmdefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#linkagespecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkagespecification(CParser.LinkagespecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributespecifierseq(CParser.AttributespecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#attributespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributespecifier(CParser.AttributespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentspecifier(CParser.AlignmentspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#attributelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributelist(CParser.AttributelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(CParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#attributetoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributetoken(CParser.AttributetokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributescopedtoken(CParser.AttributescopedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#attributenamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributenamespace(CParser.AttributenamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeargumentclause(CParser.AttributeargumentclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtokenseq(CParser.BalancedtokenseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtoken(CParser.BalancedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitdeclaratorlist(CParser.InitdeclaratorlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#initdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitdeclarator(CParser.InitdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrdeclarator(CParser.PtrdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrdeclarator(CParser.NoptrdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersandqualifiers(CParser.ParametersandqualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#trailingreturntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingreturntype(CParser.TrailingreturntypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ptroperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtroperator(CParser.PtroperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifierseq(CParser.CvqualifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#cvqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifier(CParser.CvqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefqualifier(CParser.RefqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorid(CParser.DeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#thetypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThetypeid(CParser.ThetypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractdeclarator(CParser.AbstractdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrabstractdeclarator(CParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrabstractdeclarator(CParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractpackdeclarator(CParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrabstractpackdeclarator(CParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclarationclause(CParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclarationlist(CParser.ParameterdeclarationlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclaration(CParser.ParameterdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#functiondefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondefinition(CParser.FunctiondefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(CParser.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceorequalinitializer(CParser.BraceorequalinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#initializerclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerclause(CParser.InitializerclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#initializerlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerlist(CParser.InitializerlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#bracedinitlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedinitlist(CParser.BracedinitlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassname(CParser.ClassnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassspecifier(CParser.ClassspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasshead(CParser.ClassheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classheadname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassheadname(CParser.ClassheadnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassvirtspecifier(CParser.ClassvirtspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasskey(CParser.ClasskeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#memberspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberspecification(CParser.MemberspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaration(CParser.MemberdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaratorlist(CParser.MemberdeclaratorlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#memberdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclarator(CParser.MemberdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtspecifierseq(CParser.VirtspecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#virtspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtspecifier(CParser.VirtspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#purespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurespecifier(CParser.PurespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#baseclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseclause(CParser.BaseclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#basespecifierlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasespecifierlist(CParser.BasespecifierlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#basespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasespecifier(CParser.BasespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#classordecltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassordecltype(CParser.ClassordecltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#basetypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasetypespecifier(CParser.BasetypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#accessspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessspecifier(CParser.AccessspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionfunctionid(CParser.ConversionfunctionidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conversiontypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversiontypeid(CParser.ConversiontypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversiondeclarator(CParser.ConversiondeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#ctorinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtorinitializer(CParser.CtorinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#meminitializerlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerlist(CParser.MeminitializerlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#meminitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializer(CParser.MeminitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(CParser.MeminitializeridContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorfunctionid(CParser.OperatorfunctionidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#literaloperatorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteraloperatorid(CParser.LiteraloperatoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#templatedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatedeclaration(CParser.TemplatedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#templateparameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateparameterlist(CParser.TemplateparameterlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#templateparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateparameter(CParser.TemplateparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeparameter(CParser.TypeparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#simpletemplateid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletemplateid(CParser.SimpletemplateidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#templateid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateid(CParser.TemplateidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#templatename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatename(CParser.TemplatenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#templateargumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateargumentlist(CParser.TemplateargumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#templateargument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateargument(CParser.TemplateargumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typenamespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypenamespecifier(CParser.TypenamespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitinstantiation(CParser.ExplicitinstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#explicitspecialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitspecialization(CParser.ExplicitspecializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#tryblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryblock(CParser.TryblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#functiontryblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiontryblock(CParser.FunctiontryblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#handlerseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerseq(CParser.HandlerseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(CParser.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptiondeclaration(CParser.ExceptiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#throwexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowexpression(CParser.ThrowexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#exceptionspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionspecification(CParser.ExceptionspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicexceptionspecification(CParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeidlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeidlist(CParser.TypeidlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#noexceptspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoexceptspecification(CParser.NoexceptspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#rightShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShift(CParser.RightShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShiftAssign(CParser.RightShiftAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#theoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheoperator(CParser.TheoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#booleanliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanliteral(CParser.BooleanliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#pointerliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerliteral(CParser.PointerliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserdefinedliteral(CParser.UserdefinedliteralContext ctx);
}