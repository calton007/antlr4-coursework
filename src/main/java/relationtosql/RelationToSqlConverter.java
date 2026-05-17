package relationtosql;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class RelationToSqlConverter {
    public String convert(String input) {
        RelationToSQLLexer lexer = new RelationToSQLLexer(CharStreams.fromString(input));
        ThrowingErrorListener errorListener = new ThrowingErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationToSQLParser parser = new RelationToSQLParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        RelationToSQLParser.ProgContext tree = parser.prog();
        if (errorListener.hasError()) {
            throw new RelationToSqlException("syntax error");
        }
        return new MyRelationToSQLVisitor().visit(tree);
    }
}
