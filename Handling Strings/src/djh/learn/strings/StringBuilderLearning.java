public class StringBuilderLearning {
    public static void main(String[] args) {
 
        StringBuilder sb = new StringBuilder("MBuffer");//not thread safe means multiple threads can access it at an instance of time
        System.out.println(sb);
        sb.append(" Using ");
        System.out.println(sb);
        sb.replace(0, 4, "Deepak");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
 
    } 
 }
  