import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * sets up the enemy class
 * very similar to the player class
 * uses the same kind of variable names (their private  to each class)
 */
public class Enemy extends Wanderer
{
    private int gunReloadTime;
    private int reloadDelayCount;
    private int shotsFire;
    
    public Enemy()
    {
        gunReloadTime = 100;
        reloadDelayCount = 0;
        shotsFire = 0;
    }
        
 
    public void act() 
    {
        detectHealth();
        shoot();
        move();
        reloadDelayCount++;
        detectHealth();
        

    }    
    
    public void detectHealth()
    { 
            if(world.Ehealth <= 0)
            {
 
                //Heli heli = new Heli();
                getWorld().removeObject(this);
                world.Ehealth = 10;
                world.Score = world.Score + 5;
            }
    }
    
    public void shoot()
    {
        if(reloadDelayCount >= gunReloadTime)
        {
            Player player = (Player) getWorld().getObjects(Player.class).get(0); 
            Ebullet ebullet = new Ebullet();
            getWorld().addObject(ebullet,getX(),getY());
            ebullet.turnTowards(player.getX(),player.getY()+2);
            shotsFire++;
            reloadDelayCount=0;
        }
        
    }

    public void move(){
        if(world.scrolling == true)
        {
            if(world.image == 1)
            {
                //imageCounter++;
                setLocation(getX()+world.speed, getY());
            }
            else if(world.image == 2)
            {
                //imageCounter++;
                setLocation(getX()-world.speed, getY());
            }
        }        
        
    }
 
}
