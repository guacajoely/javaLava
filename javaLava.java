import java.util.Scanner;

class javaLava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         
        String command = "";
        int square = 3;

        while (true) {

            if (square < 26) {

                System.out.println("");
                System.out.println("You are on square " + square);
                System.out.println("Type 'U' to move up,");
                System.out.println("'L' to move left,");
                System.out.println("'R' to move right.");
                System.out.println("or 'G' to view the grid");

                // get user input
                System.out.print("> ");
                command = sc.nextLine();

                // deal with user input
                if (command.toLowerCase().equals("u")) {
                    square = square + 5;
                    System.out.println("");

                    if(square < 26)
                    System.out.println("You stepped forward onto square " + square);
                }

                else if (command.toLowerCase().equals("l")) {
                    if (square != 1 
                        && square != 6 
                        && square != 11
                        && square != 16
                        && square != 21){
                            square--;
                            System.out.println("");
                            System.out.println("You stepped LEFT onto square " + square);     
                   }
                   
                   else{ 
                        System.out.println("");
                        System.out.println("You can't move any further left!");
                        System.out.println("You must go UP or RIGHT.");
                   }
                    
                }

                else if (command.toLowerCase().equals("r")) {
                    if (square%5 == 0){
                        System.out.println("");
                        System.out.println("You can't move any further RIGHT!");
                        System.out.println("You must go UP or LEFT.");    
                   }
                   else{ 
                        square++;
                        System.out.println("");
                        System.out.println("You stepped RIGHT onto square " + square); 
                   }
                    
                }

                else if (command.toLowerCase().equals("g")) {
                    System.out.println("");
                    System.out.println("           ~FINISH LINE~\r\n" + //
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
                            "                 ↑↑\r\n" + //
                            "             START HERE");   
                }

                else {
                        System.out.println("");
                        System.out.println("Please enter a valid response.");
                }
                
            }

            else{
                System.out.println("");
                System.out.println("You WIN! Play Again?");
                System.out.println("Type 'Y' for yes or 'N' for no");
                System.out.print("> ");
                command = sc.nextLine();

                if (command.toLowerCase().equals("y")) {
                    square = 3;
                    command="";
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
