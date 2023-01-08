import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a >= 2 && b >= 2 && c >= 2 && a <= 10000 && b <= 10000 && c <= 10000) {
            int resultArray[] = {
                (a + b) % c, ((a % c) + (b % c)) % c
                , (a * b) % c, ((a % c) * (b % c)) % c
            };

            for (int i = 0; i < resultArray.length; i++) {
                System.out.println(resultArray[i]);
            }
        }


    }
}