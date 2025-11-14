/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author danielrios
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int op;
        String propietario;
        int valor_v;
        String tipo = "";
        double peaje = 0;
        
        // 6.  Escribir "Ingrese el primer valor la operación"
        System.out.println("Ingrese el nombre del propietario");
        // 7.  Leer valor1
        propietario = entrada.nextLine();
        System.out.println("Ingrese el valor del vehiculo");
        valor_v = entrada.nextInt();

        System.out.println("Selecciones el tipo de vehiculo\n"
                + "Ingrese 1 para vehiculo liviano particular\n"
                + "Ingrese 2 para vehiculo grande particular\n"
                + "Ingrese 3 para taxi\n"
                + "Ingrese 4 para bus urbano\n"
                + "Ingrese número:");
        op = entrada.nextInt();

        switch (op) {

            case 1:
                peaje = valor_v * 0.0001 + 2;
                tipo = "vehiculo liviano particular";
                break;

            case 2:
                peaje = valor_v * 0.002 + 2.5;
                tipo = "vehiculo grande particular";
                break;

            case 3:
                peaje = valor_v * 0.004 + 1.5;
                tipo = "taxi";
                break;
                
                case 4:
                peaje = valor_v * 0.005 + 2.2;
                tipo = "buses urbanos";
                break;

            default:
                System.out.println("Operación invalida, seleciones de 1 a 4");
                break;

        }

        System.out.printf("Peaje \"Buena vía\"\n\tPropietario: %s\nTipo: "
                + "%s\n\tValor: $%s\n\tPeaje: $%s\n", propietario, tipo, 
                valor_v, peaje);
    }
}
