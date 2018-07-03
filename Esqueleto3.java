import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esqueleto3
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Esqueleto3 extends E3
{
    GifImage Esqueleto3 = new GifImage("esqueleto3.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(6,0);
        setImage(Esqueleto3.getCurrentImage());
    }    
}
