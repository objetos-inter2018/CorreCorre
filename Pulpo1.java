import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pulpo1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Pulpo1 extends E3
{
    GifImage Pulpo1 = new GifImage("pulpo1.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(1,0);
        setImage(Pulpo1.getCurrentImage());
    }    
}
