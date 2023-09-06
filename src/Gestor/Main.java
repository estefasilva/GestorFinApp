package Gestor;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        Registro registro = new Registro();

        registro.perfil =  new Usuario();

        registro.salary = 256;

        registro.incomings = 300;

        registro.bills = 500;

        registro.registerData();
        //usuario.printData();

        registro.perfil.printData();


    }
}
