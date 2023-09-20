import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradesInfoWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradesInfoWorld extends World
{
    private UpgradesPopUp upgradesPopUp;
    private HomeButton homeButton; 
    PlayButton playBn = new PlayButton();
    
    /**
     * Constructor for objects of class UpgradesInfoWorld.
     * 
     */
    public UpgradesInfoWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        GreenfootImage instructBg = new GreenfootImage("silhouette-dark-forest-landscape-background-free-vector.jpg");
        instructBg.scale(getWidth(),getHeight()+20); 
        setBackground(instructBg);
        addUpgradesInfoPopUp();
        addHomeButton();
    }
    
    /**
     * This method is called when the world is stopped.
     * It calls the stopped() method of the PlayButton.
     */
    public void stopped()
    {
        playBn.stopped();
    }
    
    /**
     * This method is called when the world is started.
     * It calls the started() method of the PlayButton.
     */
    public void started()
    {
        playBn.started();
    }
    
    /**
     * This method adds the HomeButton to the world.
     * It creates an instance of HomeButton and adds it to the world.
     */
    private void addHomeButton()
    {
        homeButton = new HomeButton();
        addObject(homeButton, 70, 520);
    }
    
    /**
     * This method adds the UpgradesPopUp to the world.
     * It creates an instance of UpgradesPopUp and adds it to the world.
     */
    private void addUpgradesInfoPopUp()
    {
        upgradesPopUp = new UpgradesPopUp();
        addObject(upgradesPopUp, getWidth()/2, getHeight()/2);
    }
}
