import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rayo4 ambientacion
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Rayo4 extends Actor
{
    
    GifImage TF = new GifImage("rayo4.gif");
    
    private int velCaida=10;
    /**
     * El método act se encarga de agregar un gif de rayo4
     */
    public void act()
    {
       setImage(TF.getCurrentImage());
    }   
}
