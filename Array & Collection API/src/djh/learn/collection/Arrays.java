public class Arrays {
    public static void main(String[] args) {
         int [] array = new int[5];
         array[0] =22;
         array[array.length-1]=34;
        System.out.println(array);
        for (int i : array) {
            System.out.println(i);
        }
        String[] strArray = {"Banana","Apple","Guava"};
        for (String string : strArray) {
            System.out.println(string);
        }
    }
   
}
