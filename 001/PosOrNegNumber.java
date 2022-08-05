public class PosOrNegNumber {
    public static void main(String[] args) {
        int num =-8;
        if (num==0){
            System.out.println("number is zero");
        }
        else{
            String result = num>0 ? "number is positive" :"number is negative";
            System.out.println(result);
        }
    }
}
