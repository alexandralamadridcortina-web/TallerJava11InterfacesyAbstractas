public class Main {
    public static void main(String[] args) {
        MetodoPago tarjeta = new TarjetaCredito(500);
        MetodoPago payPal = new PayPal(300);
        MetodoPago transferencia = new TransferenciaBancaria(200);

        tarjeta.realizarPago(100);
        tarjeta.reembolsarPago(50);

        System.out.println();

        payPal.realizarPago(100);
        payPal.reembolsarPago(20);

        System.out.println();

        transferencia.realizarPago(50);
        transferencia.reembolsarPago(10);
    }
}
