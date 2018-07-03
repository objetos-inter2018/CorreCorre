import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Camion
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Camion extends E1
{
    GifImage Camion = new GifImage("camion.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(3,0);
        setImage(Camion.getCurrentImage());
    }    
}
