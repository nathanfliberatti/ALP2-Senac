package exercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a placa do carro: ");
        String placa = scanner.next();
        System.out.println("Digite a cor do carro: ");
        String cor = scanner.next();
        System.out.println("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        System.out.println("Digite o modelo do carro: ");
        String modelo = scanner.next();

        Carro carro = new Carro(placa, cor, ano, modelo);
    }

}
