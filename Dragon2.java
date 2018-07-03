import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dragon2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Dragon2 extends E5
{
    GifImage corr1 = new GifImage("dragon2.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(7,0);
        setImage(corr1.getCurrentImage());
    }    
}
