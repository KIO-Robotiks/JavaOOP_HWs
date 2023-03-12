public class Aist extends Bird{
    protected Aist(double height, double weight, String colorEyes, Double heightOfFly) {
        super(height, weight, colorEyes, heightOfFly);
    }

    @Override
    protected void makeSound() {
        System.out.println("Щёлк-щёлк");
    }
}
