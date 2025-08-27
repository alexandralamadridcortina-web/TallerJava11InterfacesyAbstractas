public class TransferenciaBancaria extends MetodoPago{

    public TransferenciaBancaria(double saldoDisponible) {
        super(saldoDisponible);
    }

    @Override
    public void realizarPago(double monto) {
        double comision = 5.0;
        double total = monto + comision;

        if(saldoDisponible >= total) {
            saldoDisponible -= total;
            System.out.println("Pago de $" + monto + " realizado con Transferencia (comisión $" + comision + "). Saldo restante: $" + saldoDisponible);
        } else {
            System.out.println("Error: Saldo insuficiente en Transferencia.");
        }
    }

}
