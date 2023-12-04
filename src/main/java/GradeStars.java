import java.util.*;
public class GradeStars {
    private List<Integer> gradeList;
    private List<Integer> pointList;

    public GradeStars() {
        this.gradeList = new ArrayList<>();
        this.pointList = new ArrayList<>();
    }

    public void addGradesAndPoints(int points) {
        this.pointList.add(points);
        this.gradeList.add(pointsToGrade(points));
    }

    public double averageOfPoints() {
        int sum = 0;
        if (this.pointList.isEmpty()) { return -1; }
        for (int elem : this.pointList) {
            sum = sum + elem;
        }
        return 1.0 * sum / this.pointList.size();
    }

    public double avPassPoints() {
        int sum = 0;
        int i = 0;

        if(this.pointList.isEmpty()) { return -1; }
        for (int el : this.pointList) {
            if (el >= 50) {
                sum = sum + el;
                i++;
            }
        }
        if (i == 0) { return -1; }
        return 1.0 * sum / i;
    }

    public double passPerc() {
        int i = 0;
        for (int elem : this.pointList) {
            if (elem >= 50) {
                i++;
            }
        }
        return 100.0 * i / this.pointList.size();
    }

    public static int pointsToGrade(int points) {
        int grade;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.gradeList) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
}
