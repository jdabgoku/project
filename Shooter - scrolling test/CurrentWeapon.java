import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color; 

public class CurrentWeapon extends Info
{
    GreenfootImage image;
    String weaponn = "";
    public CurrentWeapon()
    {
        image = new GreenfootImage(255, 50);
        update();
    }
    
    
    public void act() 
    {
        update();
        checkWeapon();
    }   
    
    public void checkWeapon()
    {
        if(world.weapon == 0){weaponn="Pistol";}
        
        else{weaponn="Rocket Launcher";}
    }
    
  
    
    public void update()
    {
        image.clear();
        image.setColor(Color.YELLOW);
        image.setFont(new Font("Arial", 1, 20));
        image.drawString("Weapon: "+weaponn, 1, 20);
        setImage(image);
    }
}
