import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea la pantalla de Portada
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Portada extends World
{
        
    botonPortada botonPortada;
    private GreenfootSound musicaPortada = new GreenfootSound ("portada.mp3");
    
    
    //musc
    /**
     * Constructor for objects of class Portada.
     * 
     */
    public Portada()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        botonPortada= new botonPortada();
        prepare();
    }
    
    /**
     * Actua de la portada. Inicializa la musica y cuando el boton es presionado
     * detiene la musica y crea un nuevo mundo de menu
     * @param botonPortada Boton para regresar al menu
     * @param musicaPortada musica del mundo
     */
    public void act()
    {
        musicaPortada.play();
        if (Greenfoot.mouseClicked(botonPortada))
         {
            Menu menu = new Menu();   
            musicaPortada.stop();
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
