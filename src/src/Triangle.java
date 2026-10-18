public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(double width, double v) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2  * (width + height);
    }
}
