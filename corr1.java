import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * corr1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class corr1 extends E3
{
    GifImage corr1 = new GifImage("corr1.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(1,0);
        setImage(corr1.getCurrentImage());
    }    
}
