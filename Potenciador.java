import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Potenciador agrega movimiento a potenciador
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public abstract class Potenciador extends Actor
{
    
    /**
     * Constructor
     */
    
    public void Potenciador(){
    
        
    }
    
    /**
     * actua de Potenciador, movimiento de potenciador
     */
    public void act() 
    {
       
        move(7);
        muevePot();
        
    }    
    
    /**
     * movimiento del potenciador 
     * al llegar a uno de los extremos del escenario rebotara
     */
    public void muevePot(){
      World mundo= getWorld();
      if(Greenfoot.getRandomNumber(100)<10){
         turn(Greenfoot.getRandomNumber(50)); 
      }
      if((getY()>=mundo.getHeight()-5)||((getY()<=5)) ||((getX()<=5))|| ((getX()>=mundo.getWidth()-5)) ){
       turn(Greenfoot.getRandomNumber(90));  
      }
      
    }   
    
}
