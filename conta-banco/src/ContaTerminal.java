// Responsável por melhorar o input (basicamente o que o usuário digita)
import java.util.Locale;

// Responsável por receber o input (as informações enviadas pelo o usuário)
import java.util.Scanner;

// Responsável por gerar um valor aleatório (estudei, pesquisei sobre e quis incluí-lo para gerar mais realismo a aplicação)
import java.util.Random;

/**
 * Essa aplicação representa um programa de terminal para gerar informações à respeito do saldo de cada cliente em sua conta bancária.
 * O CLiente insere os dados de sua conta bancária e o programa informa o saldo de sua respectiva conta.
 */

public class ContaTerminal {
    public static void main(String[] args){
        //Configura o Scanner utilizando o padrão americano.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Configura o Random para informar os valores que irão ser usados no saldo do cliente.
        Random random = new Random();

        //Solicita o número da conta do cliente.
        System.out.println("Por favor, digite o número de sua conta bancária: ");
        int numeroConta = scanner.nextInt();

        //Solicita a agência da conta do cliente.
        System.out.println("Por favor, digite sua agência bancária: ");
        String agencia = scanner.next();

        //Solicita o nome completo do cliente.
        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.next();
        
        //Fecha o Scanner já que não iremos mais utilizá-lo.
        scanner.close();

        //Informa o saldo da conta do cliente.
        double saldoConta = random.nextDouble() * 2000;
        String saldoFormatado = String.format("%.2f", saldoConta);
     /* 
        * Formata o saldo da conta com duas casas decimais
        * O random gera um valor aleatório e o multiplica por 2000
        * A " % " Serve para indicar que você está inserindo um valor formatado. 
        * Já o " .2 " é responsável pela a quantidade de casas decimais que você deseja mostrar.
    */

        // Exibe a mensagem com as informações fornecidas pelo cliente.
        System.out.println("Olá " + nomeCliente);
        System.out.println("Obrigado por consultar sua conta em nosso Banco JavaCash, sua agência é " + agencia + ", conta " + numeroConta);
        System.out.println("Seu saldo atual é de " + "R$" + saldoFormatado + " e está disponível para saque, transferência ou até tomar um cafézinho haha!");
    }
}