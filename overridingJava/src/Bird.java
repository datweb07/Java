public class Bird extends Animal{
    public Bird() {
        super("Bird");
    }

    @Override
    public void Eat(){
        System.out.println("Bird eat");
    }

    @Override
    public void MakeSound(){
        System.out.println("Bird make sound");
    }
}
