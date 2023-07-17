import java.util.Scanner;
public class AnyBaseToDecimal {
    static int covertBaseToDecimal(int n, int base){
        int result = 0, i = 0;
        while (n > 0){
            result += (n%10)*Math.pow(base, i);
            i++;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int A= scanner.nextInt();
        int B= scanner.nextInt();
        int decimal=covertBaseToDecimal(A,B);
        System.out.println(decimal);
    }
}
