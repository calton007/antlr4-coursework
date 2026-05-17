package calculator;

import java.util.Scanner;

public class CalcPortal {
    private static final String LINE_START = "CALC> ";

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print(LINE_START);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                if ("exit".equals(line) || "bye".equals(line)) {
                    break;
                }
                try {
                    Double result = calculator.evaluate(line);
                    if (result != null) {
                        System.out.println(result);
                    }
                } catch (CalculatorException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
            System.out.print(LINE_START);
        }
    }
}
