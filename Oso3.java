import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Oso3
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Oso3 extends E3
{
    GifImage Oso3 = new GifImage("oso3.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(5,0);
        setImage(Oso3.getCurrentImage());
    }    
}
