public class pgtoPayPal implements iPgto {
    private String email;

    public pgtoPayPal(String email) {
        this.email = email;
    }

    private boolean validarEmailVinculado() {
        return email != null && email.endsWith("@paypal.com");
    }

    @Override
    public boolean pagar(double valor) {
        if (validarEmailVinculado()) {
            System.out.println("Pagamento no PayPal realizado com sucesso no valor de R$" + valor);
            return true;
        } else {
            System.out.println("Erro: e-mail não vinculado a uma conta PayPal.");
            return false;
        }
    }
}