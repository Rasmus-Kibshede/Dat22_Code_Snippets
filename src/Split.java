import java.util.Scanner;

public class Split {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //Takes the string to split example: Go south or Take sword

    System.out.println("Type two words with space between");
    String holeWord = scanner.nextLine();

    // An array of the separated string in the variable 'holeWord'
    // Regex is something used to find or validate something, in this case we find and split where there is a space
    // example: go south is separated between o and s.
    // In the array go is index 0 and south is index 1
    String[] listOfHoleWord = holeWord.split(" ");

    String firstWord = listOfHoleWord[0];

    String secondWord = listOfHoleWord[1];

    System.out.println("First word: " + firstWord);
    System.out.println("Second word: " + secondWord);





  }
}
