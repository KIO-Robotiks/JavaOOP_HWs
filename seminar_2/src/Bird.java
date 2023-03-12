public abstract class Bird extends Animal implements  Fly{
    private Double heightOfFly;

    protected Bird(double height, double weight, String colorEyes, Double heightOfFly) {
        super(height, weight, colorEyes);
        this.heightOfFly = heightOfFly;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo + "\nBird {" +
                "heightOfFly=" + heightOfFly +
                '}';
    }

    @Override
    public void fly() {
        System.out.println(String.format(
                "Im %s, Im fly on the %.2f meters!", this.getClass().getSimpleName(), this.heightOfFly));
    }
}
