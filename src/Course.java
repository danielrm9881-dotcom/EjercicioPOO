import java.util.ArrayList;

public class Course {

    String courseName;
    String professorName;
    int year;

    // Lista de estudiantes inscritos
    ArrayList<Student> students = new ArrayList<>();

    // Constructor
    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    }

    // Inscribir un estudiante
    public void enroll(Student student) {
        students.add(student);
    }

    // Inscribir varios estudiantes
    public void enroll(Student[] students) {

        for (Student student : students) {
            enroll(student);
        }
    }

    // Dar de baja un estudiante
    public void unEnroll(Student student) {

        for (Student s : students) {

            if (s.registration == student.registration) {
                students.remove(s);
                break;
            }
        }
    }

    // Contar estudiantes
    public int countStudents() {
        return students.size();
    }

    // Obtener la mejor calificación
    public int bestGrade() {

        int best = 0;

        for (Student student : students) {

            if (student.grade > best) {
                best = student.grade;
            }
        }

        return best;
    }

    // Calcular el promedio del curso
    public double averageGrade() {

        if (students.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Student student : students) {
            total += student.grade;
        }

        return (double) total / students.size();
    }

    // Mostrar clasificación de estudiantes
    public void ranking() {

        ArrayList<Student> ranking = new ArrayList<>(students);

        // Ordenar de mayor a menor calificación
        ranking.sort((student1, student2) ->
                student2.grade - student1.grade);

        System.out.println("\nClasificación:");

        for (int i = 0; i < ranking.size(); i++) {

            Student student = ranking.get(i);

            System.out.println(
                    (i + 1) + ". " +
                            student.firstName + " " +
                            student.lastName +
                            " - Calificación: " + student.grade
            );
        }
    }

    // Comparar cada estudiante con el promedio
    public void compareWithAverage() {

        double average = averageGrade();

        System.out.println("\nPromedio del curso: " + average);

        for (Student student : students) {

            if (student.grade > average) {

                System.out.println(
                        student.firstName + " " +
                                student.lastName +
                                " está por encima del promedio."
                );

            } else {

                System.out.println(
                        student.firstName + " " +
                                student.lastName +
                                " no está por encima del promedio."
                );
            }
        }
    }
}