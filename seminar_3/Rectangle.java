public class Rectangle extends Figure{

    private Double SideA;
    private Double SideB;

    public Rectangle(Double SideA, Double SideB) throws Exception{
        this.SideA = SideA;
        this.SideB = SideB;

        if (SideA == 0 || SideB == 0){
            throw new Exception("Такого прямоугольника быть не может.");
        }
    }

    public Rectangle(Double sideA) throws Exception{
        this.SideA = sideA;
        this.SideB = sideA;
        if (SideA == 0){
            throw new Exception("Такого квадрата быть не может.");
        }
    }

    @Override
    public Double area() {
        return SideA * SideB;
    }

    @Override
    public Double perimeter() {
        return (SideA + SideB) * 2;
    }

    public Double getSideA() {
        return SideA;
    }

    public Double getSideB() {
        return SideB;
    }

    @Override
    public String toString() {
        return "Rectangle { " + SideA + "/" + SideB + " }";
    }
}
