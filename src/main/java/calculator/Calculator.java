package calculator;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Calculator {
    private final Context context = new Context();

    public Double evaluate(String input) {
        CalcLexer lexer = new CalcLexer(CharStreams.fromString(input));
        ThrowingErrorListener errorListener = new ThrowingErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        CalcParser.StatementContext tree = parser.statement();
        if (errorListener.hasError()) {
            throw new CalculatorException("syntax error");
        }
        return new MyCalcVisitor(context).visit(tree);
    }
}
