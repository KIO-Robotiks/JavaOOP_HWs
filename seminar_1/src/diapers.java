public class diapers extends hygieneProduct{
    private Double volume;
    private Double minWeight;
    private Double maxWeight;
    private String type;

    public diapers(String name, Double price, Integer amount,
                   String unit, Integer amountInPackage,
                   Double volume, Double minWeight, Double maxWeight, String type) {
        super(name, price, amount, unit, amountInPackage);
        this.volume = volume;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        String volume = "Размер: " + String.format("%.1f", this.volume) + "\n";
        String minWeight = "Минимальный вес: " + String.format("%.1f", this.minWeight) + "\n";
        String maxWeight = "Максимальный вес: " + String.format("%.1f", this.maxWeight) + "\n";
        String type = "Тип: " + this.type + "\n";
        return baseInfo + volume + minWeight + maxWeight + type;
    }
}
