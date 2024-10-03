import java.util.Scanner;

public class nhom6_giuaky {

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Lỗi: Không thể chia cho 0!");
            return 0; // Trả về 0 khi có lỗi chia cho 0
        }
    }
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
            case 4:
                result = divide(num1, num2);
                System.out.println("Kết quả: " + result);
            break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }

        // System.out.println("Kết quả: " + result);
    }
}
