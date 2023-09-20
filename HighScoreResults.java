import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScoreResults here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScoreResults extends Actor
{
    
    //This method adds the Player's score results to the HighScoreWorld 
    public HighScoreResults()
    {
        setImage(new GreenfootImage("SCORE: " +  CountZombies.score, 22, Color.WHITE, new Color(0,0,0,0)));
            
    }
    
    public void act()
    {
        
    }
}
