/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadoresdeempresa.classes;

import trabajadoresdeempresa.interfaces.Cobrador;

/**
 *
 * @author AULA1
 */
public class Empleado implements Cobrador{
    
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    
    
    
    public float totalDelMes() {
        return 0;
        
    }
}//fin de clase
