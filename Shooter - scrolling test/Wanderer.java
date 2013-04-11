import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
Allows objects/actors to go offscreen
 */
public abstract class Wanderer extends Actor
{
    private int x;
    private int y;
    
    /**
     * Set the location of the actor.
     */
    @Override public void setLocation(int x, int y)
    {
        this.x = x;
        this.y = y;
        super.setLocation(x, y);
    }
    
    
    /**
     * Get the x co-ordinate of the actor.
     */
    @Override public int getX()
    {
        return x;
    }
    
    /**
     * Get the y co-ordinate of the actor.
     */
    @Override public int getY()
    {
        return y;
    }
}