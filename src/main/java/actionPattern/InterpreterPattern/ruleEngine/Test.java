package actionPattern.InterpreterPattern.ruleEngine;

public class Test {
    public static void main(String[] args) {
        RuleEngine engine = new RuleEngine();
        String statement = "false and true and true";
        engine.build(statement);
        System.out.println(engine.compute());
    }
}
