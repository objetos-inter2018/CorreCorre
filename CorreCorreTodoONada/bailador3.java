import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * bailador3
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class bailador3 extends E6
{   
    GifImage corr1 = new GifImage("bailador3.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(7,0);
        setImage(corr1.getCurrentImage());
    }    
}
