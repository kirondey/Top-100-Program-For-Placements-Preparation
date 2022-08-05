//Sum of the Numbers in a Given Range in Java
public class Main {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        int result=getSum(a,b);
        System.out.println("The sum of The Range is "+result);
    }
    static int getSum(int a,int b){
        if(b==a){
            return b;
        }
        return b+getSum(a,b-1);
    }
}
