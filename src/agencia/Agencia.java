/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agencia;

/**
 *
 * @author felix
 */
public class Agencia {

    public static void main(String[] args) {
        // AUTOMOVILES
        Automovil deportivo1 = new Automovil("Audi", "R8", "Azul", 2024, "Gasolina", 3000000);
        Automovil deportivo2 = new Automovil("BMW", "M4", "Negro", 2023, "Gasolina", 2500000);
        deportivo1.Mostrar_Automovil();
        System.out.println("-------------------------------------------");
        deportivo2.Mostrar_Automovil();
        System.out.println("-------------------------------------------");

        // CAMIONES
        Camion camionCarga1 = new Camion("Kenwort", "Climbing", "Rojo", 2023, 8900, 3, 1500000);
        Camion camionCarga2 = new Camion("Volvo", "FH16", "Blanco", 2022, 12000, 4, 1800000);
        camionCarga1.Mostrar_Automovil();
        System.out.println("-------------------------------------------");
        camionCarga2.Mostrar_Automovil();
        System.out.println("-------------------------------------------");

        // MOTOS
        Motos gsxr150 = new Motos("Suzuki", "GSXR150", "Azul", 2026, 164, 150, 120000);
        Motos ninja = new Motos("Kawasaki", "Ninja 400", "Verde", 2025, 150, 400, 180000);
        gsxr150.Mostrar_Automovil();
        System.out.println("-------------------------------------------");
        ninja.Mostrar_Automovil();
        System.out.println("-------------------------------------------");

        // VANS
        Vans van1 = new Vans("Mercedes-Benz", "Sprinter", "Blanco", 2024, 12, "Diesel", 850000);
        Vans van2 = new Vans("Ford", "Transit", "Gris", 2023, 15, "Gasolina", 780000);
        van1.Mostrar_Automovil();
        System.out.println("-------------------------------------------");
        van2.Mostrar_Automovil();
        System.out.println("-------------------------------------------");
    }
}
