# antlr4

ANTLR4 demo project with two Java console programs:

- `calculator`: expression calculator.
- `relationtoSQL`: simple relation-algebra-to-SQL printer.

The project uses Java 17, Maven, ANTLR 4.13.2, and JUnit 5.

## Test

```powershell
mvn test
```

## Run calculator

```powershell
mvn -q exec:java "-Dexec.mainClass=calculator.CalcPortal"
```

Example:

```text
1+2*3
```

Expected output:

```text
7.0
```

## Run relationtoSQL

```powershell
mvn -q exec:java "-Dexec.mainClass=relationtosql.RelationToSQLPortal"
```

Example:

```text
Ha(b);
```

Expected output:

```text
SELECT a FROM (b)
```

Supported relation symbols:

| Symbol | Meaning | Example |
|---|---|---|
| `H` | projection | `Ha,b(c);` |
| `G` | selection | `Ga=1@b>2(c);` |
| `*` | union | `Ha(b)*Hc(d);` |
| `~` | intersection | `Ha(b)~Hc(d);` |
| `&` | natural join | `b&c;` |
| `/` | division | unsupported, reports `ERROR: unsupported operation: division` |
