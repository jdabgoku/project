import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
the other ground object
 */
public class MoreGround extends Wanderer
{

    /**
     * Act - do whatever the MoreGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        move();
        checkLocation();

    }    
    
    public void move(){
        if(world.scrolling == true)
        {
            if(world.image == 1)
            {
                setLocation(getX()+world.speed, getY());
            }
            else if(world.image == 2)
            {
                setLocation(getX()-world.speed, getY());
            }
        }        
        
    }
    
    public void checkLocation(){
        if( getX() < 0 | getX() > 800)
        {
            setImage("invisible.gif");
        }
        else{setImage("ground4.jpg");}
        
    }
    
    public void add(){
        
        this.setLocation(world.xcords,getWorld().getHeight()-5);
    }
    
    public void add2(){
        this.setLocation(world.xcords,getWorld().getHeight()-150);
        
    }
}
