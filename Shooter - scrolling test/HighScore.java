import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
goes to the high score menu (aka HighScores world)
 */
public class HighScore extends MenuButtons
{
    /**
     * Act - do whatever the HighScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HighScores());
        }
    }    
}
