package practice03;

public class Student extends Person {
    private int kClass;

    public Student(String name,int age,int kClass) {
        super(name,age);
        this.kClass = kClass;
    }
    public void introduce(){
        System.out.println("I am a Student. I am at Class "+kClass);
    }
}