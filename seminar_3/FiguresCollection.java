import java.util.*;

public class FiguresCollection {
    private Map<Integer, Figure> map;
    static Integer index = 1;
    static Integer indexForChange = 0;
    static Integer direct = 0;

    public FiguresCollection(Map<Integer, Figure> map) {
        this.map = map;
    }

    public void addFigure(Scanner input) throws Exception {

        if (direct == 0) System.out.println("Какую фигуру вы хотите добавить в коллекцию?");
        System.out.println("1. Треугольник.");
        System.out.println("2. Прямоугольник.");
        System.out.println("3. Квадрат.");
        System.out.println("4. Круг.");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.print("Введите сторону А: ");
                Double sideA = input.nextDouble();
                System.out.print("Введите сторону B: ");
                Double sideB = input.nextDouble();
                System.out.print("Введите сторону C: ");
                Double sideC = input.nextDouble();

                Figure triangle = new Triangle(sideA, sideB, sideC);
                if (direct == 0) {
                    map.put(index, triangle);
                    index++;
                }
                else {
                    map.put(indexForChange, triangle);
                }
                break;
            case 2:
                System.out.print("Введите сторону А: ");
                sideA = input.nextDouble();
                System.out.print("Введите сторону B: ");
                sideB = input.nextDouble();

                Figure rectangle = new Rectangle(sideA, sideB);
                if (direct == 0) {
                    map.put(index, rectangle);
                    index++;
                }
                else {
                    map.put(indexForChange, rectangle);
                }
                break;
            case 3:
                System.out.print("Введите сторону А: ");
                sideA = input.nextDouble();

                Figure square = new Rectangle(sideA);
                if (direct == 0) {
                    map.put(index, square);
                    index++;
                }
                else {
                    map.put(indexForChange, square);
                }
                break;
            case 4:
                System.out.print("Введите радиус круга: ");
                Double radius = input.nextDouble();

                Figure circle = new Circle(radius);
                if (direct == 0) {
                    map.put(index, circle);
                    index++;
                }
                else {
                    map.put(indexForChange, circle);
                }
                break;
        }
    }

    public void showCollection(){
        Map<Double, Figure> map_unsorted = new HashMap<>();

        for (Map.Entry<Integer, Figure> entry: map.entrySet()) {
            map_unsorted.put(entry.getValue().area(), entry.getValue());
        }
        Map<Double, Figure> sortedMap = new TreeMap<>(map_unsorted);


        for (Map.Entry<Double, Figure> entry: sortedMap.entrySet()) {
            System.out.println(String.format("%s : Площадь %.2f",
                    entry.getValue().toString(), entry.getKey()));
        }
    }
    public Double getSumPerimeters(){
        Double sumPerimeters = 0.0;
        for (Map.Entry<Integer, Figure> entry: map.entrySet()) {
            sumPerimeters = sumPerimeters + entry.getValue().perimeter();
        }
        return sumPerimeters;
    }
    public Double getSumAreas(){
        Double sumAreas = 0.0;
        for (Map.Entry<Integer, Figure> entry: map.entrySet()) {
            sumAreas = sumAreas + entry.getValue().area();
        }
        return sumAreas;
    }

    public void removeFigure(Integer index){
        map.remove(index);
    }

    public void changeFigure(Scanner input, Integer indexForChange) throws Exception {
        direct = 1;
        this.indexForChange = indexForChange;
        map.remove(indexForChange);
        String figure = String.valueOf(map.get(index));
        System.out.println(String.format("На какую фигуру вы хотите заменить %s", figure));
        addFigure(input);
        direct = 0;
    }
}
