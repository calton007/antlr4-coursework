# antlr4

这是一个 ANTLR4 课程演示项目，包含两个 Java 命令行程序：

- `calculator`：表达式计算器。
- `relationtoSQL`：简化关系代数到 SQL 的转换器。

项目使用 Java 17、Maven、ANTLR 4.13.2 和 JUnit 5。

## 运行测试

```powershell
mvn test
```

## 运行计算器

```powershell
mvn -q exec:java "-Dexec.mainClass=calculator.CalcPortal"
```

输入示例：

```text
1+2*3
```

预期输出：

```text
7.0
```

## 运行 relationtoSQL

```powershell
mvn -q exec:java "-Dexec.mainClass=relationtosql.RelationToSQLPortal"
```

输入示例：

```text
Ha(b);
```

预期输出：

```text
SELECT a FROM (b)
```

支持的关系代数符号：

| 符号 | 含义 | 示例 |
|---|---|---|
| `H` | 投影 | `Ha,b(c);` |
| `G` | 选择 | `Ga=1@b>2(c);` |
| `*` | 并 | `Ha(b)*Hc(d);` |
| `~` | 交 | `Ha(b)~Hc(d);` |
| `&` | 自然连接 | `b&c;` |
| `/` | 除法 | 暂不支持，会输出 `ERROR: unsupported operation: division` |
