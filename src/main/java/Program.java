import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product();
        //product1.name = "Продукт №1";
        //product1.brand = "Производитель №1";
        // product1.price = 200;
        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        //product1.name = "Продукт №1";
        //product1.brand = "Производитель №1";
        // product1.price = 200;
        System.out.println(product1.displayInfo());

        Product product3 = new Product("Макфа", "Рожки", 150);
        product3.setName(null);
        System.out.println(product3.displayInfo());

        Product bottleOfWater =
                new BottleOfWater("Увинская", "Газированная", 200, 1.5);
        System.out.println(bottleOfWater.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("Ижмолоко", "Молоко", 220, 1.5, 2.5);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 =
                new BottleOfMilk("ИграМолоко", "Молоко2", 230, 1.5, 3.2);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfMilk3 =
                new BottleOfMilk("УваМолоко", "Молоко3", 225, 1.5, 3.2);
        System.out.println(bottleOfMilk3.displayInfo());
        Product chocolate1 = new Chocolate("Россия", "Аленка", 250, 481);


        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(chocolate1);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Молоко2", 1.5);
        if (bottleOfMilk == null){
            System.out.println("Такой бутылки с молоком нет в автомате");
        } else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }

        Chocolate chocolate = vendingMachine.getChocolate("Аленка", 481);
        if (chocolate == null){
            System.out.println("Такой шоколадки нет в автомате");
        } else {
            System.out.println("Вы купили: ");
            System.out.println(chocolate.displayInfo());
        }

    }
}
