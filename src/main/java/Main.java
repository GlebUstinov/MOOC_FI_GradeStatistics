
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStars grade = new GradeStars();
        UserInterface ui = new UserInterface(grade, scanner);

        ui.start();
    }
}
