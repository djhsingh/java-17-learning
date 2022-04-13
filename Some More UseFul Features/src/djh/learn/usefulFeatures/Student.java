public class Student {
    String name;
    int age;
    double salary;

    @Override
    public String toString() {
        return "Student [age=" + this.age + ", name=" +this.name + ", salary=" + this.salary + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
