public class Constructors {

    int id;
    String name;
    int age;
    Constructors(){

    }
    Constructors(int myId){
        this.id = myId;
    }
    Constructors(int myId,String myName,int myAge){
        this.id = myId;
        this.name = myName;
        this.age = myAge;
    }

    public static void main(String[] args) {
        Constructors consts = new Constructors();//default or no args constructor
        consts.id = 45;
        consts.age = 28;
        consts.name = "Deepak";
        System.out.println(consts.id + "  "+consts.name +"  "+consts.age);
        Constructors const2 = new Constructors(23);//single parameterized constructor
        System.out.println(const2.id);
        Constructors const3 = new Constructors(22,"Deepak Singh",45);//multiple parameterized constructor
        System.out.println(const3.id + "  "+const3.name +"  "+const3.age);
       
    }
    
}
