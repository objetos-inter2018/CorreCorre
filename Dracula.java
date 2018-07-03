import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dracula
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Dracula extends E2
{
    GifImage corr1 = new GifImage("dracula.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(6,0);
        setImage(corr1.getCurrentImage());
    }    
}
