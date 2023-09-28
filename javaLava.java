import java.util.Scanner;

class javaLava {
    public static void main(String[] args) {
        String command = "";
        int square = 3;
        System.out.println("Hello World.");

        Scanner sc = new Scanner(System.in);

        while (true) {
            if (square < 26) {
                System.out.println("You are on square " + square);
                System.out.println("Type 'U' to move up, 'L' to move left, and 'R' to move right.");

                // get user input
                System.out.print("> ");
                command = sc.nextLine();

                // deal with user input
                if (command.toLowerCase().equals("u")) {
                    square = square + 5;
                    System.out.println("You stepped forward onto square " + square);
                }

                if (command.toLowerCase().equals("l")) {
                    if (square != 1 
                        && square != 6 
                        && square != 11
                        && square != 16
                        && square != 21){
                            square--;
                            System.out.println("You stepped LEFT onto square " + square);     
                   }
                   
                   else{ 
                        System.out.println("You can't move any further left!");
                        System.out.println("You must go UP or RIGHT.");
                   }
                    
                }

                if (command.toLowerCase().equals("r")) {
                    if (square%5 == 0){
                        System.out.println("You can't move any further RIGHT!");
                        System.out.println("You must go UP or LEFT.");    
                   }
                   else{ 
                        square++;
                        System.out.println("You stepped RIGHT onto square " + square); 
                   }
                    
                }
                

            }
        }
    }
}
