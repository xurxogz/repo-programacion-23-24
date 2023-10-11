package UD02.apuntes01;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        final double IVA = 0.21;
        final double UMBRAL_DESCUENTO = 100;
        final double DESCUENTO = 0.05;

        double precio;
        int unidades;
        double precioSinIva;
        double iva;
        double precioConIva;
        double descuento;
        double precioFinal;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio del producto: ");
        precio = sc.nextDouble();
        System.out.print("Número de unidades: ");
        unidades = sc.nextInt();
        sc.close();

        // Proceso
        precioSinIva = precio * unidades;
        iva = precioSinIva * IVA;
        precioConIva = precioSinIva + iva;

        if (precioConIva > UMBRAL_DESCUENTO) {
            descuento = precioConIva * DESCUENTO;
            precioFinal = precioConIva - descuento;
        } else {
            precioFinal = precioConIva;
        }

        // Salida
        System.out.printf("Precio Final: %.2f € %n", precioFinal);
    }

}
