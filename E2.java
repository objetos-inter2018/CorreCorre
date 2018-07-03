import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class E2 extends Normal
{
    /**
     * mueve enemigo de abajo a arriba
     */
    public void mueveEne(int vEne, int giro){
      World mundo= getWorld();
       //abajo a arriba
       turn(giro);
       setLocation (getX(), getY()-vEne);
       if (getY()<=170)     
       {
           mundo.removeObject(this);
       }
                  }
 }

