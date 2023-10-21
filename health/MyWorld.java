import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        text text = new text("DocLog", 100, 300, 100);
        addObject(text,500,50);
        button button = new button("Patient", 1, 100, 500, 500);
        addObject(button,250,450);
        Button2 button2 = new Button2("Doctor", 2, 100, 500, 500);
        addObject(button2,750,450);
    }
}
