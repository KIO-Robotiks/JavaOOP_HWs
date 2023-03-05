public class milk extends drinkProduct{
    private Double fat;
    private String expirationDate;

    public milk(String name, Double price, Integer amount,
                        String unit, Double volume, Double fat, String expirationDate) {
        super(name, price, amount, unit, volume);
        this.fat = fat;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String fat = "Жирность : " + String.format("%.1f", this.fat) + "\n";
        String expirationDate = "Срок годности : " + this.expirationDate + "\n";
        return baseInfo + fat + expirationDate;
    }
}
