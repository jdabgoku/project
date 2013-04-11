import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
//import java.util.*;


public class Player extends Wanderer
{

    private int speed = 3;  //speed the player moves
    private int vSpeed = 0; //vertical velocity
    private int acceleration = 1; //vetical acceleration
    private int mx = 0; //mouse x
    private int my = 0; //mouse y
    private int jumpStrength = 15;
    MouseInfo mouse = Greenfoot.getMouseInfo(); //gets mouse info
    private int gunReloadTime; //minimum delay between firing the gun
    private int reloadDelayCount; //how long ago we fired the gun the last time
    private int shotsFired; //number of shots fired
    
    private int jumpReloadTime; //amount of time you must wait before you can jump again
    private int reloadDelayCount2; //for jump
    private int jumps; //# of jumps

    private String imageL;
    public String imageR;
    
    public Player()
    {
        gunReloadTime = 30;
        reloadDelayCount = 0;
        shotsFired = 0;
        
        jumpReloadTime = 30;
        reloadDelayCount2 = 0;
        jumps = 0;
        

        
        //JPreloadtime = 10000;
        //JPdelayCount = 0;
    }


    
    public void act()  //main function, goes through all of the ones inside of it
    {   
        checkKeys(); 
        detectHealth(); //detects players health (to see if it is 0)
        checkFall();
        checkWall();
 
        //JPdelayCount++;

        //checkGoal();
       reloadDelayCount++; //adds 1
       reloadDelayCount2++;

    }    


    
    public void checkKeys()
    {
        if("q".equals(Greenfoot.getKey())){SwitchWeapons();}
        if(Greenfoot.isKeyDown("a")){ moveLeft();} else{ world.scrolling = false; world.image=0;}
        if(Greenfoot.isKeyDown("d")){moveRight();}
        if(Greenfoot.isKeyDown("w")){jetPack(); world.jetpackOn= true;} else{world.jetpackOn = false;}
        if(Greenfoot.mouseClicked(null)){shoot();}
        if("space".equals(Greenfoot.getKey())){jump();}
    }
    

    
    public void SwitchWeapons(){
        if(world.weapon == 0)
        {
            world.weapon=1;
            //add rocket launcher object
            
        }
        
        else{//(weapon == 1)
        
            world.weapon=0;
            //delete rocket launcher object 
        }
     }
    

    
    public void moveLeft()
    {
        if(getX()>300)
        {
            setImage("l.gif");
            imageL = getImage().toString();
            setLocation(getX()-speed,getY());
            world.scrolling=false;
        }
        else{
        setImage("l.gif"); //sets left image
        imageL = getImage().toString();
        world.scrolling = true;
        world.image = 1;}
        //setLocation ( getX() - speed, getY());
    }
    
    
    
    public void moveRight()
    {
        if(getX()<500){
            setImage("r.gif");
            imageR = getImage().toString();
            world.scrolling = false;
            setLocation(getX()+speed,getY());
            
        }
        else{
        setImage("r.gif"); //sets right image
        imageR = getImage().toString();
        world.scrolling = true;
        world.image = 2; }
        
    }
    
    
    
    public void jetPack()
    {
        //setImage("j.gif"); will be the jetpack image
        //setLocation(getX(), getY() - vSpeed);
        //if(JPdelayCount >= JPreloadtime){
        if(world.JetPack > 1)
        {
            setImage("rjp.gif");
            if( Greenfoot.isKeyDown("a")){ 
                    setImage("ljp.gif");
                    //world.JetPack = world.JetPack - 1;
              }
            if(Greenfoot.isKeyDown("d")){
                    setImage("rjp.gif");

                    //world.JetPack = world.JetPack - 1;
            }
        world.JetPack = world.JetPack - 0;
        setLocation(getX(),getY() -2);
        //vSpeed = -2;
        
        //fall();
        //checkFall();
 
        //else{}
        //JPdelayCount = 0;
        //}
    }
        else{}
    }
    
    
    
    public void shoot()
    { 
       
            if(world.weapon==0){
                if(reloadDelayCount >= gunReloadTime) 
                    {
        
        
        
                        mx = Greenfoot.getMouseInfo().getX();
                        my = Greenfoot.getMouseInfo().getY();
                        if(mx > getX()){   //if mouse on right side of actor, turns actor to right
                            setImage("r.gif");
                            Bullet bullet = new Bullet();
                            //if(my >= getY()-200) //doesn't allow you to shoot straight up
                            //{
                                   getWorld().addObject(bullet,getX()+25,getY()+5);
                                   bullet.turnTowards(mx,my);
                                   shotsFired++;
                                   reloadDelayCount = 0;
                            //}
                        }
                            
                        if(mx < getX())
                        {   //if mouse on right side of actor, turns actor to left?
                            setImage("l.gif");
                            Bullet bullet = new Bullet();
                            //if(my >= getY()-200) //doesn't allow you to shoot straight up
                            //{
                                   getWorld().addObject(bullet,getX()+25,getY()+5);
                                   bullet.turnTowards(mx,my);
                                   shotsFired++;
                                   reloadDelayCount = 0;
                            //}
                        
                        }  }
        }
                    if(world.weapon==1){
                    
                    
                if(reloadDelayCount >= gunReloadTime) 
                    {
        
        
        
                        mx = Greenfoot.getMouseInfo().getX();
                        my = Greenfoot.getMouseInfo().getY();
                        if(mx > getX()){   //if mouse on right side of actor, turns actor to right
                            setImage("r.gif");
                            RLBullet rlbullet = new RLBullet();
                            //if(my >= getY()-200) //doesn't allow you to shoot straight up
                            //{
                                   getWorld().addObject(rlbullet,getX()+25,getY()+5);
                                   rlbullet.turnTowards(mx,my);
                                   shotsFired++;
                                   reloadDelayCount = 0;
                            //}
                        }
                            
                        if(mx < getX())
                        {   //if mouse on right side of actor, turns actor to left?
                            setImage("l.gif");
                              RLBullet rlbullet = new RLBullet();
                            //if(my >= getY()-200) //doesn't allow you to shoot straight up
                            //{
                                   getWorld().addObject(rlbullet,getX()+25,getY()+5);
                                   rlbullet.turnTowards(mx,my);
                                   shotsFired++;
                                   reloadDelayCount = 0;
                            //}
                        
                        }
 
                    }
            
        
        }
    }
    
    
    
    public void jump()
    {
        if(reloadDelayCount2 >= jumpReloadTime) //whether they can jump again yet
        {
            if(Greenfoot.isKeyDown("w")){}
            else{
            vSpeed = -jumpStrength;
            fall();
            jumps++;
            reloadDelayCount2 = 0;}
        }
        
    }
    
    
    
    public void detectHealth()
    { 
            if(world.Phealth <= 0) //if player health reaches 0
            {

                try 
                {  
                    String string = "" + world.Score;  
                    BufferedWriter output = new BufferedWriter(new FileWriter("scores.txt")); //create the text file  
                    output.flush();  
                    output.write(string);   //out puts the score to a text file "score.txt"
                    output.newLine();  
                    output.close();  
                }  
                catch(Exception e) { }
                getWorld().removeObject(this); //remove player from world
                Greenfoot.setWorld(new Died()); //sets screen to DIED world/screen
                
                
            }

    }
    
    
    
    public void fall() //makes the player fall
    {
        //if(onGround() | onMoreGround())
        //{
        setLocation(getX(),getY() + vSpeed);
        if(vSpeed <10){
        vSpeed = vSpeed + acceleration; }
        //else{}
    }
    
    /*public void checkGoal()
    {
        if(onGoal())
        {
            /*if(getWorld() instanceof Campaign)
            {
                Greenfoot.setWorld(new Campaign2());
            }
            if(getWorld() instanceof Campaign2)
            {
                Greenfoot.setWorld(new Campaign3());
            }

        }*/
    

    
    
    public void checkFall()
    {
        if(onGround() | onMoreGround() |Greenfoot.isKeyDown("w") ) 
        {

            vSpeed = 0; //if on ground, sets vertical speed to 0
            //if(getImage()=="r.gif"){}
           //setImage("rjp.gif");
            /*if( Greenfoot.isKeyDown("a")){ 
                    setImage("ljp.gif");
                    //world.JetPack = world.JetPack - 1;
              }
            if(Greenfoot.isKeyDown("d")){
                    setImage("rjp.gif");

                    //world.JetPack = world.JetPack - 1;
            }*/
                          

        }
        else
        {
            fall(); //else it calls fall()
        }
    }
    
  
    
    public void checkWall() //checks if touching outside wall
    {
        if( onSideWall())
         {
             world.scrolling=false;
         }
         
    }

    public boolean onSideWall() //if on wall, returns true
    {

        //Actor under = getOneObjectAtOffset (getImage().getHeight(),getImage().getHeight(), GroundVertical.class);
        Actor under = getOneIntersectingObject (GroundVertical.class);
        return under != null;
    }
    
  
    
    public boolean onGround() //if on ground, returns true
    {
        Actor under = getOneObjectAtOffset (0,getImage().getHeight()/-35, Ground.class);
        //Actor under = getOneIntersectingObject (Ground.class);
        return under != null;
    }
    
    public boolean onMoreGround() //same as above, except different object
    {
        Actor under = getOneObjectAtOffset (0,getImage().getHeight()-35,MoreGround.class);
        //Actor under = getOneIntersectingObject (MoreGround.class);
        return under!=null;
    }
    


    

    

    

    

    

    

    

}
       

