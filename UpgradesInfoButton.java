import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradesInfoButton here.
 * 
 * The UpgradesInfoButton class represents a button to access the upgrades information.
 * It extends the Actor class.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class UpgradesInfoButton extends Actor
{
    /**
     * Constructor for objects of class UpgradesInfoButton.
     * Initializes the UpgradesInfoButton actor and sets its initial image.
     */
    public UpgradesInfoButton()
    {
        setImage(new GreenfootImage("UPGRADE INFO", 25, Color.BLACK, new Color(0, 0, 0, 0)));
    }
    
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * It is used to update the UpgradesInfoButton actor.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new UpgradesInfoWorld());
        }
    }
}
