import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fenix
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Fenix extends E1
{
    GifImage Fenix = new GifImage("fenix.gif");
    /**
     * Act de
     */
    public void act() 
    {
        super.mueveEne(7,0);
        setImage(Fenix.getCurrentImage());
    }    
}
