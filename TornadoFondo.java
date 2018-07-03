import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TornadoFondo ambientacion nivel 8
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class TornadoFondo extends Actor
{
    GifImage TF = new GifImage("tornadoFondo.gif");
    
    private int velCaida=10;
    /**
     * El método act se encarga de agregar gif tornadoFondo
     */
    public void act()
    {
       setImage(TF.getCurrentImage());
    }  
}
