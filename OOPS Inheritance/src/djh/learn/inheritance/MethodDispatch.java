public class MethodDispatch {
    public static void main(String[] args) {
     Vehicle v1 = new Truck();
     v1.start();
     if(v1 instanceof Truck t){
         t.unload();
         t.stop();
     }
     v1.stop();
    }

    }
