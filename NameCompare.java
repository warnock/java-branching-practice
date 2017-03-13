import java.io.Console;

public class NameCompare {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter your name to find out what you should bring to the potluck");

    String userName = console.readLine();
    Integer userNameValue = userName.compareTo("A");

    System.out.println("your name returns a value of " + userNameValue);

    if (userNameValue <= 10) {
      System.out.println("You should bring pie!");
    } else {
      System.out.println("You should bring hotdogs!");
    }
  }
}
