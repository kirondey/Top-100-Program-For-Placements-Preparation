//Find the Sum of First N Natural Numbers using java using Recursion
public class Main {
    public static void main(String[] args) {
        int num=10;
        int result=getSum(num);
        System.out.println("The sum of "+num+" Natural Number is "+result);
    }
    static int getSum(int x){
        if(x==0){
            return x;
        }
        return x+getSum(x-1);
    }
}
