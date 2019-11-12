package boletin8.pkg2;
import java.util.Scanner;
public class clase2 {
    
private float prod;
private int ven;
private float des;
private float total;

public void pedirDatos(){
Scanner sc = new Scanner(System.in);
    System.out.println("Introduce las ventas:");
    numeroVentas=sc.nextInt();
    System.out.println("El articulo vale:");
    prod=sc.nextInt();
}
public void comp(){
    
if (ven<100){
des=0;
total=prod*ven;
}
else if (ven>=100 && ven<200)
   if (prod>4000){
       total=prod*ven*0.95f;  
       des=(prod*ven)-total;
   }
   else {
   total=prod*ven*0.98f;
   des=(prod*ven)-total;
   }
else  
    if (prezoUnitario>4000){
    total=prod*ven*0.90f;
    des=(prod*ven)-total;
    }
    else {
    total=prod*ven*0.92f;
    des=(prod*ven)-total;    
    }    
    System.out.println("El precio del producto es de: "+prod+"\nLas ventas fueron: "+ven+"\nEl descuento es de "+des+" euros +"\nEl total a pagar es "+total+" euros");           

}
        
}
