import java.util.ArrayList;
import java.util.Scanner;

public class Zoo{
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimalDirect(Animal animal){
        this.animals.add(animal);
    }

    public void addAnimal(Scanner input){
        System.out.print("Введите высоту животного: ");
        double growth = input.nextDouble();
        System.out.print("Введите вес животного: ");
        double weight = input.nextDouble();
        System.out.print("Введите цвет глаз: ");
        String eyeColor = input.next();

        System.out.println();
        System.out.println("Выберите животное:");
        System.out.println("1. Кот");
        System.out.println("2. Тигр");
        System.out.println("3. Аист");
        System.out.println("4. Курица");
        System.out.println("5. Волк");
        System.out.println("6. Собака");

        int choiceAnimal = input.nextInt();

        switch (choiceAnimal){
            case 1:
                System.out.print("Введите кличку кота: ");
                String name = input.next();
                System.out.print("Введите породу кота: ");
                String breed = input.next();
                System.out.print("Кот привит (да/нет): ");
                Boolean vaccination = (input.next() == "да") ? true : false;
                System.out.print("Введите цвет окраса кота: ");
                String woolColor = input.next();
                System.out.print("Введите дату рождения кота: ");
                String dataBirth = input.next();
                System.out.print("Есть ли у кота шерсть?(да/нет): ");
                Boolean haveWool = (input.next() == "да") ? true : false;

                addAnimalDirect(new Cat(growth, weight, eyeColor, name, breed, vaccination,
                        woolColor, dataBirth, haveWool));
                break;
            case 2:
                System.out.print("Введите среду обитания: ");
                String habitat = input.next();
                System.out.print("Введите дату рождения: ");
                dataBirth = input.next();
                addAnimalDirect(new Tiger(growth, weight, eyeColor, habitat, dataBirth));
                break;
            case 3:
                System.out.print("Введите высоту полёта: ");
                Double heightOfFly = Double.parseDouble(input.next());
                addAnimalDirect(new Aist(growth, weight, eyeColor, heightOfFly));
                break;
            case 4:
                addAnimalDirect(new Chicken(growth, weight, eyeColor, 0.0));
                break;
            case 5:
                System.out.print("Введите среду обитания: ");
                habitat = input.next();
                System.out.print("Введите дату рождения: ");
                dataBirth = input.next();
                System.out.print("Вожак стаи? (да/нет): ");
                Boolean leader = (input.next() == "да") ? true : false;
                addAnimalDirect(new Wolf(growth, weight, eyeColor, habitat, dataBirth, leader));
                break;
            case 6:
                System.out.print("Введите кличку собаки: ");
                name = input.next();
                System.out.print("Введите породу собаки: ");
                breed = input.next();
                System.out.print("Собака привита (да/нет): ");
                vaccination = (input.next() == "да") ? true : false;
                System.out.print("Введите цвет окраса собаки: ");
                woolColor = input.next();
                System.out.print("Введите дату рождения собаки: ");
                dataBirth = input.next();
                System.out.print("Собака дрессирована?(да/нет): ");
                Boolean training = (input.next() == "да") ? true : false;

                addAnimalDirect(new Dog(growth, weight, eyeColor, name, breed, vaccination,
                        woolColor, dataBirth, training));
                break;
        }
    }

    public void removeAnimal(int number) {
        this.animals.remove(number - 1);
    }

    public void viewAnimal(int number) {
        System.out.println(this.animals.get(number -1).getClass().getSimpleName());
        System.out.println(this.animals.get(number -1));
    }

    public void printAllAnimals(){
        System.out.println("Весь зоопарк");
        for (int i = 0; i < this.animals.size(); i++) {
            int numberOfAnimal = i + 1;
            System.out.println(numberOfAnimal + "." + this.animals.get(i).getClass().getSimpleName());
            System.out.println(this.animals.get(i));
        }
        System.out.println();
    }

    public void getAnimalSound(int number) {
        this.animals.get(number - 1).makeSound();
        System.out.println();
    }
    public void getAllSounds() {
        for (Animal item : animals) {
            item.makeSound();
        }
    }

    public void sowBirds(){
        System.out.println("Наши птички:");
        for (Animal animal: animals) {
            if (animal instanceof Fly){
                ((Fly) animal).fly();
            }
        }
    }

    public void sowWeasel(){
        System.out.println("Наши ласковые животные:");
        for (Animal animal: animals) {
            if (animal instanceof Weasel){
                ((Weasel) animal).weasel();
            }
        }
    }

    public void sowTraining(){
        System.out.println("Наша дрессировка:");
        for (Animal animal: animals) {
            if (animal instanceof Training){
                ((Training) animal).training();
            }
        }
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
