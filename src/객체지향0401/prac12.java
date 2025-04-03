package 객체지향0401;

public class prac12 {
    public static void main(String[] args) {
        int x[] = {10, 14, 56, 67, 22, 67, 44, 35};
        double sum;
        sum=0;
        for (int i = 0; i < 8; i+=1) {
            sum=sum+(x[i]);
        System.out.print(sum+ " ");
        }
    }
}
