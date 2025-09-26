import grades.GradeManager;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\\n Menu");
            System.out.println("1. Add grade");
            System.out.println("2. View average grade");
            System.out.println("3. View numer off passing grades");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            Integer choise = scanner.nextInt();

            switch (choise){
                case 1:
                System.out.print("Entrer a grade: ");
                Double grade = scanner.nextDouble();
                gradeManager.addGrade(grade);
                break;
                case 2:
                System.out.println("Average grade"+ gradeManager.calculateAverage());
                break;
                case 3:
                System.out.println("Number of passing grades: "+gradeManager.countPassingGrades());
                break;
                case 4:
                System.out.println("Exiting the program.");
                System.exit(0);
                default:
                System.out.println("Invalit option. Plis try again.");

            }
        }
    }
}
