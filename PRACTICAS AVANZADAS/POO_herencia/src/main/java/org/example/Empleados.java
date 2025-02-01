package org.example;

public abstract class Empleados {
    private String nombre;
    public int sueldo;
    private int salario;

    public Empleados(String nombre, int sueldo, int salario) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.salario = salario;
    }
    public abstract int SalarioMens();

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", salario=" + salario +
                '}';
    }
}
