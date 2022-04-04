public class WrapperClass {
    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.parseInt("345"));
        System.out.println(Double.POSITIVE_INFINITY);
        int val = Integer.parseInt("34");
        System.out.println(val);
        Integer intVal = new Integer(val);
        System.out.println(intVal.getClass().getName());
        
    }
}
