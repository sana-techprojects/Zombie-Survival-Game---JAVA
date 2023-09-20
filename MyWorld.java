import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Plant vs Zombies Game:
 * 
 * Instructions:
 * Your main goal is to endure the constant barrage of zombies for as long as you can. 
 * Your life depends on having quick reflexes and accurate shooting abilities since zombies will be attacking you from all angles. 
 * To kill a zombie, you must shoot it three times. Each successful kill nets you one point. 
 * You also receive $5 in cash for each point you score, which you may use to improve your chances of surviving. 
 * The number of zombies will rapidly rise as you go and earn up more score points, putting your abilities to the ultimate test. 
 * Your health is shown as a visible bar above the player, and it will decrease by colour if you are struck by a zombie. 
 * If your health reaches zero, the game is over. 
 * The difficulty of the game increases as the Player's score increases!
 * Use the keys W, A, S, D to move the player around.
 * 
 * Upgrades:
 * As you score points, you will also earn cash. 
 * Once you've earned $150 or more in cash, you will have unlocked the Bomb button which wipes out all existing zombies on the screen! 
 * Another upgrade is the 3 Shooter Pack which enables you to shoot 3 projectiles at one time, once you earn $80. 
 * This upgrade is only purchasable once in each game and will help you throughout the game.
 *
 * Credits:
 * Sounds:
 * - Dark Forest: zapsplat.com
 * - Zombie: pixabay.com
 * - Bomb: zapsplat.com
 *
 * Images:
 * - Zombie Animations: opengameart.org
 * - Game GUI: gameart2d.com
 * - Cereal Seeds: cereal-seeds
 * - Dark Forest Background: vecteezy.com
 * - Evil Sun Flower Plant Sprites: opengameart.org
 * - Zombie Character: opengameart.org
 * - Bricks Ground Textures: opengameart.org
 * - All other images are the courtesy of Google
 * 
 * Code:
 * - Help from Mr.Cohen 
 * - Used advice & tips from the Greenfoot Website
 * - Sana's Dad assisted for one of the method's (hitByProjectile() in the Zombie Actor Class)
 * Author: Sana Pardiwala
 * Version: 6/20/23
 */

/**
 * 
 * This class represents the game world.
 * It extends the Greenfoot class 'World'.
 */
public class MyWorld extends World
{
// Variables
    private Scoreboard scoreboard; // Reference to the scoreboard
    private UpgradeBg upgradeBg; // Reference to the upgrade background
    private ShooterUpgradeBg shooterUpgradeBg; // Reference to the shooter upgrade background
    private GreenfootSound bgm; // Background music
    int count = 0; // Counter variable
    private static int spawnSpeed = 50; // Speed of zombie spawning
    public Player mainPlayer; // Player object
    CountZombies counter = new CountZombies(); // Zombie counter
    HealthBar healthBar = new HealthBar(); // Health bar
    BombUpgradeButton bombButton = new BombUpgradeButton(counter); // Bomb upgrade button
    ShooterPackUpgrade weaponButton = new ShooterPackUpgrade(counter); // Weapon upgrade button
    int timer = 0; // Timer variable

    /**
     * Constructor for objects of class MyWorld.
     * 
     * This constructor initializes the world and sets its dimensions.
     * It also adds the player, scoreboard, upgrade buttons, zombie counter, and health bar.
     */
    public MyWorld()
    {    
        super(1000, 600, 1); // Create a world with dimensions 1000x600 pixels
        mainPlayer = new Player(weaponButton); // Create a new instance of Player with the weapon upgrade button
        addObject(mainPlayer,getWidth()/2, getHeight()/2); // Add the player to the center of the world
        addSb(); // Add the scoreboard
        addUpgradeButton(); // Add the upgrade button
        addUpgradeTwoButton(); // Add the shooter upgrade button
        addObject(counter, getWidth()-90, 60); // Add the zombie counter to the world
        addObject(weaponButton, 908, 120); // Add the weapon upgrade button to the world
        addObject(healthBar, mainPlayer.getX()-5, mainPlayer.getY()-10); // Add the health bar above the player
        spawnSpeed = 50; // Set the initial spawn speed
        addObject(bombButton, 920, 145); // Add the bomb upgrade button to the world
    }

    /**
     * This method is called when the world is stopped.
     * It calls the stopped() method of the health bar instance.
     */
    public void stopped()
    {
        healthBar.stopped();
    }
    
    /**
     * This method is called when the world is started.
     * It calls the started() method of the health bar instance.
     */
     public void started()
    {
        healthBar.started();
    }
    
    /**
     * This method returns the player object.
     * 
     * @return The player object
     */
    public Player getPlayer()
    {
        return mainPlayer;
    }

    /**
     * This method adds the scoreboard to the world.
     * It creates an instance of Scoreboard and adds it to the world.
     */
    private void addSb()
    {
        scoreboard = new Scoreboard(); // Create an instance of Scoreboard
        addObject(scoreboard, getWidth()-85, 90); // Add the scoreboard to the world
    }
    
    /**
     * This method adds the shooter upgrade button to the world.
     * It creates an instance of ShooterUpgradeBg and adds it to the world.
     */
    private void addUpgradeTwoButton()
    {
        shooterUpgradeBg = new ShooterUpgradeBg(); // Create an instance of ShooterUpgradeBg
        addObject(shooterUpgradeBg, 918, 120 ); // Add the shooter upgrade background to the world
    }
    
    /**
     * This method adds the upgrade button to the world.
     * It creates an instance of UpgradeBg and adds it to the world.
     */
    private void addUpgradeButton()
    {
        upgradeBg = new UpgradeBg(); // Create an instance of UpgradeBg
        addObject(upgradeBg, 915, 145 ); // Add the upgrade background to the world
    }
    
    /**
     * This method is called in every frame of the game.
     * It updates the game logic, including zombie spawning and speed adjustments.
     */
    public void act()
    {
        started(); // Start the game
        count++; // Increment the counter
        spawnZombies(); // Spawn zombies
        if(counter.getScore() >= 20 && counter.getScore() < 40)
        {
            spawnSpeed = 25; // Adjust spawn speed if the score is between 20 and 40
        }
        if(counter.getScore() >= 40 && counter.getScore() < 60)
        {
            spawnSpeed = 20; // Adjust spawn speed if the score is between 40 and 60
        }
        if(counter.getScore() >= 60 && counter.getScore() < 70)
        {
            spawnSpeed = 15; // Adjust spawn speed if the score is between 60 and 70
        }
        if(counter.getScore() >= 70 && counter.getScore() < 90)
        {
            spawnSpeed = 10; // Adjust spawn speed if the score is between 70 and 90
        }
        if(counter.getScore() >90)
        {
            spawnSpeed = 5; // Adjust spawn speed if the score is greater than 90
        }
    }

    /**
     * This method returns the current score.
     * 
     * @return The current score
     */
    public int getScore()
    {
        return counter.getScore();
    }
    
    /**
     * This method returns the current time.
     * 
     * @return The current time
     */
    public int getTime()
    {
        return counter.getTime();
    }
    
    /**
     * This method spawns zombies at random positions on the walls of the world.
     */
    public void spawnZombies()
    {
        int wall = Greenfoot.getRandomNumber(4); // Generate a random number between 0 and 3
        if(count % spawnSpeed == 0) // Spawn a zombie based on the spawn speed
        {
            if(wall == 1) // Spawn on the left wall
            {
                int x = 0;
                int y = Greenfoot.getRandomNumber(getHeight());
                addObject(new Zombie(mainPlayer,counter),x,y); // Add a new Zombie object to the world
            }
            else if (wall == 2) // Spawn on the top wall
            {
                int x = Greenfoot.getRandomNumber(getWidth());
                int y = 0;
                addObject(new Zombie(mainPlayer,counter),x,y); // Add a new Zombie object to the world
            }
            else if (wall == 3) // Spawn on the right wall
            {
                int x = getWidth();
                int y = Greenfoot.getRandomNumber(getHeight());
                addObject(new Zombie(mainPlayer,counter),x,y); // Add a new Zombie object to the world
            }
            else if (wall == 4) // Spawn on the bottom wall
            {
                int x = Greenfoot.getRandomNumber(getWidth());
                int y = getHeight();
                addObject(new Zombie(mainPlayer,counter),x,y); // Add a new Zombie object to the world
            }
        }
    }
}
