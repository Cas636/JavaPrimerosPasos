package helloworld;


public class OperadoresAsignacion {
    
     public static void main(String[] args){
    
        /*Asignaciones Simples
        int a = 5;
        int b = 6;
        a = b;
        System.out.println("a es igual: "+a);*/
    
        /*Ejemplo 2
        int a = 5, b = 10, c = 3, d = 8;
        a = a + 4;
        b = b - 5;
        c = c * 3;
        d = d / 4;
        System.out.println("a es igual: "+a);
        System.out.println("b es igual: "+b);
        System.out.println("c es igual: "+c);
        System.out.println("d es igual: "+d);*/
        
        /*Operaciones de asignación compuestas*/
        int a = 5, b = 10, c = 3, d = 8;
        a += 4;
        b -= 5;
        c *= 3;
        d /= 4;
        System.out.println("a es igual: "+a);
        System.out.println("b es igual: "+b);
        System.out.println("c es igual: "+c);
        System.out.println("d es igual: "+d);
        
    }
    
}
