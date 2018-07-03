import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Momia2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Momia2 extends E1
{
    GifImage Momia2 = new GifImage("momia2.gif");
    /**
     * Act - do whatever the Momia2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.mueveEne(6,0);
        setImage(Momia2.getCurrentImage());
    }    
}
