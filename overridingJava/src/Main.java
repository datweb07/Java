public class Main{
    public static void main(String[] args){
        Animal animal = new Animal("Animal");
        animal.Eat();
        animal.MakeSound();
        animal.Sleep();
        System.out.println("------------------------");

        Dog dog = new Dog();
        dog.Eat();
        dog.MakeSound();
    }
}