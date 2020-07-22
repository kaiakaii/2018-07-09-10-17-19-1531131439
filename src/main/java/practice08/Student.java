package practice08;

public class Student extends Person {
    private Klass kLass;


    public Student(int id, String name, int age, Klass kLass) {
        super(id, name, age);
        this.kLass = kLass;
    }

    public Klass getKlass() {
        return kLass;
    }

    public void setkLass(Klass kLass) {
        this.kLass = kLass;
    }

    public String introduce(){
        return "Tom".equals(this.kLass.getLeader().getName())?super.introduce()+" I am a Student. I am Leader of Class "+this.kLass.getNumber()+".":super.introduce()+" I am a Student. I am at Class "+this.kLass.getNumber()+".";
    }
}
