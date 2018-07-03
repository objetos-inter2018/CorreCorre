import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * bailador1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class bailador1 extends E3
{
    GifImage bailador1 = new GifImage("bailador1.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(6,0);
        setImage(bailador1.getCurrentImage());
    }    
}
