import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jugador nivel 1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class JNB1 extends Jugador
{
    GifImage jugador = new GifImage("jugB.gif");
    private int x,y;
    
    public JNB1()
    {
        
    }
    
    /**
     * Act de la clase
     */
    public void act() 
    {
         setImage(jugador.getCurrentImage());
         mueveJugador();
         dañJugEne();
        ayuJugAgua();
        mataJugador();
        agarraBonusPot();
        agarraBonusPotE();
    }    
    
    
    /**
     *mover jugador 
     */
    public void mueveJugador()
    {
        x=getX();
        y=getY();
        int z=7;
        
        if ((Greenfoot.isKeyDown("Left")) && ( !(Greenfoot.isKeyDown("s")) ))
        {
            if(x>35)
            {
                
                x = x-z;
            }
            
        }
       
        if ((Greenfoot.isKeyDown("Right")) && ( !(Greenfoot.isKeyDown("s")) ))
        {
            if(x<865)
            {
                
                x=x+z;
            }
        }
            
        if ((Greenfoot.isKeyDown("Up")) && ( !(Greenfoot.isKeyDown("s")) ))
        {
            if(y>150)
            {
                
                y=y-z;
                
            }
        }
            
        if ((Greenfoot.isKeyDown("Down")) && ( !(Greenfoot.isKeyDown("s")) ))
        {
            if(y<670)
            {
                
                y=y+z;
            }
        }
        
        setLocation(x,y);
    }
    
    //items
    
     /**
     * ataque a jugador por enemigo, al tocar al enemigo se decrementa la energia
     * despues el enemigo es removido del escenario
     */
    public void dañJugEne(){
        NB1 mundo= (NB1)getWorld();
        Actor Enemigo;
        Enemigo= getOneObjectAtOffset(0,0,Enemigo.class);
         if(Enemigo!=null)
        {
            mundo.agarraLimEnePot();
            mundo.removeObject(Enemigo);
        }
    }
    
     /**
     * potenciador a jugador por agua, al tomar agua se incrementara la energia
     * despues el agua es removida del escenario
     */
    public void ayuJugAgua(){
        NB1 mundo= (NB1)getWorld();
        Actor Agua;
        Agua= getOneObjectAtOffset(0,0,Agua.class);
         if(Agua!=null)
        {
            mundo.agarraLimEnePot();
            mundo.removeObject(Agua);
        }
    }
    
     /**
     * limitador a jugador por veneno, al tomar el veneno automaticamente se perdera
     * despues el veneno  es removido del escenario
     */
    public void mataJugador(){
        NB1 mundo= (NB1)getWorld();
        Actor Veneno;
        Veneno= getOneObjectAtOffset(0,0,Veneno.class);
         if(Veneno!=null)
        {
            mundo.agarraLimEnePot();
            mundo.removeObject(Veneno);
            //Greenfoot.stop();
        }
    }
    //Bonus
    
    /**
     * Al agarrar Oxigeno se desaparece y aumenta km
     */
    public void agarraBonusPot(){
        NB1 mundo= (NB1)getWorld();
        Actor Oxigeno;
        Oxigeno= getOneObjectAtOffset(0,0,Oxigeno.class);
         if(Oxigeno!=null)
        {
            mundo.agarraPBonKm();
            mundo.removeObject(Oxigeno);
        }
    }
    
    /**
     * Al agarrar googles se desaparecen y aumenta energia
     */
    public void agarraBonusPotE(){
        NB1 mundo= (NB1)getWorld();
        Actor Googles;
        Googles= getOneObjectAtOffset(0,0,Googles.class);
         if(Googles!=null)
        {
            mundo.agarraPBonE();
            mundo.removeObject(Googles);
        }
    }
    
    
}
