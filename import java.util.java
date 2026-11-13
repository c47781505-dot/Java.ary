class Shapes {

    static void square(double side) {
        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square: " + perimeter);
    }
5
    static void circle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of circle: " + area);
        System.out.println("Circumference of circle: " + circumference);    
    }
    static void rectangle(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
    static void triangle(double base, double height, double side1, double side2) {
        double area = 0.5 * base * height;
        double perimeter = base + side1 + side2;

        System.out.println("Area of triangle: " + area);
        System.out.println("Perimeter of triangle: " + perimeter);
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter the side of square: ");, 
        double side = sc.nextDouble();
        square(side);

        System.out.println("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        circle(radius);

        System.out.println("Enter the length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        rectangle(length, width);

        System.out.println("Enter the base, height, and sides of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        triangle(base, height, side1, side2);


    }
}