public class Main {
    public static void main(String[] args) {
        int n=1469582;
        System.out.println("the sum of digit is "+getSum(n));
    }
    static int getSum(int n){
        if(n==0){
            return n;
        }
        return (n%10)+getSum(n/10);
    }
}
