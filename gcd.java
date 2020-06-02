import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        int a;
        int b;
        int x;
        int y;
        int t;
        int gcd;
        int lcm;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your integers;\n");
        x = sc.nextInt();
        y = sc.nextInt();

        a=x;
        b=y;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        gcd = a;
        lcm =(x * y)/gcd;

        System.out.println("gcd of " + x + " and " + y + " is " + gcd+"\n");
        System.out.println("lcm of " + x + " and " + y + " is " + lcm+"\n");


    }
}