import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase de NivelBonus 1
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class NB1 extends World
{
    private GreenfootSound musicaB1 = new GreenfootSound ("bonus1.wav");
    //tiempo
     public SimpleTimer timer;
     public SimpleTimer timerN;
     public SimpleTimer timerL;
     public SimpleTimer timerPz;
     public SimpleTimer timerP;
     public SimpleTimer timerV;
     public SimpleTimer timerEne;
     public SimpleTimer timerDesE;
      //contadores
     private Counter contadorEnergia;
     private Counter contadorKm;
     private Counter contadorTene;
     //jugador
     public JNB1 Jugador;
     //Bonus
     public int bonusFin;
    
     /**
      * Constructor de la clase
      */
    public NB1(int Energia, int Km)
    {    
        // Create a new world with 900x700 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        //timer
        timer= new SimpleTimer();
        timerN= new SimpleTimer(); 
        timerV= new SimpleTimer(); 
        timerPz= new SimpleTimer(); 
        timerP= new SimpleTimer(); 
        timerL= new SimpleTimer(); 
        timerEne= new SimpleTimer();
        timerDesE= new SimpleTimer();
        //energia
        contadorEnergia = new Counter("ENERGIA: ");
        contadorEnergia.setValue(Energia);
        addObject(contadorEnergia,700,27);
        //km extra
        contadorKm = new Counter("KM: ");
        contadorKm.setValue(Km);
        addObject(contadorKm,121,27);
        //bonus
        int bonusFin=0;
        //jugador
        Jugador=new JNB1();
        Label label;
        label = new Label(" ",3 );
        
        prepare();
    }
    
    /**
     * Agrega el jugador del nivel bonus 1
     */
    private void prepare()
    {
        addObject(Jugador,450,350);
    }
    
    /**
     * Actua del bonus 1
     */
    public void act()
    {
        musicaB1.play();
        EnemigosN3(13, timerEne );
        EnemigosN3(13, timerDesE );
        Ox();
        Goo();
        limVeneno();
        
        FB1();
        finB1();
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
        timerDesE.mark();
    }
    
    /**
     * aparece oxigeno cada 3 segundos  
     * @param o1 Objeto clase Oxigeno
     */
    public void Ox()
    {
        if(timerN.millisElapsed()> 3000){
            Oxigeno o1= new Oxigeno();
            addObject(o1,Greenfoot.getRandomNumber (900),Greenfoot.getRandomNumber (700));
            
            timerN.mark();
        }
    }
    
    /**
     * aparece Googles cada 3 segundos  
     * @param g1 Objeto clase Googles
     */
    public void Goo()
    {
        if(timerP.millisElapsed()> 3000){
            Googles g1= new Googles();
            addObject(g1,Greenfoot.getRandomNumber (900),Greenfoot.getRandomNumber (700));
            timerP.mark();
        }
    }
    
    /**
     * aparece Veneno cada 2 segundos  
     * @param v1 Objeto clase Veneno
     */
    public void limVeneno()
    {   
        
        
        if(timerV.millisElapsed()> 2000){
           
            Veneno v1= new Veneno();
            addObject(v1,Greenfoot.getRandomNumber (900),Greenfoot.getRandomNumber (700));
            timerV.mark();
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
    public void EnemigosN3(int TipoEnemigo, SimpleTimer T)
    {
        int NumEne;
        if(T.millisElapsed()> 1000){ 
            NumEne=Greenfoot.getRandomNumber(TipoEnemigo);
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
                  Pez1 Pez1= new Pez1();
                  int Y2=((Greenfoot.getRandomNumber(700))+170);
                   if(Y2>=700)
                    {
                        Y2=700;
                     }
                    addObject(Pez1,0,Y2);
                  break;
                  
                  
                case 4: 
                  Bruce b1= new Bruce();
                  addObject(b1,Greenfoot.getRandomNumber (900),170);
                  break;
                
                case 5:
                  Tiburon4 t4= new Tiburon4();
                  addObject(t4,Greenfoot.getRandomNumber (900),700);
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
                  Pulpo1 pu1= new Pulpo1();
                  int Y4=(Greenfoot.getRandomNumber(700));
                    Y4+=170;
                     if(Y4>=700)
                      {
                            Y4=700;
                       }
                      addObject(pu1,900,Y4);
                  break;
                  /*
                case 9:
                 Pulpo2 p2= new Pulpo2();
                  int Y5=((Greenfoot.getRandomNumber(700))+170);
                  if(Y5>=700)
                       {
                           Y5=700;
                        }
                   addObject(p2,0,Y5);
                  break;
                  */
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
                  Cangrejo1 can1= new Cangrejo1();
                  addObject(can1,Greenfoot.getRandomNumber (900),700);
                  break;
                  
                  
                  case 12:
                  Tiburon2 tib2= new Tiburon2();
                  addObject(tib2,Greenfoot.getRandomNumber (900),170);
                  break;
                  
                   
                default: 
                     
                }
                T.mark();
        }
    
    }
    
    //POTENCIADORES, LIMITADORES,  ENEMIGOS  DE BONUS
    /**
     * Al agarrar potenciadores bonus, se sumaran km recorridos
     * 
     */
    public void agarraPBonKm()
    {
        
        contadorKm.add(100);
        
       
    }
    
    /**
     * Al agarrar potenciadores bonus, se sumaran km recorridos
     * 
     */
    public void agarraPBonE()
    {
        
        contadorEnergia.add(30);
        
       
    }
    
    /**
     * Al chocar con limitadores o enemigos de bonus se igualara bonusFin a 1 para terminar el nivel
     * 
     */
    public void agarraLimEnePot()
    {
        
        bonusFin+=1;
        
    }
    
    
    //Final Bonus
    
     /**
      *TerminarBonus por tiempo 
      */
     public void FB1()
    {
        if(timerN.millisElapsed()> 210000){
            //musicaB1.stop();
            int Energia=contadorEnergia.value;
            int Km=contadorKm.value;
            N5 Nivel5= new N5(Energia,Km);   
            //Greenfoot.setWorld( Nivel5);
            timerN.mark();
        }
    
   }
    
    
    /**
     * al tomar 6 limitadores de bonus, se pasara al siguiente niv
     * se detiene la musica y crea el mundo 5
     * @param Energia Guarda el valor de la Energia del nivel
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     */
    public void finB1()
    {
        if(bonusFin==6){
           musicaB1.stop();
            int Energia=contadorEnergia.value;
            int Km=contadorKm.value;
            N5 N5= new N5(Energia,Km);   
            Greenfoot.setWorld( N5);
            timerN.mark();
        }
    }
   
    
}
