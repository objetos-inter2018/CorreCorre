import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Crea Nivel 1 del juego
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class N1 extends World
{
    private GreenfootSound musicaN1 = new GreenfootSound ("juego1.mp3");
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
     public JN1 Jugador;
     
     public boolean pasaNivel;
    
    /**
     * Constructor for objects of class N1.
     * 
     */
    public N1()
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
        contadorEnergia.setValue(100);
        addObject(contadorEnergia,700,27);
        //contador km 
        contadorKm = new Counter("KM: ");
        contadorKm.setValue(0);
        addObject(contadorKm,121,27);
        
        //jugador
        Jugador=new JN1();
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
        musicaN1.play();
        ApareceEne( );
        kmR();
        apareceObs();
        potAgua();
        potPesas();
        limPizza();
        limVeneno();
        
        finN1();
        aparecePasN();
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
     * ciclo que aparece los enemigos cada 3 segundos, con NumEne se elige el  
     * Enemigo que aparecera en pantalla
     * @param NumEne Numero de enemigo que aparecera en pantalla
     */
    public void ApareceEne( )
    {   
        int NumEne;
        
        if(timerEne.millisElapsed()> 3000){  
            NumEne=Greenfoot.getRandomNumber(5);
            
            
            if(NumEne==1){
                carro1 c1= new carro1();
                addObject(c1,Greenfoot.getRandomNumber (900),700);
            
            }
               else{
                if(NumEne==2){
                        corr1 co1= new corr1();
                        int Y=(Greenfoot.getRandomNumber(700));
                        Y+=170;
                        if(Y>=700)
                        {
                            Y=700;
                        }
                        
                        addObject(co1,900,Y);
            
                   }
                   else{
                       if(NumEne==3){
                             corr2 c2= new corr2();
                             int Y=((Greenfoot.getRandomNumber(700))+170);
                             if(Y>=700)
                             {
                                 Y=700;
                              }
                             addObject(c2,0,Y);
            
                    }
                    else{
                        
                          if(NumEne==4){
                                bici1 b1= new bici1();
                                 addObject(b1,Greenfoot.getRandomNumber (900),170);
            
                                 }
            
                    }
                }
            }
            
            timerEne.mark();
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
     * no pasa de 1000 el valor de energia
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
     */
    public void agarraPotKm()
    {
        
        contadorKm.add(5);
        
       
    }
    
    //
    /**
     * Metodo que regresa la cantidad de kilometros del contador
     * @return contadorKm Regresa el contador de kilometros
     */
    public int pasanivelresultadoskm()
    {
        
        return contadorKm.value;
        
       
    }
    
    /**
     * Metodo que regresa la cantidad de Energia del contador
     * @return contadorEnergia Regresa el contador de kilometros
     */
    public int pasanivelresultadose()
    {
        
        return contadorEnergia.value;
        
       
    }
    
    //obstaculos
    /**
     * aparece obstaculo 1 cada 5 segundos  
     * @param o1 Objeto clase Obstaculo 1
     */
   public void apareceObs()
   {
       if(timerObs.millisElapsed()> 5000){
         Obs1 o1= new Obs1();
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
     * Cuando la variable pasaNivel pasa a ser verdadera, se termina el nivel 1
     * se detiene la musica y crea el mundo 2.
     * El mundo 2 recibe la variable Energia y la variable Km
     * 
     * @param Energia Guarda el valor de la Energia del nivel
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     * @param Nivel2 Nivel 2
     */
    public void finN1()
    {
        if(pasaNivel==true){
            int Energia= contadorEnergia.value;
            int Km=contadorKm.value;
            musicaN1.stop();
            N2 Nivel2= new N2(Energia, Km);   
            Greenfoot.setWorld(Nivel2);
            //timerL.mark();
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
            
            musicaN1.stop();
            
            Greenfoot.setWorld(new Perdiste(Km,Nombre));
            musicaN1.stop();
        }
    }
     
    
    }


