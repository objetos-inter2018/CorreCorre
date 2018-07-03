import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bruce
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Bruce extends E1
{
    GifImage Bruce = new GifImage("bruce.gif");
    /**
     * Act - do whatever the Bruce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.mueveEne(4,0);
        setImage(Bruce.getCurrentImage());
    }    
}
