import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ThailandYear = input.nextInt();
        int diffYear = 544;

        if (1000 <= ThailandYear && ThailandYear <= 3000) {
            System.out.println(ThailandYear - diffYear + 1);
        }
    }
}