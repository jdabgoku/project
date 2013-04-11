import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//will be the help page, (controls)
public class WHelp extends World
{

    Back back = new Back();
    public WHelp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(back,20,10); //back button, goes to main menu
    }
}
