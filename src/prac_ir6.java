import java.net.SocketOption;

public class prac_ir6 {
    public static void main(String[] args) {
        int totalPrice=13000;
        double discountRate=0.0;

        if (totalPrice>=50000) {
            discountRate=0.2;
        }
        if (totalPrice>=30000) {
            discountRate=0.1;
        }
        if (totalPrice>=10000) {
            discountRate=0.05;
        }

        int FinalPrice=(int)(totalPrice*(1-discountRate));

        if (discountRate==0) {
            System.out.println("할인이 없습니다.");
        }
        else {
            System.out.println(FinalPrice+"원");
        }
    }
}
