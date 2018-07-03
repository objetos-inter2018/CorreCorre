import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ganaste muestra el nombre y los kilometros del jugador
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Ganaste extends World
{
        private GreenfootSound musicaRecord= new GreenfootSound("Record.mp3");    
    botonMenu botonV;
    private Counter contadorKm;
    public String Nombre;
    /**
     * Constructor for objects of class Ganaste.
     * @param NombreJug Puntuacion Final
     * @param Km Km del jugadoren el juego
     * 
     */
    public Ganaste(int Km, String N)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        botonV= new botonMenu();
        prepare();
        int Pf;
        Nombre=N;
        
        Pf=Km;
        Label PnFin= new Label("Puntuacion Final", 60);
        addObject(PnFin, 200, 400);
        Label Nom= new Label("Nombre de Jugador", 50);
        addObject(Nom, 200, 200);
        Label NombreJug= new Label(Nombre, 80);
        addObject(NombreJug, 200, 300);
        Label PFLabel= new Label(Km,150);
        addObject(PFLabel, 200,500);
        
    }
    
    /**
     * actua de ganaste
     */
    public void act()
    {
      
        musicaRecord.play();
        if(Greenfoot.mouseClicked(botonV))
        {
            musicaRecord.stop();
            CreditosFinales cf = new CreditosFinales(); 
            Greenfoot.setWorld(cf);
        }
    }
    
    /**
     * agrega boton
     */
    private void prepare()
    {
        musicaRecord.stop();
        addObject(botonV,600,610);
    }
    
}
