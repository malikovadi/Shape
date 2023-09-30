public class Rectangle extends Shape
{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height)
    {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    public double getPerimeter()
    {
        return 2 * (width + height);
    }
}
