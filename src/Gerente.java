public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticou;

    public Gerente(){
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

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }
}