public class SapXepChen implements ISapXep{
    @Override
    public void SapXepTang(double[] arr) {
        int n = arr.length;
        double key;
        int j;

        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            // Dịch các phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    @Override
    public void SapXepGiam(double[] arr) {
        int n = arr.length;
        double key;
        int j;

        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            // Dịch các phần tử nhỏ hơn key sang phải
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
