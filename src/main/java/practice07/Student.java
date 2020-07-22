package practice07;

public class Student extends Person {
    private Klass kLass;

    public Student(String name, int age, Klass kLass) {
        super(name, age);
        this.kLass = kLass;
    }

    public Klass getKlass() {
        return kLass;
    }

    public void setkLass(Klass kLass) {
        this.kLass = kLass;
    }

    public String introduce(){
        return super.introduce()+" I am a Student. I am at Class "+this.kLass.getNumber()+".";
    }
}