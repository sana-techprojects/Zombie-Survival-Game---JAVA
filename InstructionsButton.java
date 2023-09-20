import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsButton extends Actor
{
    //This class labels the Instructions button with text and when its clicked on, the instructions of the game are displayed
    public InstructionsButton()
    {
        setImage(new GreenfootImage("INSTRUCTIONS", 25, Color.BLACK, new Color(0,0,0,0)));
    
    }
    
    /**
     * Act - do whatever the InstructionsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld (new InstructionsWorld());
            //((InstructionsWorld)getWorld()).stopped();
        }
    }
}
