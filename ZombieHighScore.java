import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZombieHighScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZombieHighScore extends Actor
{
    int animateImage = 1;
    int animateSpeed = 10;
    int count;
    private GreenfootImage[] images;
    
    //Adds random animated zombies to the HighScoreWorld screen
    public ZombieHighScore()
    {
        images = new GreenfootImage[10];
        for(int i = animateImage; i < images.length; i++)
        {
            images[i] = new GreenfootImage("go_" + i + ".png");
            images[i].scale(90, 100);
        
        }
        setImage(images[0]);
    
    }
    
    public void animate()
    {
        if(count % animateSpeed == 0)
        {
            if(animateImage >= 9)
            {
                animateImage = 0;
            }
            setImage(images[animateImage]);
           // setImage("__Zombie01_Walk_00" + animateImage + ".png");
            //getImage().scale(80, 90);
            animateImage++;
        
        }
    }
    
    public void act()
    {
        count++;
        animate();
        
        
    }
}
