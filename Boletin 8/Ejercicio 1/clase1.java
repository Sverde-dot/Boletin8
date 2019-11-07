
package boletin8.pkg1;
import java.util.Scanner;
public class clase1 {
    Scanner sc=new Scanner(System.in);
    private int prod;

    public clase1(){
    }

   public clase1(int prod){
        this.prod=prod;
    }    
    public void setprod(){
        this.prod=prod;
    }
    public int getprod(){
        return prod; 
    }

    public void Paso(int prod){
        System.out.println("Inserte un valor numérico enteiro.");
        float respuesta = sc.nextFloat();
        if (prod<=500)
            prod=(int) (respuesta+respuesta * 50 / 100);
        
        if(prod>500&&prod<=1000)
            prod=(int) (respuesta+respuesta * 7 / 100);
        
        if(prod>1000&&prod<=5000)
            prod=(int) (respuesta+respuesta * 15 / 100);
        
        if(prod>5000)
            prod=(int) (respuesta-respuesta * 3 / 100);
        System.out.println("La cantidad insertada fue " + respuesta + ".");
        System.out.println("El incremento es de " + (prod - respuesta) + ".");
        System.out.println("El resultado fue " + prod + ".");
        
    }
        
}
