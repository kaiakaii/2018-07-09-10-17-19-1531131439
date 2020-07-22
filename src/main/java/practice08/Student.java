package practice08;

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
        return this.kLass.getLeader().equals("Tom")?super.introduce()+" I am a Student. I am Leader of Class "+this.kLass.getNumber()+".":super.introduce()+" I am a Student. I am at Class "+this.kLass.getNumber()+".";
    }
}
