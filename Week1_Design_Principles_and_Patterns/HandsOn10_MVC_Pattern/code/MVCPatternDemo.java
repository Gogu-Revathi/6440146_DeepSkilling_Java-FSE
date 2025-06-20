import java.util.Scanner;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        Student model = new Student(name, id, grade);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        System.out.print("\nDo you want to update the grade? (yes/no): ");
        String update = scanner.nextLine().trim().toLowerCase();

        if (update.equals("yes")) {
            System.out.print("Enter new grade: ");
            String newGrade = scanner.nextLine();
            controller.setStudentGrade(newGrade);
            System.out.println("\nUpdated Student Info:");
            controller.updateView();
        }

        scanner.close();
    }
}
