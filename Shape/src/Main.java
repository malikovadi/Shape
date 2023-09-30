import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean exitProgram = false;
        while(!exitProgram) {
            Scanner shape = new Scanner(System.in);
            System.out.println("Choose the type of shape:");
            System.out.println("1.Rectangle");
            System.out.println("2.Square");
            System.out.println("3.Triangle");
            System.out.println("4.Circle");
            System.out.println("5.Exit the program");
            int shapeChoice = shape.nextInt();
            if (shapeChoice == 1) {
                System.out.println("Enter the width and height of your rectangle: ");
                double rectWidth = shape.nextDouble();
                double rectHeight = shape.nextDouble();
                Shape rectangle = new Rectangle("Rectangle", rectWidth, rectHeight);
                System.out.println("Area of your rectangle is: " + rectangle.getArea());
                System.out.println("Perimeter of your rectangle is: " + rectangle.getPerimeter());
            }
            else if(shapeChoice == 2) {
                System.out.println("Enter the sides of your square:");
                double squareSide = shape.nextDouble();
                Shape square = new Square("Square", squareSide);
                System.out.println("Area of your square is: " + square.getArea());
                System.out.println("Perimeter of your square is: " + square.getPerimeter());
            }
            else if(shapeChoice == 3) {
                System.out.println("Enter the sides of your triangle:");
                double triangleSide1 = shape.nextDouble();
                double triangleSide2 = shape.nextDouble();
                double triangleSide3 = shape.nextDouble();
                Shape triangle = new Triangle("Triangle", triangleSide1, triangleSide2, triangleSide3);
                System.out.println("Area of your triangle is: " + triangle.getArea());
                System.out.println("Perimeter of your triangle is: " +triangle.getPerimeter());
            }
            else if(shapeChoice == 4) {
                System.out.println("Enter the radius of your circle:");
                double circleRadius = shape.nextDouble();
                Shape circle = new Circle("Circle", circleRadius);
                System.out.println("Area of your circle is: " + circle.getArea());
                System.out.println("Perimeter of your circle is: " + circle.getPerimeter());
            }
            else if(shapeChoice ==  5) {
                System.out.println("You exited the program");
                return;
            }
        }
    }
}
