import java.util.Scanner;

public class Looping {
  public static void main(String[] args){

    int userChoice; //define variable for user input
    Scanner userIn = new Scanner(System.in);

    //print the menu for the user, do-while will iterate at least once.
    do{
      System.out.println("Welcome to Mike's Electronics Store");
      System.out.println("**");
      System.out.println("1) Laptop $500");
      System.out.println("2) Tablet $400");
      System.out.println("3) Smart Phone $300");
      System.out.println("4) EXIT");
      System.out.println("**");
      System.out.println("Select an option from the menu above");
      userChoice = userIn.nextInt();
    }
    //cause menu to display again if user choice is not one of the menu options
    while (userChoice < 1 || userChoice > 4 );

    //determine user choice to display appropriate message
    switch (userChoice) {
      case 1:
        System.out.println("You chose to buy a Laptop the price is $500.");
        break;
      case 2:
        System.out.println("You chose to buy a Tablet the price is $400.");
        break;
      case 3:
        System.out.println("You chose to buy a Smart phone the price is $300.");
        break;
      case 4:
        System.out.println("System exited...");
        break;
      default:
        System.out.println("Invalid choice, try again");
        break;
    }
  }
}
