import java.util.ArrayList;
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

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("What is your name? ");
        // String username = scanner.nextLine();
        // System.out.println("How old are you? ");
        // int age = scanner.nextInt();
        // scanner.nextLine(); // Here to clear the \n from nextInt
        // System.out.println("What is your favorite food? ");
        // String food = scanner.nextLine();

        // System.out.println("Hello " + username);
        // System.out.println("You are " + age + " years old");
        // System.out.println("Your favorite food is " + food);

        // scanner.close();

        // 2D array practice
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("apple");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(1));
    }
}