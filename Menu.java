import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea la pantalla de Menu
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomrz Jorge Luis)
 * @version (version 1.1)
 */
public class Menu extends World
{
     botonMenu   botonJ;
    botonMenu     botonC;
    botonMenu     botonA;
   private GreenfootSound musicaMenu= new GreenfootSound("menu.mp3");    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        botonJ= new botonMenu  ();
        botonA= new botonMenu ();
        botonC= new botonMenu  ();
        prepare();
    }
    
    /**
     * Actua de Menu. Inicializa la musica y cuando el botonA es presionado
     * crea un nuevo mundo de Ayuda
     * Cuando el botonJ es presionado se crea un nuevo mundo de nivel 1
     * cuando el botonC es presionado se crea un nuevo mundo de creditos
     * @param botonA Boton para ir a Ayuda
     * @param botonJ Boton para ir a N1
     * @param botonC Boton para ir a Creditos
     * @param musicaMenu musica del mundo
     */  
    public void act()
    {
         musicaMenu.play();
         if (Greenfoot.mouseClicked(botonA))
         {
            musicaMenu.stop(); 
            Greenfoot.setWorld(new Ayuda());
         }
         
         if (Greenfoot.mouseClicked(botonJ))
         {
             musicaMenu.stop();
             Greenfoot.setWorld(new N1());
             
         }
         
         if (Greenfoot.mouseClicked(botonC))
         {
            musicaMenu.stop();
            Greenfoot.setWorld(new Creditos());
             
         }
         
    }
    
    /**
     * Agrega los botones del menu
     */
    private void prepare()
    {
        //botones
        addObject(botonA,615, 299);
        addObject(botonJ,615,175);
        addObject(botonC,615,440);
    }
}
