package actionPattern.strategyPattern;

import actionPattern.StatePattern.Room;


public class DiscountRoom extends Room {

    double price;
    Card card;

    public void setPrice(double price){
        this.price = price;
    }

    public void setCard(Card card) {
        this.card = card;
    }


    public double getPrice(){
        if(card == null){
            return price;
        }
        return card.calculate(price);
    }

}
