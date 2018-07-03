import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Obstaculo4 modifica movimiento de obstaculo
 * 
 * @author (Carrizales Cerda Luis Angel) 
 * @version (version 1.1)
 */
public class Obs5 extends Obstaculo
{
    /**
     * Act de obs4
     */
    public void act() 
    {
        mueveObstaculo();
    } 
    
    /**
     * sobreescribe la clase mueveObstaculo de Obstaculo
     */
    @Override
    public void mueveObstaculo()
    {
        World mundo= getWorld();
     
       setLocation (getX(), getY()-7);
       if (getY()<=180)     
       {
           mundo.removeObject(this);
       }
    }
}
