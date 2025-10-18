public class HinhChuNhat extends Hinh{
    private double chieuRong;
    private double chieuDai;

    public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuDai) {
        super(toaDo);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuRong(){
        return this.chieuRong;
    }

    public double setChieuRong(double chieuRong){
        return this.chieuRong = chieuRong;
    }

    public double getChieuDai(){
        return this.chieuDai;
    }

    public double setChieuDai(double chieuDai){
        return this.chieuDai = chieuDai;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
