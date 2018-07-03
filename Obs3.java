import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Obs3 modifica movimiento de obstaculo 3
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Obs3 extends Obstaculo
{
    /**
     * Act de obs 3
     */
    public void act() 
    {
        mueveObstaculo();
    }    
    
    /**
     * sobreescribe la clase mueve obstaculo 
     */
    @Override
    public void mueveObstaculo()
    {
        World mundo= getWorld();
     
       setLocation (getX(), getY()-3);
       if (getY()<=180)     
       {
           mundo.removeObject(this);
       }
    }
}
