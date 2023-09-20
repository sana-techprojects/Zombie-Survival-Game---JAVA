import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradesInfoBg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradesInfoBg extends Actor
{
    /**
     * Act - do whatever the UpgradesInfoBg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Adds the background for the Upgrades Info Button in the Welcome World
    public UpgradesInfoBg()
    {
        GreenfootImage upgradesInfoBg = new GreenfootImage("upgradeInfoBg-removebg-preview.png");
        upgradesInfoBg.scale(200, 120);
        setImage(upgradesInfoBg);
    
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
