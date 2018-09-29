/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author guille
 */
public class Sobrecarga {

    int a;
    int b;
    
    public void metodo1(){
        
        System.out.println("Método único");        
    }
   public void metodo1(int a){
      System.out.println("Método único con un atributo: " + a);
        
    }
   public void metodo1(int a, int b){
          System.out.println("Método único con dos atributos: "+ a +" " +b );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sobrecarga objeto1 = new Sobrecarga();
        
        objeto1.metodo1();
        objeto1.metodo1(8);
        objeto1.metodo1(12, 7);
        
        
        
    }
        
 }
 
   