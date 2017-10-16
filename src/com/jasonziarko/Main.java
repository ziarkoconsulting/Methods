package com.jasonziarko;

public class Main {

    public static void main(String[] args)
    {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score as " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score as " + finalScore);

        String player_name = "Jason";

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition(player_name, position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition(player_name, position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition(player_name, position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition(player_name, position);





    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return  finalScore;
        }
        else
        {
            return -1;
        }
    }

    public static void displayHighScorePosition(String player_name, int position)
    {
        System.out.println("Congratulations, " + player_name + " you managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int highScore)
    {
        if(highScore > 1000)
        {
            return 1;
        }

        else if(highScore >= 500 && highScore < 1000)
        {
            return 2;
        }

        else if(highScore >= 100 && highScore < 500)
        {
            return 3;
        }
        else
        {
            return 4;
        }


    }
}

