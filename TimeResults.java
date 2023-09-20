import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScoreResults here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeResults extends Actor
{
    //Adds the player's time and how long they survived for in the game
    public TimeResults()
    {
        setImage(new GreenfootImage("You survived for... " +  CountZombies.time/60 + " seconds!", 25, Color.BLACK, new Color(0,0,0,0)));
            
    }
    
    /**
     * Act - do whatever the HighScoreResults wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
}
