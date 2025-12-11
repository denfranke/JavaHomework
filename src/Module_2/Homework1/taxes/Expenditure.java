package Module_2.Homework1.taxes;

public class Expenditure extends Deal {
    public Expenditure(String productName, int price) {
        super("Покупка «" + productName + "» на " + price + " руб.", 0, price);
    }
}

