import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the series length:");
        int len=sc.nextInt();
        int nextTerm;
        int a=0,b=1;
        System.out.print(a+","+b);
        for (int i=2;i<len;i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            System.out.print(","+nextTerm);
        }
    }
}
