/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_unchecked_exceptions;

/**
 *
 * @author invitado
 */
public class EVA3_2_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = null;
        System.out.println(perso.toString());
        
        int arreglo[] = new int[10];
        
        arreglo[15] = 100;
       
       int x = 10, y = 0;
       int resu = x / y;
        System.out.println(resu);
    }
    
    class Persona{
    
    }
    }
    

