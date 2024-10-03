import java.util.Scanner;

public class nhom6_giuaky {

<<<<<<< HEAD
    public static  double multipy(double a, double b){
        return a * b;
    }
    
=======
    public static double subtract(double a, double b) {
        return a - b;
    }



>>>>>>> 0831cb87b49022814be842209a8e9ddc6dddea68
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
            // case 1:
            // result = add(num1, num2);
            // break;
<<<<<<< HEAD
            case 3:
                result = multipy(num1,num2);
                System.out.println("Kết quả: " + result);
=======
            case 2:
                result = subtract(num1, num2);
>>>>>>> 0831cb87b49022814be842209a8e9ddc6dddea68
            break;
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
