import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
       

        Scanner input = new Scanner(System.in);


        System.out.println("Por favor digite seu nome completo! ");
        String nome = input.nextLine();

        System.out.println("Por favor digite o número da sua agência! ");
        String agenciabanco = input.nextLine();

        System.out.println("Por favor digite o número da sua conta! ");
        int conta = input.nextInt();
        
        System.out.println(("Por favor digite o seu saldo! "));
        double saldo = input.nextDouble();

        System.out.print("Olá "+ nome);
        System.out.print(", obrigado por criar uma conta em nosso banco, sua agência é " + agenciabanco );
        System.out.print(" conta " + conta );
        System.out.print(" e seu saldo R$ " + saldo + " já está disponível para saque.");
        //Usei o print ao invés de println para ficar mais detalhado cada parte   

        input.close();
    }
}
