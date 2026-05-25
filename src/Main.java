import model.Funcionario;
import model.Gerente;
import service.FuncionarioService;
import model.exception.FuncionarioException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FuncionarioService service = new FuncionarioService();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE FUNCIONÁRIOS ===");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Cadastrar gerente");
            System.out.println("3 - Listar todos");
            System.out.println("4 - Buscar por CPF");
            System.out.println("5 - Remover funcionário");
            System.out.println("6 - Aplicar aumento geral");
            System.out.println("7 - Calcular folha salarial");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("CPF: ");
                        String cpf = sc.nextLine();
                        System.out.print("Idade: ");
                        int idade = sc.nextInt();
                        System.out.print("Salário: ");
                        double salario = sc.nextDouble();
                        service.adicionar(new Funcionario(nome, cpf, salario, idade));
                        System.out.println("Funcionário cadastrado!");
                        break;

                    case 2:
                        System.out.print("Nome: ");
                        String nomeG = sc.nextLine();
                        System.out.print("CPF: ");
                        String cpfG = sc.nextLine();
                        System.out.print("Idade: ");
                        int idadeG = sc.nextInt();
                        System.out.print("Salário: ");
                        double salarioG = sc.nextDouble();
                        System.out.print("Bônus: ");
                        double bonus = sc.nextDouble();
                        service.adicionar(new Gerente(nomeG, cpfG, salarioG, idadeG, bonus));
                        System.out.println("Gerente cadastrado!");
                        break;

                    case 3:
                        System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
                        for (Funcionario f : service.listarTodos()) {
                            System.out.println(f);
                        }
                        break;

                    case 4:
                        System.out.print("CPF: ");
                        String cpfBusca = sc.nextLine();
                        System.out.println(service.buscarPorCpf(cpfBusca));
                        break;

                    case 5:
                        System.out.print("CPF do funcionário a remover: ");
                        String cpfRemover = sc.nextLine();
                        service.remover(cpfRemover);
                        System.out.println("Removido com sucesso!");
                        break;

                    case 6:
                        System.out.print("Porcentagem de aumento: ");
                        double pct = sc.nextDouble();
                        service.aplicarAumentoGeral(pct);
                        System.out.println("Aumento aplicado a todos!");
                        break;

                    case 7:
                        System.out.printf("Folha salarial total: R$ %.2f%n",
                                service.calcularFolhaSalarial());
                        break;
                }
            } catch (FuncionarioException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.nextLine();
            }
        } while (opcao != 0);

        sc.close();
        System.out.println("Sistema encerrado.");
    }
}