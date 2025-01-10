package org.example;
public class Main {
    public static void main(String[] args) {

        Efectivo pagoEfec = new Efectivo(400.5);
        Credito pagoCred =new Credito("123-132-123-1231");

        pagoEfec.ProcesandoPago();

        pagoCred.ProcesandoPago();

    }
}