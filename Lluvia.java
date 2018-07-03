import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Lluvia, ambientacion nivel 8
 * 
 * @author (Carrizales Cerda Luis Angel) 
 * @version (version 1.1)
 */
public class Lluvia extends Actor
{
    
    private int velCaida=10;
    /**
     * El método act se encarga de mover la lluvia y desaparecerla
     */
    public void act()
    {
       
        setLocation( getX()-velCaida , getY()+ velCaida );
        World mundo=getWorld();
        if(getY()>=getWorld().getHeight()-10 ||  getX()<=10){
            mundo.removeObject(this);
        }
        
    }  
}
