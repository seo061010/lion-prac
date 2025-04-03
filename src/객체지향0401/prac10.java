package 객체지향0401;

public class prac10 {
    public static void main(String[] args) {
        int i;
        double sum=0;
        for (i = 2; i <= 100; i = i +2)
            sum = sum+(double)(i+(i+1))/(i*(i+1));
        System.out.println(sum);
    }
}
