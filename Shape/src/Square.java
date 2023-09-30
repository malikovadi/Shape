public class Square extends Rectangle
{
    private String name;
    public Square(String name, double sideLength)
    {
        super(name, sideLength, sideLength);
    }

    public double getSideLength()
    {
        return super.getHeight();
    }

    public double getPerimeter()
    {
        return super.getHeight() * 4;
    }

    public double getArea() {
        return super.getArea();
    }
}
