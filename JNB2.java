import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jugador 1 nivel bonus 2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class JNB2 extends Jugador
{
    GifImage jugador = new GifImage("j3.gif");
    private int x,y;
    
    public JNB2()
    {
        
    }
    
    /**
     * Act de la clase
     */
    public void act() 
    {
         setImage(jugador.getCurrentImage());
         //mueveJugador();
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
        int z=10;
        
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
        NB2 mundo= (NB2)getWorld();
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
        NB2 mundo= (NB2)getWorld();
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
        NB2 mundo= (NB2)getWorld();
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
     * cuando jugador agarra Saxo se aumenta los kilometros y se desaparece objeto
     * sax
     */
    public void agarraBonusPot(){
        NB2 mundo= (NB2)getWorld();
        Actor Saxo;
        Saxo= getOneObjectAtOffset(0,0,Saxo.class);
         if(Saxo!=null)
        {
            mundo.agarraPBonKm();
            mundo.removeObject(Saxo);
        }
    }
    
    /**
     * cuando jugador agarra nota se aumenta la energia y se desaparece el objeto
     * not
     */
    public void agarraBonusPotE(){
        NB2 mundo= (NB2)getWorld();
        Actor Nota;
        Nota= getOneObjectAtOffset(0,0,Nota.class);
         if(Nota!=null)
        {
            mundo.agarraPBonE();
            mundo.removeObject(Nota);
        }
    }
    
    
}
