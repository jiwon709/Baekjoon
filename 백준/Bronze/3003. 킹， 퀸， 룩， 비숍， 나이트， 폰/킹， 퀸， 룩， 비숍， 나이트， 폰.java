import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int king = 1, queen = 1;
        int rook = 2, bishop = 2, knight = 2;
        int pawn = 8;

        int chessArray[] = {king, queen, rook, bishop, knight, pawn};
        int inputArray[] = new int[6];
        int resultArray[] = new int[6];

        for (int i = 0; i < inputArray.length; i++) {
            int inputNum = input.nextInt();
            if (inputNum >= 0 && inputNum <= 10) {
                inputArray[i] = inputNum;
                resultArray[i] = chessArray[i] - inputArray[i];
            }
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
    }
}