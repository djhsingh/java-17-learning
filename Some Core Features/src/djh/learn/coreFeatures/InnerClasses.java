public class InnerClasses {
    class Inner{  /// non-static inner class
        static int i =4;
        int j =6;
    }
    static class StaticInner{ //static inner class
        static int a = 45;
        int b = 56;
    }
    public void printMessage(){
        class MethodClass{
            static int l = 6;
            int m = 8;
        }
        MethodClass mc = new MethodClass();
        System.out.println(MethodClass.l + "-----"+ mc.m);
    }
    public static void main(String[] args){
        System.out.println("Inner Classes learning....");
        Inner in = new InnerClasses().new Inner();
        System.out.println(Inner.i+"-----"+in.j);

        StaticInner si = new StaticInner();
        System.out.println(StaticInner.a+"-----"+si.b);
        InnerClasses ics = new InnerClasses();
        ics.printMessage();

        AnnomousClass ac = new AnnomousClass(){ //annomouse inner class
            void read(){
                System.out.println("Inside Annomous Class method");
            }
        };
        ac.read();

    }
}
