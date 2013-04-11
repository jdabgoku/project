import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
enemy bullet
 */
public class Ebullet extends Bullets
{
    public void act() 
    {
        //GreenfootImage img = new GreenfootImage("b.gif");
        move();
        checkwall();
        

    }   
    
    public void move()
    {
       
 
        
    
        move(15);

    }
    
 
    
    public void checkwall()
    {

        if(getX() == 0 || getX() == 799 || getY() == 0 || getY() == 599 || getOneIntersectingObject(MoreGround.class) !=null || getOneIntersectingObject(Player.class) !=null)
        {
            if(getOneIntersectingObject(Player.class) !=null)  //if the bullet hits the helicopter, it reduces the helicopters health by 5
            {
                world.Phealth = world.Phealth - 5;
            }
            getWorld().removeObject(this);
        }
    }

}
