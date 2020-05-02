package actionPattern.strategyPattern;

public class ChildrenCard implements Card{
    public double calculate(double originalPrice) {
        return originalPrice * 0.1;
    }
}
