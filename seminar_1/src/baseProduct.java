public class baseProduct {
    protected String name;
    protected Double price;
    protected Integer amount;
    protected String unit;

    public baseProduct(String name, Double price, Integer amount, String unit) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String toString() {
        String name = "Название товара: " + this.name + "\n";
        String price = "Цена товара: " + String.format("%.2f", this.price) + "\n";
        String amount = "Количество: " + String.format("%d", this.amount) + " " + this.unit + "\n";
        return name + price + amount;
    }
}