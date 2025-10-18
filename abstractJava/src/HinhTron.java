public class HinhTron extends Hinh {
    private double banKinh;

    public HinhTron(ToaDo toaDo, double banKinh) {
        super(toaDo);
        this.banKinh = banKinh;
    }

    public double getBanKinh(){
        return this.banKinh;
    }

    public double setBanKinh(double banKinh){
        return this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }
}
