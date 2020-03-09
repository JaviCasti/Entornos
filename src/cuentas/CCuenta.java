/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;


public class CCuenta {


  
   String nombre;
   String cuenta;
   double saldo;
   double tipoInterés;

    
    public CCuenta ()
    {
    }
    
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
   
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    
    

    
     public double estado ()
    {
        return saldo;
    }

    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }



    
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
  
    

  
  
}
