import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
if clicked, just goes back to main menu
 */
public class Back extends MenuButtons
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MainMenu());
        }
    }    
}
