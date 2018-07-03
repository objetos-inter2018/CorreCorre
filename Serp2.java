import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo8
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Serp2 extends E5
{
    GifImage corr1 = new GifImage("serp2.gif");
    /**
     * Act - do whatever the Pez1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.mueveEne(3,0);
        setImage(corr1.getCurrentImage());
    }    
}
