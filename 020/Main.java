public class Main {
    public static void main(String[] args) {
        int num=5;
        if (isAutomorphic(num)){
            System.out.println("the number is Automorphic");
        }
        else
            System.out.println("the number is not a Automorphic.");

    }
    static boolean isAutomorphic(int num){
        int sq=num*num;
        while(num!=0){
            if(num%10 != sq%10){
                return false;
            }
            num=num/10;
            sq=sq/10;
        }
        return true;
    }
}
