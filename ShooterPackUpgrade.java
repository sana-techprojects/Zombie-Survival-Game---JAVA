import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShooterPackUpgrade here.
 * 
 * The ShooterPackUpgrade class represents the upgrade for the player's weapon.
 * It extends the Actor class.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class ShooterPackUpgrade extends Actor
{
    CountZombies counter;
    int upgrade2 = 1;
    boolean enableUpgrade = false;
    
    /**
     * Constructor for objects of class ShooterPackUpgrade.
     * Initializes the ShooterPackUpgrade actor and sets its initial image.
     */
    public ShooterPackUpgrade(CountZombies counter)
    {
        this.counter = counter;
        setImage(new GreenfootImage("Shooter Pack", 15, Color.BLACK, new Color(0, 0, 0, 0)));
    }
    
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * It is used to update the ShooterPackUpgrade actor.
     */
    public void act()
    {
        if (!enableUpgrade)
        {
            if (Greenfoot.mousePressed(this) && (counter.money > 79))
            {
                counter.money -= 80;
                upgrade2 = 2;
                enableUpgrade = true;
            }
        }
    }   
}
