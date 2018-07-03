import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Perdiste muestra los kilometros y nombre del jugador
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Perdiste extends World
{
    private GreenfootSound musicaPerdiste= new GreenfootSound("perdiste.mp3"); 
    botonMenu botonV;
    private Counter contadorKm;
    public String Nombre;
    /**
     * Constructor for objects of class Perdiste.
     * @param NombreJug Nombre del jugador
     * @param Km Kilometros del jugador
     */
    public Perdiste(int Km, String N)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        botonV= new botonMenu();
        prepare();
        int Pf;
        Nombre=N;
        
        Pf=Km;
        Label PnFin= new Label("Puntuacion Final", 60);
        addObject(PnFin, 600, 400);
        Label Nom= new Label("Nombre de Jugador", 50);
        addObject(Nom, 600, 200);
        Label NombreJug= new Label(Nombre, 80);
        addObject(NombreJug, 600, 300);
        Label PFLabel= new Label(Km,150);
        addObject(PFLabel, 600,500);
        
    }
    
    /**
     * actua de perdiste
     */
    public void act()
    {
      
        musicaPerdiste.play();
        if(Greenfoot.mouseClicked(botonV))
        {
            musicaPerdiste.stop();
            Menu menu = new Menu(); 
            Greenfoot.setWorld(new Menu());
        }
    }
    
    /**
     * Crea boton
     */
    private void prepare()
    {
        //musicaPerdiste.play();
        addObject(botonV,600,610);
    }
    
}
