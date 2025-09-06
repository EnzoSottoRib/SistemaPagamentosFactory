public class fabricaPgtoPayPal implements iFabricaPgto {
    private String email;

    public fabricaPgtoPayPal(String email) {
        this.email = email;
    }

    @Override
    public iPgto criarPagamento() {
        return new pgtoPayPal(email);
    }
}