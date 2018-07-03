import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Crea Nivel 6 del juego
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class N6 extends World
{
    private GreenfootSound musicaN6 = new GreenfootSound ("Monster.wav");
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
     public JN6 Jugador;
    public boolean pasaNivel;
    
    /**
     * Constructor for objects of class N6.
     * 
     */
    public N6(int Energia, int Km)
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
        Jugador=new JN6();
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
        musicaN6.play();
        ApareceEne(timerEne);
        kmR();
        apareceObs();
        potAgua();
        potPesas();
        limPizza();
        limVeneno();
        finN6();
        PerdisteJ();
        aparecePasN();
        Viento();
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
              Esqueleto1 es1= new Esqueleto1();
              addObject(es1,Greenfoot.getRandomNumber (900),700);
              
              Esqueleto1 es12= new Esqueleto1();
              addObject(es12,Greenfoot.getRandomNumber (900),700);
              
              Esqueleto1 es13= new Esqueleto1();
              addObject(es13,Greenfoot.getRandomNumber (900),700);
              break;
              
      
            case 2: 
              Murcielago1 mur1= new Murcielago1();
              int Y=(Greenfoot.getRandomNumber(700));
              Y+=170;
              if(Y>=700)
               {
                   Y=700;
               }
              addObject(mur1,900,Y);
              
               Murcielago1 mur2= new Murcielago1();
              int Y2=(Greenfoot.getRandomNumber(700));
              Y2+=170;
              if(Y2>=700)
               {
                   Y2=700;
               }
              addObject(mur2,900,Y2);
              
               Murcielago1 mur3= new Murcielago1();
              int Y3=(Greenfoot.getRandomNumber(700));
              Y3+=170;
              if(Y3>=700)
               {
                   Y3=700;
               }
              addObject(mur3,900,Y3);
              
               Murcielago1 mur4= new Murcielago1();
              int Y4=(Greenfoot.getRandomNumber(700));
              Y4+=170;
              if(Y4>=700)
               {
                   Y4=700;
               }
              addObject(mur4,900,Y4);
              
               Murcielago1 mur5= new Murcielago1();
              int Y5=(Greenfoot.getRandomNumber(700));
              Y5+=170;
              if(Y5>=700)
               {
                   Y5=700;
               }
              addObject(mur5,900,Y5);
              
              break;
      
      
            case 3: 
              Bruja1 bru1= new Bruja1();
              int Yb=((Greenfoot.getRandomNumber(700))+170);
               if(Yb>=700)
                {
                    Yb=700;
                 }
                addObject(bru1,0,Yb);
              break;
              
              
            case 4: 
              Calabaza1 ca1= new Calabaza1();
              addObject(ca1,Greenfoot.getRandomNumber (900),170);
              break;
            
            case 5:
              Tumba1 tu1= new Tumba1();
              addObject(tu1,Greenfoot.getRandomNumber (900),700);
              break;
            
            case 6: 
              Arbol1 ar1= new Arbol1();
              addObject(ar1,Greenfoot.getRandomNumber (900),170);
              break;
              
            case 7: 
              Esqueleto2 es2= new Esqueleto2();
              int Ye1=((Greenfoot.getRandomNumber(700))+170);
              if(Ye1>=700)
                   {
                       Ye1=700;
                    }
               addObject(es2,0,Ye1);
               
               Esqueleto2 es3= new Esqueleto2();
              int Yy=((Greenfoot.getRandomNumber(700))+170);
              if(Yy>=700)
                   {
                       Y3=700;
                    }
               addObject(es3,0,Yy);
               
               Esqueleto2 es4= new Esqueleto2();
              int Yy4=((Greenfoot.getRandomNumber(700))+170);
              if(Yy4>=700)
                   {
                       Yy4=700;
                    }
               addObject(es4,0,Yy4);
              break;
              
            case 8: 
              Bruja2 bru2= new Bruja2();
              int Yb2=(Greenfoot.getRandomNumber(700));
                Yb2+=170;
                 if(Yb2>=700)
                  {
                        Y4=700;
                   }
                  addObject(bru2,900,Yb2);
              break;
              
            case 9:
             Frank1 f1= new Frank1();
              int Yf1=((Greenfoot.getRandomNumber(700))+170);
              if(Yf1>=700)
                   {
                       Yf1=700;
                    }
               addObject(f1,0,Yf1);
             Frank1 f2= new Frank1();
              int Yf2=((Greenfoot.getRandomNumber(700))+170);
              if(Yf2>=700)
                   {
                       Yf2=700;
                    }
               addObject(f1,0,Yf2);
               
               break;
              
             case 10:
              Esqueleto3 e3= new Esqueleto3();
              int Y6=(Greenfoot.getRandomNumber(700));
              Y6+=170;
              if(Y6>=700)
               {
                   Y6=700;
               }
              addObject(e3,900,Y6);
              break;
              
              case 11:
              Ojo ojo= new Ojo();
              addObject(ojo,Greenfoot.getRandomNumber (900),170);
              break;
             
              
              case 12: 
              Momia2 momia2= new Momia2();
              addObject(momia2,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 13:
              Gato1 g1= new Gato1();
              addObject(g1,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 14:
              Zombie z= new Zombie();
              addObject(z,Greenfoot.getRandomNumber (900),170);
              
              Zombie z3= new Zombie();
              addObject(z3,Greenfoot.getRandomNumber (900),170);
              
              Zombie z2= new Zombie();
              addObject(z2,Greenfoot.getRandomNumber (900),170);
              
              break;
              
              
              case 15: 
              Dracula d= new Dracula();
              addObject(d,Greenfoot.getRandomNumber (900),700);
              break;
              
              case 16: 
              Calabaza2 c2= new Calabaza2();
              addObject(c2,Greenfoot.getRandomNumber (900),700);
              
              Calabaza2 c22= new Calabaza2();
              addObject(c22,Greenfoot.getRandomNumber (900),700);
              
              Calabaza2 c23= new Calabaza2();
              addObject(c23,Greenfoot.getRandomNumber (900),700);
              break;
              
              case 17:
              Monstruo1 mon1= new Monstruo1();
              addObject(mon1,Greenfoot.getRandomNumber (900),170);
              break;
              
              case 18:
              fantasma1 fant1 =new fantasma1();
              int Y7=(Greenfoot.getRandomNumber(700));
              Y7+=170;
              if(Y7>=700)
               {
                   Y7=700;
               }
              addObject(fant1,900,Y7);
              break;
               
              case 19:
              Momia3 m3=new Momia3();
              addObject(m3, Greenfoot.getRandomNumber(900), 700);
              
              Momia3 m32=new Momia3();
              addObject(m32, Greenfoot.getRandomNumber(900), 700);
              
              Momia3 m33=new Momia3();
              addObject(m33, Greenfoot.getRandomNumber(900), 700);
              break;
              
              case 20: 
              Frank2 fr2= new Frank2();
              int Yfr2=((Greenfoot.getRandomNumber(700))+170);
               if(Yfr2>=700)
                {
                    Yfr2=700;
                 }
                addObject(fr2,0,Yfr2);
              break;
              
              case 21: 
              Lobo lobo= new Lobo();
              int Ylo=((Greenfoot.getRandomNumber(700))+170);
               if(Ylo>=700)
                {
                    Ylo=700;
                 }
                addObject(lobo,0,Ylo);
              break;
              
              case 22: 
              Esqueleto4 esque4= new Esqueleto4();
              int Yesque4=((Greenfoot.getRandomNumber(900)));
               if(Yesque4>=700)
                {
                    Yesque4=700;
                 }
                addObject(esque4,Yesque4,700);
              break;
              
              case 23:
              Esqueleto5 es5=new Esqueleto5();
              addObject(es5, Greenfoot.getRandomNumber(900), 700);
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
     * aparece obstaculo 4 cada 5 segundos  
     * @param o1 Objeto clase Obstaculo 4
     */
    public void apareceObs()
   {
       if(timerObs.millisElapsed()> 5000){
         Obs4 o1= new Obs4();
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
     * Cuando la variable pasaNivel pasa a ser verdadera, se termina el nivel 6
     * se detiene la musica y crea el mundo 7.
     * El mundo 7 recibe la variable Energia y la variable Km
     * 
     * @param Energia Guarda el valor de la Energia del nivel
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     * @param Nivel7 Nivel 7
     */
    public void finN6()
    {
        if(pasaNivel==true){//cambiar por 230000
            int Energia= contadorEnergia.value;
            int Km=contadorKm.value;
            musicaN6.stop();
            N7 Nivel7= new N7(Energia, Km);   
            Greenfoot.setWorld(Nivel7);
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
            
            musicaN6.stop();
            
            Greenfoot.setWorld(new Perdiste(Km,Nombre));
            musicaN6.stop();
        }
    }
     
    
    //Viento NIVEL 6
    /**
     * Viento crea objetos hojas
     */
    public void Viento()
    {
        if(Greenfoot.getRandomNumber(100)<99)
        {
            addObject(new Hojas(),0,Greenfoot.getRandomNumber(getHeight()-10));
            addObject(new Hojas(),Greenfoot.getRandomNumber(getWidth()-10),0);
        }
    }
    }


