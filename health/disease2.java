import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class disease2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class disease2 extends World
{
    int waitingTime = 60;
    /**
     * Constructor for objects of class disease2.
     * 
     */
    public disease2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        if (disease1.oneOutOfTen == 0){
            waitingTime -= 0;
        }
        if (disease1.oneOutOfTen == 1){
            waitingTime -= 5;
        }
        if (disease1.oneOutOfTen == 2){
            waitingTime -= 10;
        }
        if (disease1.oneOutOfTen == 3){
            waitingTime -= 15;
        }
        if (disease1.oneOutOfTen == 4){
            waitingTime -= 20;
        }
        if (disease1.oneOutOfTen == 5){
            waitingTime -= 25;
        }
        if (disease1.oneOutOfTen == 6){
            waitingTime -= 30;
        }
        if (disease1.oneOutOfTen == 7){
            waitingTime -= 35;
        }
        if (disease1.oneOutOfTen == 8){
            waitingTime -= 40;
        }
        if (disease1.oneOutOfTen == 9){
            waitingTime -= 45;
        }
        if (disease1.oneOutOfTen == 10){
            waitingTime -= 50;
        }
        showText("estimated waiting time: " + waitingTime, 150,50);
    }
    public void act(){

    }
}
