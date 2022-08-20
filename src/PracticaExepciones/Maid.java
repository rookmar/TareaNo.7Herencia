package PracticaExepciones;

import java.util.Scanner;

public class Maid {
    /**
     *
     * @param args metodo para realizar la prueba
     */
    public static void main(String[] args) {

        String nombre="";//varieble donde almacena nombre
        Scanner entrada= new Scanner(System.in);
        Nombre nombre1 = new Nombre();//crear un objeto o istancia

        System.out.println("ingrese un nombre para validar que solo tenga caracteres");//pide el nombre
        nombre = entrada.nextLine();//captura el nombre
        nombre1.setNombre(nombre);//almacena el nombre en el metodo seter
        /**
         * analiza el erro si exite
         */
        try{
            nombre1.AnalizarNombre();//manda a llamar el metdo con el error creado
        }catch (Exception e){
            System.out.println("El nombre no contiene solo carateres");//mensaje de error

        }



    }
}
