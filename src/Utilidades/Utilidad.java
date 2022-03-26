package Utilidades;

import java.util.Scanner;

public class Utilidad {
    private Scanner sc = new Scanner(System.in);

    public String leerString(String msj){
        generarEspacio();
        System.out.println(msj);
        return sc.nextLine();
    }

    public int leerInt(String msj){
        generarEspacio();
        System.out.println(msj);
        return sc.nextInt();
    }

    public void imprimir(String msj){
        generarEspacio();
        System.out.println(msj);
    }

    public void generarEspacio(){
        System.out.println("----------------------------");
    }
}