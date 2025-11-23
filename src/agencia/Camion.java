/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author felix
 */

    
    public class Camion extends Automovil{
    private double pesoCarga;
    private int numEjes;
/*Constructor*/
    public Camion(String Marca, String Modelo, String Color, int Year, double pesoCarga, int numEjes, double precio) {
        super(Marca, Modelo, Color, Year, "Diesel", precio);
        this.pesoCarga = pesoCarga;
        this.numEjes = numEjes;
    }
/*Constructor*/
    @Override
    public void Mostrar_Automovil(){
        super.Mostrar_Automovil();
        System.out.println("Capacidad de carga: " + pesoCarga + " kg"
                + "\nNumero de ejes: " + numEjes);
    }
}