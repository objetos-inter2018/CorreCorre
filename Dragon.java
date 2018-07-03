import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dragon
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Dragon extends E3
{
    GifImage Dragon = new GifImage("dragon-1.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(7,0);
        setImage(Dragon.getCurrentImage());
    }    
}
