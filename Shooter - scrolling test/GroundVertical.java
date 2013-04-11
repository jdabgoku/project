import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundVertical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundVertical extends Wanderer
{
    /**
     * Act - do whatever the GroundVertical wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        checkLocation();
        //2357 or more of more ground change to invisible.gif
        GroundVertical gVert = new GroundVertical();
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
        else{setImage("groundvertical.jpg");}
        
    }
    
    public void add(){        
        this.setLocation(getWorld().getWidth()-820,world.ycords+25);
    }
    
    public void add2(){
        this.setLocation(getWorld().getWidth()*3,world.ycords2+25);
    }
}
