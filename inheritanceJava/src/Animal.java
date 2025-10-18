public class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public String GetName(){
        return this.name;
    }

    public String SetName(String name){
        return this.name = name;
    }

    public void Eat(){
        System.out.println("Eat");
    }
}
