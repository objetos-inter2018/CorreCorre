import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo3
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class E3 extends Normal
{
    /**
     * mueve enemigo de derecha a izquierda
     */
    public void mueveEne(int vEne, int giro){
      World mundo= getWorld();
      turn(giro);
      setLocation (getX()-vEne, getY());
       if (getX()<=5)
       {
             mundo.removeObject(this);
       }
        }
}
