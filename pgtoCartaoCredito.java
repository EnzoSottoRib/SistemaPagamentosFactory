public class pgtoCartaoCredito implements iPgto {

    private String numeroCartao;

    public pgtoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean pagar(double valor) {
        if (numeroCartao.equals("999")) {
            System.out.println("Pagamento com cartão de crédito. Valor: " + valor);
            return true;
        } else {
            System.out.println("Erro: número de cartão inválido.");
            return false;
        }
    }
}