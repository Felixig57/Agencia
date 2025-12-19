/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia.dao;

import agencia.model.Autos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * fernanda cho
 *
 * @author felix
 */
public class Consultas {
    Vector VectorDatos = new Vector();
    public void Guardar(Autos unAuto){
        VectorDatos.addElement(unAuto);
    }
    public void GuardarArchivos(Autos Vehiculos){
        try{
            FileWriter escritor = new FileWriter("Autos.txt",true);
            BufferedWriter almacenado = new BufferedWriter(escritor);
            PrintWriter impresion = new PrintWriter(almacenado);
            impresion.print(Vehiculos.getID());
            impresion.print("|" + Vehiculos.getMarca());
            impresion.print("|" + Vehiculos.getModelo());
            impresion.print("|" + Vehiculos.getAnio());
            impresion.print("|" + Vehiculos.getColor());
            impresion.print("|" + Vehiculos.getPrecio());
            impresion.println("|" + Vehiculos.getEstado());
            impresion.close();
        } catch (Exception e) 
        {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
}//cierra guardar archivos
      public DefaultTableModel ListaAutos(){
            Vector cabeceras = new Vector();
            cabeceras.addElement("ID"); 
            cabeceras.addElement("Marca");
            cabeceras.addElement("Modelo");
            cabeceras.addElement("Anio");
            cabeceras.addElement("Color");
            cabeceras.addElement("Precio");
            cabeceras.addElement("Estado");
            DefaultTableModel tblAutosTXT = new DefaultTableModel(cabeceras,0);
            try{
                FileReader lector = new FileReader("Autos.txt");
                BufferedReader lectorEspacio = new BufferedReader(lector);
                String d;
                while((d=lectorEspacio.readLine())!=null){
                    StringTokenizer dato = new StringTokenizer(d,"|");
                    Vector X = new Vector();
                   while(dato.hasMoreTokens()){
                       X.addElement(dato.nextToken());
                   }
                   tblAutosTXT.addRow(X);
                }
            }catch(Exception e){
              System.out.println("Error al guardar el archivo: " + e.getMessage());
            }
            
            return tblAutosTXT;
        }
   

}
