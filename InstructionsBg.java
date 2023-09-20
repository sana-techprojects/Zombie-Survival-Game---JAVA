import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsBg extends Actor
{
    /**
     * Act - do whatever the InstructionsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Adds the background for the instructions button
    public InstructionsBg()
    {
        GreenfootImage instructionsBn = new GreenfootImage("instructionsButtonWithBg-removebg-preview-removebg-preview.png");
        instructionsBn.scale(200, 120);
        setImage(instructionsBn);
    
    }
    
    public void act()
    {
        
    }
}
