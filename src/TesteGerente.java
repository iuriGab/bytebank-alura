import java.util.Scanner;

public class TesteGerente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gerente anamim = new Gerente();
        anamim.setNome("Anamim Dantas Ribeiro");
        anamim.setCpf("053.129.893-04");
        anamim.setSalario(7200.0);

        System.out.println(anamim.getNome());
        System.out.println(anamim.getCpf());

        System.out.println("Seu salário é de: " + anamim.getSalario());

        anamim.setSenha(2222);
        boolean autenticador = anamim.autentica(2222);

        System.out.println("Autenticou: " + autenticador);

        System.out.print("A bonificação é de: " + anamim.getBonificacao());
    }
}