import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * caballo
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class caballo extends E4
{
    GifImage corr1 = new GifImage("caballo.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(3,0);
        setImage(corr1.getCurrentImage());
    }    
}
