package Modelo;


public class Logica {
    private int numero1;
    private int numero2;
    private int resultado;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int sumar(){
        this.resultado = this.numero1 + this.numero2;
        
        return this.resultado;
    }
    
    public int restar(){
        this.resultado = this.numero1 - this.numero2;
        
        return this.resultado;
    }
}
