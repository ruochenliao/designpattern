package actionPattern.strategyPattern;

public class StudentCard implements Card{
    public double calculate(double originalPrice) {
        return originalPrice * 0.8;
    }
}
