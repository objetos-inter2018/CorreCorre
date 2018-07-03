import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Crea Nivel 3 del juego
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class N3 extends World
{
    private GreenfootSound musicaN3 = new GreenfootSound ("nivel3.wav");
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
     public JN3 Jugador;
    public boolean pasaNivel;
    
    /**
     * Constructor for objects of class N3.
     * 
     */
    public N3(int Energia, int Km)
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
        Jugador=new JN3();
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
        musicaN3.play();
        ApareceEne(timerEne);
        kmR();
        apareceObs();
        potAgua();
        potPesas();
        limPizza();
        limVeneno();
        finN3();
        PerdisteJ();
        aparecePasN();
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
              carro1 c1= new carro1();
              addObject(c1,Greenfoot.getRandomNumber (900),700);
              break;
              
            case 2: 
              corr1 co1= new corr1();
              int Y=(Greenfoot.getRandomNumber(700));
              Y+=170;
              if(Y>=700)
               {
                   Y=700;
               }
              addObject(co1,900,Y);
              break;
      
      
            case 3: 
              corr2 c2= new corr2();
              int Y2=((Greenfoot.getRandomNumber(700))+170);
               if(Y2>=700)
                {
                    Y2=700;
                 }
                addObject(c2,0,Y2);
              break;
              
              
            case 4: 
              bici1 b1= new bici1();
              addObject(b1,Greenfoot.getRandomNumber (900),170);
              break;
            
            case 5:
              carro2 ca2= new carro2();
              addObject(ca2,Greenfoot.getRandomNumber (900),700);
              break;
            
            case 6: 
              Bom1 bom1= new Bom1();
              addObject(bom1,Greenfoot.getRandomNumber (900),170);
              break;
              
            case 7: 
              Bici2 b2= new Bici2();
              int Y3=((Greenfoot.getRandomNumber(700))+170);
              if(Y3>=700)
                   {
                       Y3=700;
                    }
               addObject(b2,0,Y3);
              break;
              
            case 8: 
              Perro perr= new Perro();
              int Y4=(Greenfoot.getRandomNumber(700));
                Y4+=170;
                 if(Y4>=700)
                  {
                        Y4=700;
                   }
                  addObject(perr,900,Y4);
              break;
              
            case 9:
             Momia m= new Momia();
              int Y5=((Greenfoot.getRandomNumber(700))+170);
              if(Y5>=700)
                   {
                       Y5=700;
                    }
               addObject(m,0,Y5);
              break;
              
             case 10:
              caballo ca= new caballo();
              int Y6=((Greenfoot.getRandomNumber(700))+170);
              if(Y6>=700)
                   {
                       Y6=700;
                    }
               addObject(ca,0,Y6);
              break;
              
              case 11:
              Camello cam= new Camello();
              int Y7=((Greenfoot.getRandomNumber(700))+170);
              if(Y7>=700)
                   {
                       Y7=700;
                    }
               addObject(cam,0,Y7);
              break;
              
              case 12: 
              Camion camion= new Camion();
              addObject(camion,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 13:
              Serp1 s1= new Serp1();
              addObject(s1,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 14:
              Serp2 s2= new Serp2();
              addObject(s2,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 15: 
              Egip1 e1= new Egip1();
              addObject(e1,Greenfoot.getRandomNumber (900),700);
              break;
              
              case 16: 
              Egip2 e2= new Egip2();
              addObject(e2,Greenfoot.getRandomNumber (900),700);
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
     * Cuando la variable pasaNivel pasa a ser verdadera, se termina el nivel 3
     * se detiene la musica y crea el mundo 4.
     * El mundo 4 recibe la variable Energia y la variable Km
     * 
     * @param Energia Guarda el valor de la Energia del nivel
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     * @param Nivel4 Nivel 4
     */
    public void finN3()
    {
        if(pasaNivel==true){//cambiar por 230000
            int Energia= contadorEnergia.value;
            int Km=contadorKm.value;
            musicaN3.stop();
            N4 Nivel4= new N4(Energia, Km);   
            Greenfoot.setWorld(Nivel4);
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
            
            musicaN3.stop();
            
            Greenfoot.setWorld(new Perdiste(Km,Nombre));
            musicaN3.stop();
        }
    }
     
    
    }


