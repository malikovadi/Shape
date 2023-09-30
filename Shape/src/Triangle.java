public class Triangle extends Shape
{
    private double side1;
    private double side2;
    private double side3;
    private double s;
    public Triangle(String name, double side1, double side2, double side3)
    {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter()
    {
        s = side1 + side2 + side3;
        return s;
    }

    public double getArea()
    {
        s = side1 + side2 + side3;
        return Math.round(Math.sqrt(s*(s - side1)*(s - side2)*(s - side3)));
    }
}
