public class Main {
    public static void main(String[] args) {
        int num=20;
        for (int i=0;i<=num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    static  boolean isPrime(int n){
        if(n<2)
            return false;
        else {
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
