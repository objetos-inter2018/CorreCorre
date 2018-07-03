import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tiburon2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Tiburon2 extends E5
{
    GifImage corr1 = new GifImage("tiburon2.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(4,0);
        setImage(corr1.getCurrentImage());
    }    
}
