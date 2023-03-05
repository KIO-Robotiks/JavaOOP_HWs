public class eggs extends foodProduct{
    private Integer amountInPackage;

    public eggs(String name, Double price, Integer amount,
                       String unit, String expirationDate, Integer amountInPackage) {
        super(name, price, amount, unit, expirationDate);
        this.amountInPackage = amountInPackage;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String amountInPackage = "Кол-во в упаковке: " + String.format("%d", this.amountInPackage) + "\n";
        return baseInfo + amountInPackage;
    }
}
