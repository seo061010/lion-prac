public class prac_if3 {
    public static void main(String[] args) {
        int celsius=0;
        double fahrenheit=(celsius*9/5)+32;

        if (celsius<=-273){
            System.out.println("물리적으로 불가능 온도입니다.");
        }
        else if (celsius==0){
            System.out.println("물이 얼기 시작하는 온도입니다.");
        }
        else if (celsius==100){
            System.out.println("물이 끓는 온도입니다.");
        }
        else {
            System.out.println("화씨온도는 "+fahrenheit+"도 입니다");
        }

    }
}
