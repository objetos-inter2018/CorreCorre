import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea la pantalla de Ayuda3
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Ayuda3 extends World
{
        
    botonMenu botonPortada;
    
    /**
     * Constructor for objects of class Ayuda3.
     * 
     */
    public Ayuda3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        botonPortada= new botonMenu();
        prepare();
    }
    
    /**
     * Actua de Ayuda3. cuando el boton es presionado
     * crea un nuevo mundo de ayuda4
     * @param botonPortada Boton para ir a  Ayuda4
     */
    public void act()
    {
        
        if (Greenfoot.mouseClicked(botonPortada))
         {
            Ayuda4 ayuda4 = new Ayuda4();   
            Greenfoot.setWorld(ayuda4);
            
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

