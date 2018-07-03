import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * bailador6
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class bailador6 extends E6
{   
    GifImage corr1 = new GifImage("bailador6.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(2,0);
        setImage(corr1.getCurrentImage());
    }    
}
