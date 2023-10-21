import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class disease1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class disease1 extends World
{
    public static int oneOutOfTen = 0;
    /**
     * Constructor for objects of class disease1.
     * 
     */
    public disease1()
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
        text text = new text("Select Your Symptoms:", 50, 475, 100);
        addObject(text,500,100);
        BoxButton boxButton = new BoxButton("Fever", 3, 30, 200, 100);
        addObject(boxButton,250,300);
        BoxButton boxButton1 = new BoxButton("Coughing", 4, 30, 250, 100);
        addObject(boxButton1,500,300);
        BoxButton boxButton2 = new BoxButton("Diarrhea", 5, 30, 250, 100);
        addObject(boxButton2,750,300);
        BoxButton boxButton3 = new BoxButton("Headache", 6, 30, 250, 100);
        addObject(boxButton3,250,400);
        BoxButton boxButton4 = new BoxButton("Nausea", 7, 30, 210, 100);
        addObject(boxButton4,500,400);
        BoxButton boxButton5 = new BoxButton("Chills", 8, 30, 210, 100);
        addObject(boxButton5,750,400);
        BoxButton boxButton6 = new BoxButton("Shortness of Breath", 9, 20, 290, 100);
        addObject(boxButton6,250,500);
        BoxButton boxButton7 = new BoxButton("Sore Throat", 10, 30, 270, 100);
        addObject(boxButton7,500,500);
        BoxButton boxButton8 = new BoxButton("Loss of Appetite", 11, 25, 290, 100);
        addObject(boxButton8,750,500);
        BoxButton boxButton9 = new BoxButton("Visible Changes on Body", 12, 17, 300, 100);
        addObject(boxButton9,500,600);
    }
    public void act(){
        showText("scale: " + oneOutOfTen, 800,200);
    }
}
