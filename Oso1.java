import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Oso1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Oso1 extends E2
{
    GifImage corr1 = new GifImage("oso1.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(5,0);
        setImage(corr1.getCurrentImage());
    }    
}
