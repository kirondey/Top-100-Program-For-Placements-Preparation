public class Main {
    public static void main(String[] args) {
        int num=12121,rev=0,rem,temp;
        temp=num;
        for(;num!=0;num=num/10){
            rem=num%10;
            rev=rev*10+rem;
        }
        if(rev==temp)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");

    }
}
