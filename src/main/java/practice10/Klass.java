package practice10;

import java.util.ArrayList;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;
    private ArrayList<Student> classes;

    public ArrayList<Student> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Student> classes) {
        this.classes = classes;
    }

    public String getDisplayName() {
        return "Class 2";
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Klass() {
    }

    public Klass(int number) {
        this.number = number;
        this.classes = new ArrayList<Student>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (classes.contains(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        classes.add(student);
    }
    public boolean isIn(Student student){
        if (classes.contains(student)){
            return true;
        }
        return false;
    }
}