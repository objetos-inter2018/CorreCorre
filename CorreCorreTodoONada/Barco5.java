import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Barco5
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Barco5 extends E3
{
    GifImage Barco5 = new GifImage("barco5.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(4,0);
        setImage(Barco5.getCurrentImage());
    }    
}
