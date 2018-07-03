import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moltres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moltres extends E8
{
    GifImage corr1 = new GifImage("moltres.gif");
    /**
     * Act - do whatever the Pez1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.mueveEne(7,0);
        setImage(corr1.getCurrentImage());
    }    
}
