import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a > 0 && b < 10) {
            System.out.println(a / b);
        }
    }
}
