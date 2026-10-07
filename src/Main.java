public class Main {

    public static void main(String[] args) {

        // Crear estudiantes
        Student student1 = new Student(
                "Juan",
                "Perez",
                1001,
                85,
                1
        );

        Student student2 = new Student(
                "Ana",
                "Lopez",
                1002,
                70,
                1
        );

        Student student3 = new Student(
                "Carlos",
                "Gomez",
                1003,
                50,
                1
        );

        // Crear curso
        Course course = new Course(
                "Java",
                "Profesor Martinez",
                2026
        );

        // Crear lista de estudiantes
        Student[] students = {
                student1,
                student2,
                student3
        };

        // Inscribir estudiantes
        course.enroll(students);

        // Mostrar cantidad de estudiantes
        System.out.println(
                "Cantidad de estudiantes: "
                        + course.countStudents()
        );

        // Mostrar mejor calificación
        System.out.println(
                "Mejor calificación: "
                        + course.bestGrade()
        );

        // Mostrar promedio
        System.out.println(
                "Promedio: "
                        + course.averageGrade()
        );

        // Mostrar clasificación
        course.ranking();

        // Comparar estudiantes con el promedio
        course.compareWithAverage();
    }
}