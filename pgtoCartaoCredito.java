public class pgtoCartaoCredito implements iPgto{

    public pgtoCartaoCredito(String numeroCartao) throws Exception{
        //validar os dados do cartão
        if(!numeroCartao.equals("999")){
            throw new Exception("Numero inválido");
        }
    }

    @Override
    public boolean pagar(double valor){
        //procedimentos para processar o pagamento
        System.out.println("Pagamento cartão de crédito. Valor: " + valor);
        return true;
    }

}
