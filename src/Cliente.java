public class Cliente implements Autenticavel{

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Cliente pode entrar no sistema!");
            return true;
        } else {
            System.out.println("Cliente não pode entrar no sistema!");
            return false;
        }
    }
}