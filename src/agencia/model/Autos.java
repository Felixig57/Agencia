/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia.model;

/**
 *
 * @author felix
 */
public class Autos {
       
    private String ID;
    private String Marca;
    private String Modelo;
    private String Anio;
    private String Color;
    private String Precio;
    private String Estado;
    
    public Autos(String ID, String Marca, String Modelo, String Anio, String Color, String Precio, String Estado) {
        this.ID = ID;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Anio = Anio;
        this.Color = Color;
        this.Precio = Precio;
        this.Estado = Estado;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

 public Autos(){
     
 }
}
