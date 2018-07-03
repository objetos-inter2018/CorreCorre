import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nieve here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nieve extends Actor
{
    private int velCaida=15;
    /**
     * El método act se encarga de girar el copo de nieve y
     */
    public void act()
    {
        turn(-2);
        setLocation( getX() , getY()+ velCaida );
        World mundo=getWorld();
        if(getY()>=getWorld().getHeight()-10){
            mundo.removeObject(this);
        }
    }
}
