public class Main {
    public static void main(String[] args) {
        int num=371;
        if(isPalindrome(num,order(num))){
            System.out.println("number is palindrome");
        }
        else
            System.out.println("number is not palindrome");
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
        while(num!=0){
            rem=num%10;
            sum=sum+(int)(Math.pow(rem,len));
            num=num/10;
        }
        return sum == temp;
    }
}
