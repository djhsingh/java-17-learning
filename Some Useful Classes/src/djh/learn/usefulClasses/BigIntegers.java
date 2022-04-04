import java.math.BigInteger;

public class BigIntegers {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("234757575757");
        System.out.println(bigInteger);
        System.out.println(bigInteger.bitCount());
        System.out.println(bigInteger.bitLength());
        System.out.println(bigInteger.isProbablePrime(1));
    }    
}
