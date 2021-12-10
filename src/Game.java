import java.util.Random;

public class Game {
    public static void main(String[] args) {
        User user = new User();
        user.choice();
        Computer comp = new Computer();
        comp.makeCompChoice();
    }
}
