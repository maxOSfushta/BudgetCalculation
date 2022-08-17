public class Lecturer extends Person {
    private String position;
    private int experience;


    Lecturer(String name, String lastName, String department, String position, int experience) {
        super(name, lastName, department);
        this.position = position;
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "Lecturer: " + getName() + " " + getLastName() + '\n' +
                "Position: " + position + '\n' +
                "Department: " + getDepartment() + '\n' +
                "Experience: " + experience + " years" + '\n';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
