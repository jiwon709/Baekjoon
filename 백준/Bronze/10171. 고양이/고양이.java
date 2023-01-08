public class Main {
    public static void main(String[] args) {
        int firstC = 92;    // \
        int secondC = 47;   // /
        int thirdC = 40;    // (
        int fourthC = 41;   // )
        int fifthC = 39;    // '
        int sixthC = 95;    // _
        int seventhC = 124; // |

        System.out.printf("%c    %c%c\n", firstC, secondC, firstC);
        System.out.printf(" %c  %c %c%c\n", fourthC, thirdC, fifthC, fourthC);
        System.out.printf("%c  %c  %c\n", thirdC, secondC, fourthC);
        System.out.printf(" %c%c%c%c%c%c", firstC, thirdC, sixthC, sixthC, fourthC, seventhC);
    }
}