package actionPattern.InterpreterPattern.ruleEngine;

public class Test {
    public static void main(String[] args) {
        RuleEngine engine = new RuleEngine();
        String statement = "true and true and false";
        engine.build(statement);
        System.out.println(engine.compute());
    }
}
