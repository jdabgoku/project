import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround extends Wanderer
{
    /**
     * Act - do whatever the BackGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int image = 0;
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
        if( image == 0 && getX() < 0 | getX() > 800)
        {
            setImage("halfbackgroundshooter.jpg");
            image = 1;
        }
        if( image == 1 && getX() <-50 | getX() > 800){
            setImage("invisible.gif");
        }
        else{setImage("backgroundshooter.jpg");}
        
    }
}
