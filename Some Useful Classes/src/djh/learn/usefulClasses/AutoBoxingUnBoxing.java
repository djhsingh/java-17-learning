public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        //converting from primitive to object of wrapper is autoboxing
        //converting from object to corrosponding primitive;
        int val= 34;
        Integer ab = val;//auto-boxing
        System.out.println(ab);
        Integer num = 456;
        int myInt = num;// auto-unboxing
        System.out.println(myInt);
        System.out.println("user boxing....");
        int a = 45;
        Integer aInt = new Integer(a);//user defined boxing
        System.out.println(aInt);
        Integer bInt = new Integer(35);//cross shows the deprecated way
        int b = Integer.valueOf(bInt);//user defined unboxing
        System.out.println(b);

    }
}
