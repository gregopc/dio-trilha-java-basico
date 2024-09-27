import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    // Códigos de cor ANSI
    public static final String ANSI_RESET = "\u001B[0m";   // Cor padrão (branco)
    public static final String ANSI_GREEN = "\u001B[32m";  // Verde

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        // Consumir newline pendente
        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = scanner.nextDouble();

        // Formatar o saldo em reais (R$)
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = formatador.format(saldo);

        String mensagem = "Olá " + ANSI_GREEN + nomeCliente + ANSI_RESET 
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + ANSI_GREEN + agencia + ANSI_RESET 
                + ", conta " + ANSI_GREEN + numeroConta + ANSI_RESET 
                + " e seu saldo de " + ANSI_GREEN + saldoFormatado + ANSI_RESET + " já está disponível para saque.";     
        System.out.println(mensagem);
        
        scanner.close();

    }
}
