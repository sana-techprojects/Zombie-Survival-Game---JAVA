import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * The Projectile class represents the projectiles fired by the Player.
 * It extends the Actor class.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class Projectile extends Actor
{
    private static GreenfootImage cachedImage;
    
    /**
     * Constructor for objects of class Projectile.
     * Initializes the Projectile actor and sets its initial image.
     */
    public Projectile()
    {
        GreenfootImage seed = new GreenfootImage(cachedImage);
        seed.scale(20, 20);
        setImage(seed);
    }
    
    /**
     * Initialize the cached image for the projectile.
     */
    public static void init() {
        cachedImage = new GreenfootImage("sunflowerSeed-removebg-preview.png");
    }
    
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * It is used to update the Projectile actor.
     */
    public void act()
    {
        move(10);
        
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
