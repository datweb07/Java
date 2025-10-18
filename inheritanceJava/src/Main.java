public class Main{
    public static void main(String[] args){
        ConNguoi conNguoi = new ConNguoi("Nguyen Van A", 2006);
        conNguoi.An();
        HocSinh hocSinh = new HocSinh("Nguyen Van B", 2006, "IT01", "UEH");
        hocSinh.An();
        hocSinh.LamBaiTap();

        System.out.println("---------------");

        Dog dog = new Dog();
        System.out.println(dog.name);
        dog.Bark();
        dog.Eat();

        System.out.println("---------------");

        BabyDog babyDog = new BabyDog();
        babyDog.Bark();
        babyDog.Eat();
        babyDog.Weep();

        System.out.println("---------------");

        Cat cat = new Cat();
        cat.Meow();
        cat.Eat();

        System.out.println("----------------");

        Bird bird = new Bird();
        bird.Eat();
        bird.Fly();
    }
}