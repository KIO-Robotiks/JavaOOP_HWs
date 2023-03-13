import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

//        Figure triangle = new Triangle(12.0, 10.0, 15.0);
//        Figure rectangle = new Rectangle(10.0, 10.5);
//        Figure circle = new Circle(14.5);
//        Figure sq = new Rectangle(50.0);

        Map<Integer, Figure> map = new HashMap<>();
        FiguresCollection myCollection = new FiguresCollection(map);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1. Посмотреть фигуры.");
            System.out.println("2. Добавить фигуру.");
            System.out.println("3. Удалить фигуру.");
            System.out.println("4. Изменить фигуру.");
            System.out.println("5. Периметр всех фигур.");
            System.out.println("6. Площадь всех фигур.");
            System.out.println("0. Выход");

            int choice = input.nextInt();
            if (choice == 0) {
                input.close();
                break;
            }
            switch (choice) {
                case 1:
                    myCollection.showCollection();
                    System.out.println();
                    break;
                case 2:
                    myCollection.addFigure(input);
                    System.out.println("Фигура добавлена.\n");
                    break;
                case 3:
                    System.out.print("Введите индекс фигуры для удаления: ");
                    Integer index = input.nextInt();
                    myCollection.removeFigure(index);
                    break;
                case 4:
                    System.out.print("Введите индекс фигуры для замены: ");
                    index = input.nextInt();
                    myCollection.changeFigure(input, index);
                    break;
                case 5:
                    System.out.print(String.format("Периметр всех фигур = %.2f", myCollection.getSumPerimeters()));
                    break;
                case 6:
                    System.out.print(String.format("Площадь всех фигур = %.2f", myCollection.getSumAreas()));
                    break;
            }
        }
    }
}
