public class MayTinhVinacal500 implements IMayTinhBoTui{
    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        try{
            return a / b;
        }
        catch (ArithmeticException e){
            System.out.println("Lỗi: không thể chia cho 0!");
            return Double.NaN;
        }
    }
}
