public class MethodOverLoading {
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int res = add(3,4);
        System.out.println(res);
        int res2 = add(3,4,5);
        System.out.println(res2);
    }
}
