import java.awt.desktop.SystemSleepEvent;
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

        // Gán dữ liệu
/*
        int a = 5;
        System.out.println("a = " + a);

        int b = a++;
        System.out.println("a++ = " + (b));

        int c = ++a;
        System.out.println("++a = " + (c));

        Scanner scanner = new Scanner(System.in);
        float x;
        System.out.print("Nhap vao so x: ");
        x = scanner.nextFloat();
        System.out.println("x:" + x);
        x += 3;
        System.out.println("x+= 3: " + x);
        x -= 2;
        System.out.println("x-= 3: " + x);
        x*=2;
        System.out.println("x*=2: " + x);
        x/=4;
        System.out.println("x/=2: " + x);
        x%=6;
        System.out.println("x%=: " + x);
*/

/*
        // so sánh và điều kiện
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.print("Nhap x: ");
        x = scanner.nextInt();
        System.out.print("Nhap y: ");
        y = scanner.nextInt();

        System.out.println("x=y: " + (x==y));
        System.out.println("x!=y: " + (x!=y));
        System.out.println("x>y: " + (x>y));
        System.out.println("x<y: " + (x<y));
        System.out.println("x>=y: " + (x>=y));
        System.out.println("x<=y: " + (x<=y));

        System.out.println("------------------");
        System.out.println("Hai so la so chan: " + (x%2==0 && y%2==0));
        System.out.println("Co it nhat mot so chan: " + (x%2==0 || y%2==0));
        System.out.println("Hai so la so le: " + (x%2!=0 && y%2!=0));
        System.out.println("Co it nhat mot so le: " + (x%2!=0 || y%2!=0));

        // toán tử 3 ngôi
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = sc.nextInt();

        String res = (a%2==0) ? "even number" : "odd number";
        System.out.println("a is " + res);
 */
/*
        // hàm Math
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = sc.nextDouble();
        System.out.print("Nhap y: ");
        y = sc.nextDouble();

        System.out.println("Trị tuyệt đối của x = " + Math.abs(x));
        System.out.println("Min x, y = " + Math.min(x, y));
        System.out.println("Max x, y = " + Math.max(x, y));
        System.out.println("Ceil x = " + Math.ceil(x));                 // làm tròn lên số nguyên gần nhất
        System.out.println("Floor x = " + Math.floor((x)));             // làm tròn xuống số nguyên gần nhất
        System.out.println("Căn bậc hai của y = " + Math.sqrt((y)));
        System.out.println("x^2 = " + Math.pow(x, 2));

        // diện tích, chu vi hình tròn
        double r, s, p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập r: ");
        r = scanner.nextDouble();
        p = 2*Math.PI*r;
        System.out.println("Chu vi = " + p);
        System.out.println("Chu vi = " + Math.round(p));        // lấy phần nguyên
        s = Math.PI * Math.pow(r, 2);
        System.out.println("diện tích: " + s);


        // điều kiện if-else
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("nhập vào n: ");
        int n = scanner1.nextInt();
        if (n%2==0){
            System.out.println("n là số chẵn");
        }
        else{
            System.out.println("n là số lẻ");
        }
*/
/*
        // giải phương trình bậc nhất
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số a: ");
        double a = sc.nextDouble();
        while(a == 0){
            System.out.println("nhập lại a (a!=0): ");
            a = sc.nextDouble();
        }
        System.out.println("nhập vào số b: ");
        double b = sc.nextDouble();
        if (b < 0) {
            System.out.println("Phương trình: y = " + a + "x " + b);
        } else {
            System.out.println("Phương trình: y = " + a + "x + " + b);
        }

        double x = -b/a;
        double y = a*x+b;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

*/
        // giải phương trình bậc 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào a: ");
        int a = scanner.nextInt();
        System.out.print("nhập vào b: ");
        int b = scanner.nextInt();
        System.out.print("nhập vào c: ");
        int c = scanner.nextInt();



        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("phương trình vô số nghiệm");
                }
                else{
                    System.out.println("phương trình vô nghiệm");
                }
            }
            else{
                System.out.println("phương trình có 1 ngiệm x = " + (-c / b));
            }
        }
        else{
            double delta = Math.pow(b, 2) - 4*a*c;
            if (delta > 0){
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("phương trình có 2 nghiệm x1 = " + x1 + "; x2 = " + x2);
            } else if (delta == 0) {
                System.out.println("phương trình có nghiệm kép x1 = x2 = : " + (-b/(2*a)));
            }
            else{
                System.out.println("phương trình vô nghiệm");
            }
        }





    }
}