public class drinkProduct extends baseProduct{
    private Double volume;

    public drinkProduct(String name, Double price, Integer amount,
                        String unit, Double volume) {
        super(name, price, amount, unit);
        this.volume = volume;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String volume = "Объём: " + String.format("%.2f", this.volume) + "\n";
        return baseInfo + volume;
    }
}
