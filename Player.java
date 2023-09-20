import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * The Player class represents the player-controlled character in the game.
 * It extends the Actor class.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class Player extends Actor
{
    int speed = 5;
    int time = 0;
    ShooterPackUpgrade weaponButton;
    
    /**
     * Constructor for objects of class Player.
     * Initializes the Player actor and sets its initial image.
     */
    public Player()
    {   
        setImage("sunflower_plant_enemy_game_character_sprites-removebg-preview.png");
        getImage().scale(70, 80);  
    }
    
    /**
     * Constructor for objects of class Player with a weapon button reference.
     * Initializes the Player actor and sets its initial image and assigns the weapon button reference.
     */
    public Player(ShooterPackUpgrade weaponButton)
    {   
        this.weaponButton = weaponButton;
        setImage("sunflower_plant_enemy_game_character_sprites-removebg-preview.png");
        getImage().scale(70, 80);  
    }
    
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     * It is used to update the Player actor.
     */
    public void act()
    {
        time++;
        turnAround();
        moveAround();
        fireProjectile();
        zombieHit();
    }
    
    /**
     * Turn the player towards the mouse position.
     */
    public void turnAround()
    {
        if (Greenfoot.getMouseInfo() != null)
        {
            turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }
    
    /**
     * Move the player in response to key presses.
     */
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + speed);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
        }    
    }
    
    /**
     * Fire projectiles based on the weapon button upgrade level.
     */
    public void fireProjectile()
    {
        if (Greenfoot.mousePressed(null) && weaponButton.upgrade2 == 1)
        {
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile, getX(), getY());
            projectile.setRotation(getRotation());
            projectile.move(25);
        }
        
        if (Greenfoot.mousePressed(null) && weaponButton.upgrade2 == 2)
        {
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile, getX(), getY());
            projectile.setRotation(getRotation());
            projectile.move(20);
            
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2, getX(), getY());
            projectile2.setRotation(getRotation());
            projectile2.move(5);
            
            Projectile projectile3 = new Projectile();
            getWorld().addObject(projectile3, getX(), getY());
            projectile3.setRotation(getRotation());
            projectile3.move(10);
        }
    }
    
    /**
     * Check if the player is touching a zombie.
     * Returns true if touching a zombie, false otherwise.
     */
    public boolean zombieHit()
    {
        Actor zombie = getOneObjectAtOffset(0, 0, Zombie.class);
        
        if (zombie != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
