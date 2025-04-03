package lion2;
import java.util.Scanner;
public class lion3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int discount=0;

        System.out.println("입력 예시: ");
        System.out.print("영화 이름: ");
        String a =sc.nextLine();

        System.out.print("티켓 가격: ");
        int b=sc.nextInt();

        System.out.print("할인 금액: ");
        int c =sc.nextInt();

        System.out.println("입력 예시: ");
        System.out.println("영화: ");
        String d= sc.nextLine();

       discount = b-c;

        System.out.print("최종 결제 금액: "+discount);
    }
}
