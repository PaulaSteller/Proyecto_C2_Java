/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo3_sistema_gimnasio;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Menu {

    /// para crear un metodo para poder llamar los metodos de metodos valga la redondancia
    
    private Metodos gymnova;

    public Menu() {
        gymnova = new Metodos();  // vamos a usar para llamar los metodos 
    }

    public void mostrarMenu() {
        // inicializamos independimente de la opcion que escoja la secretaria 
        gymnova.generarDataInicialActividaddes();
        gymnova.dividirClases();
        gymnova.llenarCabinas();
        gymnova.inicializarParqueo();
        gymnova.incializarEspaciosRecreativos();

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar al menu?");
        boolean estadoMenu = (opcion == JOptionPane.YES_OPTION);
        while (estadoMenu) {

            int option2 = Integer.parseInt(JOptionPane.showInputDialog("Menu \n"  /// CREAMOS LA VARIABLE PARA EL SWITCH
                    + "1. Clases Disponibles\n"
                    + "2. Editar Clases\n"
                    + "3. Crear Clase \n"
                    + "4. Registrasr a un socio en una clase \n"
                    + "5. Eliminar clase \n"
                    + "6. Eliminar Socio de una clase \n"
                    + "7. Ver inscritos en cada clase\n"
                    + "8. Sala de Pesas \n"
                    + "9. Cabinas Insonorizadas \n"
                    + "10. Auditorio Fitness \n"
                    + "11. Espacios Recreativos\n" // Se eliminó la redundancia con Sala de Pesas
                    + "12. Parqueo \n"
                    + "13. Salir"));

            switch (option2) {
                case 1:
                    gymnova.mostrarclases();
                    break;
                case 2:
                    gymnova.editarClases();
                    gymnova.dividirClases();

                    break;

                case 3:
                    gymnova.crearClases();
                    gymnova.dividirClases();

                    break;
                case 4:
                    gymnova.registrarSocioClase();

                    break;
                case 5:
                    gymnova.eliminarClase();

                    break;

                case 6:
                    gymnova.eliminarSocioDeClase();

                    break;
                    case 7:
                    gymnova.verRegistradosEnClase();

                    break;
                case 8: // Sala de Pesas
                    gymnova.salaPesas();

                    break;
                case 9:
                    int hacer = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
                            + "1. Reservar a un Socio en una Cabina \n"
                            + "2. Ver horarios Resrvados \n"
                            + "3. Eliminar una reserva"));

                    switch (hacer) {
                        case 1:
                            gymnova.reservarCabina();
                            break;
                        case 2:
                            gymnova.mostrarReservarCabinas();
                            break;
                        case 3:
                            gymnova.eliminarReservaDecabina();
                            break;
                    }
                    break;
                case 10:
                    int hacer1 = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
                            + "1. Ver programacion del Auditotio Fitness \n"
                            + "2. Inscribir a Socio a un Evento \n"
                            + "3. Mostrar inscritos \n"
                            + "4. Eliminar Socio de un Evento"));
                    switch (hacer1) {
                        case 1:
                            gymnova.mostrarHorarioAuditorio();
                            break;
                        case 2:
                            gymnova.inscribirSocioAuditorio();
                            break;
                        case 3:
                            gymnova.mostrarInscritosAuditorio();
                            break;
                        case 4:
                            gymnova.eliminarSocioInscripcion();
                            break;
                    }
                    break;

                case 11: // Espacios Recreativos (anteriormente 12)
                        int hacer2 = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
                            + "1. Ver Espacios Recreativos\n"
                            + "2. Inscribir a Socio a un Espacio \n"
                            + "3. Mostrar inscritos \n"
                            + "4. Eliminar Socio de un Espacio"));
                    switch (hacer2) {
                        case 1:
                            gymnova.visualizarEspaciosRecreativos();
                            break;
                        case 2:
                           // gymnova.registrarSocioEnEspacio(idSocio, idEspacio); // idSocio e idEspacio no están definidos aquí
                           gymnova.registrarSocioEnEspacio(); // Llamada sin parámetros, el método debe manejar la entrada
                            break;
                        case 3:
                            gymnova.verInscritosEspacioRec();
                            break;
                        case 4:
                            gymnova.eliminarSocioEspacio();
                            
                            break;
                    }
                    
                    break;
                case 12: // Parqueo (anteriormente 13)
                    gymnova.parqueo();
                    break;

                case 13: // Salir (anteriormente 14)
                    estadoMenu = false;
                    continue;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es valida");
                    break;

            }

            // consultamos si desea seguir editando 
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea ingresar de nuevo al MENU");
            estadoMenu = (respuesta == JOptionPane.YES_OPTION);

        }

    }

}
