import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class BoxButton extends Actor
{
    private int buttonSwitch;
    public BoxButton(String text, int state, int size, int sizeX, int sizeY)
    {
        GreenfootImage buttonImage = getImage();
        buttonImage.scale(sizeX,sizeY);
        setImage(buttonImage);
        buttonImage.setColor(Color.BLACK);
        buttonImage.setFont(new Font("Calibri", true, false , size));
        buttonImage.drawString(text, 65, 60);
        this.buttonSwitch = state;
    }
    /**
     * Act - do whatever the BoxButton wants to do. This method is called whenever
     * the 'Act' or 'Run' BoxButton gets pressed in the environment.
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
