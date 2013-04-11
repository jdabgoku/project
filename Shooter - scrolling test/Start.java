import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
starts a NEW CAMPAIGN
SETS ALL variables to their original (allows to play again without restarting the entire game)
 */
public class Start extends MenuButtons
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            world.addedGround = false;
            Greenfoot.setWorld(new world());
            world.Score = 0;
            world.Hhealth=20;
            world.Phealth=100;
            world.Ehealth=10;

            
        }
    }    
}
