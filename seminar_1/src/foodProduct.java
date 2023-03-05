public class foodProduct extends baseProduct{
    private String expirationDate;

    public foodProduct(String name, Double price, Integer amount,
                        String unit, String expirationDate) {
        super(name, price, amount, unit);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String expirationDate = "Срок годности: " + this.expirationDate + "\n";
        return baseInfo + expirationDate;
    }
}
