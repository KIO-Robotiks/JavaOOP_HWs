public class Chicken extends Bird{
    protected Chicken(double height, double weight, String colorEyes, Double heightOfFly) {
        super(height, weight, colorEyes, heightOfFly);
    }

    @Override
    protected void makeSound() {
        System.out.println("Кудах-кудах");
    }
}
