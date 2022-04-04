public class CoVariant {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.getObjects();
        Father fh = new Father();
        fh.getObjects();
        GrandFather f = new Father();
        f.getObjects();
    }

    }
