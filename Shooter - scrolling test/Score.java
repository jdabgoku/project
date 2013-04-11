import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color; 

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Info
{
    GreenfootImage image;

    public Score()
    {
        image = new GreenfootImage(200, 50);
        update();
    }
    
    
    public void act() 
    {
        update();
    }   
    
    public void update()
    {
        image.clear();
        image.setColor(Color.YELLOW);
        image.setFont(new Font("Arial", 1, 20));
        image.drawString("Score: "+world.Score, 1, 20);
        setImage(image);
    }
}
