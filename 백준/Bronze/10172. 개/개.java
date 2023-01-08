public class Main {
    public static void main(String[] args) {
        int firstC = 92;    // \
        int secondC = 47;   // /
        int thirdC = 40;    // (
        int fourthC = 41;   // )
        int fifthC = 39;    // '
        int sixthC = 95;    // _
        int seventhC = 124; // |
        int eighthC = 34;   // "
        int ninthC = 125;   // }
        int tenthC = 96;    // `
        int eleventhC = 61; // =
        int lastC = 94;     // ^

        System.out.printf("%c%c%c%c%c\n", seventhC, firstC, sixthC, secondC, seventhC);
        System.out.printf("%cq p%c   %c%c\n", seventhC, seventhC, secondC, ninthC);
        System.out.printf("%c 0 %c%c%c%c%c\n", thirdC, fourthC, eighthC, eighthC, eighthC, firstC);
        System.out.printf("%c%c%c%c%c    %c\n", seventhC, eighthC, lastC, eighthC, tenthC, seventhC);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c", seventhC, seventhC, sixthC, secondC, eleventhC, firstC, firstC, sixthC, sixthC, seventhC);
    }
}