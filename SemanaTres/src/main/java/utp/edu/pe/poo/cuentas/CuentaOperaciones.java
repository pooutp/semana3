
package utp.edu.pe.poo.cuentas;

import utp.edu.pe.poo.cliente.Cliente;
import utp.edu.pe.poo.pantalla.LecturaInformacion;
import utp.edu.pe.poo.pantalla.Pantalla;

public class CuentaOperaciones {
    public static void hacerOperaciones( Cliente cliente){
        String[] opciones = {"Crear Cuenta [1]", "Deposito [2]", 
            "Retiro [3]", "Saldo disponible [4]", "Terminar [5]"};
    boolean apagado=true;
    int opcion;
    Pantalla pantalla = new Pantalla();
    Cuenta cuenta = new Cuenta();
    double valor;
    LecturaInformacion lecturaDatos = new LecturaInformacion();
    do{
        opcion = pantalla.Menu("Operaciones", opciones); 
        switch(opcion){
            case 1:
                valor = lecturaDatos.lecturaDouble("creando cuenta", 
                        "Monto de apertura S/: ");
                if(valor>=500){
                    cliente.setCuenta(cuenta);
                    cliente.getCuenta().abonarCuenta(valor);
                }
                break;
            case 2:   
                valor = lecturaDatos.lecturaDouble("DEPOSITO A LA CUENTA", 
                        "Monto a depositar S/: ");
                cliente.getCuenta().abonarCuenta(valor);
                break;
            case 3:                   
                valor = lecturaDatos.lecturaDouble("RETIRO DE LA CUENTA", 
                        "Monto a retirar S/: ");
                cliente.getCuenta().retirarCuenta(valor);
                break;
             case 4:                   
                System.out.println("Saldo disponible S/: " +cliente.getCuenta().saldoDisponible());               
                break;
            case 5:                   
                apagado=false;
                break;
            }            
        } while(apagado);
    }
}
