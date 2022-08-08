public class Main {
    public static void main(String[] args) {
        int num=12;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }

        if(sum>num) {
            System.out.println("the number is Abundant number");
            System.out.println("the abundance is:" + (sum - num));
        }
        else
            System.out.println("the number is not Abundant number");

    }


}