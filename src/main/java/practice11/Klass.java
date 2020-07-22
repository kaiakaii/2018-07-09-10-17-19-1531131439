package practice11;


import java.util.ArrayList;
import java.util.Collection;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    private Collection<JoinListener> listeners = new ArrayList<JoinListener>();

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
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (this.getNumber()==(student.getKlass().getNumber())) {
            this.leader = student;
            notifyTeacher(1, student);
            return;
        }
        System.out.print("It is not one of us.\n");

    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(this.getNumber());
        notifyTeacher(2, student);
    }

    public void notifyTeacher(int state, Student student) {
        listeners.forEach(listener ->{
            listener.update(state, student);
        });
    }

    public void registerListener(JoinListener listener) {
        listeners.add(listener);
    }

}