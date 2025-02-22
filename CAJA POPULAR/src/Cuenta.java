import javax.swing.*;

public class Cuenta {
    String numCuenta;
    String titular;
    int edad;
    double saldo;

    Cuenta(String numCuenta, String titular, int edad, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Deposito exitoso. Saldo actual: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actual: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente o Cantidad inválida", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    boolean transferir(Cuenta destino, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            destino.depositar(cantidad);
            JOptionPane.showMessageDialog(null, "Tranferencia exitosa a la cuenta: " + destino.numCuenta);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Transferencia inválida. Fondos insuficientes", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    void ConsultarSaldo() {
        JOptionPane.showMessageDialog(null, "Tu saldo actual es: " + saldo);
    }

}
