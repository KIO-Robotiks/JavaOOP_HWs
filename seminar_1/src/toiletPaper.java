public class toiletPaper extends hygieneProduct{
    private Integer amountOfLayers;

    public toiletPaper(String name, Double price, Integer amount,
                          String unit, Integer amountInPackage, Integer amountOfLayers) {
        super(name, price, amount, unit, amountInPackage);
        this.amountOfLayers = amountOfLayers;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String amountOfLayers = "Количество слоёв: " + String.format("%d", this.amountOfLayers) + "\n";
        return baseInfo + amountOfLayers;
    }
}
