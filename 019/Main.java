public class Main {
    public static void main(String[] args) {
        int num=6;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
            sum+=i;
            }
        }
        if(sum==num)
            System.out.println("the number is PErfect Number");
        else
            System.out.println("the number is not a perfect number");
    }
}
