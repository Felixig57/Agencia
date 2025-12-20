/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia.controller;

import agencia.layouts.main.MainDashBoard;
// Importa tus paneles aquí (asegúrate que los nombres coincidan con tus archivos)

import agencia.layouts.components.InicioPanel;
import agencia.layouts.vehiculos.VehiculosPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author felix
 */
public class NavigationController implements ActionListener {

    private MainDashBoard vista;

    public NavigationController(MainDashBoard vista) {
        this.vista = vista;
        addListeners(); // Activamos las "orejas" del programa
    }

    private void addListeners() {
        // Escuchar el botón INICIO (Para el Resumen)
        vista.barraLateralPanel2.Inicio.addActionListener(this);

        // Escuchar el botón VENTAS (Para el Formulario de Vehículos)
        // Nota: Si tu botón se llama btnVentas o btnVehiculos, úsalo aquí
        vista.barraLateralPanel2.btnVentas.addActionListener(this);
        vista.barraLateralPanel2.jcbVehiculos.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. Si presionan INICIO -> Manda a llamar al Resumen
        if (e.getSource() == vista.barraLateralPanel2.Inicio) {
            System.out.println("Cargando Inicio...");
            vista.mostrarPanel(new InicioPanel());
        }

        // 2. Si presionan VENTAS -> Manda a llamar al Formulario
        if (e.getSource() == vista.barraLateralPanel2.btnVentas) {
            System.out.println("Cargando Vehículos...");
            vista.mostrarPanel(new VehiculosPanel());
        }
        if (e.getSource() == vista.barraLateralPanel2.jcbVehiculos) {

            // Obtenemos qué seleccionó el usuario
            String opcion = (String) vista.barraLateralPanel2.jcbVehiculos.getSelectedItem();

            switch (opcion) {
                case "Automoviles":
                    System.out.println("Cambiando a Autos...");
                    // Aquí llamamos al PANEL, no a un JFrame
                    vista.mostrarPanel(new VehiculosPanel());
                    break;

                case "Motocicletas":
                    System.out.println("Cambiando a Motos...");
                    // vista.mostrarPanel(new MotosPanel()); // Descomenta cuando crees el panel
                    break;

                case "Camiones":
                    System.out.println("Cambiando a Camiones...");
                    // vista.mostrarPanel(new CamionesPanel()); // Descomenta cuando crees el panel
                    break;

                default:
                    // No hacer nada o mostrar mensaje
                    break;
            } //cierra switch
        }//cierra if
    }
    // 3. Lógica del ComboBox
}//cierra main
