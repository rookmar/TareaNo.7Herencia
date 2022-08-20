package PracticaExepciones;

/**
 * clase para crear un error personalizado
 */
public class Nombre_Error extends Exception{//llama a la clase excpetion

    /**
     * constructor sin parametros
     */

    public Nombre_Error(){
/**
 * constructor con parametros
 */
    }
    public Nombre_Error(String msj_error){
        super(msj_error);//llama a la clase exception
    }


}
