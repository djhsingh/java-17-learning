import java.lang.reflect.Method;

import org.w3c.dom.Notation;

public class UseAnnotations {

    @MyAnnotation(name="David" ,since=1.4)
    public void sayHi(){
        System.out.println("Hiiiiiii");
    }
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Method my = UseAnnotations.class.getMethod("sayHi");
        MyAnnotation myaa = my.getAnnotation(MyAnnotation.class);
        System.out.print(myaa.name());
        System.out.print(myaa.since());
        System.out.print(myaa.test());

    }
}
