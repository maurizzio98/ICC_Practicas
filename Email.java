import java.util.Scanner ;

/**
 * Programa que extraiga la dirección electrónica del dominio ciencias de un texto.
 * @author Mauricio Chávez Olea
 */

public class Email {
    public static void main(String[] pps) {

      Scanner in = new Scanner (System.in) ;
      String texto, email, textominus ;
      int posicionciencias, posicionarroba, hashcode ;

      System.out.println("Dame un texto:") ;
      texto = in.nextLine() ;


      texto = texto.trim() ;
      textominus = texto.toLowerCase() ;
      posicionarroba= textominus.indexOf("@") ;

      if(posicionarroba==-1){ //ME FALTAN CONDICIONES

      System.out.println("No hay direccion electronica");

    } //ACABA RESTRICCION NO EMAIL

      else {

        posicionciencias= textominus.indexOf("@ciencias.unam.mx") ;

        if(posicionciencias==-1){ //Me FALTA METODO PARA CONSEGUIR CORREO

          hashcode = texto.hashCode(); //CORREO NO ES IGUAL A TEXTO :v

          System.out.println("La direccion es " + hashcode +" pero no está en el dominio de ciencias");
        } //ACABA RESTRICCION NO CORREO DE CIENCIAS

        else {

            System.out.println(texto);
            System.out.println(posicionciencias);


        } //ACABA ELSE SI CORREO CIENCIAS

      } //ACABA ELSE SÍ CORREO ELECTRÓNICO


    } //NO BORRAR - PUBLIC CLASS
} //NO BORRAR - MAIN()
