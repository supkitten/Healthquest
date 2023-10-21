import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class text extends Actor
{
    public text(String txt, int size, int sizeX, int sizeY){
        GreenfootImage textImage = getImage();
        textImage.scale(sizeX,sizeY);
        textImage.setColor(Color.BLACK);
        textImage.setFont(new Font("Calibri", true, false , size));
        textImage.drawString(txt, 0, 75);
    }
}