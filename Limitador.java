import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Limitador agrega movimiento a los limitadores
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Limitador extends Actor
{
    /**
     * Act de Limitador
     */
    public void act() 
    {
       
        
        move(6);
        mueveLim();
    }    
    
    /**
     * movimiento del limitador
     * al llegar a uno de los extremos del escenario rebotara
     * 
     */
    public void mueveLim(){
      World mundo= getWorld();
      if(Greenfoot.getRandomNumber(100)<10){
         turn(Greenfoot.getRandomNumber(50)); 
      }
      if((getY()>=mundo.getHeight()-5)||((getY()<=5)) ||((getX()<=5))|| ((getX()>=mundo.getWidth()-5)) ){
       turn(Greenfoot.getRandomNumber(90));  
      }
      
    }     
    
}
