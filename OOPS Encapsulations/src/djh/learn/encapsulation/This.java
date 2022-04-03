public class This {
    String val = "";
    public This append(String str){
        this.val += str;
        return this;
    }

    public static void main(String... args){
        This th = new This();
        th.append("Deepak").append(" ").append("Singh Jangra");
        System.out.println(th.val);
    }
}
