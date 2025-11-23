/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author felix
 */
public class Vans extends Automovil {
    private int capacidadPasajeros;
/*Constructor*/
    public Vans(String Marca, String Modelo, String Color, int Year, int capacidadPasajeros, String tipoCombustible, double precio) {
        super(Marca, Modelo, Color, Year, tipoCombustible, precio);
        this.capacidadPasajeros = capacidadPasajeros;
    }
/*Constructor*/
    @Override
    public void Mostrar_Automovil() {
        super.Mostrar_Automovil();
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }
}
// el auto de la marca nissan en su modelo sentra siendo del anio 2020 
//incluye un color rojo tiene 4 llantas , tambien puede transportar 5 personas y su tipo de combustible gasolina 



