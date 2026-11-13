class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b)); 
        System.out.println("Remainder: " + (a % b));

        // Relational operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical operators
        System.out.println("a > 5 && b < 5: " + (a > 5 && b < 5));
        System.out.println("a > 5 || b > 5: " + (a > 5 || b > 5));
        System.out.println("!(a > b): " + !(a > b));

        // Assignment operator
        int x = 10;
        x += 5;
        System.out.println("x += 5: " + x);

        // Increment and decrement
        x++;
        System.out.println("x++: " + x);

        x--;
        System.out.println("x--: " + x);
    }
}