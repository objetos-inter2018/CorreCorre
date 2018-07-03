import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Santa
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Santa extends E3
{
    GifImage Santa = new GifImage("santa.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(5,0);
        setImage(Santa.getCurrentImage());
    }    
}
