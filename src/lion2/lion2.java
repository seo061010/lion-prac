package lion2;
import java.util.Scanner;
public class lion2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("정수를 입력하세요:");
        int intValue1=sc.nextInt();
        System.out.println("정수를 입력하세요:");
        int intValue2=sc.nextInt();

        if(intValue1>intValue2){
            System.out.println(intValue1);
        }
        else if(intValue1<intValue2){
            System.out.println(intValue2);
        }
        else{
            System.out.println("두 숫자는 같다");
        }

    }

}
