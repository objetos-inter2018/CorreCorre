import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class E1 extends Normal
{
    
    /**
     * Mueve enemigo de arriba a abajo
     */
    public void mueveEne(int vEne, int giro){
      World mundo= getWorld();
       //arriba a abajo
          turn(giro);
        setLocation (getX(), getY()+vEne);
        if (getY()>=mundo.getHeight()-5)
         {
            mundo.removeObject(this);
            }
        
       
        }
}
