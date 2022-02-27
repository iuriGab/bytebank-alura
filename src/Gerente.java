public class Gerente extends FuncionarioAutenticavel {

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
     }

}
