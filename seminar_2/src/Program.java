import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addAnimalDirect(new Aist(50.0, 10.5, "blue", 300.0));
        zoo.addAnimalDirect(new Cat(10.0, 5.0, "green", "Барсик", "Just Cat", true,
                "black", "03.05.2010", true));
        zoo.addAnimalDirect(new Chicken(10.5, 5.5, "braun", 0.0));
        zoo.addAnimalDirect(new Dog(20.0, 30.8, "blue", "Бульдог", "Шарик", true,
                "white", "01.01.2015", true));
        zoo.addAnimalDirect(new Tiger(80.5, 100.2, "blue-green", "Jungle", "06.08.2003"));
        zoo.addAnimalDirect(new Wolf(20.5, 20.8, "dark", "North Forest", "01.01.2005",
                false));

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить животное");
            System.out.println("2. Убрать животное");
            System.out.println("3. Посмотреть информацию о животном");
            System.out.println("4. Послушать звук животного");
            System.out.println("5. Информация о всех животных");
            System.out.println("6. Послушать всех животных");
            System.out.println("7. Поcмотреть на наших птичек \uD83D\uDC26");
            System.out.println("8. Поcмотреть на ласковых животных ❤️");
            System.out.println("9. Поcмотреть на процесс дрессировки \uD83D\uDC3E");
            System.out.println("0. Выход");

            int choice = input.nextInt();
            if (choice == 0) {
                input.close();
                break;
            }

            switch (choice) {
                case 1:
                    zoo.addAnimal(input);
                    System.out.println("Животное добавлено в зоопарк\n");
                    break;
                case 2:
                    System.out.print("Введите номер животного: ");
                    int number = input.nextInt();
                    zoo.removeAnimal(number);
                    System.out.println("Животное удалено из зоопарка\n");
                    break;
                case 3:
                    System.out.print("Введите номер животного: ");
                    number = input.nextInt();
                    zoo.viewAnimal(number);
                    break;
                case 4:
                    System.out.print("Введите номер животного: ");
                    number = input.nextInt();
                    zoo.getAnimalSound(number);
                    break;
                case 5:
                    zoo.printAllAnimals();
                    break;
                case 6:
                    zoo.getAllSounds();
                    break;
                case 7:
                    zoo.sowBirds();
                    break;
                case 8:
                    zoo.sowWeasel();
                    break;
                case 9:
                    zoo.sowTraining();
                    break;
            }
        }
        zoo.getAnimals();
    }
}

