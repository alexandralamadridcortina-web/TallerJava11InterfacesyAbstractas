public class TarjetaCredito extends MetodoPago {

    public TarjetaCredito(double saldoDisponible) {
        super(saldoDisponible);
    }

    @Override
    public void realizarPago(double monto) {
        if(saldoDisponible >= monto) {
            saldoDisponible -= monto;
            System.out.println("Pago de $" + monto + " realizado con Tarjeta. Saldo restante: $" + saldoDisponible);
        } else {
            System.out.println("Error: Saldo insuficiente en Tarjeta.");
        }
    }
}
