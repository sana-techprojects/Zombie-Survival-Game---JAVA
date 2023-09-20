import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScore here.
 * 
 * The HighScore class represents an actor that displays the high score board.
 * It extends the Actor class.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class HighScore extends Actor
{
    private static GreenfootSound scoreMusic;
    
    /**
     * Constructor for objects of class HighScore.
     * Initializes the HighScore actor and sets its initial appearance.
     */
    public HighScore()
    {
        if (scoreMusic == null)
        {
            scoreMusic = new GreenfootSound("curse-of-the-manor-152594.wav");
        }
        
        GreenfootImage highScoreBoard = new GreenfootImage("highScoreWithBg-removebg-preview (1).png");
        highScoreBoard.scale(480, 500);
        setImage(highScoreBoard);
    }
    
    /**
     * Called when the HighScore actor is added to the world.
     * Resumes playing the score music.
     */
    public void started()
    {
        if (scoreMusic != null)
        {
            scoreMusic.playLoop();
        }
    }
    
    /**
     * Called when the HighScore actor is removed from the world.
     * Pauses the score music.
     */
    public void stopped()
    {
        if (scoreMusic != null)
        {
            scoreMusic.pause();
        }
    }
    
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * It is used to update the HighScore actor.
     */
    public void act()
    {
        started();
    }
}
