
public class Fruit {
    String Fruits;
    Double Price;
    Double Quantity;
    Double Rate;
    Double totalAmount;

    Fruit(){
        this.Rate = 0.0;
        this.totalAmount = 0.0;
    }

    Fruit(String Fruits, Double Price, Double Quantity) {
         this.Fruits = Fruits;
         this.Price = Price;
         this.Quantity = Quantity;

    }
}
