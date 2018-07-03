import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Rayo3 ambientacion
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Rayo3 extends Actor
{
    GifImage TF = new GifImage("rayo3.gif");
    
    private int velCaida=10;
    /**
     * El método act se encarga de crear un gif de rayo3
     */
    public void act()
    {
       setImage(TF.getCurrentImage());
    }  
}
