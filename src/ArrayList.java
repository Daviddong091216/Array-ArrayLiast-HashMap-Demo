import java.util.Scanner;

public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<String> students = new java.util.ArrayList<>();
        java.util.ArrayList<Double> grades = new java.util.ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        /*do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while(!newStudent.equals(""));*/

        newStudent = input.nextLine();
        while (!newStudent.equals("")) {
            students.add(newStudent);
            System.out.println("Enter your students (or ENTER to finish):");
            newStudent = input.nextLine();
        }


        // Get student grades
        /*for (String student : students) {
            System.out.print("Grade for " + student + ": ");
            Double grade = input.nextDouble();
            grades.add(grade);
        }*/

        for (int i = 0; i < students.size(); i++) {
            System.out.print("Grade for " + students.get(i) + ": ");
            Double grade = input.nextDouble();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);

    }
}
