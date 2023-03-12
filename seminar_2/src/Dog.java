public class Dog extends homeAnimal implements Training{
    private Boolean training;
    public Dog(double height, double weight, String colorEyes, String name, String breed, Boolean vaccination,
               String colorWool, String dataBirth, Boolean training) {
        super(height, weight, colorEyes, name, breed, vaccination, colorWool, dataBirth);
    }

    @Override
    protected void makeSound() {
        System.out.println("Гав-Гав!");
    }

    @Override
    public void training() {
        System.out.println("Я Собака, я дрессеруюсь хорошо!");
    }

    @Override
    public void weasel() {
        System.out.println("Я собака, я ласкаюсь: Тяф-Тяф..");
    }
}
