package org.example;

public class Gerente extends Empleados {

    private final int diasTrabajados;

    public Gerente(String nombre, int sueldo, int salario, int diasTrabajados) {
        super(nombre, sueldo, salario);
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public int SalarioMens() {
        return sueldo*4;
    }

    @Override
    public String toString() {
        return super.toString()+ "Gerente{" +
                "diasTrabajados=" + diasTrabajados +
                '}';
    }
}
