package PracticaExepciones;

/**
 * clase para introducir un nombre
 */
public class Nombre {

    private String nombre;

    /**
     * constructor sin parametros
     */

    public Nombre() {
        this.nombre = nombre;
    }

    /**
     *
     * @param nombre metodo que recibe en nombre que se introduce
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @throws Nombre_Error metedo para que el usuario solo ingrese numeros
     */
    public  void AnalizarNombre()throws Nombre_Error{

     for(int i=0;i<nombre.length();i++){ //ciclo for para llevar el control de cada caracter de la cadena nombre
         char caracter = nombre.charAt(i);//convierte datos de tipo cadena a tipo chart
         int valorASCII = (int) caracter;//codigo ascii para validar las letras
         if(valorASCII<65||valorASCII>122){ //condicion if donde indicaa que si e menor a 65 o mayor 122 contiene otro tipo de carcter que no solo son letras
             throw new Nombre_Error();//llama el metodo creado en la clase Nombre_error

         }

     }System.out.println("El Nombre es correcto");//menseje para validar que es correcot el nombre


    }
}
