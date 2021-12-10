import java.util.Scanner;

public class User extends Player{
    @Override
    boolean choice() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String choice = input.toLowerCase();
        if (choice.contentEquals("rock") || choice.contentEquals("paper") || choice.contentEquals("scissors")) {
            return true;
        } else {
            return false;
        }
    }
//
//    @Override
//    void playGame() {
//    }
}

/*
 1. Get User Input
      A. Set User Input LowerCase
 2. Check User Input For Valid Input (rock, paper, scissors)
      A. If Valid, Return User Input
      B. If Not Valid, Return "Please Enter Valid Choice" And Make Them Input again
*/
