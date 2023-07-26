package program;

import domain.Account;
import exception.BusinessException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();

        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", account.getBalance());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();



    }
}