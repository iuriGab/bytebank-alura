public class Cliente implements Autenticavel{

    private AutenticacaoUtil autenticou;

    public Cliente(){
        this.autenticou = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticou.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticou.autentica(senha);
    }
}