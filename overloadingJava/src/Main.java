public class Main{
    public static void main(String[] args){
        // Overloading là việc tạo ra nhiều phương thức trong một lớp có chung tên nhưng khác tham số truyền vào
        MyMath myMath = new MyMath();
        System.out.println("min = " + myMath.timMin(9,8));
        System.out.println("min = " + myMath.timMin(2.0,3.0));
        System.out.println("sum = " + myMath.tinhTong(3,4));

        double[] arr = new double[]{3,4,5,6,7};
        System.out.println("sum array = " + myMath.tinhTong(arr));

    }
}