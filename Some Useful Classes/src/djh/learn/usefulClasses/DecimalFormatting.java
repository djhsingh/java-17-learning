import java.text.DecimalFormat;

public class DecimalFormatting {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println(df.format(54355353));
}

}
