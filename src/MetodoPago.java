public abstract class MetodoPago implements Pago {
    protected double saldoDisponible;

    public MetodoPago(double saldoDisponible){
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
    @Override
    public void reembolsarPago(double monto) {
        saldoDisponible += monto;
        System.out.println("Reembolso de $" + monto + " realizado. Nuevo saldo: $" + saldoDisponible);
    }

    @Override
    public abstract void realizarPago(double monto);
}
