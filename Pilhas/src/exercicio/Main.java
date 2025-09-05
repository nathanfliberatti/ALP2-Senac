package exercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento();

        for(int i = 0; i < 12; i++) {
            System.out.println("\nDigite os dados do carro " + (i + 1) + ":");
            System.out.println("Digite a placa do carro: ");
            String placa = scanner.next();
            System.out.println("Digite a cor do carro: ");
            String cor = scanner.next();
            System.out.println("Digite o ano do carro: ");
            int ano = scanner.nextInt();
            System.out.println("Digite o modelo do carro: ");
            String modelo = scanner.next();

            Carro carro = new Carro(placa, cor, ano, modelo);
            estacionamento.adicionarCarro(carro);
        }

        estacionamento.exibirEstacionamento();

        // Remoção por placa
        System.out.print("\nDigite a placa do carro que deseja remover: ");
        String placaRemover = scanner.next();
        estacionamento.removerCarroPorPlaca(placaRemover);

        estacionamento.exibirEstacionamento();
    }

}