package Utilidades;

import java.util.Scanner;

public class Utilidad {
    private Scanner sc = new Scanner(System.in);

    public String leerString(String msj){
        System.out.println(msj);
        return sc.nextLine();
    }

    public int leerInt(String msj){
        System.out.println(msj);
        return sc.nextInt();
    }
}