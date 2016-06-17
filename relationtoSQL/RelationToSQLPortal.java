import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class RelationToSQLPortal {

    private static final String lineStart = "Relation> ";

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
            System.out.print(lineStart);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line != null) {
                    line = line.trim();
                    if (line.length() != 0) {
                        if ("exit".equals(line) || "bye".equals(line))
                            break;
                        ANTLRInputStream input = new ANTLRInputStream(line);
                        RelationToSQLLexer lexer = new RelationToSQLLexer(input);
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                        RelationToSQLParser parser = new RelationToSQLParser(tokens);
                        ParseTree tree = parser.prog();
                        MyRelationToSQLVisitor mv = new MyRelationToSQLVisitor();
                        Object res = mv.visit(tree);
                        if (res != null)
                            System.out.println(res);
                    }
                }

                System.out.print("\n"+lineStart);
            }
    }

}