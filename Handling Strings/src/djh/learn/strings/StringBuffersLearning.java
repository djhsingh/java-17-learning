public class StringBuffersLearning {
   public static void main(String[] args) {

       StringBuffer sb = new StringBuffer("MBuffer");//thread safe means only one thread can access it at an instance of time
       System.out.println(sb);
       sb.append(" Using ");
       System.out.println(sb);
       sb.replace(0, 4, "Deepak");
       System.out.println(sb);
       sb.reverse();
       System.out.println(sb);

   } 
}
 