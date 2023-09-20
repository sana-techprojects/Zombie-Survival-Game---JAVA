import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShooterUpgradeBg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShooterUpgradeBg extends Actor
{
    /**
     * Act - do whatever the ShooterUpgradeBg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Adds the background for the shooter upgrade button
    public ShooterUpgradeBg()
    {
        GreenfootImage shooterUpgradeBg = new GreenfootImage("3ShooterPack-removebg-preview.png");
        shooterUpgradeBg.scale(130, 40);
        setImage(shooterUpgradeBg); 
    
    }
    
    public void act()
    {
        // Add your action code here.      
    }
}
