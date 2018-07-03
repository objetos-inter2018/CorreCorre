import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Crea Nivel 4 del juego
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class N4 extends World
{
    private GreenfootSound musicaN42 = new GreenfootSound ("nivel42.mp3");
    private GreenfootSound musicaN4 = new GreenfootSound ("nivel4.mp3");
    //tiempo
     public SimpleTimer timer;
     public SimpleTimer timerN;
     public SimpleTimer timerL;
     public SimpleTimer timerPz;
     public SimpleTimer timerP;
     public SimpleTimer timerV;
     public SimpleTimer timerEne; //enemigos
     public SimpleTimer timerObs; //obstaculos
     
     //contadores
     private Counter contadorEnergia;
     private Counter contadorKm;
     
     //jugador
     public JN4 Jugador;
    public boolean pasaNivel;
    
    /**
     * Constructor for objects of class N4.
     * 
     */
    public N4(int Energia, int Km)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        //timers
        timer= new SimpleTimer();
        timerN= new SimpleTimer(); 
        timerV= new SimpleTimer(); 
        timerPz= new SimpleTimer(); 
        timerP= new SimpleTimer(); 
        timerL= new SimpleTimer(); 
        timerEne= new SimpleTimer();
        timerObs= new SimpleTimer();
        
        //contador energia
        contadorEnergia = new Counter("ENERGIA: ");
        contadorEnergia.setValue(Energia);
        addObject(contadorEnergia,700,27);
        //contador km 
        contadorKm = new Counter("KM: ");
        contadorKm.setValue(Km);
        addObject(contadorKm,121,27);
        
        //jugador
        Jugador=new JN4();
        addObject(Jugador, 450, 350);
        pasaNivel=false;
        
        
        prepare();
    }
    
    /**
     * Agrega el jugador al nivel
     */
    private void prepare()
    {
        addObject(Jugador,450,350);
        
        
    }
    
    /**
     * Actua del nivel
     */
    public void act()
    {
        musicaN4.play();
        musicaN42.play();
        ApareceEne(timerEne);
        kmR();
        apareceObs();
        potAgua();
        potPesas();
        limPizza();
        limVeneno();
        aparecePasN();
        finN4();
        PerdisteJ();
    }
    
    /**
     * Inicializa los timer del  nivel
     * 
     * @param timer Timer de los kilometros
     * @param timerN Timer de Agua
     * @param timerP Timer de las Pesas
     * @param timerV Timer de Veneno
     * @param timerPz Timer de Pizza
     * @param timerL Timer de nivel
     * @param timerEne Timer de los Enemigos
     */
    public void started()
    {
        timer.mark();
        timerN.mark();
        timerP.mark();
        timerV.mark();
        timerPz.mark();
        timerL.mark();
        timerEne.mark();
    }
    
     //INCREMENTO DE KILOMETROS
    /**
     * Kilometro Recorridos suma +1 al contador de los kilometros cada segundo
     * @param contadorKm Contador de los kilometros del nivel
     */
   public void kmR()
    {
        if(timer.millisElapsed()> 1000){
            contadorKm.add(1);
            timer.mark();
    }
    
   }
    
     //ENEMIGOS
    /**
    * Ciclo que aparece los enemigos del nivel cada segundo, NumEne eligira el numero de
    * enemigo a aparecer en pantalla, tomara un numero random y entrara en un 
    * switch-case
    * 
    * @param NumEne 
    */
    public void ApareceEne(SimpleTimer T)
{
     int NumEne;
    if(T.millisElapsed()> 1000){ 
        NumEne=Greenfoot.getRandomNumber(17);
        switch (NumEne)
        {
            case 1: 
              Patricio p1= new Patricio();
              addObject(p1,Greenfoot.getRandomNumber (900),700);
              break;
      
      
            case 2: 
              Cangrejo3 c3= new Cangrejo3();
              int Y=(Greenfoot.getRandomNumber(700));
              Y+=170;
              if(Y>=700)
               {
                   Y=700;
               }
              addObject(c3,900,Y);
              break;
      
      
            case 3: 
              Barco2 bar2= new Barco2();
              int Y2=((Greenfoot.getRandomNumber(700))+170);
               if(Y2>=700)
                {
                    Y2=700;
                 }
                addObject(bar2,0,Y2);
              break;
              
              
            case 4: 
              Bruce b1= new Bruce();
              addObject(b1,Greenfoot.getRandomNumber (900),170);
              break;
            
            case 5:
              Barco1 barco1= new Barco1();
              addObject(barco1,Greenfoot.getRandomNumber (900),700);
              break;
            
            case 6: 
              Orca Orca= new Orca();
              addObject(Orca,Greenfoot.getRandomNumber (900),170);
              break;
              
            case 7: 
              Cangrejo2 can2= new Cangrejo2();
              int Y3=((Greenfoot.getRandomNumber(700))+170);
              if(Y3>=700)
                   {
                       Y3=700;
                    }
               addObject(can2,0,Y3);
              break;
              
            case 8: 
              Barco5 b5= new Barco5();
              int Y4=(Greenfoot.getRandomNumber(700));
                Y4+=170;
                 if(Y4>=700)
                  {
                        Y4=700;
                   }
                  addObject(b5,900,Y4);
              break;
              
            case 9:
             Gaviota g= new Gaviota();
              int Y5=((Greenfoot.getRandomNumber(700))+170);
              if(Y5>=700)
                   {
                       Y5=700;
                    }
               addObject(g,0,Y5);
              break;
              
             case 10:
              Tiburon1 ti1= new Tiburon1();
              int Y6=(Greenfoot.getRandomNumber(700));
              Y6+=170;
              if(Y6>=700)
               {
                   Y6=700;
               }
              addObject(ti1,900,Y6);
              break;
              
              case 11:
              Bote1 bo1= new Bote1();
              addObject(bo1,Greenfoot.getRandomNumber (900),170);
              break;
             
              
              case 12: 
              Barco3 b3= new Barco3();
              addObject(b3,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 13:
              Gaviota2 g2= new Gaviota2();
              addObject(g2,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 14:
              Barco4 b4= new Barco4();
              addObject(b4,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 15: 
              Cangrejo1 can1= new Cangrejo1();
              addObject(can1,Greenfoot.getRandomNumber (900),700);
              break;
              
              case 16: 
              Tortuga1 t1= new Tortuga1();
              addObject(t1,Greenfoot.getRandomNumber (900),700);
              break;
              
              case 17:
              Tiburon2 tib2= new Tiburon2();
              addObject(tib2,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 18:
              Tiburon3 ti3= new Tiburon3();
              int Y7=(Greenfoot.getRandomNumber(700));
              Y7+=170;
              if(Y7>=700)
               {
                   Y7=700;
               }
              addObject(ti3,900,Y7);
              break;
              
            default: 
                 
            }
            T.mark();
    }
    
}
    
    
     //APARECE POTENCIADOES Y LIMITADORES
    /**
     * aparece agua cada 5 segundos  
     * @param a1 Objeto clase Agua
     */
    public void potAgua()
    {
        if(timerN.millisElapsed()> 5000){
            Agua a1= new Agua();
            addObject(a1,Greenfoot.getRandomNumber (900),Greenfoot.getRandomNumber (700));
            timerN.mark();
        }
       
    }
    

    /**
     * aparece pesas cada 5 segundos  
     * @param p1 Objeto clase Pesas
     */
    public void potPesas()
    {
        if(timerP.millisElapsed()> 5000){
            Pesas p1= new Pesas();
            addObject(p1,Greenfoot.getRandomNumber (900),Greenfoot.getRandomNumber (700));
            timerP.mark();
        }
    }
    
    /**
     * aparece veneno cada 20 segundos 
     * @param v1 Objeto clase Veneno
     */
    public void limVeneno()
    {
        if(timerV.millisElapsed()> 20000){
            Veneno v1= new Veneno();
            addObject(v1,Greenfoot.getRandomNumber (900),Greenfoot.getRandomNumber (700));
            timerV.mark();
        }
    }
    
    /**
     * aparece pizza cada 20 segundos  
     * @param pz1 Objeto clase pz1
     */
    public void limPizza()
    {
        if(timerPz.millisElapsed()> 20000){
            Pizza pz1= new Pizza();
            addObject(pz1,Greenfoot.getRandomNumber (900),Greenfoot.getRandomNumber (700));
            timerPz.mark();
        }
    }
    
   //incremento/decremento energia/km
     
    //ENERGIA DECREMENTO INCREMENTO
    /**
     * Disminuye la energia al chocar con enemigo
     */
    public void decrementaEnergia()
    {
        contadorEnergia.add(-10);
    }
    
    /**
     * Incrementa la energia al tomar agua
     * no pasa de 100 el valor de energia
     */
    public void incrementaEnergia()
    {
        if (contadorEnergia.value<=1000)
        {
            contadorEnergia.add(5);
        } 
    }
   
     
    //VALORES LIMITADORES  POTENCIODORES
    /**
     * Al tomar el veneno el jugador pierde automaticamente la mitad de su energia
     */
    public void agarraVeneno()
    {
        
             contadorEnergia.setValue((contadorEnergia.value/2));
        
    }
    
    /**
     * Al agarrar la pizza, perdera la mitad de sus kilometros
     */
    public void agarraLimKm()
    {
        
        contadorKm.setValue(contadorKm.value/2);
        
    }
    
    /**
     * Al agarrar las pesas, se sumaran km recorridos
     * 
     */
    public void agarraPotKm()
    {
        
        contadorKm.add(5);
        
       
    }
    
   //obstaculos
   /**
     * aparece obstaculo 2 cada 5 segundos  
     * @param o1 Objeto clase Obstaculo 2
     */
   public void apareceObs()
   {
       if(timerObs.millisElapsed()> 5000){
         Obs2 o1= new Obs2();
         addObject(o1,450,700);
         timerObs.mark();
       }
    } 
   
   //CAMBIO DE NIVEL
    /**
     * aparece PasaNivel 30 segundos despues de iniciar el nivel
     * @param pasN Objeto clase PasaNivel
     */  
       public void aparecePasN()
   {
       if(timerL.millisElapsed()> 30000){
         PasaNivel PasN= new PasaNivel();
         addObject(PasN,450,700);
         timerL.mark();
       }
    } 
    
    /**
     * Al agarrar pasanivel el valor de pasanivel se vuelve verdadero
     * @param pasaNivel variable para controlar el paso de nivel
     */
    public void agarraPasan()
    {
        
        pasaNivel=true;
       
    }
    
   /**
     * Cuando la variable pasaNivel pasa a ser verdadera, se termina el nivel 4
     * se detiene la musica y crea el Nivel Bonus 1
     * El mundo NB1 recibe la variable Energia y la variable Km
     * 
     * @param Energia Guarda el valor de la Energia del nivel
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     * @param NivelB1 Nivel Bonus 1
     */
    public void finN4()
    {
        if(pasaNivel==true){//cambiar por 230000
            int Energia= contadorEnergia.value;
            int Km=contadorKm.value;
            musicaN4.stop();
            musicaN42.stop();
            NB1 NivelB1= new NB1(Energia, Km);   
            Greenfoot.setWorld(NivelB1);
            timerL.mark();
        }
    }
    
    
    //PERDISTE
    /**
     * Cuando la energia del jugador llega a 0 , el juego se termina 
     * y se pasa a la pantalla de Perdiste
     * Perdiste recibe nombre del jugador y los kilometros obtenidos  a lo largo del juego
     * 
     * @param Nombre Guarda el nombre del jugador para mostrar en la pantalla de ganaste
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     * @param Perdiste Pantalla de Perdiste
     */
    public void PerdisteJ()
    {
        if(contadorEnergia.getValue()<=0)
        {
            String Nombre;
            int Km=contadorKm.value*10;
            try{
            Nombre= JOptionPane.showInputDialog("Por Favor Escribe Tu Nombre");
            }
            catch(java.lang.NullPointerException e1)
            {
                System.out.println("no ingresaste nombre");
                Nombre=("Jugador");
            }
            
            musicaN4.stop();
            musicaN42.stop();
            
            Greenfoot.setWorld(new Perdiste(Km,Nombre));
            musicaN4.stop();
            musicaN42.stop();
        }
    }
     
    
    }


