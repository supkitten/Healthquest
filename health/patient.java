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
        BoxButton boxButton = new BoxButton("Injury", 1, 30, 200, 100);
        addObject(boxButton,250,353);
        BoxButton boxButton1 = new BoxButton("Disease", 2, 30, 200, 100);
        addObject(boxButton1,750,353);
        text text = new text("What type of problem?", 50, 500, 100);
        addObject(text,520,100);
    }
}
