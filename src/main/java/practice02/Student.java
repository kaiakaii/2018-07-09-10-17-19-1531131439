package practice02;

public class Student extends Person {
    private int kLass;

    public int getKlass() {
        return kLass;
    }

    public void setKlass(int kClass) {
        this.kLass = kClass;
    }

    public Student(String name, int age, int kClass) {
        super(name,age);
        this.kLass = kClass;
    }
    public String introduce(){
        return "I am a Student. I am at Class "+this.kLass+".";
    }
}
