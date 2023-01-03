import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Game rpcObject = new Game();
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Rock beats Scissors.  Scissors beat paper.  Paper beats Rock.");
        System.out.println("The computer has chosen.  What's your choice? (rock, paper, scissors, lizard or spock?)");
        System.out.print("Your choice: ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        if (rpcObject.isValidInput(choice))
        {
            rpcObject.setPlayerRPC(choice);
            System.out.println("Computer chose: "+rpcObject.getComputerRPC());
            if (rpcObject.play().equals("player"))
                System.out.println("You won!");
            else if  (rpcObject.play().equals("computer"))
                System.out.println("You lost!");
            else System.out.println("Tie!");

        }
        else
        {
            System.out.println("Sorry.  Invalid input. Should be\"Rock\", \"Paper\" or \"Scissors\" or \"Lizard\" or \"Spock\" ");
        }

    }
}