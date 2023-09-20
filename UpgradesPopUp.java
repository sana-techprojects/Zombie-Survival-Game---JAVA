import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradesPopUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradesPopUp extends Actor
{
    /**
     * Act - do whatever the UpgradesPopUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Adds an image displayed the upgrades the player can use when playing the game
    public UpgradesPopUp()
    {
        GreenfootImage upgradeLabel = new GreenfootImage("InstructionsPopup__3_-removebg-preview.png");
        upgradeLabel.scale(950, 550);
        setImage(upgradeLabel);
    
    
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
