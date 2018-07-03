import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea la pantalla de Ayuda2
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Ayuda2 extends World
{
        
    botonMenu botonPortada;
    
    /**
     * Constructor for objects of class Ayuda2.
     * 
     */
    public Ayuda2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        botonPortada= new botonMenu();
        prepare();
    }
    
    
    /**
     * Actua de Ayuda2. cuando el boton es presionado
     * crea un nuevo mundo de ayuda3
     * @param botonPortada Boton para ir a ayuda 2
     */
    public void act()
    {
        
        if (Greenfoot.mouseClicked(botonPortada))
         {
            Ayuda3 ayuda3 = new Ayuda3();  
            Greenfoot.setWorld(ayuda3);
            
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

