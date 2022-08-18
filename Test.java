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
        Random random = new Random();

        scanner.nextLine();
        while (scanner.hasNextLine()) {

            int r = random.nextInt(5 - 1) + 1;

            String[] array = scanner.nextLine().split(",");

            boolean b1 = Boolean.parseBoolean(array[5]);
            boolean b2 = Boolean.parseBoolean(array[6]);

            int b3 = Integer.parseInt(array[4]);

            Student student = new Student(array[1], array[2], r, array[3], b3, b1, b2);

            department1.addStudent(student);
            department2.addStudent(student);
            department3.addStudent(student);
            department4.addStudent(student);

        }

        System.out.println("Dep1 " + department1.calculateBudgetForStudents());
        System.out.println("Dep2 " + department2.calculateBudgetForStudents());
        System.out.println("Dep3 " + department3.calculateBudgetForStudents());
        System.out.println("Dep4 " + department4.calculateBudgetForStudents());
    }
// git add .
// git commit -m "blabla"
// git push
}

