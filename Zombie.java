import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Zombie
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Zombie extends E5
{
    GifImage corr1 = new GifImage("zombie1.gif");
    /**
     * Act de clase
     */
    public void act() 
    {
        super.mueveEne(6,0);
        setImage(corr1.getCurrentImage());
    }    
}
