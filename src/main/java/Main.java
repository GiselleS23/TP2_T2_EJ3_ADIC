/* 3.- Dada una fecha expresada como un número entero de 6 dígitos, muestre sólo los dígitos que representan el mes.
Sacchetti, Maria Giselle C2 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numFecha;
    int mes;

    System.out.print("Ingrese la fecha en formato dia, mes, año como 6 dígitos (DDMMAA): ");
    numFecha = input.nextInt();

    /* si coloco el while no me toma el 01... al 09*/
    /* la otra es cambiar el formato al formato MMDDAA */
    
    /* while (numFecha < 100000 || numFecha > 999999) {
      System.out.println("Fecha no valida, deben ser 6 digitos positivos");
      numFecha = input.nextInt();
    } */

    mes = (numFecha % 1000) / 100;
    
    if (mes >= 1 && mes <= 9) {
      System.out.println("El mes es: 0" + mes);
    } else {
      System.out.println("El mes es: " + mes);
    }
/* HACER EL SWITCH */

    input.close();
  }
}