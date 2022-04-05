public class Strings{
    public static void main(String[] args) {
        System.out.println("Understanding strings....");
        String str = "String literal";//string literal
        String obj = new String("String Object");
        String myBlock = """
            <html>
                <head>
                    <title>String Page</title>
                </head>
                <body>
                    <h1>Welcome to String Lessions...</h1>
                </body>
            </html>
        """;  //text block

        System.out.println(str);
        System.out.println(obj);
        System.out.println(myBlock);
        System.out.println(str.charAt(0));
        System.out.println(str.concat("Welcome"));
        str = str.concat("Welcome");
        System.out.println(str.contains("Welcome"));
        System.out.println(str.equals("String literalWelcome"));
        System.out.println(str.indexOf("Welcome"));
        System.out.println(str.length() );
        System.out.println(str.replace("Welcome","Namaskaram"));
    }
}