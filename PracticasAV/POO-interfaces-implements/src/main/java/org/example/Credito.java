package org.example;

public class Credito implements MetodoPago{

    private final String numTarjeta;

    public Credito(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public void ProcesandoPago() {
        System.out.println("procesando pago con el numero de tarjeta: "+numTarjeta);

    }

    @Override
    public void OtroMetodo() {
        System.out.println("procesando...................");
    }
}
