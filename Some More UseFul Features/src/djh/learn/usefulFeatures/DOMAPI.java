import java.io.FileWriter;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMAPI {
    static Element createStudent(Document d, String name, int age, double salary){
        Element e = d.createElement("student");
        Element c1 = d.createElement("name");
        c1.setTextContent(""+name);
        Element c2 = d.createElement("age");
        c2.setTextContent(""+age);
        Element c3 = d.createElement("salary");
        c3.setTextContent(""+salary);
        e.appendChild(c1);
        e.appendChild(c2);
        e.appendChild(c3);
        return e;
    }
    
    public static void main(String[] args) {
        
        DocumentBuilderFactory factory =  DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document d = builder.newDocument();
            Element rootElement = d.createElement("students");
            rootElement.appendChild(createStudent(d,"Deepak Singh Jangra",28, 90000));
            rootElement.appendChild(createStudent(d,"Aman",23, 34000));
            rootElement.appendChild(createStudent(d,"Raj",18, 8000));
            rootElement.appendChild(createStudent(d,"Sunil",68, 78000));
            rootElement.appendChild(createStudent(d,"Heena",22, 34000));
            d.appendChild(rootElement);
            DOMSource source = new DOMSource(d);
            StringWriter sw = new StringWriter();
            StreamResult sr = new StreamResult(sw);

            TransformerFactory fact =  TransformerFactory.newInstance();

            Transformer former = fact.newTransformer();
            former.transform(source, sr);
            System.out.println(sw.toString());
            FileWriter fw = new FileWriter("./myxml.xml");
            fw.write(sw.toString());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
