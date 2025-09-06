public class sistemaPagamento {
    public static void main(String[] args) {
        
        pgtoService service = new pgtoService();

        //pagar com cartao de credito
        service.processar(new fabricaPgtoCartaoCredito("999"), 5000.00);

    }
}
