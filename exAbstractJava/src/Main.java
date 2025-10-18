public class Main{
    public static void main(String[] args){
        HangSanXuat hangSanXuat1 = new HangSanXuat("H1", "VN");
        HangSanXuat hangSanXuat2 = new HangSanXuat("H2", "My");
        HangSanXuat hangSanXuat3 = new HangSanXuat("H3", "Phap");

        PhuongTienDiChuyen p1 = new MayBay("Dau", hangSanXuat1);
        PhuongTienDiChuyen p2 = new XeOto("Xang", hangSanXuat2);
        PhuongTienDiChuyen p3 = new XeDap(hangSanXuat3);

        System.out.println("Lấy hãng sản xuất của p1: " + p1.layTenHangSanXuat());

        System.out.println("Vận tốc của máy bay: " + p1.layVanToc());
        System.out.println("Vận tốc o to: " + p2.layVanToc());
        System.out.println("Vận tốc của xe đạp: " + p3.layVanToc());

    }
}