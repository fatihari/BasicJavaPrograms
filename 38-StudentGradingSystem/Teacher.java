package studentGradingSystem;

public class Teacher {
    private String name;
    private String mpno;
    private String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Mobile Phone Number: " + this.mpno);
        System.out.println("Branch: " + this.branch);
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getMpno() {
        return mpno;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }

    public void setName(String name) {
        this.name = name;
    }

}
