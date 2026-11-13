import java.util.Scanner;

class different {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.println("Enter the name of the voter:");
        String name = get.nextLine();

        System.out.println("Enter the age of the voter:");
        int age = get.nextInt();

        if (age >= 18) {
            System.out.println(name + " is eligible to vote.");
        } else {
            System.out.println(name + " is not eligible to vote.");
        }

        get.close();
    }
}