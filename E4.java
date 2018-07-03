import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo4
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class E4 extends Normal
{
    /**
     * mueve enemigo de izquierda a derecha
     */
    public void mueveEne(int vEne, int giro){
      World mundo= getWorld();
      
       turn(giro);
       setLocation (getX()+vEne, getY());// izquierda a derecha
       if (getX()>=mundo.getWidth()-5)
        {
           mundo.removeObject(this);
        }
                       
                    
        }
}
