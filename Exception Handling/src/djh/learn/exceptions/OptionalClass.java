import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> op = Optional.empty();
        System.out.println(op);
        String str = "";
        String mstr = null;
        System.out.println(op.of(str));
       // System.out.println(op.of(mstr));
        System.out.println(op.isPresent());
        Optional<String> opt = Optional.ofNullable(null);
     //   System.out.println(opt.get());
        System.out.println(opt.orElse("Oyeeeee"));
    }
}
