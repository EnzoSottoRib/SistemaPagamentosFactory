public class pgtoCriptomoeda implements iPgto {
    private double saldoCarteira;

    public pgtoCriptomoeda(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    private boolean validarSaldo(double valor) {
        return saldoCarteira >= valor;
    }

    @Override
    public boolean pagar(double valor) {
        if (validarSaldo(valor)) {
            System.out.println("Pagamento com Criptomoeda processado no valor de R$" + valor );
            return true;
        } else {
            System.out.println("Erro: saldo insuficiente na carteira digital");
            return false;
        }
    }
}