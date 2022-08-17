import java.util.ArrayList;

public class Student extends Person {
    private int course;
    private boolean academicPerformance;
    private int group;
    private boolean budget;

    public Student(String name, String lastName,String department, int course, int group, boolean academicPerformance, boolean budget) {
        super(name, lastName, department);
        this.course = course;
        this.group = group;
        this.academicPerformance = academicPerformance;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Student: " + getName() + " " + getLastName() + '\n' +
                "Course: " + course + '\n' +
                "Department: " + getDepartment() + '\n' +
                "Group: " + group + '\n' +
                "Academic performance: " + academicPerformance + '\n' +
                "Budget: " + budget + '\n';
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(boolean academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public boolean getBudget() {
        return budget;
    }

    public void setBudget(boolean budget) {
        this.budget = budget;
    }

}
