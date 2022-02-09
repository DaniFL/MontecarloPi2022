package aplicacion;

import dominio.Matematicas;

public class Principal {

    public static void main(String[] args){
        long intentos = Long.parseLong(args[0]);
        System.out.println("El número Pi es " + Matematicas.generarNumeroPi(intentos));
    }
}

