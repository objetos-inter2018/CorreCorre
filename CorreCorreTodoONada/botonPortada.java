import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase de Boton Portada
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class botonPortada extends Actor
{
    GifImage inicia = new GifImage("inicia.gif");
    //x 8333   y 633
    
    /**
     * Actua de BotonPortada (Crea un boton con gif)
     */
    public void act() 
    {
        // Add your action code here.
        setImage(inicia.getCurrentImage());
        
    }        
}
