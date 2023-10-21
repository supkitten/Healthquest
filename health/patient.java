import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class patient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class patient extends World
{

    /**
     * Constructor for objects of class patient.
     * 
     */
    public patient()
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
        BoxButton boxButton = new BoxButton("Injury", 3, 30, 200, 100);
        addObject(boxButton,237,353);
        BoxButton boxButton1 = new BoxButton("Disease", 3, 30, 200, 100);
        addObject(boxButton1,237,353);
    }
}
