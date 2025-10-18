public class Main{
    public static void main(String[] args){
        ToaDo toaDo1 = new ToaDo(2, 3);
        ToaDo toaDo2 = new ToaDo(-1, 6);
        ToaDo toaDo3 = new ToaDo(0, 5);

        Hinh hinh1 = new Diem(toaDo1);
        Hinh hinh2 = new HinhTron(toaDo2, 4.5);
        Hinh hinh3 = new HinhChuNhat(toaDo3, 4, 5);

        System.out.println("Dien tich cua diem = " + hinh1.tinhDienTich());
        System.out.println("Dien tich cua hinh tron = " + hinh2.tinhDienTich());
        System.out.println("Dien tich cua hinh chu nhat = " + hinh3.tinhDienTich());
    }
}