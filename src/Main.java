import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String notification = "Hello";
        String name = "\"Truong Thanh Dat\"";
        System.out.println(String.format("Xin chào %s", name));
        System.out.println(notification + " " + name);

        String tenSach = "Lap trinh Java";
        int namXuatBan = 2025;
        double giaTien = 25.5;
        boolean conSach = true;
        char maKho = 'D';
        System.out.println("Ten sach: "+tenSach);
        System.out.println("Nam: "+namXuatBan);
        System.out.println("Gia: "+giaTien);
        System.out.println("Con sach: "+conSach);
        System.out.println("Ma kho: "+maKho);

        final int temperature = 100; // final là hằng số
        System.out.println("Nhiet do " + temperature);

/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ho va ten: ");
        String hoVaTen = scanner.nextLine();

        System.out.print("Nhap ma sinh vien: ");
        long maSinhVien = scanner.nextLong();

        System.out.print("Diem trung binh: ");
        float diemTB = scanner.nextFloat();

        System.out.println("Ho va ten: "+ hoVaTen);
        System.out.println("MSSV: " + maSinhVien);
        System.out.println("Diem Tb: " + diemTB);
*/

/*
        int a = 100;
        int b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // ép kiểu ngầm định
        float c  = a;
        float d = b;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // ép kiểu tường minh
        float e = 4.5f;
        float f = 5.6f;

        int g = (int)e;
        int h = (int)f;
        System.out.println("g = " + g);
        System.out.println("h = " + h);


        // ép kiểu giữa biến nguyên thủy và đối tượng
        Integer x = Integer.valueOf(64);
        int y = x; // unboxing
*/

/*
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao a = ");
        a = scanner.nextInt();
        System.out.print("Nhap vao b = ");
        b = scanner.nextInt();

        int sum = a + b;
        int minus = a - b;
        int multiply = a * b;
        double divide = (double) a / b;
        double percent = a % b;

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + minus);
        System.out.println("a * b = " + multiply);
        System.out.println("a / b = " + divide);
        System.out.println("a % b = " + percent);
*/

        int a = 5;
        System.out.println("a = " + a);

        int b = a++;
        System.out.println("a++ = " + (b));

        int c = ++a;
        System.out.println("++a = " + (c));

    }
}