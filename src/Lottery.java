import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter in a two digit number: ");
        int userGuess = keyboard.nextInt();
        int lottoNum = (int)(Math.random()*100) + 1;
        int firstDigitGuess = userGuess % 10;
        int secondDigitGuess = userGuess / 10;
        int firstLottoNum = lottoNum % 10;
        int secondLottoNum = lottoNum / 10;

        System.out.println("The lotto number is : " + lottoNum);
        if(userGuess == lottoNum){
            System.out.println("YOU GOT IT!!!");
            System.out.println("You win the Jackpot of $10,000");
        }
        else if(firstDigitGuess == secondLottoNum && secondDigitGuess ==
                firstLottoNum){
            System.out.println("You got both digits correct.");
            System.out.println("You win $2,000");
        }
        else if(firstDigitGuess == firstLottoNum || firstDigitGuess ==
                secondLottoNum || secondDigitGuess == firstLottoNum || secondDigitGuess ==
                secondLottoNum){
            System.out.println("You got one digit correct.");
            System.out.println("You win $500");
        }
        else {
            System.out.println("You did not win anything :(");
        }
    }
}