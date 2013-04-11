import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//will be the high score menu
public class HighScores extends World
{

    Back back = new Back();
    public HighScores()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(back,20,10);
    }
}
