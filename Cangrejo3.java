import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Cangrejo3
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Cangrejo3 extends E3
{
    GifImage Cangrejo3 = new GifImage("cangrejo3.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(4,0);
        setImage(Cangrejo3.getCurrentImage());
    }    
}
