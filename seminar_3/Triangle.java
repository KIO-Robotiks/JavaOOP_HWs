public class Triangle extends Figure{

    private Double sideA;
    private Double sideB;
    private Double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC) throws Exception {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB){
            throw new Exception("Такого треугольника быть не может.");
        }
    }

    @Override
    public Double area() {
        Double p = 0.5 * (sideA + sideB + sideC);
        Double area = Math.sqrt(p * (p - sideA)*(p - sideB)*(p - sideC));
        return area;
    }

    @Override
    public Double perimeter() {
        return sideA + sideB + sideC;
    }

    public Double getSideA() {
        return sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public Double getSideC() {
        return sideC;
    }

    @Override
    public String toString() {
        return "Triangle { " + sideA + "/" + sideB + "/" + sideC + " }";
    }
}
