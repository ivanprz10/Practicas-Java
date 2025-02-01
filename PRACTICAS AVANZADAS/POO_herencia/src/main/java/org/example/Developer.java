package org.example;

public class Developer extends Empleados{
    private final String puesto;

    public Developer(String nombre, int sueldo, int salario, String puesto) {
        super(nombre, sueldo, salario);
        this.puesto = puesto;
    }
    public int SalarioMens(){
        return sueldo*4;
    }

    @Override
    public String toString() {
        return super.toString()+ "Developer{" +
                "puesto='" + puesto + '\'' +
                '}';
    }
}
