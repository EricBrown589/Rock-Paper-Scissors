import java.util.Random;

public class Game {
    public static void main(String[] args) {
        System.out.println("Please enter Rock, Paper, or Scissors");
        User user = new User();
        user.choice();
        Computer comp = new Computer();
        comp.makeCompChoice();
    }
}
