package utp.edu.pe.poo.cuentas;

public class Cuenta {
    private double monto;
    private String tipo;
    public Cuenta(){
        monto=0;
        tipo="Ahorro";
    }
    
    public Cuenta(double monto, String tipo){
        this.monto=monto;
        this.tipo = tipo;
    }
    
    public boolean retirarCuenta(double montoRetirar){
        if(monto> montoRetirar){
            monto-= montoRetirar;
            return true;
        } 
        return false;
    }
    public void abonarCuenta(double montoAbonar){       
        monto+= montoAbonar;
    }
    
    public double saldoDisponible(){
        return monto;
    }

    public String getTipo() {
        return tipo;
    }  
}
