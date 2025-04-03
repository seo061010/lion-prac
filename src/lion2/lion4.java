package lion2;
import java.util.Scanner;
public class lion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;
        int option;
        while (true) {
            System.out.print("옵션 선택 (1: 상품 입력, 2: 결제, 3: 프로그램 종료): ");
            option = sc.nextInt();

            if (option == 1) {
                sc.nextLine();
                System.out.print("상품명: ");
                String a = sc.nextLine();

                System.out.print("가격: ");
                int b = sc.nextInt();

                System.out.print("수량: ");
                int c = sc.nextInt();

                totalPrice += b * c;
            }
            else if (option == 2) {
                System.out.println(totalPrice);
                totalPrice=0;
            }
            else if(option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
