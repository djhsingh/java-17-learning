public class MethodReference {

    MethodReference(){
       
        System.out.println("Cnstructor.....");
    }
    static void staticMethod(){
       
        System.out.println("Static Method.....");
    }
   void nonstaticMethod(){
        System.out.println("non--Static Method.....");
    }
    public static void main(String[] args) {
         
        Printable p = MethodReference :: staticMethod;//static method referenece
        p.print();
        MethodReference mr = new MethodReference();//non-static method refereence
        Printable p2 = mr :: nonstaticMethod;
        p2.print();

        Printable p3 = MethodReference :: new;//constructor mehtod referene
        p3.print();
    }
}
