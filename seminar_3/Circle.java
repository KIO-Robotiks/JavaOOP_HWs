public class Circle extends Figure{

    private Double radius;

    public Circle(Double radius) throws Exception{
        this.radius = radius;
        if (radius == 0){
            throw new Exception("Такого круга быть не может.");
        }
    }
    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Double perimeter() {
        return 2 * Math.PI * radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{ " + radius + " }";
    }
}
