/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author danielrios
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        int ti_e;
        double su_i;
        double su_f = 0;
        double aumento = 0;

        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sueldo");
        su_i = entrada.nextDouble();
        System.out.println("Ingresar el tipo de empleado");
        ti_e = entrada.nextInt();

        if (ti_e == 1) {
            aumento = su_i * 0.05;
            su_f = aumento + su_i;
        } else {
            if (ti_e == 2) {
                aumento = su_i * 0.07;
                su_f = su_i + aumento;
            } else {
                if (ti_e == 3) {
                    aumento = su_i * 0.09;
                    su_f = su_i + aumento;
                } else {
                    if (ti_e == 4) {
                        aumento = su_i * 0.12;
                        su_f = su_i + aumento;
                    } else {
                        if (ti_e >= 5) {
                            aumento = su_i * 0.15;
                            su_f = su_i + aumento;
                        }
                    }
                }
            }

        }
        System.out.printf("Nombre de empleado: %s\nSueldo: $%s\nIncremento "
                + "de sueldo: $%s\nSueldo final: $%s\n", nombre, su_i,
                aumento, su_f);

    }
}
