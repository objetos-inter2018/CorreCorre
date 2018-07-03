import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rayo1 ambientacion nivel 8
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Rayo1 extends Actor
{
    GifImage TF = new GifImage("rayo1.gif");
    
    private int velCaida=10;
    /**
     * El método act se encarga de agregar gif clase rayo1
     */
    public void act()
    {
       setImage(TF.getCurrentImage());
    }  
}
