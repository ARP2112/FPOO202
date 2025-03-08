import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Empleado>empleados = new ArrayList<>();
        boolean continuar = true;

        while (continuar){
            String[] opciones = {"Agregar empleado", "Listar Empleados", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción: ", "Gestión de Empleados",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ingrese el ID del empleado: "));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado: "));

                    String[] tipos = {"Conductor", "Administrativo"};
                    int tipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de Empleado: ", "Tipo de Empleado",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

                    if (tipo == 0) {

                        //Conductor
                        String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia: ");
                        empleados.add(new Conductor(nombre, id, salario, licencia));
                    }
                    else {
                        //Administrativo
                        String departamento = JOptionPane.showInputDialog("Ingrese el departamento: ");
                        empleados.add(new Administrativo(nombre, id, salario, departamento));
                    }
                    break;

                case 1:
                    if (empleados.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                    } else {
                        for (Empleado e : empleados) {
                            e.mostrarInfo();
                        }
                    }
                    break;

                case 2:
                    continuar = false;
                    break;

            }
        }
    }
}