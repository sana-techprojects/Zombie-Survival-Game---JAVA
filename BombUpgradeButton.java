import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The BombUpgradeButton class represents an actor that serves as a button for upgrading the bomb weapon.
 * It extends the Actor class.
 * 
 * The BombUpgradeButton can perform actions such as playing a bomb sound, creating a bomb explosion animation,
 * and removing all zombie actors from the world.
 * 
 * The class contains a reference to the CountZombies object for tracking the game's zombie count.
 * The bombSound stores the sound effect for the bomb explosion.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class BombUpgradeButton extends Actor
{
    private CountZombies counter;
    private GreenfootSound bombSound;
    
    /**
     * Constructor for the BombUpgradeButton class.
     * 
     * @param counter The CountZombies object for tracking the zombie count.
     */
    public BombUpgradeButton(CountZombies counter)
    {
        this.counter = counter;
        setImage(new GreenfootImage("Bomb", 15, Color.BLACK, new Color(0, 0, 0, 0)));
    }
    
    /**
     * Adds a bomb explosion animation to the world.
     */
    private void addBombExplosion()
    {
        BombGIF bombGIF = new BombGIF();
        //addObject(bombGIF, 502, 301);
    }
    
    /**
     * Removes all zombie actors from the world.
     */
    public void bombZombies()
    {
        getWorld().removeObjects(getWorld().getObjects(Zombie.class));
    }
    
    /**
     * The act() method is called on every act cycle.
     * It handles the mouse press event on the button, plays the bomb sound effect,
     * creates the bomb explosion animation, subtracts money from the counter, and removes zombies.
     */
    public void act()
    {
        World world = getWorld();
        MyWorld myWorld = (MyWorld) world;
        
        bombSound = new GreenfootSound("zapsplat_warfare_bomb_drop_explode_designed_explosion_002_93129.wav");
        bombSound.setVolume(100);
        
        if (Greenfoot.mousePressed(this) && counter.money >= 150)
        {
            bombSound.play();
            myWorld.addObject(new BombGIF(), 500, 300);
            counter.money -= 150;
            bombZombies();
        }
    }
}
