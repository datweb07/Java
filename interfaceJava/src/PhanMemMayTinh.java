public class PhanMemMayTinh implements IMayTinhBoTui, ISapXep{
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

    @Override
    public void SapXepTang(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            // Tìm vị trí phần tử nhỏ nhất trong đoạn chưa sắp xếp
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Đổi chỗ phần tử nhỏ nhất với phần tử đầu của đoạn chưa sắp
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


    @Override
    public void SapXepGiam(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;

            // Tìm vị trí phần tử lớn nhất
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j;
                }
            }

            // Đổi chỗ phần tử lớn nhất về đầu đoạn
            double temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
