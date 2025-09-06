public class pgtoService {

    public void processar(iFabricaPgto fabricaPgto, double valor){
        try{
            fabricaPgto.criar().pagar(valor);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

}
