import java.util.Random;

public class Computer extends Player{
    private String compChoice;
    void makeCompChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);
        if (choice == 0) {
            compChoice = "rock";
        } else if (choice == 1) {
            compChoice = "paper";
        } else {
            compChoice = "scissors";
        }
        System.out.println(compChoice);
    }

    @Override
    boolean choice() {
        return false;
    }

//    @Override
//    void playGame() {
//
//    }
}
/*
 1. Get Random Number Between 0 and 2

 */