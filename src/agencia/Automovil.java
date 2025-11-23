/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author felix
 */
//Definimos los atributos del constructor 
public class Automovil {
    private String Marca;
    private String Modelo;
    private String Color;
    private int Year;
    private String tipoCombustible;
    private double precio;
/*Constructor*/
    public Automovil(String Marca,String Modelo, String Color, int Year, String tipoCombustible, double precio){
        this.Marca = Marca;
        //sobre cargamos el constructor
        this.Modelo = Modelo;
        this.Color = Color;
        this.Year = Year;
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
    }
/*Constructor*/
    public void Mostrar_Automovil(){
        System.out.println("Marca: " + Marca
                + "\nModelo: " + Modelo
                + "\nColor: " + Color
                + "\nAnio: " + Year
                + "\nCombustible: " + tipoCombustible
                + "\nPrecio: $" + precio);
    }
}

