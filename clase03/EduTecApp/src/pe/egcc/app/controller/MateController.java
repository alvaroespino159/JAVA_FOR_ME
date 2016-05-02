
package pe.egcc.app.controller;

import pe.edu.lb.MateLib;


public class MateController {
    
private final MateLib mate;    
    
    public MateController(){
         mate = new MateLib();
        
    }


    public int promediar(int n1, int n2) {
       return mate.promediar(n1, n2);
    }

    public int promediar(int n1, int n2, int n3) {
       return mate.promediar(n1, n2, n3);
       
    }

    public int promediar(int n1, int n2, int n3, int n4){
        
        return mate.promediar(n1, n2, n3, n4);
    }
    
    
    public int promediar(int n1, int n2, int n3, int n4, int n5){
        return mate.promediar(n1, n2, n3, n4, n5);
        
    }
    
}


  
