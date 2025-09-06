public class fabricaPgtoCartaoCredito implements iFabricaPgto{

    private String numeroCartao;
    public fabricaPgtoCartaoCredito(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    
    @Override
    public iPgto criar() throws Exception {
        return new pgtoCartaoCredito(numeroCartao);
    }

}
