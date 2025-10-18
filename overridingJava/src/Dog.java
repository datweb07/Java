public class Dog extends Animal{
    public Dog() {
        super("Dog");
    }

    @Override
    public void Eat(){
        System.out.println("Dog eat");
    }

    @Override
    public void MakeSound(){
        System.out.println("Dog make sound");
    }
}
