package helloworld;


public class OperadoresLogicos {
    
     public static void main(String[] args){
    
        boolean valor1 = true;    
        boolean valor2 = true;    
        boolean valor3 = true;
        boolean valor4 = false;
        // se realizan las operaciones logicas con los datos declarados arriba
        //operador &&
        System.out.println("Primer resultado: "+(valor1&&valor2));//true
        System.out.println("Segundo resultado: "+(valor3&&valor4));//false
        //Operador ||
        System.out.println("Tercer resultado: "+(valor1||valor2));//true
        System.out.println("Cuarto resultado: "+(valor3||valor4));//true
        //Operador !
        System.out.println("Quinto resultado: "+(!valor1));//false
        System.out.println("Sexto resultado: "+(!valor4));//true
    
    }
    
}
