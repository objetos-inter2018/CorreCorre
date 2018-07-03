import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase hojas, sirven de ambientacion
 * 
 * @author (Carrizales Cerda Luis Angel) 
 * @version (version 1.1)
 */
public class Hojas extends Actor
{
    private int velCaida=10;
    /**
     * El método act se encarga de girar las hojas 
     */
    public void act()
    {
        turn(-5);
        setLocation( getX()+velCaida , getY()+ velCaida );
        World mundo=getWorld();
        if(getY()>=getWorld().getHeight()-10 ||  getX()>=getWorld().getWidth()-10 ){
            mundo.removeObject(this);
        }
        
    }  
}
