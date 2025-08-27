public class PayPal extends MetodoPago {

    public PayPal(double saldoDisponible){
        super(saldoDisponible);
    }

    @Override
    public void realizarPago(double monto){
        double comision = monto * 0.02;
        double total = monto + comision;

        if (saldoDisponible >= total) {
            saldoDisponible -= total;
            System.out.println("Pago de $" + monto + " realizado con PayPal (comisión $" + comision + "). Saldo restante: $" + saldoDisponible);
        } else {
            System.out.println("Error: Saldo insuficiente en PayPal.");
        }
    }
}
