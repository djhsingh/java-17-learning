import java.util.Objects;

public class Student implements Cloneable{

    int id;
    String name;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
         if(this == obj)
         return true;
         else if(obj == null)
         return false;
         if(this.getClass() !=obj.getClass())
         return false;
         Student std = (Student)obj;
         return id == std.id  && Objects.equals(name, std.name);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(id,name);
    }

    

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    public static void main(String[] args)  {
        System.out.println("Hello World for Cloning the objects");
        try{
        Student s1 = new Student(3,"Deepak");
        System.out.println(s1.toString());
        Student s2 = (Student)s1.clone();
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        }
        catch(CloneNotSupportedException e){
            System.out.println(e);
        }

    }
    
}
