package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";



    
        
    

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if(handSign.equals( ROCK)) return PAPER;
        if(handSign.equals( PAPER)) return SCISSOR;
        if(handSign.equals( SCISSOR)) return ROCK;



        return "tie";
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if(handSign.equals( ROCK)) return SCISSOR;
        if(handSign.equals( PAPER)) return ROCK;
        if(handSign.equals( SCISSOR)) return PAPER;



        return "tie";


    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
    if(getWinningMove(handSignOfPlayer1).equals(getLosingMove(handSignOfPlayer2))){
        return  handSignOfPlayer1;

    }
    if(getWinningMove(handSignOfPlayer2).equals(getLosingMove(handSignOfPlayer1))){
        return  handSignOfPlayer2;
    }
        return "tie";
    }
}
