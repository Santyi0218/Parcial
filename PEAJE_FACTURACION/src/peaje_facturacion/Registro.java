package peaje_facturacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

    static ArrayList<Automovil> vehiculos = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        leerVehiculos();
        System.out.println("\nCoches introducidos:");
        mostrarVehiculos();
    }

public static void leerVehiculos(){
        String placa;
        String marca;
        String tipovehiculo;
        int valorpeaje;
        Automovil aux;
        int i, N;
        do {
            System.out.print("Número de vehiculos? ");
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine();
        for (i = 1; i <= N; i++) {
            System.out.println("Vehiculo " + i);
            System.out.print("Placa: ");
            placa = sc.nextLine();          
            System.out.print("Marca: ");
            marca = sc.nextLine();
            System.out.print("Tipovehiculo: ");
            tipovehiculo = sc.nextLine();
            System.out.print("Valor peaje: ");
            valorpeaje = sc.nextInt();
            sc.nextLine();
            aux = new Automovil();
            aux.setPlaca(placa);
            aux.setMarca(marca);
            aux.setTipovehiculo(tipovehiculo);
            aux.setValorpeaje(valorpeaje);
            
                      
            vehiculos.add(aux);
        }
    }


private static void mostrarVehiculos() {
        
        for(int i = 0; i< vehiculos.size(); i++)
            System.out.println(vehiculos.get(i));
        
    }
}