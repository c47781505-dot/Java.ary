import java.util.Scanner;

class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter name of Student 1: ");
        String name1 = sc.nextLine();

        System.out.print("Enter age: ");
        int age1 = sc.nextInt();

        System.out.print("Enter marks in Sub 1: ");
        int s11 = sc.nextInt();
        System.out.print("Enter marks in Sub 2: ");
        int s12 = sc.nextInt();
        System.out.print("Enter marks in Sub 3: ");
        int s13 = sc.nextInt();
        System.out.print("Enter marks in Sub 4: ");
        int s14 = sc.nextInt();
        System.out.print("Enter marks in Sub 5: ");
        int s15 = sc.nextInt();

        int total1 = s11 + s12 + s13 + s14 + s15;
        double average1 = total1 / 5.0;

        sc.nextLine();

        System.out.print("\nEnter name of Student 2: ");
        String name2 = sc.nextLine();

        System.out.print("Enter age: ");
        int age2 = sc.nextInt();

        System.out.print("Enter marks in Sub 1: ");
        int s21 = sc.nextInt();
        System.out.print("Enter marks in Sub 2: ");
        int s22 = sc.nextInt();
        System.out.print("Enter marks in Sub 3: ");
        int s23 = sc.nextInt();
        System.out.print("Enter marks in Sub 4: ");
        int s24 = sc.nextInt();
        System.out.print("Enter marks in Sub 5: ");
        int s25 = sc.nextInt();

        int total2 = s21 + s22 + s23 + s24 + s25;
        double average2 = total2 / 5.0;

        sc.nextLine();

        System.out.print("\nEnter name of Student 3: ");
        String name3 = sc.nextLine();

        System.out.print("Enter age: ");
        int age3 = sc.nextInt();

        System.out.print("Enter marks in Sub 1: ");
        int s31 = sc.nextInt();
        System.out.print("Enter marks in Sub 2: ");
        int s32 = sc.nextInt();
        System.out.print("Enter marks in Sub 3: ");
        int s33 = sc.nextInt();
        System.out.print("Enter marks in Sub 4: ");
        int s34 = sc.nextInt();
        System.out.print("Enter marks in Sub 5: ");
        int s35 = sc.nextInt();

        int total3 = s31 + s32 + s33 + s34 + s35;
        double average3 = total3 / 5.0;

        sc.nextLine();

        System.out.print("\nEnter name of Student 4: ");
        String name4 = sc.nextLine();

        System.out.print("Enter age: ");
        int age4 = sc.nextInt();

        System.out.print("Enter marks in Sub 1: ");
        int s41 = sc.nextInt();
        System.out.print("Enter marks in Sub 2: ");
        int s42 = sc.nextInt();
        System.out.print("Enter marks in Sub 3: ");
        int s43 = sc.nextInt();
        System.out.print("Enter marks in Sub 4: ");
        int s44 = sc.nextInt();
        System.out.print("Enter marks in Sub 5: ");
        int s45 = sc.nextInt();

        int total4 = s41 + s42 + s43 + s44 + s45;
        double average4 = total4 / 5.0;

        sc.nextLine();

        System.out.print("\nEnter name of Student 5: ");
        String name5 = sc.nextLine();

        System.out.print("Enter age: ");
        int age5 = sc.nextInt();

        System.out.print("Enter marks in Sub 1: ");
        int s51 = sc.nextInt();
        System.out.print("Enter marks in Sub 2: ");
        int s52 = sc.nextInt();
        System.out.print("Enter marks in Sub 3: ");
        int s53 = sc.nextInt();
        System.out.print("Enter marks in Sub 4: ");
        int s54 = sc.nextInt();
        System.out.print("Enter marks in Sub 5: ");
        int s55 = sc.nextInt();

        int total5 = s51 + s52 + s53 + s54 + s55;
        double average5 = total5 / 5.0;


        System.out.println("\n========== RESULTS ==========");

        System.out.println("\n" + name1 + " | Age: " + age1);
        System.out.println("Total: " + total1);
        System.out.println("Average: " + average1);

        System.out.println("\n" + name2 + " | Age: " + age2);
        System.out.println("Total: " + total2);
        System.out.println("Average: " + average2);

        System.out.println("\n" + name3 + " | Age: " + age3);
        System.out.println("Total: " + total3);
        System.out.println("Average: " + average3);

        System.out.println("\n" + name4 + " | Age: " + age4);
        System.out.println("Total: " + total4);
        System.out.println("Average: " + average4);

        System.out.println("\n" + name5 + " | Age: " + age5);
        System.out.println("Total: " + total5);
        System.out.println("Average: " + average5);


    
        String topper;
        int highest;

        if (total1 >= total2 && total1 >= total3 &&
            total1 >= total4 && total1 >= total5) {

            topper = name1;
            highest = total1;

        } else if (total2 >= total1 && total2 >= total3 &&
                   total2 >= total4 && total2 >= total5) {

            topper = name2;
            highest = total2;

        } else if (total3 >= total1 && total3 >= total2 &&
                   total3 >= total4 && total3 >= total5) {

            topper = name3;
            highest = total3;

        } else if (total4 >= total1 && total4 >= total2 &&
                   total4 >= total3 && total4 >= total5) {

            topper = name4;
            highest = total4;

        } else {

            topper = name5;
            highest = total5;
        }

        System.out.println("\n========== TOPPER ==========");
        System.out.println("Topper: " + topper);
        System.out.println("Total Marks: " + highest);

    }
}