package Conditions;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2))
            return "Draw!";
        String res = "";
        switch (p1) {
            case "scissors":
                res = p2 == "paper" ? "Player 1 won!" : "Player 2 won!";
                break;
            case "paper":
                res = p2 == "rock" ? "Player 1 won!" : "Player 2 won!";
                break;
            case "rock":
                res = p2 == "scissors" ? "Player 1 won!" : "Player 2 won!";
                break;
        }
        return res;
    }
}
