import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int password = 12345;
        int saldo = 2500;

        while (escolha != 2) {
            System.out.println("""
                    ************************
                    
                    Escolha uma opção:
                    1- Fazer login
                    2- Sair
                    
                    ************************
                    
                    """);
            escolha = scanner.nextInt();
            scanner.nextLine();
            if (escolha == 1) {
                System.out.println("Digite seu nome: ");
                String nome = scanner.nextLine();
                System.out.printf("Olá %s! digite a sua senha: ", nome);
                int senha = scanner.nextInt();
                    if (senha == password) {
                        int escolhaConta = 0;

                        while (escolhaConta != 3) {
                            System.out.println(String.format("""
                             Bem vindo %s!
                             ------------------
                             O que deseja fazer?
                             
                             Saldo atual é de %d
                             
                             1 - Realizar transferência
                             2 - Depositar valor
                             3 - Sair
                             """, nome, saldo));

                            escolhaConta = scanner.nextInt();

                            switch (escolhaConta) {
                                case 1:
                                    System.out.println("Digite o valor da transferência: ");
                                    int valorTransferencia = scanner.nextInt();
                                    if (valorTransferencia > saldo) {
                                        System.out.println("Não há saldo o suficiente");
                                    } else {
                                        saldo -= valorTransferencia;
                                        System.out.println("Transferência realizada com sucesso! Seu novo saldo é de " + saldo);
                                    }
                                    break;
                                case 2:
                                    System.out.println("Qual o valor do depósito? ");
                                    double valorDeposito = scanner.nextDouble();
                                    saldo += (int) valorDeposito;
                                    System.out.println("Depósito realizado com sucesso! Seu novo saldo é de " + saldo);
                                    break;
                                case 3:
                                    System.out.println("Saindo da conta...");
                                    break;
                                default:
                                    System.out.println("Opção inválida.");
                            }
                        }
                    } else {
                        System.out.println("Senha inválida!");
                    }
            }
        }
    }
}

