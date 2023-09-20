import greenfoot.*; // Import necessary classes

/**
 * 
 * This class represents the world where instructions are displayed.
 * It extends the Greenfoot class 'World'.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class InstructionsWorld extends World
{
    private InstructionsPopUp instructionsPopUp; // Reference to the instructions popup
    private HomeButton homeButton; // Reference to the home button
    PlayButton playBn = new PlayButton(); // Create a new instance of PlayButton
    
    /**
     * Constructor for objects of class InstructionsWorld.
     * 
     * This constructor initializes the world and sets its dimensions.
     * It also sets the background image and adds the instructions popup and home button.
     */
    public InstructionsWorld()
    {    
        super(1000, 600, 1); // Create a world with dimensions 1000x600 pixels
        GreenfootImage instructBg = new GreenfootImage("silhouette-dark-forest-landscape-background-free-vector.jpg");
        instructBg.scale(getWidth(), getHeight() + 20); // Scale the background image to fit the world size
        setBackground(instructBg); // Set the background image of the world
        addInstructionsPopUp(); // Add the instructions popup to the world
        addHomeButton(); // Add the home button to the world
    }
    
    /**
     * This method is called when the world is stopped.
     * It calls the stopped() method of the play button instance.
     */
    public void stopped()
    {
        playBn.stopped();
    }
    
    /**
     * This method is called when the world is started.
     * It calls the started() method of the play button instance.
     */
    public void started()
    {
        playBn.started();
    }
    
    /**
     * This method adds the home button to the world.
     * It creates a new instance of the home button and sets its position.
     */
    private void addHomeButton()
    {
        homeButton = new HomeButton(); // Create a new instance of HomeButton
        addObject(homeButton, 70, 520); // Add the home button to the world at position (70, 520)
    }
    
    /**
     * This method adds the instructions popup to the world.
     * It creates a new instance of the instructions popup and sets its position at the center of the world.
     */
    private void addInstructionsPopUp()
    {
        instructionsPopUp = new InstructionsPopUp(); // Create a new instance of InstructionsPopUp
        addObject(instructionsPopUp, getWidth() / 2, getHeight() / 2); // Add the instructions popup to the center of the world
    }
}
