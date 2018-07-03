import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * carro2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class carro2 extends E2
{
    GifImage corr1 = new GifImage("c2.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(2,0);
        setImage(corr1.getCurrentImage());
    }    
}
