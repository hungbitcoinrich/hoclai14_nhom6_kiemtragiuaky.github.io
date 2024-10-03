import java.util.Scanner;

public class nhom6_giuaky {

    <<<<<<<HEAD<<<<<<<HEAD
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Lỗi: Không thể chia cho 0!");
            return 0; // Trả về 0 khi có lỗi chia cho 0
        }
    }=======<<<<<<<HEAD

    public static double multipy(double a, double b) {
        return a * b;
    }
    // thay doi

    =======

    public static double subtract(double a, double b) {
        return a - b;
    }

    >>>>>>>0831 cb87b49022814be842209a8e9ddc6dddea68>>>>>>>3e98 a3b856babfbdce4b8ce636029268c4cf6b2a=======

    public static double add(double a, double b) {
        return a + b;
    }

    >>>>>>>NguyenQuangHung

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so thu nhat: ");
        double num1 = scanner.nextDouble();

        System.out.println("nhap so thu hai: ");
        double num2 = scanner.nextDouble();

        System.out.println("chon phep tinh: ");
        System.out.println("1. Cong (+)");
        System.out.println("2. Tru (-)");
        System.out.println("3. Nhan (*)");
        System.out.println("4. Chia (/)");


        int choice = scanner.nextInt();
        double result = 0;

        
        switch (choice) {
<<<<<<< HEAD
            case 4:
                result = divide(num1, num2);
                System.out.println("Kết quả: " + result);
=======
            // case 1:
            // result = add(num1, num2);
            // break;
<<<<<<< HEAD
<<<<<<< HEAD
            case 3:
                result = multipy(num1,num2);
                System.out.println("Kết quả: " + result);
=======
            case 2:
                result = subtract(num1, num2);
>>>>>>> 0831cb87b49022814be842209a8e9ddc6dddea68
>>>>>>> 3e98a3b856babfbdce4b8ce636029268c4cf6b2a
            break;
=======
            case 1:
                result = add(num1, num2);
                break;
>>>>>>> NguyenQuangHung
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }

        // System.out.println("Kết quả: " + result);
<<<<<<< HEAD
        
=======
        System.out.println("Ket qua: " + result);
>>>>>>> 0831cb87b49022814be842209a8e9ddc6dddea68
    }
}
