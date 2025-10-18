public class Cat extends Animal{
    public Cat() {
        super("Cat");
    }

    @Override
    public void Eat(){
        System.out.println("Cat eat");
    }

    @Override
    public void MakeSound(){
        System.out.println("Cat make sound");
    }
}
