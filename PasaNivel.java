import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase de PasaNivel
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class PasaNivel extends Actor
{
    /**
     * actua de PasaNivel
     */
    public void act() 
    {
        move(20);
        muevePasN();
    }    
    
    /**
     * movimiento de PasaNivel
     * toma los limites de los niveles para cambiar la direccion
     */
    public void muevePasN(){
      World mundo= getWorld();
      if(Greenfoot.getRandomNumber(100)<10){
         turn(Greenfoot.getRandomNumber(50)); 
      }
      if((getY()>=mundo.getHeight()-5)||((getY()<=5)) ||((getX()<=5))|| ((getX()>=mundo.getWidth()-5)) ){
       turn(Greenfoot.getRandomNumber(90));  
      }
      
    }   
}
