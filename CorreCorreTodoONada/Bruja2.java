import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bruja2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Bruja2 extends E3
{
    GifImage Bruja2 = new GifImage("bruja2.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(6,0);
        setImage(Bruja2.getCurrentImage());
    }    
}
