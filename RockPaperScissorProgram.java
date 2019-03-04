public class RockPaperScissorProgram {

    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    //Return the respective winning move.
    public String getWinningMove(String handSign) {
        if (PAPER.equals(handSign)) {
            return SCISSOR;
        } else if(SCISSOR.equals(handSign)) {
            return ROCK;
        } else {
            return PAPER;
        }
    }

    //Return the respective losing move.
    public String getLosingMove(String handSign) {
        if (PAPER.equals(handSign)) {
            return ROCK;
        } else if(SCISSOR.equals(handSign)) {
            return PAPER;
        } else {
            return SCISSOR;
        }
    }

    //Return a string representative of the winning hand sign between the two players.
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if(handSignOfPlayer1.equals(handSignOfPlayer2)) {
            return "draw";
        } else if (getWinningMove(handSignOfPlayer1).equals(handSignOfPlayer2)) {
            return handSignOfPlayer2;
        } else {
            return handSignOfPlayer1;
        }
    }
}
