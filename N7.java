import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Crea Nivel 7 del juego
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class N7 extends World
{
    private GreenfootSound musicaN72 = new GreenfootSound ("nivel72.mp3");
    private GreenfootSound musicaN7 = new GreenfootSound ("nivel7.mp3");
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
     public JN7 Jugador;
    public boolean pasaNivel;
    
    /**
     * Constructor for objects of class N7.
     * 
     */
    public N7(int Energia, int Km)
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
        Jugador=new JN7();
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
        musicaN7.play();
        musicaN72.play();
        ApareceEne(timerEne);
        kmR();
        apareceObs();
        potAgua();
        potPesas();
        limPizza();
        limVeneno();
        finN7();
        PerdisteJ();
        aparecePasN();
        Fuego();
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
              Lava lava= new Lava();
              int Ylava=(Greenfoot.getRandomNumber(700));
              if(Ylava>=700 || Ylava<=169)
              {
                  Ylava=350;
                }
              addObject(lava, Greenfoot.getRandomNumber(900),Ylava);
              
              break;
      
      
            case 2: 
              Fueguin Fueguin=new Fueguin();
              addObject(Fueguin, Greenfoot.getRandomNumber(900), 700);
              break;
      
      
            case 3: 
              Dragon4 dragon4= new Dragon4();
              int Y2=((Greenfoot.getRandomNumber(700))+170);
               if(Y2>=700)
                {
                    Y2=700;
                 }
                addObject(dragon4,0,Y2);
              break;
              
              
            case 4: 
              Fenix2 Fenix2= new Fenix2();
              addObject(Fenix2,Greenfoot.getRandomNumber (900),170);
              break;
            
            case 5: 
              Fenix4 fenix4= new Fenix4();
              int Y2f=((Greenfoot.getRandomNumber(700))+170);
               if(Y2f>=700)
                {
                    Y2f=700;
                 }
                addObject(fenix4,0,Y2f);
              break;
              
            case 6: 
              FuegoR Fur1= new FuegoR();
              int Y3=((Greenfoot.getRandomNumber(700))+170);
              if(Y3>=700)
                   {
                       Y3=700;
                    }
               addObject(Fur1,0,Y3);
               
               FuegoR Fur2= new FuegoR();
              int Y32=((Greenfoot.getRandomNumber(700))+170);
              if(Y32>=700)
                   {
                       Y3=700;
                    }
               addObject(Fur2,0,Y32);
              break;
              
            case 7: 
              Dragon dra= new Dragon();
              int Y4=(Greenfoot.getRandomNumber(700));
                Y4+=170;
                 if(Y4>=700)
                  {
                        Y4=700;
                   }
                  addObject(dra,900,Y4);
                  
                  
              Dragon dra2= new Dragon();
              int Y42=(Greenfoot.getRandomNumber(700));
                Y42=170;
                 if(Y42>=700)
                  {
                        Y42=700;
                   }
                  addObject(dra2,900,Y42);
              break;
            
             
              
              case 9:
              Charizard cha= new Charizard();
              addObject(cha,Greenfoot.getRandomNumber (900),170);
              break;
             
              
              case 10: 
              Fenix fen= new Fenix();
              addObject(fen,Greenfoot.getRandomNumber (900),170);
              break;
              
              
              case 11:
              Dragon2 dr21= new Dragon2();
              addObject(dr21,Greenfoot.getRandomNumber (900),170);
              
              Dragon2 dr22 = new Dragon2();
              addObject(dr22,Greenfoot.getRandomNumber (900),170);
              
              Dragon2 dr23= new Dragon2();
              addObject(dr23,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 12: 
              Salamandra sal= new Salamandra();
              addObject(sal,Greenfoot.getRandomNumber (900),700);
              break;
              
              case 13: 
              Dragon3 drag3= new Dragon3();
              addObject(drag3,Greenfoot.getRandomNumber (900),700);
              break;
              
              case 14:
              Fenix3 fen3= new Fenix3();
              addObject(fen3,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 15:
              Lavin lav= new Lavin();
              int Y7=(Greenfoot.getRandomNumber(700));
              Y7+=170;
              if(Y7>=700)
               {
                   Y7=700;
               }
              addObject(lav,900,Y7);
              
              Lavin lav2= new Lavin();
              int Y72=(Greenfoot.getRandomNumber(700));
              Y72+=170;
              if(Y72>=700)
               {
                   Y72=700;
               }
              addObject(lav2,900,Y72);
              break;
               
              case 16:
              Moltres moltres= new Moltres();
              int Ymol=((Greenfoot.getRandomNumber(900)));
               if(Ymol>=700)
                {
                    Ymol=700;
                 }
                addObject(moltres,Ymol,700);
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
     * aparece obstaculo 5 cada 5 segundos  
     * @param o1 Objeto clase Obstaculo 5
     */
     public void apareceObs()
   {
       if(timerObs.millisElapsed()> 5000){
         Obs5 o1= new Obs5();
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
     * Cuando la variable pasaNivel pasa a ser verdadera, se termina el nivel 7
     * se detiene la musica y crea el bonus 2.
     * El bonus 2 recibe la variable Energia y la variable Km
     * 
     * @param Energia Guarda el valor de la Energia del nivel
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     * @param NB2 Nivel Bonus 2
     */
    public void finN7()
    {
        if(pasaNivel==true){//cambiar por 230000
           int Energia= contadorEnergia.value;
            int Km=contadorKm.value;
            musicaN7.stop();
            musicaN72.stop();
            NB2 NB2= new NB2(Energia, Km);   
            Greenfoot.setWorld(NB2);
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
            
            musicaN7.stop();
            musicaN72.stop();
            
            Greenfoot.setWorld(new Perdiste(Km,Nombre));
            musicaN7.stop();
            musicaN72.stop();
        }
    }
     
    /**
     * Fuego crea objetos Fuego
     */
    public void Fuego()
    {
        if(Greenfoot.getRandomNumber(99)<100)
        {
            addObject(new Fuego(),Greenfoot.getRandomNumber(900),700);
        }
    }
    }


