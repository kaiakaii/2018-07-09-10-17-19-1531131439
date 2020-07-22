package practice08;

public class Klass {
    private int number;
    private String displayName;
    private String leader;

    public String getDisplayName() {
        return "Class 2";
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public Klass() {
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void assignLeader(Student student){
        this.leader = student.getName();
    }
}