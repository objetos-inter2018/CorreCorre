import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bici2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Bici2 extends E4
{
    GifImage corr1 = new GifImage("b2.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(2,0);
        setImage(corr1.getCurrentImage());
    }    
}
