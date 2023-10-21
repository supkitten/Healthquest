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
        buttonImage.drawString(text, 60, 60);
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
                    Greenfoot.setWorld(new injury1());
                    break;
                case 2:
                    Greenfoot.setWorld(new disease1());
                    break;
                case 3:
                    disease1.oneOutOfTen += 1;
                    break;
                case 4:
                    disease1.oneOutOfTen += 1;
                    break;
                case 5:
                    disease1.oneOutOfTen += 1;
                    break;
                case 6:
                    disease1.oneOutOfTen += 1;
                    break;
                case 7:
                    disease1.oneOutOfTen += 1;
                    break;
                case 8:
                    disease1.oneOutOfTen += 1;
                    break;
                case 9:
                    disease1.oneOutOfTen += 1;
                    break;
                case 10:
                    disease1.oneOutOfTen += 1;
                    break;
                case 11:
                    disease1.oneOutOfTen += 1;
                    break;
                case 12:
                    disease1.oneOutOfTen += 1;
                    break;  
            }
        }
    }
}
