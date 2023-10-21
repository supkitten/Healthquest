import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class button extends Actor
{
    private int buttonSwitch;
    public button(String text, int state, int size, int sizeX, int sizeY)
    {
        GreenfootImage buttonImage = getImage();
        buttonImage.scale(sizeX,sizeY);
        setImage(buttonImage);
        buttonImage.setColor(Color.WHITE);
        buttonImage.setFont(new Font("Calibri", true, false , size));
        buttonImage.drawString(text, 10, 35);
        this.buttonSwitch = state;
    }
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            switch(buttonSwitch){
                case 1:
            }
        }
    }
}