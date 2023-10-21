import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class map extends Actor
{
    /**
     * Act - do whatever the map wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public map(){
        GreenfootImage map = getImage();
        map.scale(1000,700);
        setImage(map);
    }
}
