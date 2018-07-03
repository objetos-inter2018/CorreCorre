import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase abstracta de obstaculo, cada obstaculo modifica el movimiento de esta
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public abstract class Obstaculo extends Actor
{
    /**
     * mueve el obstaculo
     */
    public void mueveObstaculo(){
      World mundo= getWorld();
     
       setLocation (getX(), getY()-5);
       if (getY()<=180)     
       {
           mundo.removeObject(this);
       }
    }
}
