public class Tiger extends wildAnimal{
    public Tiger(double height, double weight, String colorEyes, String habitat, String dataBirth) {
        super(height, weight, colorEyes, habitat, dataBirth);
    }

    @Override
    protected void makeSound() {
        System.out.println("Ррррр!");
    }
}
