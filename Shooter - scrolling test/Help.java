import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
if clicked goes to the help menu
 */
public class Help extends MenuButtons
{
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new WHelp());
        }
    }    
}
