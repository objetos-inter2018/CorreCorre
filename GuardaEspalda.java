import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Guardaespalda Jugador 2 de nivel bonus 2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class GuardaEspalda extends JNB2
{
    /**
     * Act de clase
     */
    public void act() 
    {
        // Add your action code here.
        super.mueveJugador();
        
        super.agarraBonusPot();
        super.agarraBonusPotE();
        AyuJugEne();
    }   
    
    /**
     * Si guardaespaldas toca enemigo lo desaparece sin recibir daño
     */
    public void AyuJugEne(){
        NB2 mundo= (NB2)getWorld();
        Actor Enemigo;
        Enemigo= getOneObjectAtOffset(0,0,Enemigo.class);
         if(Enemigo!=null)
        {
            
            mundo.removeObject(Enemigo);
        }
    }
}
