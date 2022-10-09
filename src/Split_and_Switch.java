import java.util.Scanner;

public class Split_and_Switch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Takes the string to split example: Go south or Take sword

    System.out.println("Type go, take or drop and type where to go or what to take/drop");

    // Converts the string toLowerCae example: Go SOuTh = go south
    String holeWord = scanner.nextLine().toLowerCase();

    // An array of the separated string in the variable 'holeWord'
    // Regex is something used to find or validate something, in this case we find and split where there is a space
    // example: go south is separated between o and s.
    // In the array go is index 0 and south is index 1
    String[] listOfHoleWord = holeWord.split(" ");

    String firstWord = listOfHoleWord[0];

    /*If we have a command with one word only like: info or look, them the array does not have an index 1 and there for we will get an error.
    We can check the array listOfHoleWords length is bigger than 1.
    */

    String secondWord = "";
    // Checks if the array is bigger than 1
    if (listOfHoleWord.length > 1) {
      secondWord = listOfHoleWord[1];
    }


    // Takes a word and check if there is a case that matches the word and does something in the case.
    switch (firstWord) {
      case "go":
        System.out.println("You have walked: " + secondWord);
        break;
      case "take":
        System.out.println("You have taken: " + secondWord);
        break;
      case "drop":
        System.out.println("You have dropped: " + secondWord);
        break;
      default:
        System.out.println("That command does not work");
        break;
    }


  }
}
