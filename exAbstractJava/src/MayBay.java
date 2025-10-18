public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("May bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
        this.HangSanXuat = hangSanXuat;
    }

    public String getLoaiNhienLieu(){
        return this.loaiNhienLieu;
    }

    public String setLoaiNhienLieu(String loaiNhienLieu){
        return this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 1000;
    }

    public void catCanh(){
        System.out.println("Cất cánh");
    }

    public void haCanh(){
        System.out.println("Hạ cánh");
    }
}
