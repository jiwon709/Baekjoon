import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int bArray[] = Stream.of(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();
        int resultArray[] = new int[bArray.length + 1];
        int cnt = 0;
        for (int i = bArray.length; i >= 0; i--) {
            if (i == bArray.length) {
                resultArray[i] = a * b;
            } else {
                resultArray[i] = a * bArray[cnt++];
            }
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
    }
}