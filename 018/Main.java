public class Main {
    static int f[]=new int[10];
    public static void main(String[] args) {

        int num=145;
        preComputer();
        if(isStrong(num)){
            System.out.println("the number is strong number.");
        }
        else
            System.out.println("the number is Not a Strong number.");
    }

    static void preComputer(){
        f[0]=f[1]=1;
        for(int i=2;i<10;i++){
            f[i]=f[i-1]*i;
        }
    }
    static boolean isStrong(int num){
        int sum=0;
        int temp=num;
        while(num!=0){
            sum=sum+f[num%10];
            num=num/10;
        }
        return (sum==temp);
    }
}