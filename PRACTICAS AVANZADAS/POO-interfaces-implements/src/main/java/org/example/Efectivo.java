package org.example;

public class Efectivo implements  MetodoPago{
    private final double Moneda;

    public Efectivo(double moneda) {
        this.Moneda = moneda;
    }

    @Override
    public void ProcesandoPago() {

        System.out.println("procesando pago de: "+Moneda);

    }

    @Override
    public void OtroMetodo() {

        System.out.println("procesando............");

    }
}
