//I can't instantiate this class because this one now is abstract
//Example: Funcionario f = *new Funcionario();* (only concrete)
//Example: Funcionario f = *new Gerente() or other;* (abstract)
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //method without body because it's abstract and the implementation is in the sons;
    public abstract double getBonificacao();

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public double getSalario() { return salario; }

    public void setSalario(double salario) { this.salario = salario; }
}
