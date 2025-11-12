/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo06;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author danielrios
 */
public class Ejemplo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int dia_pago;
        double descuento;
        double total_final;
        int costo;
        int total;
        
        System.out.println("Ingrese nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese parroquia");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese dia de pago");
        dia_pago = entrada.nextInt();
     
       
        total = 25;
        descuento = total * 0.05;
        total_final = total + descuento;
        
        if ((dia_pago<10) && (parroquia.equals("El Valle") || 
                parroquia.equals("El Sagrario"))) {
            System.out.printf("Nombre: %s\nApellido: %s\nUsuario: %s\nEdad: "
                    + "%s\nParroquia: %s\nTotal: %s\nDescuento: "
                    + "%s\nTotal final: %s\n", nombre, apellido, usuario, 
                    edad, parroquia, total, descuento, total_final);
        } else {
            System.out.printf("%s\n", "acceso incorrecto");
    }
    
    }
}
