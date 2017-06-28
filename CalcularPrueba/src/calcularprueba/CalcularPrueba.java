/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularprueba;

import java.util.Scanner;

/**
 *
 * @author Linux
 */
public class CalcularPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        int op;
        float num1, num2, res;
        do{
        do{
        System.out.println("MENU");
        System.out.println("1. - SUMA");
        System.out.println("2. - RESTA");
        System.out.println("3. - DIVISION");
        System.out.println("4. - MULTIPLICACION");
        System.out.println("5. - SALIR");
        System.out.println("Ingrese Opcion: ");
               
        op = s.nextInt();
        
        }while (op>5);
        
        
        switch (op) {
            
            case 1:{ 
                System.out.println("SUMA");
                System.out.println("Ingrese Numero: ");
                num1 = s.nextInt();
                System.out.println("Ingrese Numero: ");
                num2 = s.nextInt();
                
                res = num1 + num2;
                
                System.out.println("Resultado es: " + res);
         }break;
        
            case 2:{
                 System.out.println("RESTA");
                System.out.println("Ingrese Numero: ");
                num1 = s.nextInt();
                System.out.println("Ingrese Numero: ");
                num2 = s.nextInt();
                
                      
                System.out.println("Resultado es: " + (num1-num2) );
            }break;
    
            case 3:{
                
                System.out.println("DIVISION");
                System.out.println("Ingrese Numero: ");
                num1 = s.nextInt();
                System.out.println("Ingrese Numero: ");
                num2 = s.nextInt();
                
                                
                System.out.println("Resultado es: " + (num1/num2));
            }break;
            
            case 4:{
                System.out.println("MULTIPLICACION");
                System.out.println("Ingrese Numero: ");
                num1 = s.nextInt();
                System.out.println("Ingrese Numero: ");
                num2 = s.nextInt();
                
                System.out.println("Resultado es: " + (num1*num2));
            }break;
            
            case 5:{
                System.out.println("BYE");
            }break;
            
        }
     }while (op<=4);
        }
        
}
