package practice08;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return this.klass.getNumber()!=0?super.introduce()+" I am a Teacher. I teach Class "+this.klass.getNumber()+".":super.introduce()+" I am a Teacher. I teach No Class.";
    }
    public String introduceWith(Student student){
        return student.getKlass().getNumber()==this.klass.getNumber()?super.introduce()+" I am a Teacher. I teach "+student.getName()+".":super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }
}
