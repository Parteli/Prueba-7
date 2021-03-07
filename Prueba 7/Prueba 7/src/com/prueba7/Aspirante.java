/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba7;

/**
 *
 * @author Murilo
 */
public class Aspirante {
    
    public static boolean Verificar(int edad) throws Exception
    {
        if(edad < 0) throw new Exception("Edad debe ser mayor que cero");
        return (edad >= 18 && edad <= 40);
    }
    
    public static int NivelAcceso(boolean ap1,boolean ap2,boolean ap3)
    {
        if(ap1==true && ap2==true) { return 1; }
        else if( ap3==true ) { return 2; }
        return 3;
    }
}
