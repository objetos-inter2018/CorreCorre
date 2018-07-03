import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Perro
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Perro extends E3
{
    GifImage Perro = new GifImage("perro.gif");
    
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(2,0);
        setImage(Perro.getCurrentImage());
    }    
}
