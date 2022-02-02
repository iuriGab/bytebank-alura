public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario iuri = new Funcionario();
        iuri.setNome("Iuri Gabriel");
        iuri.setCpf("053.129.893-04");
        iuri.setSalario(5500.00);

        System.out.println(iuri.getNome());
        System.out.println(iuri.getBonificacao());
    }
}
