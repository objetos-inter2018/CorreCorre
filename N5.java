import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Crea Nivel 5 del juego
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class N5 extends World
{
    private GreenfootSound musicaN52 = new GreenfootSound ("nivel52.mp3");
    private GreenfootSound musicaN5 = new GreenfootSound ("nivel5.mp3");
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
     public JN5 Jugador;
    public boolean pasaNivel;
    
    /**
     * Constructor for objects of class N5.
     * 
     */
    public N5(int Energia, int Km)
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
        Jugador=new JN5();
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
        musicaN5.play();
        //musicaN52.play();
        ApareceEne(timerEne);
        kmR();
        apareceObs();
        potAgua();
        potPesas();
        limPizza();
        limVeneno();
        aparecePasN();
        finN5();
        PerdisteJ();
        Nevada();
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
              Pescar1 p1= new Pescar1();
              addObject(p1,Greenfoot.getRandomNumber (900),700);
              break;
      
      
            case 2: 
              Morsa mor= new Morsa();
              int Y=(Greenfoot.getRandomNumber(700));
              Y+=170;
              if(Y>=700)
               {
                   Y=700;
               }
              addObject(mor,900,Y);
              break;
      
      
            case 3: 
              Esqui4 es4= new Esqui4();
              int Y2=((Greenfoot.getRandomNumber(700))+170);
               if(Y2>=700)
                {
                    Y2=700;
                 }
                addObject(es4,0,Y2);
              break;
              
              
            case 4: 
              Morsa2 mo2= new Morsa2();
              addObject(mo2,Greenfoot.getRandomNumber (900),170);
              break;
            
            case 5:
              Ping2 pi2= new Ping2();
              addObject(pi2,Greenfoot.getRandomNumber (900),700);
              break;
            
            case 6: 
              Orca Orca= new Orca();
              addObject(Orca,Greenfoot.getRandomNumber (900),170);
              break;
              
            case 7: 
              Esqui3 es3= new Esqui3();
              int Y3=((Greenfoot.getRandomNumber(700))+170);
              if(Y3>=700)
                   {
                       Y3=700;
                    }
               addObject(es3,0,Y3);
              break;
              
            case 8: 
              Santa sa= new Santa();
              int Y4=(Greenfoot.getRandomNumber(700));
                Y4+=170;
                 if(Y4>=700)
                  {
                        Y4=700;
                   }
                  addObject(sa,900,Y4);
              break;
              
            case 9:
             Ping1 pin1= new Ping1();
              int Y5=((Greenfoot.getRandomNumber(700))+170);
              if(Y5>=700)
                   {
                       Y5=700;
                    }
               addObject(pin1,0,Y5);
              break;
              
             case 10:
              Oso3 o3= new Oso3();
              int Y6=(Greenfoot.getRandomNumber(700));
              Y6+=170;
              if(Y6>=700)
               {
                   Y6=700;
               }
              addObject(o3,900,Y6);
              break;
              
              case 11:
              Esqui1 es1= new Esqui1();
              addObject(es1,Greenfoot.getRandomNumber (900),170);
              break;
             
              
              case 12: 
              Esqui2 es2= new Esqui2();
              addObject(es2,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 13:
              MonoNi1 mn1= new MonoNi1();
              addObject(mn1,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 14:
              Patinador1 pat1= new Patinador1();
              addObject(pat1,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 15: 
              Oso2 o2= new Oso2();
              addObject(o2,Greenfoot.getRandomNumber (900),700);
              break;
              
              case 16: 
              Oso1 o1= new Oso1();
              addObject(o1,Greenfoot.getRandomNumber (900),700);
              break;
              
              case 17:
              Tiburon2 tib2= new Tiburon2();
              addObject(tib2,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 18:
              Oso4 o4= new Oso4();
              int Y7=(Greenfoot.getRandomNumber(700));
              Y7+=170;
              if(Y7>=700)
               {
                   Y7=700;
               }
              addObject(o4,900,Y7);
              break;
               
              case 19:
              Moto1 m1=new Moto1();
              addObject(m1, Greenfoot.getRandomNumber(900), 700);
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
     * aparece obstaculo 3 cada 5 segundos  
     * @param o1 Objeto clase Obstaculo 3
     */
    public void apareceObs()
   {
       if(timerObs.millisElapsed()> 5000){
         Obs3 o1= new Obs3();
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
     * Cuando la variable pasaNivel pasa a ser verdadera, se termina el nivel 5
     * se detiene la musica y crea el mundo 6.
     * El mundo 6 recibe la variable Energia y la variable Km
     * 
     * @param Energia Guarda el valor de la Energia del nivel
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     * @param Nivel6 Nivel 6
     */
    public void finN5()
    {
        if(pasaNivel==true){//cambiar por 230000
            int Energia= contadorEnergia.value;
            int Km=contadorKm.value;
            musicaN5.stop();
            musicaN52.stop();
            N6 Nivel6= new N6(Energia, Km);   
            Greenfoot.setWorld(Nivel6);
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
            
            musicaN5.stop();
            musicaN52.stop();
            
            Greenfoot.setWorld(new Perdiste(Km,Nombre));
            musicaN5.stop();
            musicaN52.stop();
        }
    }
     
    
    //NEVADA NIVEL 5
    /**
     * Nevada crea objetos Nieve
     */
    public void Nevada()
    {
        if(Greenfoot.getRandomNumber(100)<101)
        {
            addObject(new Nieve(),Greenfoot.getRandomNumber(getWidth()-10),0);
        }
    }
    
    }


