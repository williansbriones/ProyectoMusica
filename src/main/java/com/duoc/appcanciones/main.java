
package com.duoc.appcanciones;

import com.duoc.appcanciones.MTO.cancion;
import java.time.LocalDate;
import java.time.Month;


public class main {


    public static void main(String[] args) {
        
       cancion can1 = new cancion("Llamado de emergencia","Daddy yankee", false, false, "05:00" );
       
        System.out.println(can1);
        System.out.println(can1.duracionCancion(can1.getDuracion())[0]+" "+can1.duracionCancion(can1.getDuracion())[1]);
        System.out.println(can1.tipoDeCancion(can1.getDuracion()));
        
       
        
        
        
    }
    
}
