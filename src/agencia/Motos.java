/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author felix
 */
public class Motos extends Automovil {
    private double CaballosFuerza;
    private int cilindrada;
/*Constructor*/
    public Motos(String Marca, String Modelo, String Color, int Year, double CaballosFuerza, int cilindrada, double precio) {
        super(Marca, Modelo, Color, Year, "Gasolina", precio);
        this.CaballosFuerza = CaballosFuerza;
        this.cilindrada = cilindrada;
    }
/*Constructor*/
    @Override
    public void Mostrar_Automovil(){
        super.Mostrar_Automovil();
        System.out.println("Caballos de Fuerza: " + CaballosFuerza + " hp"
                + "\nCilindrada: " + cilindrada + " cc");
    }
}