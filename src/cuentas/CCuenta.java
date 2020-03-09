/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;


public class CCuenta {


  
   public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}




   private String nombre;
   private String cuenta;
   private double saldo;
   private double tipoInterés;

    
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
    
    /**
     * Asigna un nombre a la cuenta
     * @param nom nombre de la cuenta
     */
   
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    
    
    /**
     * Devuelve el saldo de la cuenta
     * @return saldo el saldo de la cuenta
     */
    
     public double estado ()
    {
        return saldo;
    }

    /**
     * Ingresa dinero a la cuenta
     * @param cantidad la cantidad a ingresar
     * @throws Exception
     */
     
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }


    /**
     * Retira dinero de la cuenta
     * @param cantidad la cantidad a retirar
     * @throws Exception
     */
    
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * Administa ael ingreso/retirada de la cuenta
     * @param miCuenta la cuenta a modificar
     * @param cantidad la cantidad a tratar
     * @param opcion la modificacion que se desea realizar
     */

	public static void operativa_cuenta(CCuenta miCuenta,float cantidad, int opcion){
	    if(opcion==2){
	        try 
	        {
	            miCuenta.retirar(cantidad);
	        } catch (Exception e)
	        {
	            System.out.print("Fallo al retirar");
	        }
	    }else if(opcion==1){
	        try
	        {
	            System.out.println("Ingreso en cuenta");
	            miCuenta.ingresar(cantidad);
	        } catch (Exception e)
	        {
	            System.out.print("Fallo al ingresar");
	        }
	    }
	}
    
  
    

  
  
}
