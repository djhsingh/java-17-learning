public sealed class SealedClass permits Cube,Sphare{
    void volume(){
        System.out.println("Finding Volume......");
    }

    public static void main(String[] args) {
        SealedClass sc = new SealedClass();
        sc.volume();
        Cube cb = new Cube();
        cb.volume();
        Sphare sp = new Sphare();
        sp.volume();
        Square sq = new Square();
        sq.volume();
    }
}
