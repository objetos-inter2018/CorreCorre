import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ping2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Ping2 extends E2
{
    GifImage corr1 = new GifImage("pin2.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(5,0);
        setImage(corr1.getCurrentImage());
    }    
}
