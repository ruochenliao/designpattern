package actionPattern.strategyPattern;

public class VipCard implements Card{
    public double calculate(double originalPrice) {
        return originalPrice * 0.6;
    }
}
