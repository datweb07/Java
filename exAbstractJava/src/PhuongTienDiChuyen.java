public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat HangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat){
        this.loaiPhuongTien = loaiPhuongTien;
        this.HangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien(){
        return this.loaiPhuongTien;
    }

    public String setLoaiPhuongTien(String loaiPhuongTien){
        return this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat(){
        return this.HangSanXuat;
    }

    public HangSanXuat setHangSanXuat(HangSanXuat hangSanXuat){
        return this.HangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat(){
        return this.HangSanXuat.getTenHangSanXuat();
    }

    public void batDau(){
        System.out.println("Bắt đầu....");
    }

    public void tangToc(){
        System.out.println("Tăng tốc....");
    }

    public void dungLai(){
        System.out.println("Dừng lại....");
    }

    public abstract double layVanToc();
}
