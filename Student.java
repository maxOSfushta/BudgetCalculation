import java.util.ArrayList;

public class Student extends Person {
    private int course;
    private boolean academicPerformance;
    private int group;
    private boolean budget;

    public Student(String name, String lastName, int course, String department, int group, boolean academicPerformance, boolean budget) {
        this.name = name;
        this.lastName = lastName;
        this.course = course;
        this.department = department;
        this.group = group;
        this.academicPerformance = academicPerformance;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Student: " + name + " " + lastName + '\n' +
                "Course: " + course + '\n' +
                "Department: " + department + '\n' +
                "Group: " + group + '\n' +
                "Academic performance: " + academicPerformance + '\n' +
                "Budget: " + budget + '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
