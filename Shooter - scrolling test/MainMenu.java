import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//The main menu you first see
//the current circles are just placeholder images. The Background will probably change also
public class MainMenu extends World
{

    Start start = new Start();
    HighScore score = new HighScore();
    Help help = new Help();
    
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(start,400,200); //start NEW campaign (resets current scores/health levels/etc
        addObject(score,400,400); //goes to the high score menu
        addObject(help,400,500); //goes to the help page
    }
}
