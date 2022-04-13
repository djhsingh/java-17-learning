import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SamlMain {
    public static void main(String[] args) {
        StudentHandler sh = new StudentHandler();
        try{
            SAXParserFactory fact = SAXParserFactory.newInstance();
            SAXParser parser = fact.newSAXParser();
            parser.parse("./saml.xml",sh);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
