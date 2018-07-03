import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Fuego sirve de ambientacion
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Fuego extends Actor
{
    private int velCaida=8;
    /**
     * El método act se encarga de elevar fuego
     */
    public void act()
    {
        
        setLocation( getX() , getY()- velCaida );
        World mundo=getWorld();
        if(getY()==0){
            mundo.removeObject(this);
        }
        
    }  
}
