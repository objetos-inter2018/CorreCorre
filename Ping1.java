import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ping1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Ping1 extends E1
{
    GifImage Ping1 = new GifImage("pin1.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(5,0);
        setImage(Ping1.getCurrentImage());
    }    
}
