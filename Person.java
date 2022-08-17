public abstract class Person {
     private String name;
     private String lastName;
     private String department;
     Person(String name, String lastName, String department ) {
          this.name = name;
          this.lastName = lastName;
          this.department = department;
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
     public String getDepartment() {
          return department;
     }

     public void setDepartment(String department) {
          this.department = department;
     }

}
