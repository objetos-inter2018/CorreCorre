import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea la pantalla de los creditos
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Creditos extends World
{
        
    botonMenu botonPortada;
    private GreenfootSound Creditos = new GreenfootSound ("creditos.mp3");
    
    
    //musc
    /**
     * Constructor for objects of class Creditos.
     * 
     */
    public Creditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        botonPortada= new botonMenu();
        prepare();
    }
    
    /**
     * Actua de los creditos. Inicializa la musica y cuando el boton es precionado
     * crea un nuevo mundo de menu
     * @param botonPortada Boton para regresar al menu
     * @param Creditos musica del mundo
     */
    public void act()
    {
        Creditos.play();
        if (Greenfoot.mouseClicked(botonPortada))
         {
            Menu menu = new Menu();   
            Creditos.stop();
            Greenfoot.setWorld(menu);
            
         }
        
    }
    
    /**
     * Agrega un boton al mundo
     */
    private void prepare()
    {
        addObject(botonPortada,132,621);
    }
}
