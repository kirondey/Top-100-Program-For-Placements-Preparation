import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Starting : ");
        int start=sc.nextInt();
        System.out.print("enter end: ");
        int end=sc.nextInt();
        System.out.println("in this range all palindrome numbers are:");
        for (int i=start;i<=end;i++){
            if(isPalindrome(i,order(i))){
                System.out.println(i);
            }

       }

    }
    static int order(int num){
        int len=0;
        while(num!=0){
            num=num/10;
            len++;
        }
        return len;
    }
    static boolean isPalindrome(int num,int len){
        int temp=num;
        int sum=0,rem;
        if(num==0)
            return false;
        while(num!=0){
            rem=num%10;
            sum=sum+(int)(Math.pow(rem,len));
            num=num/10;
        }
        return sum == temp;
    }
}

