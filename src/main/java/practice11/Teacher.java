package practice11;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Teacher extends Person implements JoinListener{
    private Collection<Klass> classes;
    public Teacher(int id,String name, int age, Collection<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> {
            klass.registerListener(this);
        });
    }

    public Teacher(int id,String name, int age) {
        super(id, name, age);
    }

    public Collection<Klass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        if(this.classes==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }else {
            int length=classes.size();
            String result="";
            for(Klass klass:classes){
                result+=klass.getNumber()+", ";
            }
            result=result.substring(0,result.length()-2);
            return super.introduce() + " I am a Teacher. I teach Class "+result+".";
        }
    }

    public boolean isTeaching(Student student){
        return this.classes.contains(student.getKlass());
    }
    public String introduceWith(Student student){
        for (Klass klass:classes ) {
            if(student.getKlass().getNumber()==klass.getNumber())
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }

    @Override
    public void update(int state, Student student) {
        //System.out.println(student.getName()+" "+student.getKlass().getNumber());
        if(state == 1) {
            System.out.print("I am " + this.getName() + ". I know " + student.getName() + " become Leader of Class " + student.getKlass().getNumber() + ".\n");
        } else if (state == 2){
            System.out.print("I am " + this.getName() + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".\n");
        }

    }
}