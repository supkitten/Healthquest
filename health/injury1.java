import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class injury1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class injury1 extends World
{
    public static int oneOutOfTen = 0;
    /**
     * Constructor for objects of class injury1.
     * 
     */
    public injury1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        
        text text = new text("Select where on your body it hurts:", 50, 600, 100);
        addObject(text,500,100);
        BoxButton boxButton = new BoxButton("  Hand", 3, 30, 250, 100);
        addObject(boxButton,250,300);
        BoxButton boxButton1 = new BoxButton("     Arm", 4, 30, 250, 100);
        addObject(boxButton1,500,300);
        BoxButton boxButton2 = new BoxButton("    Feet", 5, 30, 250, 100);
        addObject(boxButton2,750,300);
        BoxButton boxButton3 = new BoxButton("      Leg", 6, 30, 250, 100);
        addObject(boxButton3,250,400);
        BoxButton boxButton4 = new BoxButton("Upper body", 7, 30, 275, 100);
        addObject(boxButton4,500,400);
        BoxButton boxButton5 = new BoxButton("Lower Body", 8, 30, 275, 100);
        addObject(boxButton5,750,400);
        BoxButton boxButton6 = new BoxButton("  Back / Spine", 9, 25, 290, 100);
        addObject(boxButton6,250,500);
        BoxButton boxButton7 = new BoxButton("Head / Neck", 10, 30, 270, 100);
        addObject(boxButton7,500,500);
        BoxButton boxButton8 = new BoxButton("      Genitalia", 11, 25, 290, 100);
        addObject(boxButton8,750,500);
    }
    
    public void act(){
        if (oneOutOfTen > 9){
            oneOutOfTen = 9;
        }
    }
}
