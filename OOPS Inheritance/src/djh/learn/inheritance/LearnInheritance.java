public class LearnInheritance {
    public static void main(String[] args) {
        System.out.println("Welocome to Inheritance...");
        Dog dog = new Dog();
        System.out.println(dog.name+ dog.animalColor);
        dog.makeNoise();
        dog.legs();
        Bird bird = new Bird();
        bird.legs();
        bird.makeNoise();

        MethodOverriding over  = new MethodOverriding();
        over.makeNoise();
    }
}
