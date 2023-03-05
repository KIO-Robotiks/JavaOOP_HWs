public class hygieneProduct extends baseProduct{
    private Integer amountInPackage;

    public hygieneProduct(String name, Double price, Integer amount,
                        String unit, Integer amountInPackage) {
        super(name, price, amount, unit);
        this.amountInPackage = amountInPackage;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String amountInPackage = "Количество штук в упаковке: " + String.format("%d", this.amountInPackage) + "\n";
        return baseInfo + amountInPackage;
    }
}
