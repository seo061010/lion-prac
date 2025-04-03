package 객체지향0401;

public class prac11 {
    public static void main(String[] args) {
        int x[];
        x=new int[5];
        // int x[]=new int[5];
        x[0]=10;
        x[1]=14;
        x[2]=56;
        x[3]=67;
        x[4]=22;
        // int x[5]={10,14,56,67,22};
        // 5는 생략 가능
        System.out.print(x[0]);System.out.print(" ");
        System.out.print(x[1]);System.out.print(" ");
        System.out.print(x[2]);System.out.print(" ");
        System.out.print(x[3]);System.out.print(" ");
        System.out.print(x[4]);System.out.print(" ");

        for (int i=0;i<5;i+=1){
            //for (int i=0;i<x.length;i+=1){
            System.out.print(x[i]+" ");
        }

    }
}
// int x [], x=new int[10];
