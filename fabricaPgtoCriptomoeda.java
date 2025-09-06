public class fabricaPgtoCriptomoeda implements iFabricaPgto {
    private double saldoCarteira;

    public fabricaPgtoCriptomoeda(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    @Override
    public iPgto criarPagamento() {
        return new pgtoCriptomoeda(saldoCarteira);
    }
}