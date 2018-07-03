import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ojo
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Ojo extends E6
{   
    GifImage corr1 = new GifImage("ojo.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(1,0);
        setImage(corr1.getCurrentImage());
    }    
}
