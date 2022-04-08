public class GenericIterations {
   public static void main(String[] args) {
       System.out.println("Generic Iterations....");
       Integer [] array = {2,3,4,5,7,4,2,5};
       displayGenerics(array);
       Double [] array2 = {2d,3d,4d,5d,7d,4d,2d,5d};
       displayGenerics(array2);
   }
   static <E>  void displayGenerics(E[] arr){
        System.out.println("Printign Generics...");
        for(E obj : arr){
            System.out.println(obj);
        }
   }

}
