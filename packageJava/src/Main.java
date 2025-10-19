import code_a.ViDu;

public class Main{
    public static void main(String[] args){
        ViDu viDu = new ViDu(4, 5);
        System.out.println(viDu.getA());

        code_b.ViDu viDu1 = new code_b.ViDu(1,2,3);
        System.out.println(viDu1.getA());
    }
}