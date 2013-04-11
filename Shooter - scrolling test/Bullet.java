import greenfoot.*;
import greenfoot.MouseInfo.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
ALL BULLET OBJECTS ARE PRACTICALLY THE SAME EXCEPT FOR SOME VARIANCES
LIKE DETECTING PLAYER INSTEAD OF ENEMY, ETC
This is the player's bullet
 */
public class Bullet extends Bullets
{
    MouseInfo mouse = Greenfoot.getMouseInfo();


    public void act() 
    {
        move();
        checkenemy(); //if it hits an enemy, the bullet gets deleted NOT WORKING YET DUE TO ERRORS should be easy to fix
        checkwall(); //checks if it hits the wall (if so, deletes the object)
        

    }   
    
    public void move()
    {
       
 
        
    
        move(15);

    }
    
    public void checkenemy()
    {
        if(getOneIntersectingObject(Enemy.class) !=null)
        {
    
            //getWorld().removeObject(this);
            
        }
        }
    
    public void checkwall() //checks to see if it hits any of these, if so removes the bullet from the world
    {

        if(getX() == 0 || getX() == 799 || getY() == 0 || getY() == 599 || getOneIntersectingObject(Heli.class) !=null || getOneIntersectingObject(MoreGround.class) !=null || getOneIntersectingObject(Enemy.class) !=null)
        {
            if(getOneIntersectingObject(Heli.class) !=null)  //if the bullet hits the helicopter, it reduces the helicopters health by 5
            {
                world.Hhealth = world.Hhealth - 5;
            }
            
            if(getOneIntersectingObject(Enemy.class) !=null) //same but for enemy
            {
                world.Ehealth = world.Ehealth - 5;
            }
            
            getWorld().removeObject(this); //IF ANY of those return true, the bullet is removed fromt the world
        }
    }

}
