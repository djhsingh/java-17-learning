public class MyCal implements Calculator {

    @Override
    public int add(int a, int b) {
        // TODO Auto-generated method stub
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        // TODO Auto-generated method stub
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println("Learning Interfaces...");
        Calculator cal = new MyCal();
        int sum = cal.add(4,5);
        System.out.println("sum is "+sum);
        int sub = cal.add(14,5);
        System.out.println("sum is "+sub);
        cal.testDefault();
        Calculator.testStatic();
        System.out.println(Calculator.var1);
    }
    
}
