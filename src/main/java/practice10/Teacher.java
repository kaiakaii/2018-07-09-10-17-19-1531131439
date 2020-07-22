package practice10;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Teacher extends Person{
    private Collection<Klass> classes;
    public Teacher(int id,String name, int age, Collection<Klass> classes) {
        super(id, name, age);
        this.classes = new ArrayList<Klass>();
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
        String msg = "";
        for (Klass klass:
             classes) {
            msg += klass.getNumber()+",";
        }
        return this.classes.size()!=0?super.introduce()+" I am a Teacher. I teach Class "+ msg.substring(0,msg.length()-1)+".":super.introduce()+" I am a Teacher. I teach No Class.";
    }

    public boolean isTeaching(Student student){
        for (Klass klass:
                this.classes) {
            if (!klass.getClasses().contains(student)){
                return false;
            }
        }
        return true;
    }
}
