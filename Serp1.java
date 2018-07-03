import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Serp1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Serp1 extends E1
{
    GifImage Serp1 = new GifImage("serp1.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(3,0);
        setImage(Serp1.getCurrentImage());
    }    
}
