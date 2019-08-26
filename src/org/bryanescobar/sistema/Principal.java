/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bryanescobar.sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author programacion
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sumar suma = new Sumar(0,0); 
        Resta restar = new Resta(0,0); 
        Multiplicacion multiplicar = new Multiplicacion(0,0);  
        Division divisiones = new Division(0,0);   //inicializamos en 0 los valores
        int opcion = 0;
        int contador=0;
        
        
        while(contador==0){
            
   
           JOptionPane.showMessageDialog (null,"Bienvenido!!");
           JOptionPane.showMessageDialog(null,"Opereaciones: \nSuma=1\n Resta=2\n Multiplicacion=3\n Division=4\n si Desea salir pon 5\n");
           opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion deseada: "));
       switch (opcion){
       case 1:     
        suma.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer valor !!"));
        suma.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo  valor!!"));
        JOptionPane.showMessageDialog(null,"Total de la Sumatoria  "+ suma.sumatoria(suma.valor1,suma.valor2));
       break;
       
       
      case 2:
       restar.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer valor!!"));
       restar.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo valor!!"));
       JOptionPane.showMessageDialog(null,"Total de la resta  "+restar.Restatoria(restar.valor1,restar.valor2));
       break;
      case 3:
        multiplicar.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer valor !!"));
        multiplicar.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo valor!!"));
        JOptionPane.showMessageDialog(null ,"Total de la Multiplicacion  "+multiplicar.Multiplicaciones(multiplicar.valor1,multiplicar.valor2));
      break;
      
      case 4:
         divisiones.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese uin primer valor !!"));
         divisiones.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo valor !!"));
         JOptionPane.showMessageDialog (null,"Total de la division  "+ divisiones.divisor(divisiones.valor1,divisiones.valor2));
      break;   
      case 5:
          contador++;
        break;
        
      default:
          JOptionPane.showMessageDialog (null,"Sintaxis error amigo!");
          break;
      }
       
       
   }
}
}
       