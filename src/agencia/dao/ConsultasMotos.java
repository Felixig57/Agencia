/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia.dao;

import agencia.model.Motos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felix
 */
public class ConsultasMotos {

    Vector VectorDatos = new Vector();

    public void Guardar(Motos unaMoto) {
        VectorDatos.addElement(unaMoto);
    }

    public void GuardarArchivos(Motos motos) {
        try {
            FileWriter escritor = new FileWriter("Motos.txt", true);
            BufferedWriter almacenado = new BufferedWriter(escritor);
            PrintWriter impresion = new PrintWriter(almacenado);
            impresion.print(motos.getID());
            impresion.print("|" + motos.getMarca());
            impresion.print("|" + motos.getModelo());
            impresion.print("|" + motos.getAnio());
            impresion.print("|" + motos.getColor());
            impresion.print("|" + motos.getPrecio());
            impresion.print("|" + motos.getEstado());
            impresion.println("|" + motos.getCilindrada());//Atributo nuevo

            impresion.close();
        } catch (Exception e) {
            System.out.println("Error al guardar el archivo de motos: " + e.getMessage());
        }
    }//Cierra Guardar Archivos

    public DefaultTableModel ListaMotos() { 
        Vector cabeceras = new Vector();
        cabeceras.addElement("ID");
        cabeceras.addElement("Marca");
        cabeceras.addElement("Modelo");
        cabeceras.addElement("Anio");
        cabeceras.addElement("Color");
        cabeceras.addElement("Precio");
        cabeceras.addElement("Estado");
        cabeceras.addElement("Cilindrada");
        DefaultTableModel tblMotosTXT = new DefaultTableModel(cabeceras, 0);
        try {
            FileReader lector = new FileReader("Motos.txt");
            BufferedReader lectorEspacio = new BufferedReader(lector);
            String d;
            while ((d = lectorEspacio.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector X = new Vector();
                while (dato.hasMoreTokens()) {
                    X.addElement(dato.nextToken());
                }
                tblMotosTXT.addRow(X);
            }
        } catch (Exception e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
        return tblMotosTXT;
    }

}
