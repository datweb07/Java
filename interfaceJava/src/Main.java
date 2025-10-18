public class Main{
    public static void main(String[] args){
        MayTinhCasioFX500 mayTinhCasioFX500 = new MayTinhCasioFX500();
        MayTinhVinacal500 mayTinhVinacal500 = new MayTinhVinacal500();

        System.out.println("1 + 1 = " + mayTinhCasioFX500.cong(1,1));
        System.out.println("2 / 0 = " + mayTinhVinacal500.chia(4,0));
        System.out.println("------------------------");

        double[] arr = new double[] {2,4,3,5,9,-1,0,6};
        double[] arr2 = new double[] {-1, 4, 5, 3, 7};
        SapXepChen sapXepChen = new SapXepChen();
        sapXepChen.SapXepTang(arr);
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("----------------");
        sapXepChen.SapXepGiam(arr2);
        for(int i=0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("-------------------");

        PhanMemMayTinh phanMemMayTinh = new PhanMemMayTinh();
        phanMemMayTinh.SapXepTang(arr2);
        for(int i=0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}