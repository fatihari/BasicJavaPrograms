package studentGradingSystem;

public class Course {
    private String name;
    private String code;
    private String prefix;
    private int grade;
    private int oralExamGrade;
    private Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.grade = 0;
        this.setOralExamGrade(0);
    }

    public int getOralExamGrade() {
        return oralExamGrade;
    }

    public void setOralExamGrade(int oralExamGrade) {
        this.oralExamGrade = oralExamGrade;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.getBranch().equals(this.prefix)) { // Add if they are in the same branch.
            this.teacher = teacher;
            //printTeacher();
        } else
            System.out.println("Teacher and course are not the same branch!");
    }

    private void printTeacher() {
        this.teacher.print();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
