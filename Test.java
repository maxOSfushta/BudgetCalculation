import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        final int minSalary = 6000;
        final int minScholarship = 1500;
        final int performanceAllowance = 500;


        List<Lecturer> lecturersInBio = new ArrayList<>();
        List<Student> studentsInBio = new ArrayList<>();

        Lecturer lecturersInBio1 = new Lecturer("Bob", "Smith", "Lecturer", "Biology", 13);
        Lecturer lecturersInBio2 = new Lecturer("Zoey", "Roman", "Professor", "Biology", 13);
        Lecturer lecturersInBio3 = new Lecturer("Marwan", "Glover", "Assistant", "Biology", 3);
        Lecturer lecturersInBio4 = new Lecturer("Kaleb", "Woolley", "Department head", "Biology", 31);
        Lecturer lecturersInBio5 = new Lecturer("Braydon", "Emery", "Assistant", "Biology", 5);
        Lecturer lecturersInBio6 = new Lecturer("Brooke", "Farrington", "Lecturer", "Biology", 7);
        Lecturer lecturersInBio7 = new Lecturer("Adam", "Henson", "Lecturer", "Biology", 9);

        Student studentsInBio1 = new Student("Sam", "Robinson", 2, "Biology", 1, true, true);
        Student studentsInBio2 = new Student("Hendrix", "Graves", 1, "Biology", 2, false, true);
        Student studentsInBio3 = new Student("Conrad", "Mercado", 4, "Biology", 2, true, false);
        Student studentsInBio4 = new Student("Jensen", "Hurst", 4, "Biology", 3, false, false);
        Student studentsInBio5 = new Student("Jamie", "Mcclure", 3, "Biology", 4, true, true);
        Student studentsInBio6 = new Student("Torin", "Stewart", 2, "Biology", 2, true, false);
        Student studentsInBio7 = new Student("Teodor", "Lindsay", 3, "Biology", 4, false, false);
        Student studentsInBio8 = new Student("Emilia", "Dotson", 1, "Biology", 1, false, true);
        Student studentsInBio9 = new Student("Miller", "Bourne", 2, "Biology", 3, true, false);
        Student studentsInBio10 = new Student("Che", "Coulson", 3, "Biology", 1, false, false);
        Student studentsInBio11 = new Student("Samuel", "Rhodes", 3, "Biology", 4, true, true);
        Student studentsInBio12 = new Student("Joan", "Acevedo", 1, "Biology", 1, false, true);

        lecturersInBio.add(lecturersInBio1);
        lecturersInBio.add(lecturersInBio2);
        lecturersInBio.add(lecturersInBio3);
        lecturersInBio.add(lecturersInBio4);
        lecturersInBio.add(lecturersInBio5);
        lecturersInBio.add(lecturersInBio6);
        lecturersInBio.add(lecturersInBio7);
        studentsInBio.add(studentsInBio1);
        studentsInBio.add(studentsInBio2);
        studentsInBio.add(studentsInBio3);
        studentsInBio.add(studentsInBio4);
        studentsInBio.add(studentsInBio5);
        studentsInBio.add(studentsInBio6);
        studentsInBio.add(studentsInBio7);
        studentsInBio.add(studentsInBio8);
        studentsInBio.add(studentsInBio9);
        studentsInBio.add(studentsInBio10);
        studentsInBio.add(studentsInBio11);
        studentsInBio.add(studentsInBio12);

        int sumForLecturerInBioDep = 0;
        int sumForStudentInBioDep = 0;
        int budgetForBiologyDepartment;

        for (Lecturer lecturer : lecturersInBio) {
            final int salaryInBiologyDepartment = 2000;
            int sumOfSalary = 0;
            if (lecturer.department == "Biology" & lecturer.getExperience() <= 10) {
                sumOfSalary = minSalary + salaryInBiologyDepartment + 1000;
                sumForLecturerInBioDep = sumForLecturerInBioDep + sumOfSalary;
            } else if (lecturer.department == "Biology" & lecturer.getExperience() >= 10) {
                sumOfSalary = sumOfSalary = minSalary + salaryInBiologyDepartment + 1500;
                sumForLecturerInBioDep = sumForLecturerInBioDep + sumOfSalary;
            }

        }

        for (Student student : studentsInBio) {
            int sumOfScholarship = 0;
            if (student.getBudget() & student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship + performanceAllowance;
                sumForStudentInBioDep = sumForStudentInBioDep + sumOfScholarship;
            } else if (student.getBudget() & !student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship;
                sumForStudentInBioDep = sumForStudentInBioDep + sumOfScholarship;
            }
        }

        budgetForBiologyDepartment = sumForLecturerInBioDep + sumForStudentInBioDep;
        System.out.println("Budget for the next semester of the Department of Biology is :" + " " + budgetForBiologyDepartment);



        List<Lecturer> lecturersInChemistry = new ArrayList<>();
        List<Student> studentsInChemistry = new ArrayList<>();

        Lecturer lecturersInChemistry1 = new Lecturer("Hester", "Ware", "Lecturer", "Chemistry", 3);
        Lecturer lecturersInChemistry2 = new Lecturer("Hughie", "Lambert", "Professor", "Chemistry", 23);
        Lecturer lecturersInChemistry3 = new Lecturer("Jerry", "Houston", "Assistant", "Chemistry", 9);
        Lecturer lecturersInChemistry4 = new Lecturer("Curtis", "Flynn", "Department head", "Chemistry", 11);
        Lecturer lecturersInChemistry5 = new Lecturer("Alton", "Ramsay", "Assistant", "Chemistry", 15);
        Lecturer lecturersInChemistry6 = new Lecturer("Carlie", "Contreras", "Lecturer", "Chemistry", 27);
        Lecturer lecturersInChemistry7 = new Lecturer("Elaina", "Kendall", "Lecturer", "Chemistry", 19);

        Student studentsInChemistry1 = new Student("Hakeem", "Samuels", 2, "Chemistry", 3, false, false);
        Student studentsInChemistry2 = new Student("Ross", "Heath", 2, "Chemistry", 1, true, false);
        Student studentsInChemistry3 = new Student("Niall", "Gomez", 3, "Chemistry", 4, false, true);
        Student studentsInChemistry4 = new Student("Bethaney", "Wills", 1, "Chemistry", 2, true, true);
        Student studentsInChemistry5 = new Student("Omari", "Morales", 4, "Chemistry", 1, false, true);
        Student studentsInChemistry6 = new Student("Summer", "Medrano", 4, "Chemistry", 3, false, false);
        Student studentsInChemistry7 = new Student("Sarah-Jayne", "Oakley", 2, "Chemistry", 1, true, false);
        Student studentsInChemistry8 = new Student("Harry", "Klein", 3, "Chemistry", 2, false, false);
        Student studentsInChemistry9 = new Student("Umair", "Finley", 4, "Chemistry", 4, false, false);
        Student studentsInChemistry10 = new Student("Roshni", "Morin", 3, "Chemistry", 4, false, true);
        Student studentsInChemistry11 = new Student("Myla", "Duggan", 3, "Chemistry", 2, false, true);
        Student studentsInChemistry12 = new Student("Kerry", "Bostock", 1, "Chemistry", 3, false, true);

        lecturersInChemistry.add(lecturersInChemistry1);
        lecturersInChemistry.add(lecturersInChemistry2);
        lecturersInChemistry.add(lecturersInChemistry3);
        lecturersInChemistry.add(lecturersInChemistry4);
        lecturersInChemistry.add(lecturersInChemistry5);
        lecturersInChemistry.add(lecturersInChemistry6);
        lecturersInChemistry.add(lecturersInChemistry7);
        studentsInChemistry.add(studentsInChemistry1);
        studentsInChemistry.add(studentsInChemistry2);
        studentsInChemistry.add(studentsInChemistry3);
        studentsInChemistry.add(studentsInChemistry4);
        studentsInChemistry.add(studentsInChemistry5);
        studentsInChemistry.add(studentsInChemistry6);
        studentsInChemistry.add(studentsInChemistry7);
        studentsInChemistry.add(studentsInChemistry8);
        studentsInChemistry.add(studentsInChemistry9);
        studentsInChemistry.add(studentsInChemistry10);
        studentsInChemistry.add(studentsInChemistry11);
        studentsInChemistry.add(studentsInChemistry12);

        int sumForLecturerInChemDep = 0;
        int sumForStudentInChemDep = 0;
        int budgetForChemistryDepartment;

        for (Lecturer lecturer : lecturersInChemistry) {
            final int salaryInChemistryDepartment = 1500;
            int sumOfSalary = 0;
            if (lecturer.department == "Chemistry" & lecturer.getExperience() <= 10) {
                sumOfSalary = minSalary + salaryInChemistryDepartment + 1000;
                sumForLecturerInChemDep = sumForLecturerInChemDep + sumOfSalary;
            } else if (lecturer.department == "Chemistry" & lecturer.getExperience() >= 10) {
                sumOfSalary = minSalary + salaryInChemistryDepartment + 1500;
                sumForLecturerInChemDep = sumForLecturerInChemDep + sumOfSalary;
            }

        }

        for (Student student : studentsInChemistry) {
            int sumOfScholarship = 0;
            if (student.getBudget() & student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship + performanceAllowance;
                sumForStudentInChemDep = sumForStudentInChemDep + sumOfScholarship;
            } else if (student.getBudget() & !student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship;
                sumForStudentInChemDep = sumForStudentInChemDep + sumOfScholarship;
            }
        }

        budgetForChemistryDepartment = sumForLecturerInChemDep + sumForStudentInChemDep;
        System.out.println("Budget for the next semester of the Department of Chemistry is :" + " " + budgetForChemistryDepartment);




        List<Lecturer> lecturersInBiostatistics = new ArrayList<>();
        List<Student> studentsInBiostatistics = new ArrayList<>();

        Lecturer lecturersInBiostatistics1 = new Lecturer("Manav", "Quintana", "Lecturer", "Biostatistics", 13);
        Lecturer lecturersInBiostatistics2 = new Lecturer("Caris", "Alfaro", "Professor", "Biostatistics", 7);
        Lecturer lecturersInBiostatistics3 = new Lecturer("Henna", "Savage", "Assistant", "Biostatistics", 19);
        Lecturer lecturersInBiostatistics4 = new Lecturer("Tymoteusz", "Webber", "Department head", "Biostatistics", 31);
        Lecturer lecturersInBiostatistics5 = new Lecturer("Elspeth", "Gomez", "Assistant", "Biostatistics", 5);
        Lecturer lecturersInBiostatistics6 = new Lecturer("Tamia", "Prince", "Lecturer", "Biostatistics", 2);
        Lecturer lecturersInBiostatistics7 = new Lecturer("Archibald", "Chambers", "Lecturer", "Biostatistics", 9);

        Student studentsInBiostatistics1 = new Student("Hasan", "Bevan", 1, "Biostatistics", 1, true, true);
        Student studentsInBiostatistics2 = new Student("Clara", "Lake", 3, "Biostatistics", 2, true, true);
        Student studentsInBiostatistics3 = new Student("Phoenix", "Fritz", 2, "Biostatistics", 3, false, false);
        Student studentsInBiostatistics4 = new Student("Harvir", "Dougherty", 4, "Biostatistics", 1, false, true);
        Student studentsInBiostatistics5 = new Student("Macauly", "Gilbert", 2, "Biostatistics", 4, false, false);
        Student studentsInBiostatistics6 = new Student("Niko", "Branch", 3, "Biostatistics", 4, true, false);
        Student studentsInBiostatistics7 = new Student("Yuvraj", "Clemons", 4, "Biostatistics", 3, false, false);
        Student studentsInBiostatistics8 = new Student("Tiarna", "Bray", 2, "Biostatistics", 1, true, false);
        Student studentsInBiostatistics9 = new Student("Star", "Stevenson", 1, "Biostatistics", 3, false, true);
        Student studentsInBiostatistics10 = new Student("Alistair", "Maynard", 1, "Biostatistics", 2, true, true);
        Student studentsInBiostatistics11 = new Student("Precious", "Wolf", 4, "Biostatistics", 1, true, true);
        Student studentsInBiostatistics12 = new Student("Malikah", "Wilder", 2, "Biostatistics", 4, false, false);

        lecturersInBiostatistics.add(lecturersInBiostatistics1);
        lecturersInBiostatistics.add(lecturersInBiostatistics2);
        lecturersInBiostatistics.add(lecturersInBiostatistics3);
        lecturersInBiostatistics.add(lecturersInBiostatistics4);
        lecturersInBiostatistics.add(lecturersInBiostatistics5);
        lecturersInBiostatistics.add(lecturersInBiostatistics6);
        lecturersInBiostatistics.add(lecturersInBiostatistics7);
        studentsInBiostatistics.add(studentsInBiostatistics1);
        studentsInBiostatistics.add(studentsInBiostatistics2);
        studentsInBiostatistics.add(studentsInBiostatistics3);
        studentsInBiostatistics.add(studentsInBiostatistics4);
        studentsInBiostatistics.add(studentsInBiostatistics5);
        studentsInBiostatistics.add(studentsInBiostatistics6);
        studentsInBiostatistics.add(studentsInBiostatistics7);
        studentsInBiostatistics.add(studentsInBiostatistics8);
        studentsInBiostatistics.add(studentsInBiostatistics9);
        studentsInBiostatistics.add(studentsInBiostatistics10);
        studentsInBiostatistics.add(studentsInBiostatistics11);
        studentsInBiostatistics.add(studentsInBiostatistics12);

        int sumForLecturerInBiostatDep = 0;
        int sumForStudentInBiostatDep = 0;
        int budgetForBiostatisticsDepartment;

        for (Lecturer lecturer : lecturersInBiostatistics) {
            final int salaryInBiostatisticsDepartment = 3500;
            int sumOfSalary = 0;
            if (lecturer.department == "Biostatistics" & lecturer.getExperience() <= 10) {
                sumOfSalary = minSalary + salaryInBiostatisticsDepartment + 1000;
                sumForLecturerInBiostatDep = sumForLecturerInBiostatDep + sumOfSalary;
            } else if (lecturer.department == "Biostatistics" & lecturer.getExperience() >= 10) {
                sumOfSalary = minSalary + salaryInBiostatisticsDepartment + 1500;
                sumForLecturerInBiostatDep = sumForLecturerInBiostatDep + sumOfSalary;
            }

        }

        for (Student student : studentsInBiostatistics) {
            int sumOfScholarship = 0;
            if (student.getBudget() & student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship + performanceAllowance;
                sumForStudentInBiostatDep = sumForStudentInBiostatDep + sumOfScholarship;
            } else if (student.getBudget() & !student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship;
                sumForStudentInBiostatDep = sumForStudentInBiostatDep + sumOfScholarship;
            }
        }

        budgetForBiostatisticsDepartment = sumForLecturerInBiostatDep + sumForStudentInBiostatDep;
        System.out.println("Budget for the next semester of the Biostatistics Department is :" + " " + budgetForBiostatisticsDepartment);





        List<Lecturer> lecturersInCardiology = new ArrayList<>();
        List<Student> studentsInCardiology = new ArrayList<>();

        Lecturer lecturersInCardiology1 = new Lecturer("Khloe", "Chung", "Lecturer", "Cardiology", 23);
        Lecturer lecturersInCardiology2 = new Lecturer("Dillan", "Whittaker", "Professor", "Cardiology", 11);
        Lecturer lecturersInCardiology3 = new Lecturer("Krystian", "Stout", "Assistant", "Cardiology", 1);
        Lecturer lecturersInCardiology4 = new Lecturer("Conner", "Joyce", "Department head", "Cardiology", 5);
        Lecturer lecturersInCardiology5 = new Lecturer("Earl", "Mason", "Assistant", "Cardiology", 34);
        Lecturer lecturersInCardiology6 = new Lecturer("Pauline", "Fowler", "Lecturer", "Cardiology", 12);
        Lecturer lecturersInCardiology7 = new Lecturer("Ollie", "Aguilar", "Lecturer", "Cardiology", 5);

        Student studentsInCardiology1 = new Student("Alysha", "Mcguire", 3, "Cardiology", 2, true, true);
        Student studentsInCardiology2 = new Student("Bodhi", "Mcmahon", 4, "Cardiology", 3, true, true);
        Student studentsInCardiology3 = new Student("Darcy", "Lovell", 1, "Cardiology", 1, true, true);
        Student studentsInCardiology4 = new Student("Eiliyah", "Lott", 2, "Cardiology", 3, true, true);
        Student studentsInCardiology5 = new Student("Abubakr", "Conrad", 3, "Cardiology", 4, true, true);
        Student studentsInCardiology6 = new Student("Safiyyah", "Cole", 3, "Cardiology", 2, true, true);
        Student studentsInCardiology7 = new Student("Kirsty", "Mack", 1, "Cardiology", 4, true, true);
        Student studentsInCardiology8 = new Student("Konrad", "Doyle", 4, "Cardiology", 1, true, true);
        Student studentsInCardiology9 = new Student("Dolcie", "Acevedo", 2, "Cardiology", 3, true, true);
        Student studentsInCardiology10 = new Student("Artur", "Woodcock", 1, "Cardiology", 1, true, true);
        Student studentsInCardiology11 = new Student("Forrest", "Valencia", 4, "Cardiology", 3, true, true);
        Student studentsInCardiology12 = new Student("Brandy", "Chase", 4, "Cardiology", 4, true, true);

        lecturersInCardiology.add(lecturersInCardiology1);
        lecturersInCardiology.add(lecturersInCardiology2);
        lecturersInCardiology.add(lecturersInCardiology3);
        lecturersInCardiology.add(lecturersInCardiology4);
        lecturersInCardiology.add(lecturersInCardiology5);
        lecturersInCardiology.add(lecturersInCardiology6);
        lecturersInCardiology.add(lecturersInCardiology7);
        studentsInCardiology.add(studentsInCardiology1);
        studentsInCardiology.add(studentsInCardiology2);
        studentsInCardiology.add(studentsInCardiology3);
        studentsInCardiology.add(studentsInCardiology4);
        studentsInCardiology.add(studentsInCardiology5);
        studentsInCardiology.add(studentsInCardiology6);
        studentsInCardiology.add(studentsInCardiology7);
        studentsInCardiology.add(studentsInCardiology8);
        studentsInCardiology.add(studentsInCardiology9);
        studentsInCardiology.add(studentsInCardiology10);
        studentsInCardiology.add(studentsInCardiology11);
        studentsInCardiology.add(studentsInCardiology12);

        int sumForLecturerInCardiologyDep = 0;
        int sumForStudentInCardiologyDep = 0;
        int budgetForCardiologyDepartment;

        for (Lecturer lecturer : lecturersInCardiology) {
            final int salaryInCardiologyDepartment = 5500;
            int sumOfSalary = 0;
            if (lecturer.department == "Cardiology" & lecturer.getExperience() <= 10) {
                sumOfSalary = minSalary + salaryInCardiologyDepartment + 1000;
                sumForLecturerInCardiologyDep = sumForLecturerInCardiologyDep + sumOfSalary;
            } else if (lecturer.department == "Cardiology" & lecturer.getExperience() >= 10) {
                sumOfSalary = minSalary + salaryInCardiologyDepartment + 1500;
                sumForLecturerInCardiologyDep = sumForLecturerInCardiologyDep + sumOfSalary;
            }

        }

        for (Student student : studentsInCardiology) {
            int sumOfScholarship = 0;
            if (student.getBudget() & student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship + performanceAllowance;
                sumForStudentInCardiologyDep = sumForStudentInCardiologyDep + sumOfScholarship;
            } else if (student.getBudget() & !student.getAcademicPerformance()) {
                sumOfScholarship = minScholarship;
                sumForStudentInCardiologyDep = sumForStudentInCardiologyDep + sumOfScholarship;
            }
        }

        budgetForCardiologyDepartment = sumForLecturerInCardiologyDep + sumForStudentInCardiologyDep;
        System.out.println("Budget for the next semester of the Cardiology Department is :" + " " + budgetForCardiologyDepartment);







    }

}

