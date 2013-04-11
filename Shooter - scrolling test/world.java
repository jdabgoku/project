import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//the First level you see when you hit the start campaign button (blue circle for now)
public class world extends World
{
    BackGround background = new BackGround();
    Player player = new Player();  //player object
    Bullet bullet =new Bullet(); //bullet object
    Ground ground = new Ground();
    MoreGround ground2 = new MoreGround(); 
    Enemy enemy = new Enemy();
    Heli heli = new Heli();
    Health health = new Health();
    Score score = new Score();
    JetPack jetpack = new JetPack();
    CurrentWeapon weaponn = new CurrentWeapon();
    public static int Hhealth = 15; //helicopter3
    
    //public Hhealth [] HeliHealthArray;
    
    
    public static int Ehealth = 5; //enemy
    public static int Phealth = 100; //player
    public static int Score = 0; //sets score to 0
    public static int JetPack = 100;
    public static int weapon = 0; //which weapon is currently being used
    public static boolean scrolling = false;
    public static int image = 2; //which image the player is current using(left or right)
    public static boolean jetpackOn = false;  //whether the jetpack is currently active
    public static int speed = 3; //speed at which objects move
    public static boolean addedGround = false; //if 1 stops running addGround() in world.act()
    public static int xcords = 0; ////the x-cordinates for MoreGround
    public static int ycords = 0;
    public static int ycords2 = 0;
    
    public world()
    {    
        super(800, 600, 1); 

        int k = 100;
        for(int i = 0; i<4;i++){

            addObject(new BackGround(),k,300);
            k += 200;
        }
        
        addObject(new Ground(),5,getHeight()-5);
        addObject(new Ground(),790,getHeight()-5);
        addObject(player,400,400);
        addObject(health,710,15);
        addObject(score,610,27);
        addObject(jetpack,310,15);
        addObject(weaponn,610,57); //shows which weapon is currently being used

    }
    
    public void act(){
                addGround(); //adds the ground to the world
            }
            
    public void addGround(){
        if(world.addedGround == false)
        {
            for(int i=0;i<48;i++){  //bottom ground
                MoreGround ground = new MoreGround();
                addObject(ground,0,getHeight()); //these cordinates do not matter
                ground.add();
                world.xcords += 50;

            }
            
            for(int i = 0;i<12;i++){ //left side wall
                GroundVertical gVert = new GroundVertical();
                addObject(gVert,0,0);
                gVert.add();
                world.ycords += 50;
            }
            
            for(int i = 0; i < 12;i++){
                GroundVertical gVert = new GroundVertical();
                addObject(gVert,0,0);
                gVert.add2();
                world.ycords2+=50;
                
            }
            
        /*    for(int i=0;i<50;i++){ //other
            MoreGround ground = new MoreGround();
            addObject(ground,0,getHeight()); //these cordinates do not matter
            ground.add2();
            world.xcords += 36;
            }*/
        }
        
        world.addedGround = true;
        
        
    }
    

    
    
    
    
    
    
    
}
