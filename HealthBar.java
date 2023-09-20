import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * The HealthBar class represents an actor that displays the health of the player.
 * It extends the Actor class.
 * 
 * The HealthBar actor has a health value and different colors to represent different health levels.
 * The act() method updates the HealthBar's appearance based on the current health value.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health = 50;
    private Color goodColor = Color.GREEN;
    private Color mediumColor = Color.YELLOW;
    private Color badColor = Color.RED;
    private static GreenfootSound gameMusic;
    
    /**
     * Constructor for objects of class HealthBar.
     * Initializes the HealthBar actor and sets its initial appearance.
     */
    public HealthBar()
    {
        if (gameMusic == null)
        {
            gameMusic = new GreenfootSound("halloween-spooky-horror-scary-creepy-funny-monsters-and-zombie-116009.mp3");
        }
        
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0, 0, 51, 11);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1, 1, health, 10);
    }
    
    /**
     * Called when the HealthBar actor is added to the world.
     * Resumes playing the game music.
     */
    public void started()
    {
        if (gameMusic != null)
        {
            gameMusic.playLoop();
        }
    }
    
    /**
     * Called when the HealthBar actor is removed from the world.
     * Pauses the game music.
     */
    public void stopped()
    {
        if (gameMusic != null)
        {
            gameMusic.pause();
        }
    }
    
    /**
     * Updates the HealthBar's appearance and handles losing health.
     */
    public void act()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0, 0, 51, 11);
        
        if (health >= 35)
        {
            getImage().setColor(goodColor);
        }
        else if (health >= 20 && health < 35)
        {
            getImage().setColor(mediumColor);
        }
        else if (health >= 0 && health < 20)
        {
            getImage().setColor(badColor);
        }
        
        getImage().fillRect(1, 1, health, 10); 
        
        World world = getWorld();
        MyWorld myWorld = (MyWorld) world;
        setLocation(myWorld.getPlayer().getX(), myWorld.getPlayer().getY() - 50);
        
        loseHealth();
    }
    
    /**
     * Decreases the health when the player is hit by a zombie.
     * Stops the game music and switches to the HighScoreWorld when health reaches 0 or below.
     */
    public void loseHealth()
    {
        started();
        
        World world = getWorld();
        MyWorld myWorld = (MyWorld) world;
        
        if (myWorld.getPlayer().zombieHit())
        {
            health--;
        }
        
        if (health <= 0)
        {
            stopped();
            Greenfoot.setWorld(new HighScoreWorld());
        }
    }
}
