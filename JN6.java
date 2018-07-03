import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jugador nivel 6
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class JN6 extends Jugador
{
    GifImage jugador = new GifImage("jug.gif");
    private int x,y;
    private int vel=2;
    private GreenfootImage image1;
    private GreenfootImage image2;
    public SimpleTimer timerEfeOb;
    public SimpleTimer timerAtk;
    public SimpleTimer timerCd;
    private boolean Ob;
    private boolean attack;
    
    public JN6()
    {
        image1= new GreenfootImage("jugJ.gif");
        image2= new GreenfootImage("attack.gif");
        timerEfeOb= new SimpleTimer();
        timerAtk = new SimpleTimer();
        timerCd = new SimpleTimer();
        Ob=false;
        attack = false;
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
        comPi();
        agarraPesas();
        PasaNivel();
    }    
    
    
    /**
     *mover jugador 
     */
    public void mueveJugador()
    {
        x=getX();
        y=getY();
        int z=6;
        
        if(Greenfoot.isKeyDown("s")==false)
            Ob = actObs(Ob);
        Ob = deactObs(Ob); 
        if ((Greenfoot.isKeyDown("Left")) && ( !(Greenfoot.isKeyDown("s")) ))
        {
            if(x>35 && (Ob==false) )
            {
                x = x-z;
            }
            else
            {
                if(x<865)
                {
                    x=x+z;
                }
            }
            
        }
       
        if ((Greenfoot.isKeyDown("Right")) && ( !(Greenfoot.isKeyDown("s")) ) )
        {
            if(x<865 && (Ob==false) )
            {
                x=x+z;
            }
            else
                if(x>34)
                    x=x-z;
        }
            
        if ((Greenfoot.isKeyDown("Up")) && ( !(Greenfoot.isKeyDown("s")) ) )
        {
            if(y>150 && (Ob==false))
            {
                y=y-z;
            }
            else
                if(y<670)
                    y=y+z;
        }
            
        if ((Greenfoot.isKeyDown("Down")) && ( !(Greenfoot.isKeyDown("s")) ))
        {
            if(y<670 && (Ob==false))
            {
                y=y+z;
            }
            else
                if(y>150)
                    y=y-z;
        }
        
        if (Greenfoot.isKeyDown("s")  && (Ob==false))
        {
            setImage(image1);
        }
        
        if(attack)             
            setImage(image2);
        
        atacando();
        
        setLocation(x,y);
    }
    
    /**
     * Cuando jugador presiona "a" ataque se vuelve true mientras ataque sea falso
     * obstaculo falso, si ataque es verdadero, 2 segundos despues se vuelve falso
     * @param atack bandera de ataque
     */
    public void atacando()
    {
        if (Greenfoot.isKeyDown("a")  && (Ob==false) && (attack==false) && timerCd.millisElapsed() > 500)
        {
            attack=true;
            timerAtk.mark();
        }
        if(attack==true && timerAtk.millisElapsed() > 2000)
        {
            attack = false;
            timerCd.mark();
        }
    }
    
    //items
    
    /**
     * ataque a jugador por enemigo, al tocar al enemigo se decrementa la energia
     * despues el enemigo es removido del escenario
     */
    public void dañJugEne(){
        if(attack)
            removeTouching(Enemigo.class);
        else{    
            N6 mundo= (N6)getWorld();
            Actor Enemigo;
            Enemigo= getOneObjectAtOffset(0,0,Enemigo.class);
            if(Enemigo!=null)
            {
                mundo.decrementaEnergia();
                mundo.removeObject(Enemigo);
            }
        }
    }
    
     /**
     * potenciador a jugador por agua, al tomar agua se incrementara la energia
     * despues el agua es removida del escenario
     */
    public void ayuJugAgua(){
        N6 mundo= (N6)getWorld();
        Actor Agua;
        Agua= getOneObjectAtOffset(0,0,Agua.class);
         if(Agua!=null)
        {
            mundo.incrementaEnergia();
            mundo.removeObject(Agua);
        }
    }
    
     /**
     * limitador a jugador por veneno, al tomar el veneno automaticamente se perdera
     * despues el veneno  es removido del escenario
     */
    public void mataJugador(){
        N6 mundo= (N6)getWorld();
        Actor Veneno;
        Veneno= getOneObjectAtOffset(0,0,Veneno.class);
         if(Veneno!=null)
        {
            mundo.agarraVeneno();
            mundo.removeObject(Veneno);
        }
    }
    
      /**
     * limitador a jugador por pizza, al tomar pizza se restaran kilometros recorridos
     * despues la pizza  es removida del escenario
     */
    public void comPi(){
        N6 mundo= (N6)getWorld();
        Actor Pizza;
        Pizza= getOneObjectAtOffset(0,0,Pizza.class);
         if(Pizza!=null)
        {
            mundo.agarraLimKm();
            mundo.removeObject(Pizza);
        }
    }
    
      /**
     * limitador a jugador por pizza, al tomar pizza se restaran kilometros recorridos
     * despues la pizza  es removida del escenario
     */
    public void agarraPesas(){
        N6 mundo= (N6)getWorld();
        Actor Pesas;
        Pesas= getOneObjectAtOffset(0,0,Pesas.class);
         if(Pesas!=null)
        {
            mundo.agarraPotKm();
            mundo.removeObject(Pesas);
        }
    }
    
    
    //OBSTACULO
    //activa efecto obstaculo
    /**
     * cuando el jugador toca obstaculo se activa el efecto de obstaculo
     * @return o efecto obstaculo
     */
    public boolean actObs(boolean o)
    {
        
        if(isTouching(Obs4.class))
        {
            o = true;
            attack = false;
            timerEfeOb.mark();
        }
        
        return o;
    }
    
    /**
     * despues de 3.5 segundos "o" se vuelve false
     * @return o efecto de obstaculo
     */
    public boolean deactObs(boolean o)
    {
        if(o && timerEfeOb.millisElapsed()> 3500)
            o = false;
        return o;
    }
    
    //PasaNivel
    /**
     * Cuando el jugador agarra un pasanivel, el pasanivel desaparece y se ejecuta 
     * la clase agarraPasan de n6
     */
    public void PasaNivel(){
        N6 mundo= (N6)getWorld();
        Actor PasaNivel;
        PasaNivel= getOneObjectAtOffset(0,0,PasaNivel.class);
         if(PasaNivel!=null)
        {
            mundo.agarraPasan();
            mundo.removeObject(PasaNivel);
        }
    }
    
}
