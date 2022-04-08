import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
    private static final long serialVersionUID = 4901632601214259573l;
    int id;
    String name;
    public Employee() {
    }
    String branch;
   
    public Employee(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // TODO Auto-generated method stub
        out.writeInt(id);
        out.writeObject(name);
     //   out.writeObject(branch);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub
        this. id = in.readInt();
        this.name = (String)in.readObject();
     //   this.branch = (String)in.readObject();
    }
}
