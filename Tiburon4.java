import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tiburon4
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Tiburon4 extends E2
{
    GifImage corr1 = new GifImage("tiburon4.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(1,0);
        setImage(corr1.getCurrentImage());
    }    
}
