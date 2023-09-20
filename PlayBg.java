import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayBg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayBg extends Actor
{
    //adds the background for the Play Game button
    public PlayBg()
    {
        GreenfootImage playBg = new GreenfootImage("playButtonWithBg-removebg-preview.png");
        playBg.scale(200, 120);
        setImage(playBg);
        
    
    }
    
    /**
     * Act - do whatever the PlayBg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
