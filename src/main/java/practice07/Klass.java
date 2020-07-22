package practice07;

public class Klass {
    private int number;
    private String displayName;

    public String getDisplayName() {
        return "Class 2";
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
}
