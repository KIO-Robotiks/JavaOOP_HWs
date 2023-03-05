public class bread extends foodProduct{
    private String typeOfFlour;

    public bread(String name, Double price, Integer amount,
                 String unit, String expirationDate, String typeOfFlour) {
        super(name, price, amount, unit, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String typeOfFlour = "Тип муки: " + this.typeOfFlour + "\n";
        return baseInfo + typeOfFlour;
    }
}
