package actionPattern.strategyPattern;

public interface Card {
    /**
     * 计算打折价格
     * @param originalPrice
     * @return
     */
    double calculate(double originalPrice);
}
