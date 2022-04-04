import java.text.NumberFormat;
import java.util.Locale;
public class NumberFormatting {
    public static void main(String[] args) {
        Locale locale = new Locale("da","DK");
        NumberFormat nf = NumberFormat.getInstance(locale);
        String number = nf.format(45.6767);
        System.out.println(number);

        NumberFormat ncf = NumberFormat.getCurrencyInstance(locale);
        String curr = ncf.format(45.6767);
        System.out.println(curr);
    }
}
