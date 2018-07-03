import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rayo 2 ambientacion nivel 8
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Rayo2 extends Actor
{
    GifImage TF = new GifImage("rayo2.gif");
    
    private int velCaida=10;
    /**
     * El método act se encarga de agregar gif de rayo2
     */
    public void act()
    {
       setImage(TF.getCurrentImage());
    }  
}
