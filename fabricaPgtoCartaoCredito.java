public class fabricaPgtoCartaoCredito implements iFabricaPgto{
    private String numeroCartao;
    
    public fabricaPgtoCartaoCredito(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    
    @Override
    public iPgto criarPagamento() {
        try {
            return new pgtoCartaoCredito(numeroCartao);
        } catch (Exception e) {
            return null; 
        }
    }
}