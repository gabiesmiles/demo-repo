public class MainAnimals {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.eat();
        cat.eat();
        dog.speaks();
        cat.speaks();


        System.out.println(dog.lives);
        System.out.println(cat.lives);
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);


    }
}
