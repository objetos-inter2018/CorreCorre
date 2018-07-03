import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Egip2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Egip2 extends E2
{
    GifImage corr1 = new GifImage("egip2.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(3,0);
        setImage(corr1.getCurrentImage());
    }    
}
