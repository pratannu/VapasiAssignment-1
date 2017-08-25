import java.util.*;

public class FruitQuantityRate{
    public static void main(String[] args) {

        //Creating Class Objects
        Fruit FruitApple = new Fruit("Apple", 100.00, 2.00);
        Fruit FruitOrange = new Fruit("Orange", 80.00, 1.5);
        Fruit FruitBanana = new Fruit("Banana", 30.00, 0.5);
        Fruit FruitKiwi = new Fruit("Kiwi", 120.00, 0.75);
        Fruit FruitRate = new Fruit(); //Default Constructor

        //Creating ArrayList
        ArrayList<Fruit> FruitArray = new ArrayList<Fruit>();
        FruitArray.add(FruitApple);
        FruitArray.add(FruitOrange);
        FruitArray.add(FruitBanana);
        FruitArray.add(FruitKiwi);

        Iterator itr = FruitArray.iterator();

        System.out.println("Fruit    " + "Quantity    " + "Rate   ");

        while (itr.hasNext()) {
        Fruit fruit1 = (Fruit) itr.next();
            FruitRate.Rate =   (fruit1.Price * fruit1.Quantity);
            FruitRate.totalAmount = FruitRate.totalAmount + FruitRate.Rate;
            System.out.println(fruit1.Fruits + "     " + fruit1.Quantity + "       " + FruitRate.Rate );

        }
        System.out.println();
        System.out.println("Total Amount" + "=  " + FruitRate.totalAmount);
    }
}
