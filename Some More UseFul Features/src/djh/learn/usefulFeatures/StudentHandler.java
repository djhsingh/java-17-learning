import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class StudentHandler extends DefaultHandler{
    ArrayList<Student> stds;
    Student s;
    boolean student,name,age,salary;
    @Override
    public void endDocument() throws SAXException {
        // TODO Auto-generated method stub
        System.out.println(stds);
        System.out.println(stds.size());
        System.out.println("Document ended...");
    }
    @Override
    public void startDocument() throws SAXException {
        // TODO Auto-generated method stub
        stds = new ArrayList<>();
        
        System.out.println("Documented started.....");
    }
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        // TODO Auto-generated method stub
        System.out.println(qName);
        System.out.println("localName "+localName);
        System.out.println("Attributes.."+attributes);
        switch(qName){
           case "student" : s = new Student();
                            student = true;
                            break;
           case "name"  :  name=true;   
            break;
           case "age" : age = true;
            break;
           case "salary" :salary = true;
            break;           

        }
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        // TODO Auto-generated method stub
        System.out.println("character event...");
        String val = new String(ch,start,length);
        System.out.println("value is "+val);
        if(name){
            s.name  = val;
            name = false;            
        } else if(age){
            s.age = Integer.parseInt(val);
            age = false;
        } else if(salary){
            s.salary = Double.parseDouble(val);
            salary = false;
        }
        
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        // TODO Auto-generated method stub
        System.out.println(qName);
        switch(qName){
           case "student" : stds.add(s);
                            student = false;
                            break;
        }
        System.out.println("element ended"+qName);
    }

    
}
