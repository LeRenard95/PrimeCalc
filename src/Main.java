import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner primeScan = new Scanner(System.in);
        System.out.println("Type Number");
        int n = primeScan.nextInt();
        {
            while (n % 2 == 0) {
                System.out.print(2 + " ");
                n /= 2;
            }
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
            if (n > 2)
                System.out.print(n);

        }
    }
}