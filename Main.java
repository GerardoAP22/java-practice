import java.util.Scanner; // Need to import to get user input

public class Main {
    public static void main(String[] args) {

        // Simple Excercises
        // System.out.println("\"I love pizza\""); // sysout shortcut

        // int x = 123;
        // long y = 123456798032452L; // Need to end a long initialization with L
        // float z = 3.14f; // Need to add the f like long
        // String name = "Gerardo";

        // System.out.println("My number is " + x);
        // System.out.println(y + ", " + z);
        // System.out.println("My name is " + name);

        // User inputs

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String username = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Here to clear the \n from nextInt
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + username);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favorite food is " + food);
    }
}