import java.util.*;
public class UserInterface {

    private GradeStars gr;
    private Scanner scanner;

    public UserInterface(GradeStars gr, Scanner scanner) {
        this.gr = gr;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Enter point totals, -1 stops:");
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                continue;
            }

            this.gr.addGradesAndPoints(points);
        }
    }

    public void printGradeDistribution() {
        System.out.println("Point average (all): " + this.gr.averageOfPoints());

        if (this.gr.avPassPoints() > 0) {
            System.out.println("Point average (passing): " + this.gr.avPassPoints());
        } else {
            System.out.println("Point average (passing): -");
        }

        System.out.println("Pass percentage: " + this.gr.passPerc());

        int grade = 5;
        while(grade >= 0) {
            int stars = gr.numberOfGrades(grade);
            System.out.println(grade + ": " + printStars(stars));
            grade--;
        }
    }

    public static String printStars(int amount) {
        String stars = "";
        while (amount > 0) {
            stars = stars + "*";
            amount--;
        }
        return stars;
    }
}
