public class Lecturer extends Person {
    private String position;
    private int experience;


    Lecturer(String name, String lastName, String position, String department, int experience) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "Lecturer: " + name + " " + lastName + '\n' +
                "Position: " + position + '\n' +
                "Department: " + department + '\n' +
                "Experience: " + experience + " years" + '\n';
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
