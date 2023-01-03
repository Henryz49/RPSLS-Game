public class Game
{
    //Store the string "Rock," "Paper" or "Scissors" in the instance variables.
    private String computerRPC;
    private String playerRPC;

    public Game()
    {
        //Randomly choose numbers 0 to 2 and set computer RPC to "Rock","Paper" or "Scissors"
        final int randNum = (int) (Math.random() * 5);
        if (randNum==0)
            computerRPC = "rock";
        if (randNum==1)
            computerRPC = "paper";
        if (randNum == 2)
            computerRPC = "scissors";
        if (randNum == 3)
            computerRPC = "lizard";
        if (randNum == 4)
            computerRPC = "spock";
    }

    public String getComputerRPC()
    {
        return computerRPC;
    }
    public String getPlayerRPC()
    {
        return playerRPC;
    }
    public void setComputerRPC(String rpc)
    {
        computerRPC = rpc;
    }
    public void setPlayerRPC(String rpc)
    {
        playerRPC = rpc.toLowerCase();
    }
    boolean isValidInput(final String rpc)
    {

        if((rpc.toLowerCase().equals("rock"))
                ||  (rpc.toLowerCase().equals("paper"))
                ||  (rpc.toLowerCase().equals("scissors") )
                ||  (rpc.toLowerCase().equals("lizard") )
                ||  (rpc.toLowerCase().equals("spock") )
        )

            return true;
        else
            return false;
    }
    /**
     Assumes valid input from the player
     Returns "computer" if computer wins.
     returns "player" if player wins
     returns "tie" if there is a tie
     */
    public String play()
    {
        if (getComputerRPC().equals("rock"))
        {
            if (getPlayerRPC().equals("paper") || getPlayerRPC().equals("spock"))
                return "player";
            else if (getComputerRPC().equals("scissors") || getPlayerRPC().equals("lizard"))
                return "computer";
            else
                return "tie";
            }

        else if (getComputerRPC().equals("paper")) {
            if (getPlayerRPC().equals("rock") || getPlayerRPC().equals("spock"))
                return "computer";
            else if (getPlayerRPC().equals("lizard") || getPlayerRPC().equals("scissors"))
                return "player";
            else
                return "tie";
        }

        else if (getComputerRPC().equals("scissors"))
        {
            if (getPlayerRPC().equals("rock") || getPlayerRPC().equals("spock"))
                return "player";
            else if (getPlayerRPC().equals("paper") || getPlayerRPC().equals("lizard"))
                return "computer";
            else
                return "tie";
    }

        else if (getComputerRPC().equals("lizard"))
        {
         if (getPlayerRPC().equals("rock") || getPlayerRPC().equals("scissors"))
             return "player";
         else if (getPlayerRPC().equals("paper") || getPlayerRPC().equals("spock"))
             return "computer";
         else return "tie";
        }

        else{}
        if (getPlayerRPC().equals("paper") || getPlayerRPC().equals("lizard"))
            return "player";
        else if (getPlayerRPC().equals("scissors") || getPlayerRPC().equals("rock"))
            return "computer";
        else return "tie";
        }
    }

