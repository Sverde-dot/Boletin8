package boletin8.pkg2;

import java.util.Scanner;
public class clase2 {
    Scanner sc=new Scanner(System.in);
    private int prod;
    private int pre=30;
    private int des;
    private float descuento = 0;
    public clase2(){
    }

   public clase2(int prod,int pre){
        this.prod=prod;
        this.pre=pre;
    }    
    public void setprod(){
        this.prod=prod;
    }
    public int getprod(){
        return prod; 
    }
    public void setPre(int pre) {
        this.pre = pre;
    }
    public int getPre() {
        return pre;
    }
    
    

    public void Paso(int prod){
        System.out.println("Inserte un valor numérico entero.");
        float respuesta = sc.nextFloat();
        //des=(int) (respuesta-respuesta * descuento);
        if (prod<100){
            prod=(int) (respuesta*pre);

        System.out.println("No habra descuento");
        }
        
        
        if (prod>=100&&prod<200){
            prod=(int) (respuesta*pre);
            /*if(pre>4000){
                descuento = 0.05f;

                System.out.println("El descuento fue de  " + des + ".");
            }
            else{
                descuento = 0.02f;

                System.out.println("El descuento fue de  " + des + ".");
            }*/
        }
        
        
        if(prod>=200){
            prod=(int) (respuesta*pre);
                /*if(pre>4000){
                    descuento = 0.10f;

                System.out.println("El descuento fue de  " + des + ".");
            }
                else{
                    descuento = 0.08f;

                System.out.println("El descuento fue de  " + des + ".");
            }*/
        }
        System.out.println("La cantidad insertada fue " + respuesta + ".");
        System.out.println("El precio final es " + prod);

        
    }
        
}