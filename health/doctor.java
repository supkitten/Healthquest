import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class doctor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class doctor extends World
{

    /**
     * Constructor for objects of class doctor.
     * 
     */
    public doctor()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        addObject(new map(),500,350);
    }
}
