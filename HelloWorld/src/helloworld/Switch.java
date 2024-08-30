package helloworld;


public class Switch {

    public static void main(String[] args) {
        /*
        char vocal = 'U';
        switch(vocal){
            case 'A':
                System.out.println("Vocal A");
                break;
            case 'E':
                System.out.println("Vocal E");
                break;
            case 'I':
                System.out.println("Vocal I");
                break;
            case 'O':
                System.out.println("Vocal O");
                break;
            case 'U':
                System.out.println("Vocal U");
                break;
            default:
                System.out.println("No se conoce la vocal");
                break;

        }*/
        
        int mes = 8;
        String nom_mes = "";
        
        switch (mes){
            case 1 -> nom_mes = "Enero";
            case 2 -> nom_mes = "Febrero";
            case 3 -> nom_mes = "Marzo";
            case 4 -> nom_mes = "Abril";
            case 5 -> nom_mes = "Mayo";
            case 6 -> nom_mes = "Junio";
            case 7 -> nom_mes = "Julio";
            case 8 -> nom_mes = "Agosto";
            case 9 -> nom_mes = "Septiembre";
            case 10 -> nom_mes = "Octubre";
            case 11 -> nom_mes = "Noviembre";
            case 12 -> nom_mes = "Diciembre";
        }
        System.out.println("Mes "+nom_mes);
    }
    
}
