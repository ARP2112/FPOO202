import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("121040859", "ANDREA RODRÍGUEZ PÉREZ", 23, 18000);
        Cuenta cuenta2 = new Cuenta("121040858", "RENE PONCE RESÉNDIZ", 22, 12000);

        String numCuenta = JOptionPane.showInputDialog("Ingrese su No. de Cuenta: ");
        Cuenta cuenta = null;

        if (numCuenta.equals(cuenta1.numCuenta)){
            cuenta = cuenta1;
        }
        else if(numCuenta.equals(cuenta2.numCuenta)){
            cuenta = cuenta2;
        }
        else {
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        while (true){
            String[] opciones = {"Consultar saldo", "Ingresar efectivo", "Retirar efectivo", "Depositar a otra cuenta", "Salir"};
            int selección = JOptionPane.showOptionDialog(null, "Seleccione una opción: ", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (selección == -1){
                JOptionPane.showMessageDialog(null, "HASTA LUEGO, VUELVA PRONTO.");
                return;
            }

            switch(selección) {
                case 0:
                    cuenta.ConsultarSaldo();
                    break;
                case 1:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar: "));
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    String cuentaDestino = JOptionPane.showInputDialog("Ingrese el No. de cuenta a la que quiere depositar: ");
                    Cuenta destino = null;
                    if (cuentaDestino.equals(cuenta1.numCuenta)) {
                        destino = cuenta1;
                    } else if (cuentaDestino.equals(cuenta2.numCuenta)) {
                        destino = cuenta2;
                    }
                    if (destino != null) {
                        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que quiere tranferir: "));
                        cuenta.transferir(destino, monto);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Cuenta destino NO ENCONTRADA.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "HASTA LUEGO, VUELVA PRONTO. ");
                        return;

                        default:
                            JOptionPane.showMessageDialog(null, "Opción NO VÁLIDA.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }


            }
        }
    }
