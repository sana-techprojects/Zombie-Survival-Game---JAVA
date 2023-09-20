import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CountZombies here.
 * 
 * The CountZombies class represents an actor that keeps track of the game's score, money, and time.
 * It extends the Actor class.
 * 
 * The CountZombies actor displays the current score, cash, and time as a text image.
 * It provides methods for adding points to the score, and getters for accessing the current score, cash, and time.
 * 
 * The class contains a static score variable to keep track of the score, money, and time.
 * The act() method updates the text image with the current values of score, cash, and time.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class CountZombies extends Actor
{
    /**
     * Act - do whatever the CountZombies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score;
    public static int money;
    public static int time;
    
    /**
     * Constructor for objects of class CountZombies.
     * Initializes the CountZombies actor and sets its initial text image.
     */
    public CountZombies()
    {
        setImage(new GreenfootImage("Score: " + score + "\nCash: $" + money + "\nTime: " + time/60, 25, Color.BLACK, new Color(0, 0, 0, 0)));
    }
    
    /**
     * Updates the current score, cash, and time values and updates the text image accordingly.
     */
    public void act()
    {
        time++;
        setImage(new GreenfootImage("Score: " + score + "\nCash: $" + money + "\nTime: " + time/60, 25, Color.BLACK, new Color(0, 0, 0, 0)));
    }

    // mutator / setter --> Allows outside classes to CHANGE your value, according to your rules
    
    /**
     * Adds the specified points to the score.
     * If the points value is greater than 0, the score is updated.
     * 
     * @param points The points to add to the score.
     */
    public void addPoints(int points)
    {
        if (points > 0)
        {
            score += points;
        }
        setImage(new GreenfootImage("Score: " + score + "\nCash: $" + money + "\nTime: " + time/60, 25, Color.BLACK, new Color(0, 0, 0, 0)));
    }

    // accessor / getting --> Allows outside classes to GET your current value
    
    /**
     * Gets the current score.
     * 
     * @return The current score.
     */
    public static int getScore()
    {
        return score;
    }
    
    /**
     * Gets the current amount of money.
     * 
     * @return The current amount of money.
     */
    public static int getMoney()
    {
        return money;
    }
    
    /**
     * Gets the current time.
     * 
     * @return The current time.
     */
    public static int getTime()
    {
        return time;
    }
}
