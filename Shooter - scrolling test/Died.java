import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//When the player dies they are presented with this screen. Shows their scorews
public class Died extends World
{

    Score score = new Score();
    Back back = new Back();
    public Died()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(score,400,300);
        addObject(back,20,10);
    }
}
