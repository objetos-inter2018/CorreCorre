import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea la pangtalla de Ayuda4
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Ayuda4 extends World
{
        
    botonMenu botonPortada;
    /**
     * Constructor for objects of class Ayuda4.
     * 
     */
    public Ayuda4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        botonPortada= new botonMenu();
        prepare();
    }
    
    /**
     * Actua de Ayuda2. cuando el boton es presionado
     * crea un nuevo mundo de menu
     * @param botonPortada Boton para regresar a menu
     * @param musicaAyuda Musica de Ayuda
     */
    public void act()
    {
        //musicaPortada.play();
        if (Greenfoot.mouseClicked(botonPortada))
         {
            Menu menu = new Menu();   
            Ayuda.musicaAyuda.stop();
            Greenfoot.setWorld(menu);
            
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

