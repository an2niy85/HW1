public class Chocolate extends Product{

    /**
     * Калорийонсть
     */
    private double caloric;

    public double getCaloric() {
        return caloric;
    }

    public Chocolate(String brand, String name, double price, double caloric) {
        super(brand, name, price);
        this.caloric = caloric;
    }

    @Override
    String displayInfo() {
        return String.format("[Шоколад]\n%s - %s - %.2f\nКалорийность: %.1f",
                brand, name, price, caloric);
    }
}
