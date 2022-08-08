public class Main {
    public static void main(String[] args) {
        int num1=246,num2=1148;
        double sum1=0,sum2=0;
        for(int i=1;i<=num1/2;i++){
            if(num1%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<=num2/2;i++){
            if(num2%i==0){
                sum2+=i;
            }
        }


        if((num1/sum1)==(num2/sum2)) {
            System.out.println("the numbers pair is Friendly Pair");

        }
        else
            System.out.println("the numbers pair is not Friendly Pairr");

    }


}