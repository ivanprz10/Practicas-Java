package org.example;
public class Main {
    public static void main(String[] args) {

        Developer prog = new Developer("ivan",7000,1000,"Senior");
        Gerente geren = new Gerente("Juan", 7000,1000,23);

        System.out.println("el salario mensual es de: "+prog.SalarioMens());

        System.out.println(prog);

        System.out.println("el salario mensual del gerente es de :"+geren.SalarioMens());

        System.out.println(geren);

    }
}