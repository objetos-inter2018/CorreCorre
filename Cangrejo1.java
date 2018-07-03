import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Cangrejo1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Cangrejo1 extends E2
{
    GifImage corr1 = new GifImage("cangrejo1.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(4,0);
        setImage(corr1.getCurrentImage());
    }    
}
