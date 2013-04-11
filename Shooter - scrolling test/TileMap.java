import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.awt.*;
import java.util.Iterator;
import java.util.*;
import java.awt.Image;
import java.util.LinkedList;
import java.util.Iterator;
import java.net.*;
import java.lang.String.*;

import java.util.ArrayList;
/**
 * Write a description of class MapCreation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*public class TileMap extends World
{
    /*public TileMap()
    {    

        //super(600, 400, 1); 
    }

      Enemy enemy = new Enemy();  
    

    private Image[][] tiles;
    private LinkedList sprites;
    private Player player;
 

    /**
        Creates a new TileMap with the specified width and
        height (in number of tiles) of the map.
    
    public TileMap(int width, int height) {
            //tiles = new Image[width][height];
            super(width,height,1);

    }


public void act(){
    loadMap();
}

    
    private TileMap loadMap() throws IOException {
try{
    ArrayList lines = new ArrayList();
    int width = 0;
    int height = 0;
    URL path = getClass().getClassLoader().getResource("scores.txt"); 
    // read every line in the text file into the list
    InputStream stream = path.openStream();
    BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
    while (true) {
        String line = reader.readLine();
        // no more lines to read
        if (line == null) {
            reader.close();
            break;
        }

        // add every line except for comments
        if (!line.startsWith("#")) {
            lines.add(line);
            width = Math.max(width, line.length());
        }
    }
System.out.println(lines);
    // parse the lines to create a TileEngine
    height = lines.size();
    TileMap newMap = new TileMap(width, height);
    for (int y=0; y<height; y++) {
        String line = (String)lines.get(y);
        for (int x=0; x<line.length(); x++) {
            char ch = line.charAt(x);

            // check if the char represents tile A, B, C, etc.
            int tile = ch - 'A';
            if (tile >= 0 && tile < getWidth()/*tiles.size()) {
                //newMap.setTile(x, y, (Image)tiles.get(tile));
            }

            // check if the char represents a sprite
            else if (ch == 'o') {
                    addObject(enemy,x,y);
                
            }
            else if (ch == '!') {
                //addSprite(newMap, musicSprite, x, y);
            }
            else if (ch == '*') {
                //addSprite(newMap, goalSprite, x, y);
            }
            else if (ch == '1') {
                //addSprite(newMap, grubSprite, x, y);
            }
            else if (ch == '2') {
                //addSprite(newMap, flySprite, x, y);
            }
        }
    }

    // add the player to the map
    //Sprite player = (Sprite)playerSprite.clone();
    //player.setX(TileMapRenderer.tilesToPixels(3));
    //player.setY(0);
    //newMap.setPlayer(player);

    return newMap;
}
catch(IOException ex){}
}

    
}*/
