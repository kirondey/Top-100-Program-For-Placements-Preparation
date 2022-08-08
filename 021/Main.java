public class Main {
    public static void main(String[] args) {
        int num=176;
        if(isHarshed(num))
             System.out.println("the number is harshad number");
        else
            System.out.println("the number is not harshad number");
    }
    static boolean isHarshed(int num){
        int temp=num;
        int sum=0;
        while(num!=0){
            sum=sum+(num%10);
            num=num/10;
        }
        return (temp%sum==0);
    }
}
