public class ProcessAPI {
    public static void main(String[] args) {
        ProcessHandle ph = ProcessHandle.current();
        System.out.println(ph.pid());
        System.out.println(ph.isAlive());
        System.out.println(ph.getClass());
        System.out.println(ph.info());
        System.out.println(ph.parent());

    }
}
