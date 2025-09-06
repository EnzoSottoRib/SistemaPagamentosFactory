public class pgtoService {
    public void processar(iFabricaPgto fabrica, double valor) {
        iPgto pagamento = fabrica.criarPagamento(); 
        pagamento.pagar(valor);
    }
}