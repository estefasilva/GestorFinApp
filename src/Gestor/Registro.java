package Gestor;

import java.util.Scanner;

public class Registro {

    Usuario usuario = new Usuario();

    Scanner sc = new Scanner(System.in);

double salary;
double incomings;
double bills;
double saves;
Usuario perfil;

public void registerData(){
    System.out.println(salary);
    System.out.println("Ingrese su nombre: ");
    perfil.name = sc.next();

    System.out.println(incomings);
    System.out.println("ingrese el apellido: ");
    perfil.LastName = sc.next();

    System.out.println(bills);
    System.out.println("ingrese su correo: ");
    perfil.email = sc.next();





}


}
