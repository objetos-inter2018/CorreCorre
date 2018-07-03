import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemigo estatico
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Estatico extends Normal
{
    /**
     * mueve el enemigo de tipo estatico, solo lo aparece
     */
    public void mueveEne(int vEne, int giro){
      World mundo= getWorld();
       turn(giro);
    }                          
}
