import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // String: bất biến
        // StringBuffer: khả biến, multi-thread
        // StringBuilder: khả biến, single-thread

        Scanner scanner = new Scanner(System.in);
        String s;
//        System.out.print("nhập vào chuỗi: ");
//        s = scanner.nextLine();
        s = "abcxyz";
        System.out.println(s);
        System.out.println("---------------------");
        // hàm length
        System.out.println("Length = " + s.length());

        // hàm charAt
        System.out.println("Char at [3]: " + s.charAt(3));

        for(int i = 0; i < s.length(); i++){
            System.out.println("Vị trí [" + i + "] là: " + s.charAt(i));
        }
        System.out.println("---------------------");

        // hàm getChars(vị trí bắt đầu, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng)
        char[] arrayChar = new char[10];
        s.getChars(2, 4, arrayChar, 0);
        for(int i = 0 ; i < arrayChar.length; i++){
            System.out.println("Vị trí [" + i + "] là: " + arrayChar[i]);
        }

        // hàm getByte: lấy giá trị trong bảng mã ASCII
        byte[] arrayByte = s.getBytes();
        for(byte b : arrayByte){
            System.out.println(b);
        }

        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        // hàm equals (so sánh hai chuỗi giống nhau, có phân biệt viết hoa/thường)
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        // hàm equalsIgnoreCase (không phân biệt viết hoa/thường)
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));

        // hàm compareTo
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van";
        String sv4 = "Nguyen Van A";
        String sv5 = "nguyen van a";
        System.out.println("sv1 compare to sv2: " + sv1.compareTo(sv2));  // sv1 nhỏ hơn sv2
        System.out.println("sv1 compare to sv3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compare to sv4: " + sv1.compareTo(sv4));

        // hàm compareToIgnoreCase (tương tự compareTo, không phân biệt chữ hoa/thường)
        System.out.println("sv1 compareToIgnoreCase sv2: " + sv1.compareToIgnoreCase(sv2));
        System.out.println("sv1 compareToIgnoreCase sv5: " + sv1.compareToIgnoreCase(sv5));

        // hàm regionMatches (vị trí bắt đầu của r1, đoạn cần so sánh r2, vị trí bắt đầu của r2, so sánh 4 kí tự của r1 với r2)
        String r1 = "abcxyz";
        String r2 = "abxz";
        String r3 = "cxyz";
        boolean check1 = r1.regionMatches(2, r2, 0, 4);
        boolean check2 = r1.regionMatches(2, r3, 0, 4);
        System.out.println("r1 vs r2: " + check1);  // false
        System.out.println("r1 vs r3: " + check2);  // true (same cxyz)

        // hàm startWith (hàm kiểm tra chuỗi bắt đầu bằng)
        String sdt = "123456789";
        System.out.println(sdt);
        System.out.println("---------------------");
        System.out.println("start with 123: " + sdt.startsWith("123"));
        System.out.println("start with 456: " + sdt.startsWith("456"));
        System.out.println("---------------------");

        // hàm endWith (hàm kiềm tra chuỗi kết thúc bằng)
        String tenFile = "docx.pdf";
        if (tenFile.endsWith("txt")){
            System.out.println("Đây là file docs");
        } else if (tenFile.endsWith("pdf")) {
            System.out.println("Đây là file pdf");
        } else {
            System.out.println("Lỗi file!");
        }

        // lập chỉ mục
        String string1 = "Xin chào mọi người, Xin chào";
        String string2 = "Xin chào";
        String string3 = "Xin chào 123";
        char c1 = 'à';

        // hàm indexOf
        System.out.println("vị trí của string2 trong string1 là: " + string1.indexOf(string2));  // kiểm tra string1 có chứa string2 không, nếu có thì return về vị trí index của string2 trong string1
        System.out.println("vị trí của string3 trong string1 là: " + string1.indexOf(string3));

        // sử dụng vị trí bắt đầu
        System.out.println("vị trí của string2 trong string1 là: " + string1.indexOf(string2, 3));  // bắt đầu tìm từ index 3

        // tìm kiếm char
        System.out.println("vị trí của c1 trong string1 là: " + string1.indexOf(c1));
        System.out.println("vị trí của c1 trong string1 là: " + string1.indexOf(c1, 7));

        // hàm lastIndexOf --> tìm kiếm từ phải sang trái
        System.out.println("vị trí cuối cùng của string2 trong string1: " + string1.lastIndexOf(string2));

        //
        String a1 = "Dat";
        String a2 = ".com";

        String a3 = a1 + a2;

        // hàm concat -> nối chuỗi
        String a4 = a1.concat(a2);
        System.out.println(a3);
        System.out.println(a4);

        // hàm replace -> thay thế
        String a5 = "Dat.vn";
        String a6 = a5.replace("Dat", "UEH");
        System.out.println(a6);

        // toLowerCase và toUpperCase
        String a7 = "hello";
        String a8 = "HELLO";

        String a9 = a7.toUpperCase();
        String a10 = a8.toLowerCase();

        System.out.println(a9);
        System.out.println(a10);

        // hàm trim -> xóa bỏ khoảng trắng ở hai đầu chuỗi
        String a11 = "   Xin chào   ";
        System.out.println(a11);
        System.out.println(a11.trim());

        // hàm substring -> cắt chuỗi con
        String a12 = "Xin chào Đạt";
        System.out.println(a12.substring(9));
    }
}
