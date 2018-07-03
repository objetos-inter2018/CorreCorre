import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Gato1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Gato1 extends E1
{
    GifImage Gato1 = new GifImage("gato1.gif");
    /**
     * Act - do whatever the Gato1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.mueveEne(6,0);
        setImage(Gato1.getCurrentImage());
    }    
}
