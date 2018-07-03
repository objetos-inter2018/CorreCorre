import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Pizza 
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Pizza extends Km
{
    /**
     * Act de nivel pizza
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
         move(7);
        mueveLim();
    }    
    
    /**
     * Movimiento Limitador
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
