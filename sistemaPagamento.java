public class sistemaPagamento {
    public static void main(String[] args) {
        pgtoService service = new pgtoService();

        service.processar(new fabricaPgtoCartaoCredito("999"), 150.00);
        service.processar(new fabricaPgtoPayPal("usuario@paypal.com"), 75.00);
        service.processar(new fabricaPgtoCriptomoeda(250.00), 30.00);
    }
}