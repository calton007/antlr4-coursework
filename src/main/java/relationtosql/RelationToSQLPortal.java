package relationtosql;

import java.util.Scanner;

public class RelationToSQLPortal {
    private static final String LINE_START = "Relation> ";

    public static void main(String[] args) {
        RelationToSqlConverter converter = new RelationToSqlConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.print(LINE_START);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                if ("exit".equals(line) || "bye".equals(line)) {
                    break;
                }
                try {
                    System.out.println(converter.convert(line));
                } catch (RelationToSqlException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
            System.out.print("\n" + LINE_START);
        }
    }
}
