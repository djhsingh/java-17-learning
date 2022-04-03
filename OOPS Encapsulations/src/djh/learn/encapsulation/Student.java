public class Student {

    private String name;
    private int age;
    private double marks;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return this.marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student() {
        System.out.println("Default Constructor");
    }

    public Student(String name, int age, double marks) {
        this();
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", marks='" + getMarks() + "'" +
                "}";
    }

}
