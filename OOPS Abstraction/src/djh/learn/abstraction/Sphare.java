public sealed class Sphare extends SealedClass {
   //only final or sealed or permitted or non-sealed classes can extend
    void volume(){
        System.out.println("Sphare Volume......");
    }
}

 final class Square extends Sphare {
//cannot extend square class
void volume(){
    System.out.println("Square Volume......");
}
}