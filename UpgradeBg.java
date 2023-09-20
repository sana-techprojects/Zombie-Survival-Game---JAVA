import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradeBg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeBg extends Actor
{
    /**
     * Act - do whatever the UpgradeBg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Adds the background for the upgrade bomb button 
    public UpgradeBg()
    {
        GreenfootImage upgradeBg = new GreenfootImage("bombBg-removebg-preview.png");
        upgradeBg.scale(130, 35);
        setImage(upgradeBg); 
    
    }
    public void act()
    {
        // Add your action code here.
    }
}
