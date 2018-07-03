import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo8
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class E8 extends Normal
{
    /**
     * mueve enemigo de izquierda a derecha ascendente
     */
    public void mueveEne(int vEne, int giro){
      World mundo= getWorld();
      turn(giro);
      setLocation (getX()+vEne, getY()-vEne);
      //cruuzado de derecha a izquierda desaparece abajo o en 
      //extremo izquierdo
       if (getX()>=mundo.getWidth()-5 || getY()<=170)
        {
              mundo.removeObject(this);
        }
                            
        }
}
