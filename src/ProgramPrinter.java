import gen.CListener;
import gen.CParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ProgramPrinter implements CListener {

    StringBuilder sb = new StringBuilder();
    int nested = 0;
    SymbolTable symbolTable;
    SymbolTable current;

    @Override
    public void enterPrimaryExpression(CParser.PrimaryExpressionContext ctx) {

    }

    @Override
    public void exitPrimaryExpression(CParser.PrimaryExpressionContext ctx) {

    }

    @Override
    public void enterPostfixExpression(CParser.PostfixExpressionContext ctx) {

        if (ctx.LeftParen(0) != null) { //func call (Phase 1)
//            System.out.println("\n\n" + sb.toString().split("\n")[sb.toString().split("\n").length - 1] + "\n\n");
            int tab = sb.toString().split("\n")[sb.toString().split("\n").length - 1].split("\t").length - 1;
            if (sb.toString().split("\n")[sb.toString().split("\n").length - 1].contains("nested")) {
                tab++;
            }
            sb.append("\t".repeat(Math.max(0, tab)));

            sb.append("function call: name: ");
            sb.append(ctx.primaryExpression().getText());
            sb.append("/ params: ");
            int count = 0;

            for (var param : ctx.argumentExpressionList(0).assignmentExpression()) {

                sb.append(param.getText());
                sb.append(" (index: ");
                sb.append(count);
                sb.append(")");
                sb.append(", ");
                count++;
            }
            sb.delete(sb.length() - 2, sb.length());
            sb.append("\n");
        }

    }

    @Override
    public void exitPostfixExpression(CParser.PostfixExpressionContext ctx) {

    }

    @Override
    public void enterArgumentExpressionList(CParser.ArgumentExpressionListContext ctx) {

    }

    @Override
    public void exitArgumentExpressionList(CParser.ArgumentExpressionListContext ctx) {

    }

    @Override
    public void enterUnaryExpression(CParser.UnaryExpressionContext ctx) {

    }

    @Override
    public void exitUnaryExpression(CParser.UnaryExpressionContext ctx) {

    }

    @Override
    public void enterUnaryOperator(CParser.UnaryOperatorContext ctx) {

    }

    @Override
    public void exitUnaryOperator(CParser.UnaryOperatorContext ctx) {

    }

    @Override
    public void enterCastExpression(CParser.CastExpressionContext ctx) {

    }

    @Override
    public void exitCastExpression(CParser.CastExpressionContext ctx) {

    }

    @Override
    public void enterMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void exitMultiplicativeExpression(CParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void enterAdditiveExpression(CParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void exitAdditiveExpression(CParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void enterShiftExpression(CParser.ShiftExpressionContext ctx) {

    }

    @Override
    public void exitShiftExpression(CParser.ShiftExpressionContext ctx) {

    }

    @Override
    public void enterRelationalExpression(CParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void exitRelationalExpression(CParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void enterEqualityExpression(CParser.EqualityExpressionContext ctx) {

    }

    @Override
    public void exitEqualityExpression(CParser.EqualityExpressionContext ctx) {

    }

    @Override
    public void enterAndExpression(CParser.AndExpressionContext ctx) {

    }

    @Override
    public void exitAndExpression(CParser.AndExpressionContext ctx) {

    }

    @Override
    public void enterExclusiveOrExpression(CParser.ExclusiveOrExpressionContext ctx) {

    }

    @Override
    public void exitExclusiveOrExpression(CParser.ExclusiveOrExpressionContext ctx) {

    }

    @Override
    public void enterInclusiveOrExpression(CParser.InclusiveOrExpressionContext ctx) {

    }

    @Override
    public void exitInclusiveOrExpression(CParser.InclusiveOrExpressionContext ctx) {

    }

    @Override
    public void enterLogicalAndExpression(CParser.LogicalAndExpressionContext ctx) {

    }

    @Override
    public void exitLogicalAndExpression(CParser.LogicalAndExpressionContext ctx) {

    }

    @Override
    public void enterLogicalOrExpression(CParser.LogicalOrExpressionContext ctx) {

    }

    @Override
    public void exitLogicalOrExpression(CParser.LogicalOrExpressionContext ctx) {

    }

    @Override
    public void enterConditionalExpression(CParser.ConditionalExpressionContext ctx) {

    }

    @Override
    public void exitConditionalExpression(CParser.ConditionalExpressionContext ctx) {

    }

    @Override
    public void enterAssignmentExpression(CParser.AssignmentExpressionContext ctx) {

    }

    @Override
    public void exitAssignmentExpression(CParser.AssignmentExpressionContext ctx) {

    }

    @Override
    public void enterAssignmentOperator(CParser.AssignmentOperatorContext ctx) {

    }

    @Override
    public void exitAssignmentOperator(CParser.AssignmentOperatorContext ctx) {

    }

    @Override
    public void enterExpression(CParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(CParser.ExpressionContext ctx) {

    }

    @Override
    public void enterConstantExpression(CParser.ConstantExpressionContext ctx) {

    }

    @Override
    public void exitConstantExpression(CParser.ConstantExpressionContext ctx) {

    }

    @Override
    public void enterDeclaration(CParser.DeclarationContext ctx) {

    }

    @Override
    public void exitDeclaration(CParser.DeclarationContext ctx) {

    }

    @Override
    public void enterDeclarationSpecifiers(CParser.DeclarationSpecifiersContext ctx) {

    }

    @Override
    public void exitDeclarationSpecifiers(CParser.DeclarationSpecifiersContext ctx) {

    }

    @Override
    public void enterDeclarationSpecifier(CParser.DeclarationSpecifierContext ctx) {

    }

    @Override
    public void exitDeclarationSpecifier(CParser.DeclarationSpecifierContext ctx) {

    }

    @Override
    public void enterInitDeclaratorList(CParser.InitDeclaratorListContext ctx) {

    }

    @Override
    public void exitInitDeclaratorList(CParser.InitDeclaratorListContext ctx) {

    }

    @Override
    public void enterInitDeclarator(CParser.InitDeclaratorContext ctx) {

    }

    @Override
    public void exitInitDeclarator(CParser.InitDeclaratorContext ctx) {

    }

    @Override
    public void enterStorageClassSpecifier(CParser.StorageClassSpecifierContext ctx) {

    }

    @Override
    public void exitStorageClassSpecifier(CParser.StorageClassSpecifierContext ctx) {

    }

    @Override
    public void enterTypeSpecifier(CParser.TypeSpecifierContext ctx) {

    }

    @Override
    public void exitTypeSpecifier(CParser.TypeSpecifierContext ctx) {

    }

    @Override
    public void enterStructOrUnionSpecifier(CParser.StructOrUnionSpecifierContext ctx) {

    }

    @Override
    public void exitStructOrUnionSpecifier(CParser.StructOrUnionSpecifierContext ctx) {

    }

    @Override
    public void enterStructOrUnion(CParser.StructOrUnionContext ctx) {

    }

    @Override
    public void exitStructOrUnion(CParser.StructOrUnionContext ctx) {

    }

    @Override
    public void enterStructDeclarationList(CParser.StructDeclarationListContext ctx) {

    }

    @Override
    public void exitStructDeclarationList(CParser.StructDeclarationListContext ctx) {

    }

    @Override
    public void enterStructDeclaration(CParser.StructDeclarationContext ctx) {

    }

    @Override
    public void exitStructDeclaration(CParser.StructDeclarationContext ctx) {

    }

    @Override
    public void enterSpecifierQualifierList(CParser.SpecifierQualifierListContext ctx) {

    }

    @Override
    public void exitSpecifierQualifierList(CParser.SpecifierQualifierListContext ctx) {

    }

    @Override
    public void enterStructDeclaratorList(CParser.StructDeclaratorListContext ctx) {

    }

    @Override
    public void exitStructDeclaratorList(CParser.StructDeclaratorListContext ctx) {

    }

    @Override
    public void enterStructDeclarator(CParser.StructDeclaratorContext ctx) {

    }

    @Override
    public void exitStructDeclarator(CParser.StructDeclaratorContext ctx) {

    }

    @Override
    public void enterEnumSpecifier(CParser.EnumSpecifierContext ctx) {

    }

    @Override
    public void exitEnumSpecifier(CParser.EnumSpecifierContext ctx) {

    }

    @Override
    public void enterEnumeratorList(CParser.EnumeratorListContext ctx) {

    }

    @Override
    public void exitEnumeratorList(CParser.EnumeratorListContext ctx) {

    }

    @Override
    public void enterEnumerator(CParser.EnumeratorContext ctx) {

    }

    @Override
    public void exitEnumerator(CParser.EnumeratorContext ctx) {

    }

    @Override
    public void enterEnumerationConstant(CParser.EnumerationConstantContext ctx) {

    }

    @Override
    public void exitEnumerationConstant(CParser.EnumerationConstantContext ctx) {

    }

    @Override
    public void enterTypeQualifier(CParser.TypeQualifierContext ctx) {

    }

    @Override
    public void exitTypeQualifier(CParser.TypeQualifierContext ctx) {

    }

    @Override
    public void enterDeclarator(CParser.DeclaratorContext ctx) {

    }

    @Override
    public void exitDeclarator(CParser.DeclaratorContext ctx) {

    }

    @Override
    public void enterDirectDeclarator(CParser.DirectDeclaratorContext ctx) {

    }

    @Override
    public void exitDirectDeclarator(CParser.DirectDeclaratorContext ctx) {

    }

    @Override
    public void enterNestedParenthesesBlock(CParser.NestedParenthesesBlockContext ctx) {

    }

    @Override
    public void exitNestedParenthesesBlock(CParser.NestedParenthesesBlockContext ctx) {

    }

    @Override
    public void enterPointer(CParser.PointerContext ctx) {

    }

    @Override
    public void exitPointer(CParser.PointerContext ctx) {

    }

    @Override
    public void enterTypeQualifierList(CParser.TypeQualifierListContext ctx) {

    }

    @Override
    public void exitTypeQualifierList(CParser.TypeQualifierListContext ctx) {

    }

    @Override
    public void enterParameterTypeList(CParser.ParameterTypeListContext ctx) {

    }

    @Override
    public void exitParameterTypeList(CParser.ParameterTypeListContext ctx) {

    }

    @Override
    public void enterParameterList(CParser.ParameterListContext ctx) {
        if (!ctx.getText().isEmpty()) { // (Phase 1)
            int tab = sb.toString().split("\n")[sb.toString().split("\n").length - 1].split("\t").length - 1;
            sb.append("\t".repeat(Math.max(0, tab + 1)));
            sb.append("parameter list: [");
            for (CParser.ParameterDeclarationContext param : ctx.parameterDeclaration()) {
                sb.append(param.declarator().directDeclarator().Identifier().getText());
                sb.append(" ");
                sb.append(param.declarationSpecifiers().getText());
                sb.append(", ");
            }
        }

    }

    @Override
    public void exitParameterList(CParser.ParameterListContext ctx) {
        sb.delete(sb.length() - 2, sb.length()); // (Phase 1)
        sb.append("]\n");
    }

    @Override
    public void enterParameterDeclaration(CParser.ParameterDeclarationContext ctx) {


    }

    @Override
    public void exitParameterDeclaration(CParser.ParameterDeclarationContext ctx) {

    }

    @Override
    public void enterIdentifierList(CParser.IdentifierListContext ctx) {


    }

    @Override
    public void exitIdentifierList(CParser.IdentifierListContext ctx) {

    }

    @Override
    public void enterTypeName(CParser.TypeNameContext ctx) {

    }

    @Override
    public void exitTypeName(CParser.TypeNameContext ctx) {

    }

    @Override
    public void enterTypedefName(CParser.TypedefNameContext ctx) {
        if(current.lookup(ctx.getText(),true)==null){
            System.out.printf("Error106: in line [%d:%d], Can not find Variable [%s]%n",
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                    ctx.getText());
        }
    }

    @Override
    public void exitTypedefName(CParser.TypedefNameContext ctx) {

    }

    @Override
    public void enterInitializer(CParser.InitializerContext ctx) {

    }

    @Override
    public void exitInitializer(CParser.InitializerContext ctx) {

    }

    @Override
    public void enterInitializerList(CParser.InitializerListContext ctx) {

    }

    @Override
    public void exitInitializerList(CParser.InitializerListContext ctx) {

    }

    @Override
    public void enterDesignation(CParser.DesignationContext ctx) {

    }

    @Override
    public void exitDesignation(CParser.DesignationContext ctx) {

    }

    @Override
    public void enterDesignatorList(CParser.DesignatorListContext ctx) {

    }

    @Override
    public void exitDesignatorList(CParser.DesignatorListContext ctx) {

    }

    @Override
    public void enterDesignator(CParser.DesignatorContext ctx) {

    }

    @Override
    public void exitDesignator(CParser.DesignatorContext ctx) {

    }

    @Override
    public void enterStatement(CParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(CParser.StatementContext ctx) {

    }

    @Override
    public void enterLabeledStatement(CParser.LabeledStatementContext ctx) {

    }

    @Override
    public void exitLabeledStatement(CParser.LabeledStatementContext ctx) {

    }

    @Override
    public void enterCompoundStatement(CParser.CompoundStatementContext ctx) {

    }

    @Override
    public void exitCompoundStatement(CParser.CompoundStatementContext ctx) {

    }

    @Override
    public void enterBlockItemList(CParser.BlockItemListContext ctx) {

        for (CParser.BlockItemContext block : ctx.blockItem()) {
            if (block.declaration() != null) { // (Phase 1)
                int tab = sb.toString().split("\n")[sb.toString().split("\n").length - 1].split("\t").length - 1;
                if (sb.toString().split("\n")[sb.toString().split("\n").length - 1].contains("nested")) {
                    tab++;
                }
                sb.append("\t".repeat(Math.max(0, tab)));


                sb.append("field: ");
                if (block.declaration().initDeclaratorList() != null) {
                    sb.append(block.declaration().initDeclaratorList().initDeclarator(0).declarator().directDeclarator().Identifier().getText());
                    sb.append("/ type: ");
                    sb.append(block.declaration().declarationSpecifiers().getText());
                    if (block.declaration().initDeclaratorList().initDeclarator(0).declarator().directDeclarator().LeftBracket(0) != null) {
                        sb.append("/ length: ");
                        sb.append(block.declaration().initDeclaratorList().initDeclarator(0).declarator().directDeclarator().Constant(0));
                    }
                    sb.append("\n");
                } else {
                    sb.append(block.declaration().declarationSpecifiers().declarationSpecifier(1).getText());
                    sb.append("/ type: ");
                    sb.append(block.declaration().declarationSpecifiers().declarationSpecifier(0).getText());
                    sb.append("\n");
                }
            }
        }

    }

    @Override
    public void exitBlockItemList(CParser.BlockItemListContext ctx) {

    }

    @Override
    public void enterBlockItem(CParser.BlockItemContext ctx) {

    }

    @Override
    public void exitBlockItem(CParser.BlockItemContext ctx) {

    }

    @Override
    public void enterExpressionStatement(CParser.ExpressionStatementContext ctx) {

    }

    @Override
    public void exitExpressionStatement(CParser.ExpressionStatementContext ctx) {

    }

    @Override
    public void enterSelectionStatement(CParser.SelectionStatementContext ctx) {
        if (nested != 0) { // (Phase 1)
            int tab = sb.toString().split("\n")[sb.toString().split("\n").length - 1].split("\t").length - 1;

            if (sb.toString().split("\n")[sb.toString().split("\n").length - 1].contains("nested")) {
                tab++;
            }

            sb.append("\t".repeat(Math.max(0, tab)));
            sb.append("nested statement: {\n");
//            sb.append("\t".repeat(Math.max(0, tab + 1)));


            //         ************************************         // nested symbol table

            SymbolTable nest = new SymbolTable(ctx.start.getLine(), "nested");
            nest.setParent(current);
            current.addChild(nest);
            current = nest;
            StringBuilder key = new StringBuilder(), value = new StringBuilder();

            for (var variable : ctx.statement(0).compoundStatement().blockItemList().blockItem()) {
                if (variable.declaration() != null) {
                    if (variable.declaration().initDeclaratorList() != null) { // init value or array
                        String fieldName = variable.declaration().initDeclaratorList().initDeclarator(0).declarator().getText().split("\\[")[0];
                        if(nest.lookup(fieldName, true)!=null){ // phase(3) field already defined
                            fieldName+="_"+variable.start.getLine()+"_"+variable.start.getCharPositionInLine();
                            SymbolTable temp = current;
                            while(temp.getName().contains("nested")){
                                temp = temp.getParent();
                            }
                            System.out.printf("Error104: in line [%d:%d], field [%s] has been defined already%n",variable.start.getLine(),
                                    variable.start.getCharPositionInLine(),
                                    fieldName.split("_")[0]);
                        }
                        key.append(String.format("Field_%s", fieldName));
                        value.append(String.format("methodField(name: %s) (type: %s", fieldName,
                                variable.declaration().declarationSpecifiers().getText()));
                        if (variable.declaration().initDeclaratorList().initDeclarator(0).declarator().directDeclarator().LeftBracket(0) != null) { // isArray
                            value.append(" ");
                            value.append(String.format("array, length= %s",
                                    variable.declaration().initDeclaratorList().initDeclarator(0).declarator().directDeclarator().Constant(0).getText()));
                        }
                        value.append(")");

                    } else { // no init value
                        String fieldName = variable.declaration().declarationSpecifiers().declarationSpecifier(1).getText();
                        if(nest.lookup(fieldName, true)!=null){ // phase(3) field already defined
                            fieldName+="_"+variable.start.getLine()+"_"+variable.start.getCharPositionInLine();
                            SymbolTable temp = current;
                            while(temp.getName().contains("nested")){
                                temp = temp.getParent();
                            }
                            System.out.printf("Error104: in line [%d:%d], field [%s] has been defined already%n",variable.start.getLine(),
                                    variable.start.getCharPositionInLine(),
                                    fieldName.split("_")[0]);
                        }

                        key.append(String.format("Field_%s", fieldName));
                        value.append(String.format("methodField(name:%s) (type:%s)", fieldName,
                                variable.declaration().declarationSpecifiers().declarationSpecifier(0).getText()));
                    }
                    nest.insert(key.toString(), value.toString());
                }
            }

        }
        nested++;
    }

    @Override
    public void exitSelectionStatement(CParser.SelectionStatementContext ctx) {
        nested--; // (Phase 1)
        if (nested > 0) {
            int tab = sb.toString().split("\n")[sb.toString().split("\n").length - 1].split("\t").length - 1;
            sb.append("\t".repeat(Math.max(0, tab - 1)));
            sb.append("}\n");

            if (current.getParent() != null)
                current = current.getParent();
        }

    }

    @Override
    public void enterIterationStatement(CParser.IterationStatementContext ctx) {
        if (nested != 0) { // (Phase 1)
            int tab = sb.toString().split("\n")[sb.toString().split("\n").length - 1].split("\t").length - 1;

            if (sb.toString().split("\n")[sb.toString().split("\n").length - 1].contains("nested")) {
                tab++;
            }

            sb.append("\t".repeat(Math.max(0, tab)));
            sb.append("nested statement: {\n");

            //         ************************************         // nested symbol table
            SymbolTable nest = new SymbolTable(ctx.start.getLine(), "nested");
            nest.setParent(current);
            current.addChild(nest);
            current = nest;
            StringBuilder key = new StringBuilder(), value = new StringBuilder();

            for (var variable : ctx.statement().compoundStatement().blockItemList().blockItem()) {
                if (variable.declaration() != null) {
                    if (variable.declaration().initDeclaratorList() != null) { // init value or array

                        String fieldName = variable.declaration().initDeclaratorList().initDeclarator(0).declarator().getText().split("\\[")[0];
                        if(nest.lookup(fieldName, true)!=null){ // phase(3) field already defined
                            fieldName+="_"+variable.start.getLine()+"_"+variable.start.getCharPositionInLine();
                            SymbolTable temp = current;
                            while(temp.getName().contains("nested")){
                                temp = temp.getParent();
                            }
                            System.out.printf("Error104: in line [%d:%d], field [%s] has been defined already%n",variable.start.getLine(),
                                    variable.start.getCharPositionInLine(),
                                    fieldName.split("_")[0]);
                        }

                        key.append(String.format("Field_%s",
                                fieldName));
                        value.append(String.format("methodField(name: %s) (type: %s",
                                fieldName,
                                variable.declaration().declarationSpecifiers().getText()));
                        if (variable.declaration().initDeclaratorList().initDeclarator(0).declarator().directDeclarator().LeftBracket(0) != null) { // isArray
                            value.append(" ");
                            value.append(String.format("array, length= %s",
                                    variable.declaration().initDeclaratorList().initDeclarator(0).declarator().directDeclarator().Constant(0).getText()));
                        }
                        value.append(")");

                    } else { // no init value

                        String fieldName = variable.declaration().declarationSpecifiers().declarationSpecifier(1).getText();
                        if(nest.lookup(fieldName, true)!=null){ // phase(3) field already defined
                            fieldName+="_"+variable.start.getLine()+"_"+variable.start.getCharPositionInLine();
                            SymbolTable temp = current;
                            while(temp.getName().contains("nested")){
                                temp = temp.getParent();
                            }
                            System.out.printf("Error104: in line [%d:%d], field [%s] has been defined already%n",variable.start.getLine(),
                                    variable.start.getCharPositionInLine(),
                                    fieldName.split("_")[0]);
                        }

                        key.append(String.format("Field_%s",
                                fieldName));
                        value.append(String.format("methodField(name:%s) (type:%s)",
                                fieldName,
                                variable.declaration().declarationSpecifiers().declarationSpecifier(1).getText()));
                    }
                    nest.insert(key.toString(), value.toString());
                }
            }
        }
        nested++;
    }

    @Override
    public void exitIterationStatement(CParser.IterationStatementContext ctx) {
        nested--; // (Phase 1)
        if (nested > 0) {
            int tab = sb.toString().split("\n")[sb.toString().split("\n").length - 1].split("\t").length - 1;
            sb.append("\t".repeat(Math.max(0, tab - 1)));
            sb.append("}\n");
            if (current.getParent() != null)
                current = current.getParent();
        }
    }

    @Override
    public void enterForCondition(CParser.ForConditionContext ctx) {


    }

    @Override
    public void exitForCondition(CParser.ForConditionContext ctx) {

    }

    @Override
    public void enterForDeclaration(CParser.ForDeclarationContext ctx) {

    }

    @Override
    public void exitForDeclaration(CParser.ForDeclarationContext ctx) {

    }

    @Override
    public void enterForExpression(CParser.ForExpressionContext ctx) {

    }

    @Override
    public void exitForExpression(CParser.ForExpressionContext ctx) {

    }

    @Override
    public void enterJumpStatement(CParser.JumpStatementContext ctx) {
        if(ctx.Return()!=null){
            SymbolTable temp = current;
            while (current!=null && current.getName().contains("nested")){
                temp = temp.getParent();
            }
            String returnType = symbolTable.getHashtable().get("Method_"+temp.getName()).split("return type: ")[1].split("\\)")[0];
            CParser.PrimaryExpressionContext value = ctx.expression().assignmentExpression(0).conditionalExpression().logicalOrExpression().logicalAndExpression(0).inclusiveOrExpression(0).exclusiveOrExpression(0).andExpression(0).equalityExpression(0).relationalExpression(0).shiftExpression(0).additiveExpression(0).multiplicativeExpression(0).castExpression(0).unaryExpression().postfixExpression().primaryExpression();
            if(value.Constant()==null){
                if(temp.lookup(value.getText(),true) != null){
                    if(!temp.getHashtable().get("Field_"+value.getText()).split("type: ")[1].split(" ")[0].equals(returnType)){
                        System.out.printf("Error210: in line [%d:%d], ReturnType of this method must be [%s]%n",ctx.start.getLine(),
                                ctx.start.getCharPositionInLine(),
                                returnType);
                    }
                }
            } else if (value.Identifier() == null) {
                Enum<Type> typeEnum = SymbolTable.typeCheck(value.getText());
                if(!returnType.toUpperCase().equals(typeEnum.toString())){
                    System.out.printf("Error210: in line [%d:%d], ReturnType of this method must be [%s]%n",ctx.start.getLine(),
                            ctx.start.getCharPositionInLine(),
                            returnType);
                }
            }
        }
    }

    @Override
    public void exitJumpStatement(CParser.JumpStatementContext ctx) {

    }

    @Override
    public void enterProgram(CParser.ProgramContext ctx) {
        sb.append("program start {\n"); // (Phase 1)
        symbolTable = new SymbolTable(1, "program"); // program
    }

    @Override
    public void exitProgram(CParser.ProgramContext ctx) {
        sb.append("}\n"); // (Phase 1)
        System.out.println(sb);
        System.out.println(symbolTable);
    }

    @Override
    public void enterFunctionDefinition(CParser.FunctionDefinitionContext ctx) {
        // sb.append("\t"); // (Phase 1)
        int tab = sb.toString().split("\n")[sb.toString().split("\n").length - 1].split("\t").length - 1;

        if (!sb.toString().split("\n")[sb.toString().split("\n").length - 1].contains("program start")) {
            tab--;
        }

        sb.append("\t".repeat(Math.max(0, tab + 1)));

        if (ctx.declarator().directDeclarator().directDeclarator().getText().contains("main")) {
            sb.append("main method: return type: ");
            if (ctx.typeSpecifier().getText().equals("void")) {
                sb.append("void(no return) {\n");
            } else {
                sb.append(ctx.typeSpecifier().getText());
                sb.append(" {\n");
            }
        } else {
            sb.append("normal method: name: ");
            sb.append(ctx.declarator().directDeclarator().directDeclarator().getText());
            sb.append("/ return type: ");
            sb.append(ctx.typeSpecifier().getText());
            sb.append(" {\n");

        }

        //                  *******************                  // program SymbolTable (Phase 2)

        StringBuilder key = new StringBuilder(), value = new StringBuilder();

            //           ********************            // phase(3) method already defined
        String funcName = ctx.declarator().directDeclarator().directDeclarator().getText();
        if(symbolTable.lookup(funcName, false)!=null){
            funcName+="_"+ctx.start.getLine()+"_"+ctx.start.getCharPositionInLine();
            System.out.printf("Error102: in line [%d:%d], method [%s] has been defined already%n",ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                    funcName.split("_")[0]);
        }

        key.append(String.format("Method_%s", funcName));
        value.append(String.format("Value: Method (name: %s) (return type: %s)",
                funcName,
                ctx.typeSpecifier().getText()));
        if (ctx.declarator().directDeclarator().parameterTypeList() != null) {
            value.append("  [parameter list: ");
            int counter = 0;
            for (CParser.ParameterDeclarationContext params : ctx.declarator().directDeclarator().parameterTypeList().parameterList().parameterDeclaration()) {

                value.append("[type: ");
                value.append(params.declarationSpecifiers().getText());
                if (params.declarator().directDeclarator().LeftBracket(0) != null) {
                    value.append(" array");
                }
                value.append(", index: ");
                value.append(counter);
                value.append("]");
                counter++;
            }
            value.append("]");
        }

        symbolTable.insert(key.toString(), value.toString());
        current = symbolTable;

        //                  *******************                  // function params SymbolTable (Phase 2)

        String name = ctx.declarator().directDeclarator().directDeclarator().getText();
        SymbolTable temp = new SymbolTable(ctx.start.getLine(), name);
        symbolTable.addChild(temp);
        current = temp;
        for (CParser.ParameterDeclarationContext params :
                ctx.declarator().directDeclarator().parameterTypeList().parameterList().parameterDeclaration()) {
            key = new StringBuilder();
            value = new StringBuilder();

            key.append(String.format("Field_%s", params.declarator().directDeclarator().Identifier().getText()));
            if (params.declarator().directDeclarator().LeftBracket(0) != null) { // array
                value.append(String.format("methodParamField(name: %s) (type: %s array, length= %s)",
                        params.declarator().directDeclarator().Identifier().getText(),
                        params.declarationSpecifiers().getText(),
                        params.declarator().directDeclarator().Constant(0).getText()));
            } else { // not array
                value.append(String.format("methodParamField(name: %s) (type: %s)",
                        params.declarator().directDeclarator().Identifier().getText(),
                        params.declarationSpecifiers().getText()));
            }

            symbolTable.getChild(name).insert(key.toString(), value.toString());
            current = symbolTable.getChild(name);
        }


        //                  *******************                  // function fields SymbolTable (Phase 2)



        for (CParser.BlockItemContext item : ctx.compoundStatement().blockItemList().blockItem()) {
            key = new StringBuilder();
            value = new StringBuilder();

            if (item.declaration() != null) {
                if (item.declaration().initDeclaratorList() != null) { // init value or array
                    String fieldName = item.declaration().initDeclaratorList().initDeclarator(0).declarator().getText().split("\\[")[0];
                    if(current.lookup(fieldName, true)!=null){ // phase(3) field already defined
                        fieldName+="_"+item.start.getLine()+"_"+item.start.getCharPositionInLine();
                        System.out.printf("Error104: in line [%d:%d], field [%s] has been defined already%n",item.start.getLine(),
                                item.start.getCharPositionInLine(),
                                fieldName.split("_")[0]);
                    }

                    key.append(String.format("Field_%s", fieldName));
                    value.append(String.format("methodField(name: %s) (type: %s", fieldName,
                            item.declaration().declarationSpecifiers().getText()));
                    if (item.declaration().initDeclaratorList().initDeclarator(0).declarator().directDeclarator().LeftBracket(0) != null) { // isArray
                        value.append(" ");
                        value.append(String.format("array, length= %s",
                                item.declaration().initDeclaratorList().initDeclarator(0).declarator().directDeclarator().Constant(0).getText()));
                    }
                    value.append(")");

                } else { // no init value
                    String fieldName = item.declaration().declarationSpecifiers().declarationSpecifier(1).getText();
                    if(current.lookup(fieldName, true)!=null){ // phase(3) field already defined
                        fieldName+="_"+item.start.getLine()+"_"+item.start.getCharPositionInLine();
                        System.out.printf("Error104: in line [%d:%d], field [%s] has been defined already%n",item.start.getLine(),
                                item.start.getCharPositionInLine(),
                                fieldName.split("_")[0]);
                    }

                    key.append(String.format("Field_%s", fieldName));
                    value.append(String.format("methodField(name:%s) (type:%s)", fieldName,
                            item.declaration().declarationSpecifiers().declarationSpecifier(0).getText()));
                }
                symbolTable.getChild(name).insert(key.toString(), value.toString());
                current = symbolTable.getChild(name);
            }
        }





    }

    @Override
    public void exitFunctionDefinition(CParser.FunctionDefinitionContext ctx) {
        sb.append("\t}\n"); // (Phase 2)

    }

    @Override
    public void enterDeclarationList(CParser.DeclarationListContext ctx) {

    }

    @Override
    public void exitDeclarationList(CParser.DeclarationListContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
