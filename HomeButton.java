import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeButton here.
 * 
 * The HomeButton class represents a button that allows the player to return to the welcome screen.
 * It extends the Actor class.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class HomeButton extends Actor
{
    HighScore highScore = new HighScore();
    
    /**
     * Constructor for objects of class HomeButton.
     * Initializes the HomeButton actor and sets its initial appearance.
     */
    public HomeButton()
    {      
        GreenfootImage homeButton = new GreenfootImage("homeButtonWithBg-removebg-preview (1).png");
        homeButton.scale(100, 90);
        setImage(homeButton);
    }
    
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * It is used to update the HomeButton actor.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            highScore.stopped();
            Greenfoot.setWorld(new WelcomeWorld());
        }
    }
}
