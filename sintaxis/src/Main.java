//Zona de importación
import java.util.Scanner;


//Clase principal
public class Main {


    //Metodo principal
    public static void main(String[] args) {


        /* System.out.println("Hello, Andrea Rodríguez!");
        System.out.println("Hello, Andrea Rodríguez!");
        System.out.println("Hello, Andrea Rodríguez!");*/


     // 2. Cadenas


      /*  String cadena= "andrea" + "rodríguez" + "pérez";
        System. out.println(cadena);

      //Medir longitud de la cadena
        System.out.println(cadena.length());

      //Letras que estan en ese rango
        System.out.println(cadena.substring(2,5));
      //Letras que están a partir de ese número
        System.out.println(cadena.substring(2));
        //Letras que estan en ese rango
        System.out.println(cadena.substring(0,5)); */

/*
      //3. Variables
        String cadena= "333", cadena2, cadena3;
        int entero= 3, entero2, entero3;
        double decimal= 3.3, decimal2, decimal3;


      //Convertir cadena a int
      entero2= Integer.parseInt(cadena);
      System.out.println(entero2 );


      //Convertir double a int
        entero3= (int) decimal;
        System.out.println(entero3);


      //Convertir double a cadena
      cadena2= String.valueOf(decimal);
      System.out.println(cadena2);

      //Convertir de int a double
        decimal2= Double.valueOf(entero);
        System.out.println(decimal2);


       //Conversión implícita
       int i =12;
       double numd= i;
       System.out.println(numd);

       */

        /*

        //4. Solicitud de datos


        Scanner scn= new Scanner(System.in);

        System.out.println("Escribe una cadena:");
        String cadena= scn.nextLine();


        System.out.println("Escribe un número entero:");
        int entero= scn.nextInt();


        System.out.println("Escribe un número decimal:");
        double decimal = scn.nextDouble();

        System.out.println("Número decimal guardado:"+ decimal);
        System.out.println("Número entero guardado:"+ entero);
        System.out.println("Cadena guardada:"+ cadena);


         */

        //5. Boolean, operadores lógicos y de comparación
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9 );
        System.out.println(10 <= 9);
        System.out.println(10 != 9);


        //Operadores lógicos
        int x= 3;
        System.out.println(x < 5 && x > 10);
        System.out.println(x < 5 || x > 10);
        System.out.println(!(x < 5 && x > 10));


    }
}