public class childProduct extends baseProduct{
    private Integer minAge;
    private Boolean hypoallergenicity;

    public childProduct(String name, Double price, Integer amount,
                           String unit, Integer minAge,
                           Boolean hypoallergenicity) {
        super(name, price, amount, unit);
        this.minAge = minAge;
        this.hypoallergenicity = hypoallergenicity;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String minAge = "Минимальный возраст: " + String.format("%d", this.minAge) + "\n";
        String hypoallergenicity = "Гипоалегенность:  " + String.valueOf(this.hypoallergenicity) + "\n";
        return baseInfo + minAge + hypoallergenicity;
    }
}
