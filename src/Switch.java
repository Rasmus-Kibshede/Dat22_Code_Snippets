import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.println("Type world, car or dog");
    String word = scanner.nextLine();

    // Takes a word and check if there is a case that matches the word and does something in the case.
    switch (word) {
      case "world":
        System.out.println("The world is big!");
        break;
      case "car":
        System.out.println("The car is driving fast!!!");
        break;
      case "dog":
        System.out.println("The dog says VUF VUF");
        break;

      default:
        System.out.println("That is not world, car or dog");
        break;
    }

    System.out.println();

    // Takes an int and check if there is a case that matches the int and does something in the case.
    System.out.println("Type 1, 2 or 3");
    int number = scanner.nextInt();
    switch (number) {
      case 1:
        System.out.println("This is 1");
        break;
      case 2:
        System.out.println("This is 2");
        break;
      case 3:
        System.out.println("This is 3");
        break;
      default:
        System.out.println("That is not 1, 2 or 3");
        break;
    }

  }
}
