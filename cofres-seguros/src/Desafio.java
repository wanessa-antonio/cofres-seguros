import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Método de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Físico", "Chave");
    }
}

public class Desafio {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitando ao usuário que digite o tipo de cofre (digital ou físico)
            System.out.print("Por favor, digite o tipo de cofre (digital ou físico): ");
            String tipoCofre = scanner.nextLine();

            System.out.println();

            // Condição necessária para a verificação dos cofres seguros:
            if (tipoCofre.equalsIgnoreCase("digital")) {
                // Solicitando ao usuário que digite a senha
                System.out.print("Por favor, digite a senha: ");
                int senha = scanner.nextInt();

                System.out.println();
                
                // Solicitando ao usuário que confirme a senha
                System.out.print("Por favor, confirme a senha: ");
                int confirmacaoSenha = scanner.nextInt();

                System.out.println();

                CofreDigital cofreDigital = new CofreDigital(senha);

                System.out.println("Tipo: Cofre Digital");
                System.out.println("Método de abertura: Senha");

                if (cofreDigital.validarSenha(confirmacaoSenha)) {
                    System.out.println("Cofre aberto!");
                } else {
                    System.out.println("Senha incorreta!");
                }
            } else if (tipoCofre.equalsIgnoreCase("físico")) {
                CofreFisico cofreFisico = new CofreFisico();
                cofreFisico.imprimirInformacoes();
            }
        }
    }
}
