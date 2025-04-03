package lion2;
import java.util.Scanner;
public class lion1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("정수를 입력하세요:");
        int intValue1=sc.nextInt();
        System.out.print("정수를 입력하세요:");
        int intValue2=sc.nextInt();
        int sum=intValue1+intValue2;
        System.out.print("입력한 정수는:"+sum);
    }
}
