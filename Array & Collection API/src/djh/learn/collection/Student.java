public class Student implements Comparable<Student>{
    int id;
    String name;

    public Student() {
    }

    @Override
    public int compareTo(Student obj) {
        System.out.println("Sorting implementing");
        if (this.id > obj.id){
            return 1;
        } else if (this.id < obj.id){
            return -1;
        } else{
            return 0;
        }
    }



    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}