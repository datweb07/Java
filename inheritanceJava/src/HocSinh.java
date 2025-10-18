public class HocSinh extends ConNguoi {
    private String tenLop, tenTruong;

    public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong) {
        super(hoVaTen, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String GetTenLop(){
        return this.tenLop;
    }

    public String SetTenLop(String tenLop){
        return this.tenLop = tenLop;
    }

    public String GetTenTruong(){
        return this.tenTruong;
    }

    public String SetTenTruong(String tenTruong){
        return this.tenTruong = tenTruong;
    }

    public void LamBaiTap(){
        System.out.println("Do exercise");
    }
}
