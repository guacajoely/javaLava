import java.util.Arrays;
import java.util.Scanner;

class javaLava {

    //get random number that also excludes an array of numbers from future selection
    public static int getRandoNum(int min, int max, int[] exclude) {
        Arrays.sort(exclude);
        int random = min + (int) ((max - min + 1 - exclude.length) * Math.random());
        for (int ex : exclude) {
            if (random < ex) {
                break;
            }
            random++;
        }
        return random;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String command = "";
        int square = 3;
        
        //last auto save
        int lastSafeSquare = 3;

        // creates array of 7 squares between 1 and 25
        int[] lavaSquares = new int[7];

        // excluding the starting square #3, and any previously selected squares
        int[] excludedNums = new int[8];
        excludedNums[0] = 3;

        for (int i = 0; i < lavaSquares.length; i++) {
            lavaSquares[i] = getRandoNum(1, 25, excludedNums);
            excludedNums[i + 1] = lavaSquares[i];
        }

        while (true) {

            if (square < 26) {

                System.out.println("");
                System.out.println("You are on square " + square);
                System.out.println("Type 'U' to move up,");
                System.out.println("'L' to move left,");
                System.out.println("'R' to move right.");
                System.out.println("'G' to view the grid");
                System.out.println("or 'C' to CHEAT!");

                // get user input
                System.out.print("> ");
                command = sc.nextLine();

                // deal with user input
                if (command.toLowerCase().equals("u")) {
                    square = square + 5;
                    System.out.println("");

                    if (square < 26)
                        System.out.println("You stepped forward onto square " + square);
                }

                else if (command.toLowerCase().equals("l")) {
                    if (square != 1
                            && square != 6
                            && square != 11
                            && square != 16
                            && square != 21) {
                        square--;
                        System.out.println("");
                        System.out.println("You stepped LEFT onto square " + square);
                    }

                    else {
                        System.out.println("");
                        System.out.println("You can't move any further left!");
                        System.out.println("You must go UP or RIGHT.");
                    }

                }

                else if (command.toLowerCase().equals("r")) {
                    if (square % 5 == 0) {
                        System.out.println("");
                        System.out.println("You can't move any further RIGHT!");
                        System.out.println("You must go UP or LEFT.");
                    } else {
                        square++;
                        System.out.println("");
                        System.out.println("You stepped RIGHT onto square " + square);
                    }

                }

                else if (command.toLowerCase().equals("g")) {
                    System.out.println("");
                    System.out.println("              ~FINISH~\r\n" + //
                            " ______ ______ ______ ______ ______ \r\n" + //
                            "|      |      |      |      |      |\r\n" + //
                            "|  21  |  22  |  23  |  24  |  25  |\r\n" + //
                            "|______|______|______|______|______|\r\n" + //
                            "|      |      |      |      |      | \r\n" + //
                            "|  16  |  17  |  18  |  19  |  20  |\r\n" + //
                            "|______|______|______|______|______|\r\n" + //
                            "|      |      |      |      |      | \r\n" + //
                            "|  11  |  12  |  13  |  14  |  15  |\r\n" + //
                            "|______|______|______|______|______|\r\n" + //
                            "|      |      |      |      |      | \r\n" + //
                            "|  06  |  07  |  08  |  09  |  10  |\r\n" + //
                            "|______|______|______|______|______|\r\n" + //
                            "|      |      |      |      |      | \r\n" + //
                            "|  01  |  02  |  03  |  04  |  05  |\r\n" + //
                            "|______|______|______|______|______|\r\n" + //
                            "                 ^^\r\n" + //
                            "             START HERE");
                }

                else if (command.toLowerCase().equals("c")) {
                    System.out.println("");
                    System.out.println("The squares that are lava are...");
                    for (int i = 0; i < lavaSquares.length; i++) {
                        System.out.println(lavaSquares[i]);
                    }
                }

                else {
                    System.out.println("");
                    System.out.println("Please enter a valid response.");
                }

            }

            else {
                System.out.println("");
                System.out.println("You WIN! Play Again?");
                System.out.println("Type 'Y' for yes or 'N' for no");
                System.out.print("> ");
                command = sc.nextLine();

                if (command.toLowerCase().equals("y")) {

                    // RESET EVERYTHING
                    square = 3;
                    command = "";
                    lavaSquares = new int[7];
                    excludedNums = new int[8];
                    excludedNums[0] = 3;

                    for (int i = 0; i < lavaSquares.length; i++) {
                        lavaSquares[i] = getRandoNum(1, 25, excludedNums);
                        excludedNums[i + 1] = lavaSquares[i];
                    }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                }

                else if (command.toLowerCase().equals("n")) {
                    System.exit(0);
                }

                else {
                    System.out.println("Please enter a valid response.");
                }

            }

        }
    }
}
