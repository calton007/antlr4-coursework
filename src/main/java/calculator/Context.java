package calculator;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String, Double> values = new HashMap<>();

    public Double getValue(String key) {
        Double value = values.get(key);
        if (value == null) {
            throw new CalculatorException("undefined variable: " + key);
        }
        return value;
    }

    public void setContext(String key, Double value) {
        values.put(key, value);
    }
}
