import greenfoot.*;

/**
 * The HighScoreWorld class represents the world where high scores are displayed.
 * It extends the World class.
 * 
 * The class is responsible for adding and managing objects in the world.
 * 
 * The HighScoreWorld class contains a HomeButton object, a HighScore object, and multiple ZombieHighScore objects.
 * It also has HighScoreResults and TimeResults objects for displaying high score results.
 * The background image is set and scaled accordingly.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class HighScoreWorld extends World
{
    private HomeButton homeButton; 
    private HighScore highScoreBoard;
    ZombieHighScore animatedZombie = new ZombieHighScore();
    ZombieHighScore animatedZombie1 = new ZombieHighScore();
    ZombieHighScore animatedZombie3 = new ZombieHighScore();
    ZombieHighScore animatedZombie4 = new ZombieHighScore();
    ZombieHighScore animatedZombie5 = new ZombieHighScore();
    ZombieHighScore animatedZombie6 = new ZombieHighScore();
    HighScoreResults highScoreResults = new HighScoreResults();
    TimeResults timeResults = new TimeResults();
    
    /**
     * Constructor for objects of class HighScoreWorld.
     * It creates a new world with 1000x600 cells and sets the background image.
     */
    public HighScoreWorld()
    {    
        super(1000, 600, 1); 
        
        // Set the background image
        GreenfootImage instructBg = new GreenfootImage("silhouette-dark-forest-landscape-background-free-vector.jpg");
        instructBg.scale(getWidth(), getHeight() + 20); 
        setBackground(instructBg);
        
        // Add the HomeButton and HighScore objects to the world
        addHomeButton();
        addHighScore();
        
        // Add the HighScoreResults and TimeResults objects to the world
        addObject(highScoreResults, getWidth() / 2 + 85, getHeight() / 2 + 215);
        addObject(timeResults, getWidth() / 2, getHeight() / 2 - 100);
        
        // Add the ZombieHighScore objects to the world
        addObject(animatedZombie, 960, 590);
        addObject(animatedZombie1, 56, 591);
        addObject(animatedZombie3, 434, 546);
        addObject(animatedZombie4, 841, 455);
        addObject(animatedZombie5, 920, 289);
        addObject(animatedZombie6, 498, 26);
    }
    
    /**
     * Called when the world can start the background music.
     * It calls the started() method of the HighScore object.
     */
    public void started()
    {
        highScoreBoard.started();
    }
    
    /**
     * Called when the world can stop/ pause the background music.
     * It calls the stopped() method of the HighScore object.
     */
    public void stopped()
    {
        highScoreBoard.stopped();
    }
    
    /**
     * Adds the HomeButton object to the world.
     */
    private void addHomeButton()
    {
        homeButton = new HomeButton();
        addObject(homeButton, 80, 70);
    }
    
    /**
     * Adds the HighScore object to the world.
     */
    private void addHighScore()
    {
        highScoreBoard = new HighScore();
        addObject(highScoreBoard, getWidth() / 2, getHeight() / 2);
    }
}
