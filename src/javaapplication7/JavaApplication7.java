
package javaapplication7;

public class JavaApplication7 {
import javax.swing.JOptionPane;
class salario{
    public static void main(String[] args) {
        int  productos = 0;
        int total = 0;
        productos = Integer.parseInt(JOptionPane.showImputDialog("Ingrese el "
                + " precio del producto:"));
        
        while(productos>0){
          total=total+productos;
          productos=Integer.parseInt(JOptionPane.showImputDialog("Ingrese el "
                + " precio del producto:"));
        }
        
        double salario = (total*0.09)+200.0;
        System.out.println ("el salario del pobre señor es: "+salario);
             
    }
        
        
  
    }
    
}
