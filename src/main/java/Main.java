import java.util.Scanner;

class Main {
    public static void main (String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: "); //not println because it shouldn't end the line.
        int age = scanner.nextInt();
        int yearsUntil100 = 100 - age;
        if (yearsUntil100 <= 0) {
            System.out.println("You are already over 100.");
        } else if (yearsUntil100 == 1) {
            System.out.println("You will be 100 next year.");
        } else {
            System.out.println("You will be 100 in " + yearsUntil100 + " years.");
        }

    }
}