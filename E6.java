import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo6
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class E6 extends Normal
{
    /**
     * mueve enemigo de izquierda a derecha descendente
     */
    public void mueveEne(int vEne, int giro){
      World mundo= getWorld();
      turn(giro);
      setLocation (getX()+vEne, getY()+vEne);
      //cruuzado de derecha a izquierda desaparece abajo o en 
      //extremo izquierdo
       if (getX()>=mundo.getWidth()-5 || getY()>=mundo.getHeight()-5)
       {
          mundo.removeObject(this);
       }
                            
        }
}
