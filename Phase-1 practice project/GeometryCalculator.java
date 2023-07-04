package collectionFramework;

public class GeometryCalculator {
	// Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a square
    public static double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public static double calculateArea(double radius, boolean isRadius) {
        if (isRadius) {
            return Math.PI * radius * radius;
        } else {
            // Assuming diameter is passed
            return Math.PI * radius * radius / 4;
        }
    }

    public static void main(String[] args) {
        double rectangleArea = calculateArea(5.0, 4.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        double squareArea = calculateArea(5.0);
        System.out.println("Area of the square: " + squareArea);

        double circleArea = calculateArea(3.0, true);
        System.out.println("Area of the circle (radius): " + circleArea);

        double circleArea2 = calculateArea(6.0, false);
        System.out.println("Area of the circle (diameter): " + circleArea2);
    }
}

