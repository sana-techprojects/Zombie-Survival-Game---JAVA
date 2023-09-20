import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * The PlayButton class represents a button that starts the game when clicked.
 * It extends the Actor class.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class PlayButton extends Actor
{
    private static GreenfootSound bgm;
    
    /**
     * Constructor for objects of class PlayButton.
     * Initializes the PlayButton actor and sets its initial appearance.
     */
    public PlayButton()
    {
        if (bgm == null){
            bgm = new GreenfootSound("music_biiansu_enter_the_forest_013.mp3");   
        }
        setImage(new GreenfootImage("PLAY!", 25, Color.BLACK, new Color(0, 0, 0, 0)));
    }
    
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * It is used to update the PlayButton actor.
     */
    public void act()
    {
        started();
        
        if (Greenfoot.mousePressed(this))
        {
            stopped();
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    /**
     * Start playing the background music.
     */
    public void started()
    {
        if (bgm != null)
        {
            bgm.playLoop();
        }
    }
    
    /**
     * Stop playing the background music.
     */
    public void stopped()
    {
        if (bgm != null)
        {
            bgm.pause();
        }
    }
}
