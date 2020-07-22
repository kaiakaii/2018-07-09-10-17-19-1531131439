package practice11;

import java.util.Objects;

public class Student extends Person {
    private Klass kLass;


    public Student(int id, String name, int age, Klass kLass) {
        super(id, name, age);
        this.kLass = kLass;
        //kLass.appendMember(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "kLass=" + kLass +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kLass);
    }

    public Klass getKlass() {
        return kLass;
    }

    public void setkLass(Klass kLass) {
        this.kLass = kLass;
    }

    public String introduce(){
        if(this.kLass.getLeader()==this)
            return super.introduce()+" I am a Student. I am Leader of Class "+this.kLass.getNumber()+".";
        return super.introduce()+" I am a Student. I am at Class "+this.kLass.getNumber()+".";
    }
}