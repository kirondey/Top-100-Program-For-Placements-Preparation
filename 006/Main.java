//Greatest Number Among Three Numbers in Java
public class Main {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        int temp,result;
        temp=(num1>num2)?num1:num2;
        result=(temp>num3)?temp:num3;
        System.out.println (result + " is the greatest");
    }
}
