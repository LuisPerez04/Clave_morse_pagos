package codigo_morse;

import java.util.Scanner;

public class CODIGO_MORSE {
 public static String[][] aCodigo;
    
    public static void arrayList(){
        //Alfabeto
        aCodigo = new String[27][2];
        aCodigo[0][0] = "A";  
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        //Codigo Morse
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
    }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cualquiera frase de su agrado: ");
        String frase = sc.nextLine().toUpperCase();
        char carFrase[] = frase.toCharArray();
        arrayList();
        mi_bucle(frase, carFrase);
        System.out.println(pago_palabra(frase, carFrase));   
    }
    
        public static String caracteres_1(char car) {
        //Caracter de conversion
        int car_no = (int) car;
        return aCodigo[car_no - 65][0] + " " + aCodigo[car_no - 65][1];
    }
    
        public static void mi_bucle(String frase, char carFrase[]){
        //Bucle para poder imprimir los resultados deseados
        for (int i = 0; i < frase.length(); i++) {
         if(String.valueOf(carFrase[i]).equals(" ")){
          System.out.println("");
            } else {
                System.out.println(caracteres_1(carFrase[i]));
            }
        }
    }
    
        public static String pago_palabra(String frase, char carFrase[]){
        int contador_palabra = 1;
        int precio_pago = 0;
        //En este aspecto hay un bucle para ver las palabras que se usaron (numero)
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                contador_palabra++;
            }
        }
        //If para verificar
        if(contador_palabra <= 5){
            precio_pago = 10;
        } else{
            precio_pago = ((contador_palabra - 5) * 3) + 10;
        }
        return "El numero de palabras es : " + contador_palabra + "\n" + "Paga la cantidad de $" + precio_pago;
    }
    
}
    
    

