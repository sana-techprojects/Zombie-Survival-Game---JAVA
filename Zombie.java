import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * The Zombie class represents a zombie actor in the game.
 * It extends the Actor class.
 * 
 * Author: (your name)
 * Version: (a version number or a date)
 */
public class Zombie extends Actor
{
    private GreenfootSound shootSound;
    
    private int animateImage = 0;
    private int animateSpeed = 10;
    private int count;
    private int health = 3;
    private Player player;
    private CountZombies counter;
    private GreenfootImage[] images;
    
    public Zombie(Player mainPlayer, CountZombies counter)
    {
        this.counter = counter;
        player = mainPlayer;
        
        images = new GreenfootImage[9];
        for(int i = 0; i < images.length; i++)
        {
            images[i] = new GreenfootImage("__Zombie01_Walk_00" + i + ".png");
            images[i].scale(80, 90);
        }
        setImage(images[0]);
    }
    
    public void act()
    {
        count++;
        animate();
        moveAround();
        hitByProjectile();
    }
    
    public void animate()
    {
        if(count % animateSpeed == 0)
        {
            if(animateImage >= images.length)
            {
                animateImage = 0;
            }
            setImage(images[animateImage]);
            animateImage++;
        }
    }
    
    public void moveAround()
    {
        move(1);
        turnTowards(player.getX(), player.getY());
    }
 
    public void hitByProjectile() {
        shootSound = new GreenfootSound("zapsplat_science_fiction_cyberpunk_blaster_gun_shooting_projectile_002_89786.wav");
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if (projectile != null && projectile.getWorld() != null) {
            shootSound.play();
            health--;
            getWorld().removeObject(projectile);
        }
        if (health == 0) {
            counter.addPoints(1);
            counter.money += 5;
            getWorld().removeObject(this);
        }
    }   
}
