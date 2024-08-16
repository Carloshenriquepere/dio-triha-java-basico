package service;

import java.util.Scanner;

import static java.lang.System.*;

public class ContaService {

    Scanner sc = new Scanner(in);

    public void contaBancaria() {

        out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        out.print("Digite sua numero da conta: ");
        int conta = sc.nextInt();

        out.print("Digite sua agencia: ");
        String agencia = sc.next();

        out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();


        out.println("Olá " + nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
                ", conta " + conta +
                " e seu saldo de " + saldo +
                " já está disponível para saque");
    }
}
