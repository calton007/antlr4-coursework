package relationtosql;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RelationToSqlConverterTest {
    private final RelationToSqlConverter converter = new RelationToSqlConverter();

    @Test
    void convertsProjection() {
        assertEquals("SELECT a FROM (b)", converter.convert("Ha(b);"));
        assertEquals("SELECT a,b FROM (c)", converter.convert("Ha,b(c);"));
    }

    @Test
    void convertsSelection() {
        assertEquals("SELECT * FROM (b) WHERE a=1", converter.convert("Ga=1(b);"));
        assertEquals("SELECT * FROM (b) WHERE a=1 AND b>2", converter.convert("Ga=1@b>2(b);"));
    }

    @Test
    void convertsSetOperations() {
        assertTrue(converter.convert("Ha(b)*Hc(d);").contains("UNION"));
        assertTrue(converter.convert("Ha(b)~Hc(d);").contains("INTERSECT"));
    }

    @Test
    void convertsNaturalJoin() {
        assertEquals("(b) NATURAL JOIN (c)", converter.convert("b&c;"));
    }

    @Test
    void rejectsDivision() {
        RelationToSqlException exception =
                assertThrows(RelationToSqlException.class, () -> converter.convert("b/c;"));

        assertEquals("unsupported operation: division", exception.getMessage());
    }

    @Test
    void rejectsSyntaxErrors() {
        RelationToSqlException exception =
                assertThrows(RelationToSqlException.class, () -> converter.convert("Ha(b)xxx;"));

        assertEquals("syntax error", exception.getMessage());
    }
}
