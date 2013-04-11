import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//second level

public class World2 extends World
{

    Player player = new Player();
    Bullet bullet =new Bullet();
    Ground ground = new Ground();
    Health health = new Health();
    Score score = new Score();

    Enemy enemy = new Enemy();
    public World2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(player,20,540);
        addObject(ground,400,600);
        addObject(enemy,760,540);
        addObject(health,710,15);
        addObject(score,610,27);
    }
}
