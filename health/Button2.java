import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Button2 extends Actor
{
    private int buttonSwitch;
    public Button2(String text, int state, int size, int sizeX, int sizeY)
    {
        GreenfootImage buttonImage = getImage();
        buttonImage.scale(sizeX,sizeY);
        setImage(buttonImage);
        buttonImage.setColor(Color.WHITE);
        buttonImage.setFont(new Font("Calibri", true, false , size));
        buttonImage.drawString(text, 100, 250);
        this.buttonSwitch = state;
    }
    /**
     * Act - do whatever the Button2 wants to do. This method is called whenever
     * the 'Act' or 'Run' Button2 gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            switch(buttonSwitch){
                case 2:
                    Greenfoot.setWorld(new doctor());
            }
        }
    }
}
