public class Student {

    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // Constructor 1
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.registration = 0;
        this.grade = 0;
        this.year = 1;
    }

    // Constructor 2
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = 0;
        this.grade = 0;
        this.year = 1;
    }

    // Constructor 3
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    // Mostrar nombre completo
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    // Verificar si está aprobado
    public boolean isApproved() {
        return grade >= 60;
    }

    // Cambiar de año si está aprobado
    public int changeYearIfApproved() {

        if (isApproved()) {
            year = year + 1;
            System.out.println("Congratulations");
        }

        return year;
    }
}