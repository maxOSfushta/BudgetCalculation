import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {

    private List<Lecturer> lecturers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private final int salaryInDepartment;


    final static int minSalary = 6000;
    final static int minScholarship = 1500;
    final static int performanceAllowance = 500;
    private String department;


    public Department(int salaryInDepartment, String department) {
        this.department = department;
        this.salaryInDepartment = salaryInDepartment;
    }


    public int calculateBudgetForLecturers() {
        int sumForLecturerInDep = 0;
        int sumOfSalary = 0;
        for (Lecturer lecturer : lecturers) {
            if (lecturer.getExperience() <= 10) {
                sumOfSalary = minSalary + salaryInDepartment + 1000;
                sumForLecturerInDep += sumOfSalary;
            } else if (lecturer.getExperience() >= 10) {
                sumOfSalary = minSalary + salaryInDepartment + 1500;
                sumForLecturerInDep += sumOfSalary;
            }
        }
        return sumForLecturerInDep;
    }

    public int calculateBudgetForStudents() {
        int sumOfScholarship = 0;
        int sumForStudentInDep = 0;
        for (Student student : students) {
            if (student.getBudget() & student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship + performanceAllowance;
                sumForStudentInDep += sumOfScholarship;
            } else if (student.getBudget() & !student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship;
                sumForStudentInDep += sumOfScholarship;
            }
        }
        return sumForStudentInDep;
    }

    public void addStudent(Student student) {
        if (Objects.equals(student.getDepartment(), this.department)) {
                students.add(student);
        }
    }

    public void addLecturer(Lecturer lecturer) {
        if(Objects.equals(lecturer.getDepartment(), this.department)) {
            lecturers.add(lecturer);
        }
    }
}
