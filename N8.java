import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Crea Nivel 8 del juego
 * 
 * @author (Carrizales Cerda Luis Angel)
 *         (Elías Gomez Jorge Luis)
 * @version (version 1.1)
 */
public class N8 extends World
{
    private GreenfootSound musicaN8 = new GreenfootSound ("nivel8.mp3");
    private GreenfootSound musicaN82 = new GreenfootSound ("nivel82.mp3");
    private GreenfootSound musicaN83 = new GreenfootSound ("nivel83.mp3");
    //tiempo
     public SimpleTimer timer;
     public SimpleTimer timerN;
     public SimpleTimer timerL;
     public SimpleTimer timerPz;
     public SimpleTimer timerP;
     public SimpleTimer timerV;
     public SimpleTimer timerEne1; //enemigos
     public SimpleTimer timerEne2;
     public SimpleTimer timerEne3;
     public SimpleTimer timerEne4;
     public SimpleTimer timerEne5;
     public SimpleTimer timerEne6;
     public SimpleTimer timerEne7;
     
     //contadores
     private Counter contadorEnergia;
     private Counter contadorKm;
     
     //jugador
     public JN8 Jugador;
    
    
    /**
     * Constructor for objects of class N8.
     * 
     */
    public N8(int Energia, int Km)
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
        timerEne1= new SimpleTimer();
        timerEne2= new SimpleTimer();
        timerEne3= new SimpleTimer();
        timerEne4= new SimpleTimer();
        timerEne5= new SimpleTimer();
        timerEne6= new SimpleTimer();
        timerEne7= new SimpleTimer();
        
        //contador energia
        contadorEnergia = new Counter("ENERGIA: ");
        contadorEnergia.setValue(Energia);
        addObject(contadorEnergia,700,27);
        //contador km 
        contadorKm = new Counter("KM: ");
        contadorKm.setValue(Km);
        addObject(contadorKm,121,27);
        
         
        //fondonivel
        addObject(new TornadoFondo(), 421, 115);
        addObject(new Rayo1(), 780 , 85 );
        addObject(new Rayo1(), 180 , 85 );
        addObject(new Rayo3(), 70 , 160 );
        addObject(new Rayo4(), 850, 160 );
        
        //jugador
        Jugador=new JN8();
        addObject(Jugador, 450, 350);
       
        
        
        
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
        musicaN8.play();
        musicaN82.play();
        musicaN83.play();
        ApareceEne1();
        ApareceEne2(timerEne2);
        ApareceEne3(timerEne3);
        ApareceEne4(timerEne4);
        ApareceEne5(timerEne5);
        ApareceEne6(timerEne6);
        ApareceEne7(timerEne7);
        kmR();
        potAgua();
        potPesas();
        limPizza();
        limVeneno();
        Lluvia();
        PerdisteJ();
        Ganaste();
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
     * @param timerEne1 Timer de los Enemigos del nivel 1
     * @param timerEne2 Timer de los Enemigos del nivel 2
     * @param timerEne3 Timer de los Enemigos del nivel 3
     * @param timerEne4 Timer de los Enemigos del nivel 4
     * @param timerEne5 Timer de los Enemigos del nivel 5
     * @param timerEne6 Timer de los Enemigos del nivel 6
     * @param timerEne7 Timer de los Enemigos del nivel 7
     */
    public void started()
    {
        timer.mark();
        timerN.mark();
        timerP.mark();
        timerV.mark();
        timerPz.mark();
        timerL.mark();
        timerEne1.mark();
        timerEne2.mark();
        timerEne3.mark();
        timerEne4.mark();
        timerEne5.mark();
        timerEne6.mark();
        timerEne7.mark();
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
    * Ciclo que aparece los enemigos del nivel 1 cada 3 segundos, NumEne eligira el numero de
    * enemigo a aparecer en pantalla, tomara un numero random y entrara en un 
    * switch-case
    * 
    * @param NumEne 
    */
     public void ApareceEne1( )
    {   
        int NumEne;
        
        if(timerEne1.millisElapsed()> 3000){  
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
            
            timerEne1.mark();
        }
    }
    
    /**
    * Ciclo que aparece los enemigos del nivel cada segundo, NumEne eligira el numero de
    * enemigo a aparecer en pantalla, tomara un numero random y entrara en un 
    * switch-case
    * 
    * @param NumEne 
    */
    public void ApareceEne2(SimpleTimer T)
{
     int NumEne;
    if(T.millisElapsed()> 1000){ 
        NumEne=Greenfoot.getRandomNumber(9);
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
               
            default: 
                 
            }
            T.mark();
    }
    
}

    /**
    * Ciclo que aparece los enemigos del nivel 3 cada segundo, NumEne eligira el numero de
    * enemigo a aparecer en pantalla, tomara un numero random y entrara en un 
    * switch-case
    * 
    * @param NumEne 
    */
public void ApareceEne3(SimpleTimer T)
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

/**
    * Ciclo que aparece los enemigos del nivel 4 cada segundo, NumEne eligira el numero de
    * enemigo a aparecer en pantalla, tomara un numero random y entrara en un 
    * switch-case
    * 
    * @param NumEne 
    */
public void ApareceEne4(SimpleTimer T)
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

/**
    * Ciclo que aparece los enemigos del nivel 5 cada segundo, NumEne eligira el numero de
    * enemigo a aparecer en pantalla, tomara un numero random y entrara en un 
    * switch-case
    * 
    * @param NumEne 
    */
public void ApareceEne5(SimpleTimer T)
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

/**
    * Ciclo que aparece los enemigos del nivel 6 cada segundo, NumEne eligira el numero de
    * enemigo a aparecer en pantalla, tomara un numero random y entrara en un 
    * switch-case
    * 
    * @param NumEne 
    */
public void ApareceEne6(SimpleTimer T)
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
    
/**
    * Ciclo que aparece los enemigos del nivel 7 cada segundo, NumEne eligira el numero de
    * enemigo a aparecer en pantalla, tomara un numero random y entrara en un 
    * switch-case
    * 
    * @param NumEne 
    */
    public void ApareceEne7(SimpleTimer T)
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
    
    /**
     * Cuando pasan 20 segundos, el juego se termina y se pasa a la pantalla de ganaste
     * Ganaste recibe nombre del jugador y los kilometros obtenidos  a lo largo del juego
     * 
     * @param Nombre Guarda el nombre del jugador para mostrar en la pantalla de ganaste
     * @param Km Guarda el valor de los Km del nivel 
     * @param pasaNivel variable para controlar el paso de nivel
     * @param Ganaste Pantalla de Ganaste
     */
    public void Ganaste()
    {
        if(timerL.millisElapsed()> 20000){//cambiar por 230000
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
            musicaN8.stop();
            musicaN82.stop();
            musicaN83.stop();
            Greenfoot.setWorld(new Ganaste(Km, Nombre));
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
            
            musicaN8.stop();
            musicaN82.stop();
            musicaN83.stop();
            
            Greenfoot.setWorld(new Perdiste(Km,Nombre));
            musicaN8.stop();
            musicaN82.stop();
            musicaN83.stop();
        }
    }
     
    /**
     * Lluvia crea objetos Lluvia
     */ 
    public void Lluvia()
    {
        if(Greenfoot.getRandomNumber(150)<99)
        {
            addObject(new Lluvia(),900,Greenfoot.getRandomNumber(getHeight()-10));
            addObject(new Lluvia(),Greenfoot.getRandomNumber(getWidth()-10),0);
        }
    }
    
    }


