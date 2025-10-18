public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public XeOto(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("Oto", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
        this.HangSanXuat = hangSanXuat;
    }

    @Override
    public double layVanToc() {
        return 100;
    }

    public String getLoaiNhienLieu(){
        return this.loaiNhienLieu;
    }

    public String setLoaiNhienLieu(String loaiNhienLieu){
        return this.loaiNhienLieu = loaiNhienLieu;
    }
}
