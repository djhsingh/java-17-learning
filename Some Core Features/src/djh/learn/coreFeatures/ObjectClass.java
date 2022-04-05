public class ObjectClass {
    public static void main(String[] args) throws Exception {
        Object obj = new Object();
        Object obj2 = new Object();
        //obj.notify();
        //obj.notifyAll();
        //obj2.wait(2000);
        System.out.println(obj.toString());
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj2));
        ObjectClass objj= null;
        System.gc();

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("inside finalize....");
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }    

}
