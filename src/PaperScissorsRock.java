import java.util.Scanner;
public class PaperScissorsRock {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Rock (0), Paper (1), Scissors (2): ");
        int player = keyboard.nextInt();
        int computer = (int)(Math.random()*3);
        if(player == 0){
            System.out.print("You played rock.");
        }
        if(player == 1){
            System.out.print("You played paper.");
        }
        if(player == 2){
            System.out.print("You played scissors.");
        }
        if(computer == 0){
            System.out.print(" The computer played rock.");
        }
        if(computer == 1){
            System.out.print(" The computer played paper.");
        }
        if(computer == 2){
            System.out.print(" The computer played scissors.");
        }
        if(computer == player) {
            System.out.println("\nIt is a draw!");
        }
        if(computer == 0 && player == 1){
            System.out.println("\nPaper beats rock, you win!");
        }
        if(computer == 0 && player == 2){
            System.out.println("\nRock beats scissors, the computer wins!");
        }
        if(computer == 1 && player == 0){
            System.out.println("\nPaper beats rock, the computer wins!");
        }
        if(computer == 1 && player == 2){
            System.out.println("\nScissors beat paper, you win!");
        }
        if(computer == 2 && player == 0){
            System.out.println("\nRock beats scissors, you win!");
        }
        if(computer == 2 && player == 1){
            System.out.println("\nScissors beat paper, the computer wins!");
        }
    }
}