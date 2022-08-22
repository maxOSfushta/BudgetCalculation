import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {

        Department department1 = new Department(1500, "Biology");
        Department department2 = new Department(2000, "Chemistry");
        Department department3 = new Department(2500, "Biostatistics");
        Department department4 = new Department(2300, "Cardiology");


        String path = "./students.csv";
        FileInputStream studentsInputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(studentsInputStream);


        scanner.nextLine();
        while (scanner.hasNextLine()) {

            String[] arrayOfStudents = scanner.nextLine().split(",");

            boolean academicPerformance = Boolean.parseBoolean(arrayOfStudents[5]);
            boolean budget = Boolean.parseBoolean(arrayOfStudents[6]);
            int course = Integer.parseInt(arrayOfStudents[2]);
            int group = Integer.parseInt(arrayOfStudents[4]);

            Student student = new Student(arrayOfStudents[0], arrayOfStudents[1], course, arrayOfStudents[3], group, academicPerformance, budget);

            department1.addStudent(student);
            department2.addStudent(student);
            department3.addStudent(student);
            department4.addStudent(student);

        }
        studentsInputStream.close();

        String path1 = "./lecturers.csv";
        FileInputStream lecturersInputStream = new FileInputStream(path1);
        Scanner scanner1 = new Scanner(lecturersInputStream);

        scanner1.nextLine();
        while (scanner1.hasNextLine()) {

            String[] arrayOfLecturers = scanner1.nextLine().split(",");

            int experience = Integer.parseInt(arrayOfLecturers[4]);

            Lecturer lecturer = new Lecturer(arrayOfLecturers[0], arrayOfLecturers[1], arrayOfLecturers[2], arrayOfLecturers[3], experience);

            department1.addLecturer(lecturer);
            department2.addLecturer(lecturer);
            department3.addLecturer(lecturer);
            department4.addLecturer(lecturer);

        }

        lecturersInputStream.close();


        int sumForDep1 = department1.calculateBudgetForLecturers() + department1.calculateBudgetForStudents();
        int sumForDep2 = department2.calculateBudgetForLecturers() + department2.calculateBudgetForStudents();
        int sumForDep3 = department3.calculateBudgetForLecturers() + department3.calculateBudgetForStudents();
        int sumForDep4 = department4.calculateBudgetForLecturers() + department4.calculateBudgetForStudents();

        System.out.println("The budget for the Department of Biology is: " + sumForDep1 + " rubles");
        System.out.println("The budget for the Department of Chemistry is: " + sumForDep2 + " rubles");
        System.out.println("The budget for the Department of Biostatistics is: " + sumForDep3 + " rubles");
        System.out.println("The budget for the Department of Cardiology is: " + sumForDep4 + " rubles");
    }

}

