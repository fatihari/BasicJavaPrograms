package studentGradingSystem;

/**
 * @author Fatih ARI - 22.08.2021
 * 
 * The student grading system program was designed by creating teacher, course and student models.
 * 
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        Teacher t1 = new Teacher("Sir Mahmut", "50000000", "ATA");
        Teacher t2 = new Teacher("Sir Einstein", "40000000", "PHY");
        Teacher t3 = new Teacher("Sir Bernoulli", "10000000", "CAL");
        Course history = new Course("History", "1001", "ATA");
        Course physics = new Course("Physics", "1002", "PHY");
        Course calculus = new Course("Mathematics", "1003", "CAL");

        history.addTeacher(t1);
        physics.addTeacher(t2);
        calculus.addTeacher(t3);

        Student s1 = new Student("Necmi", "123", "4", history, physics, calculus);
        Student s2 = new Student("Ferit", "124", "4", history, physics, calculus);

        s1.addBulkExamGrade(70, 40, 100);
        s1.addOralExamGrade(100, 80, 90);
        s1.isPass();
        s2.addBulkExamGrade(50, 40, 60);
        s2.addOralExamGrade(60, 70, 75);
        s2.isPass();
    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
