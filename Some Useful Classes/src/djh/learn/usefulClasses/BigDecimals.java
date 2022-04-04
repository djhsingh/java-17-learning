import java.math.BigDecimal;
public class BigDecimals {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("3353.4545454");
        System.out.println(b);
        System.out.println(b.precision());
    }
}
