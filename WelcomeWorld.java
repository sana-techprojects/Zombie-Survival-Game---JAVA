import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomeWorld extends World
{
    private Title title;
    private InstructionsBg instructionsBg;
    private PlayBg playBg;
    private UpgradesInfoBg upgradesInfoBg;
    InstructionsButton instructBn = new InstructionsButton();
    PlayButton playBn = new PlayButton();
    UpgradesInfoButton upgradesInfoButton = new UpgradesInfoButton();
    
    /**
     * Constructor for objects of class WelcomeWorld.
     */
    public WelcomeWorld()
    {    
        super(1000, 600, 1); // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        GreenfootImage bg = new GreenfootImage("dark-zombie-wallpaper-preview.jpg");
        bg.scale(getWidth(), getHeight()+20); 
        setBackground(bg);
        
        addTitle();
        addInstructionsButton();
        addObject(instructBn, 130, 400);
        addPlayButton();
        addObject(playBn, 130, 520);
        addUpgradesInfoButton();
        addObject(upgradesInfoButton, 130, 280);
        Projectile.init();
    }
    
    /**
     * This method adds the UpgradesInfoButton to the world.
     * It creates an instance of UpgradesInfoBg and adds it to the world.
     */
    private void addUpgradesInfoButton()
    {
        upgradesInfoBg = new UpgradesInfoBg();
        addObject(upgradesInfoBg, 130, 280);
    }
    
    /**
     * This method adds the InstructionsButton to the world.
     * It creates an instance of InstructionsBg and adds it to the world.
     */
    private void addInstructionsButton()
    {
        instructionsBg = new InstructionsBg();
        addObject(instructionsBg, 130, 400);
    }
    
    /**
     * This method adds the PlayButton to the world.
     * It creates an instance of PlayBg and adds it to the world.
     */
    private void addPlayButton()
    {
        playBg = new PlayBg();
        addObject(playBg, 130, 520);
    }
    
    /**
     * This method adds the Title to the world.
     * It creates an instance of Title and adds it to the world.
     */
    private void addTitle()
    {
        title = new Title();
        addObject(title, getWidth()/2, getHeight()/2 - 200);
    }

    /**
     * This method is called when the music of the world is stopped/ paused.
     * It calls the stopped() method of the PlayButton.
     */
    public void stopped()
    {
        playBn.stopped();
    }
    
    /**
     * This method is called when the music of the world is started.
     * It calls the started() method of the PlayButton.
     */
    public void started()
    {
        playBn.started();
    }
    
    /**
     * This method is called every act cycle.
     * It currently doesn't have any functionality.
     */
    public void act()
    {
        
    }
}
