package studentGradingSystem;

public class Student {
    private String name;
    private String studentNo;
    private String classes;
    private Course c1;
    private Course c2;
    private Course c3;
    private float average;
    private boolean isPass;

    public Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0f;
        this.isPass = false;
    }

    public void isPass() {
        System.out.println("=========================");
        this.average = (this.c1.getGrade() + this.c2.getGrade() + this.c3.getGrade()) / 3.0f;
        printGrade();
        if (this.average >= 60)
            System.out.println("You PASSED the Class");
        else
            System.out.println("You FAILED in Class");

    }

    public void addBulkExamGrade(int grade1, int grade2, int grade3) {
        if (grade1 >= 0 && grade1 <= 100)
            this.c1.setGrade(grade1);
        if (grade2 >= 0 && grade2 <= 100)
            this.c2.setGrade(grade2);
        if (grade3 >= 0 && grade3 <= 100)
            this.c3.setGrade(grade3);
    }

    public void addOralExamGrade(int grade1, int grade2, int grade3) {
        if (grade1 >= 0 && grade1 <= 100)
            this.c1.setOralExamGrade(grade1);
        if (grade2 >= 0 && grade2 <= 100)
            this.c2.setOralExamGrade(grade2);
        if (grade3 >= 0 && grade3 <= 100)
            this.c3.setOralExamGrade(grade3);
    }

    private void printGrade() {
        System.out.println("Your name is: " + this.name);
        System.out.println(this.c1.getName() + " lesson average grade: "
                + (this.c1.getGrade() * 8 + this.c1.getOralExamGrade() * 2) / 10);
        System.out.println(this.c2.getName() + " lesson average grade: "
                + (this.c2.getGrade() * 8 + this.c2.getOralExamGrade() * 2) / 10);
        System.out.println(this.c3.getName() + " lesson average grade: "
                + (this.c3.getGrade() * 8 + this.c3.getOralExamGrade() * 2) / 10);
        System.out.println("Your grade average is: " + this.average);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNo() {
        return this.studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getClasses() {
        return this.classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Course getC1() {
        return this.c1;
    }

    public void setC1(Course c1) {
        this.c1 = c1;
    }

    public Course getC2() {
        return this.c2;
    }

    public void setC2(Course c2) {
        this.c2 = c2;
    }

    public Course getC3() {
        return this.c3;
    }

    public void setC3(Course c3) {
        this.c3 = c3;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public boolean isIsPass() {
        return this.isPass;
    }

    public boolean getIsPass() {
        return this.isPass;
    }

    public void setIsPass(boolean isPass) {
        this.isPass = isPass;
    }
}
