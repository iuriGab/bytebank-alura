public class Administrador extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticou;

    public Administrador(){
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

    @Override
    public double getBonificacao() {
        return 50;
    }
}