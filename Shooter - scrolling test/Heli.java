import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
enemy/player/heli classes very similar
enemy/heli just not controllable by the player
 */
public class Heli extends Wanderer
{
    private int gunReloadTime;
    private int reloadDelayCount;
    private int shotsFire;
    
    public Heli()
    {
        gunReloadTime = 50;
        reloadDelayCount = 0;
        shotsFire = 0;

    }
    
    public void act() 
    {
        MoveToPlayer();
        shoot();
        detectHealth();
        reloadDelayCount++;
    }   
    
    public void MoveToPlayer()
    {
        Player player = (Player) getWorld().getObjects(Player.class).get(0); 
        Heli heli = (Heli) getWorld().getObjects(Heli.class).get(0); 

        if(player.getX()<heli.getX()) {
            heli.setImage("HL.gif");
        }

        if(player.getX()>getX()){
            heli.setImage("HR.gif");
           }
        if(player.getX()+150<heli.getX()) {
            setLocation(getX()-1,getY());
        }
        if(player.getX()-150>heli.getX()) {
            setLocation(getX()+1,getY());

        }

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
        
        //setLocation(player.getX()+20,getY());


        //turnTowards(player.getX(),player.getY());
        
    }
    public void shoot()
    {
        if(reloadDelayCount >= gunReloadTime)
        {
            Player player = (Player) getWorld().getObjects(Player.class).get(0); 
            Hbullet hbullet = new Hbullet();
            Heli heli = (Heli) getWorld().getObjects(Heli.class).get(0); 
        if(player.getX()<heli.getX()) {
           getWorld().addObject(hbullet,getX()-40,getY()+35);   
        }
        if(player.getX()>heli.getX()) {
           getWorld().addObject(hbullet,getX()+40,getY()+35);
        }
 
            hbullet.turnTowards(player.getX(),player.getY()+2);
            shotsFire++;
            reloadDelayCount=0;
        }
        
    }
    
    public void detectHealth()
    { 
            if(world.Hhealth <= 0)
            {
                getWorld().removeObject(this);
                world.Hhealth = 20;
                world.Score = world.Score + 10;
            }
    }
  
}
