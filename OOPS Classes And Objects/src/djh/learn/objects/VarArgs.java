public class VarArgs {
    public static int sum(int... params){
        int sum = 0;
        for(int i=0;i<params.length;i++){
            sum = sum + params[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum1 = sum(1);
        System.out.println(sum1);
        int sum2 = sum(1,2);
        System.out.println(sum2);
        int sum3 = sum(1,2,3);
        System.out.println(sum3);
        int sum4 = sum(1,2,3,4);
        System.out.println(sum4);
        int sum5 = sum(1,2,3,4,5);
        System.out.println(sum5);
    }
}
