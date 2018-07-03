import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tiburon3
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Tiburon3 extends E3
{
    GifImage Tiburon3 = new GifImage("tiburon3.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(4,0);
        setImage(Tiburon3.getCurrentImage());
    }    
}
