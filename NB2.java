import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NB2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NB2 extends World
{
    private GreenfootSound musicaB2 = new GreenfootSound ("Bonus2.wav");
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
     public JNB2 Jugador;
     public GuardaEspalda J;
     //Bonus
     public int bonusFin;
    
    /**
      * Constructor de la clase
      */
     public NB2(int Energia, int Km)
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
        Jugador=new JNB2();
        J=new GuardaEspalda();
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
        addObject(J,450,450);
    }
    
    /**
     * Actua del bonus 1
     */
    public void act()
    {
        musicaB2.play();
        EnemigosN3(13, timerEne );
        EnemigosN3(13, timerDesE );
        Sax();
        Not();
        limVeneno();
        finB1();
        FB1();
        //finN1();
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
        musicaB2.play();
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
     * aparece sax cada 5 segundos  
     * @param s1 Objeto clase sax
     */
    public void Sax()
    {
        if(timerN.millisElapsed()> 5000){
            Saxo s1= new Saxo();
            addObject(s1,Greenfoot.getRandomNumber (900),Greenfoot.getRandomNumber (700));
            
            timerN.mark();
        }
    }
    
    /**
     * aparece Not cada 5 segundos  
     * @param n1 Objeto clase Nota
     */
    public void Not()
    {
        if(timerP.millisElapsed()> 5000){
            Nota n1= new Nota();
            addObject(n1,Greenfoot.getRandomNumber (900),Greenfoot.getRandomNumber (700));
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
            NumEne=Greenfoot.getRandomNumber(20);
            switch (NumEne)
            {
                
                case 1: 
                Esqueleto1 es1= new Esqueleto1();
                addObject(es1,Greenfoot.getRandomNumber (900),700);
              
                  break;
          
      
                case 2: 
                  Zombie z= new Zombie();
                  addObject(z,Greenfoot.getRandomNumber (900),170);
              
                  Zombie z3= new Zombie();
                  addObject(z3,Greenfoot.getRandomNumber (900),170);
              
                  Zombie z2= new Zombie();
                  addObject(z2,Greenfoot.getRandomNumber (900),170);
              
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
                  Calabaza2 c2= new Calabaza2();
                  addObject(c2,Greenfoot.getRandomNumber (900),700);
              
                  Calabaza2 c22= new Calabaza2();
                  addObject(c22,Greenfoot.getRandomNumber (900),700);
              
                  Calabaza2 c23= new Calabaza2();
                  addObject(c23,Greenfoot.getRandomNumber (900),700);break;
                
                case 5:
                  bailador5 bailador5= new bailador5();
                  int Ybailador5=((Greenfoot.getRandomNumber(700))+170);
                   if(Ybailador5>=700)
                    {
                        Ybailador5=700;
                     }
                    addObject(bailador5,0,Ybailador5);
                  break;
                
                case 6: 
                  Momia3 m3=new Momia3();
                  addObject(m3, Greenfoot.getRandomNumber(900), 700);
              
                  Momia3 m32=new Momia3();
                  addObject(m32, Greenfoot.getRandomNumber(900), 700);
                  break;
                  
                case 7: 
                  Esqueleto4 esque4= new Esqueleto4();
              int Yesque4=((Greenfoot.getRandomNumber(900)));
               if(Yesque4>=700)
                {
                    Yesque4=700;
                 }
                addObject(esque4,Yesque4,700);
                  break;
                  
                case 8: 
                  
              Esqueleto5 es5=new Esqueleto5();
              addObject(es5, Greenfoot.getRandomNumber(900), 700);
                  break;
                  
                case 9:
                 bailador1 bailador1= new bailador1();
                int Ybai1=(Greenfoot.getRandomNumber(700));
                Ybai1+=170;
                 if(Ybai1>=700)
                  {
                        Ybai1=700;
                   }
                  addObject(bailador1,900,Ybai1);
                  break;
                  
                 case 10:
                  bailador4 bai4= new bailador4();
                  addObject(bai4,Greenfoot.getRandomNumber (900),700);
                  break;
                  
                  
                  case 11: 
                  bailador2 bai2= new bailador2();
                  addObject(bai2,Greenfoot.getRandomNumber (900),170);
                  break;
                  
                  
                  case 12:
                   bailador3 bai3= new bailador3();
                   addObject(bai3,Greenfoot.getRandomNumber (900),170);
                  break;
                  
                  case 13:
                   bailador6 bai6= new bailador6();
                   addObject(bai6,Greenfoot.getRandomNumber (900),170);
                  break; 
                  
                  case 16:
                  bailador8 bai8= new bailador8();
                  int Ymol=((Greenfoot.getRandomNumber(900)));
                   if(Ymol>=700)
                     {
                    Ymol=700;
                     }
                  addObject(bai8,Ymol,700);
                   break;
                  
                   case 17: 
                   Egip2 e2= new Egip2();
                   addObject(e2,Greenfoot.getRandomNumber (900),700);
                   break;
                   
                   case 18: 
                   Momia2 momia2= new Momia2();
                   addObject(momia2,Greenfoot.getRandomNumber (900),170);
                   break;
                   
                   case 19: 
                   Oso2 o2= new Oso2();
                   addObject(o2,Greenfoot.getRandomNumber (900),700);
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
    
    
    //Final Bonus2
    
     /**
      *TerminarBonus por tiempo 
      */
     public void FB1()
    {
        if(timerN.millisElapsed()> 210000){
            //musicaB1.stop();
            //Nivel3 Nivel2= new Bonus2();   
            //Greenfoot.setWorld( Bonus2);
            timerN.mark();
        }
    
   }
    
    
    /**
     * al tomar un limitador de bonus, se pasara al siguiente niv
     * se detiene la musica y crea el mundo 8
     * @param Energia Guarda el valor de la Energia del nivel
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     */
    public void finB1()
    {
        if(bonusFin==15){
            musicaB2.stop();
            int Energia=contadorEnergia.value;
            int Km=contadorKm.value;
            N8 N8= new N8(Energia,Km);   
            Greenfoot.setWorld( N8);
            timerN.mark();
        }
    }
   
    
}
