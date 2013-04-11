import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health  extends Info
{
    private GreenfootImage image;
    private final Color fillColor = new Color(140, 15, 15);
    private final Font font = new Font("Verdana", 1, 18);
    
    public Health()
    {
        image = new GreenfootImage(193, 20);
        baseImage();
        updateImage();
    }
    
    
    public void act() 
    {
        baseImage();
        updateImage();
    } 
    
    public void updateImage()
    {
        image.setColor(fillColor);
        image.fillRect(82, 2, world.Phealth, 17);
        setImage(image);
    }
    
    public void baseImage()
    {
        image.clear();
        image.setColor(Color.WHITE);
        image.drawRect(81, 1, 101, 18);
        image.setColor(Color.GRAY);
        image.fillRect(82, 2, 100, 17);
        image.setColor(Color.WHITE);
        image.setFont(font);
        image.drawString("Health:", 1, 17);
    }
}