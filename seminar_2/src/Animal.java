public abstract class Animal {
    protected Double height;
    protected Double weight;
    protected String colorEyes;

    public Animal(double height, double weight, String colorEyes) {
        this.height = height;
        this.weight = weight;
        this.colorEyes = colorEyes;
    }

    protected abstract void makeSound();

    @Override
    public String toString() {
        return "{" +
                "height=" + height +
                ", weight=" + weight +
                ", colorEyes='" + colorEyes + '\'' +
                '}';
    }
}
