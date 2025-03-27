public class prac_if5 {
    public static void main(String[] args) {
        int age=67;

        if (age<=7){
            System.out.println("무료입니다.");
        }
        else if(age>=8 && age<=18) {
            System.out.println("청소년 요금 : 800원");
        }
        else if(age>=19 && age<=64){
            System.out.println("성인 요금 : 1,200원");
        }
        else {
            System.out.println("무료입니다.");
        }
    }
}
