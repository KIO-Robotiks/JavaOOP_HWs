public class Cat extends homeAnimal{
    private Boolean haveWool;
    public Cat(double height, double weight, String colorEyes, String name, String breed, Boolean vaccination,
               String colorWool, String dataBirth, Boolean haveWool) {
        super(height, weight, colorEyes, name, breed, vaccination, colorWool, dataBirth);
        this.haveWool = haveWool;
    }

    public Boolean getHaveWool(){
        return haveWool;
    }

    @Override
    protected void makeSound() {
        System.out.println("Мяу!");
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo + "\nCat{" +
                "haveWool='" + haveWool + '\'' +
                '}';
    }

    @Override
    public void weasel() {
        System.out.println("Я кот я ласкаюсь: Муррррр!");
    }
}
