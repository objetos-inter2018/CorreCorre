import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea la pantalla de Ayuda
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Ayuda extends World
{
        
    botonMenu botonPortada;
    public static GreenfootSound musicaAyuda= new GreenfootSound("Ayuda.mp3");    
    
    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        botonPortada= new botonMenu();
        prepare();
    }
    
    /**
     * Actua de la Ayuda. Inicializa la musica y cuando el boton es presionado
     * crea un nuevo mundo de ayuda 2
     * @param botonPortada Boton para ir a ayuda2
     * @param musicaAyuda musica del mundo
     */
    public void act()
    {
        musicaAyuda.play();
        if (Greenfoot.mouseClicked(botonPortada))
         {
            Ayuda2 ayuda = new Ayuda2();   
            
            Greenfoot.setWorld(ayuda);
            
         }
        
    }
    
    /**
     * Agrega un boton al mundo
     */
    private void prepare()
    {
        addObject(botonPortada,825,625);
    }
}

