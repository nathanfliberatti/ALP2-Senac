import java.util.Scanner;

public class Exemplo1 {

    static Scanner in = new Scanner(System.in);
    static int tam_max = 10;
    static int tam = 0;

    public static void main(String[] args) {
        int[] vet = new int[10];
        int op;
        int elem;
        do {
            System.out.println("1 - Insere");
            System.out.println("2 - Remove");
            System.out.println("3 - Exibe lista");
            System.out.println("0 - Sair");
            op = in.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Digite o elemento:");
                    elem = in.nextInt();
                    enfileirar(vet, elem);
                    break;
                }
                case 2: {
                    elem = desenfileirar(vet);
                    System.out.println("Elemento removido da fila = " + elem);
                    break;
                }
                case 3: {
                    exibe(vet);
                    break;
                }
            }//case
        } while (op != 0); //while
    }

    static void exibe(int[] vet) {
        int i;
        System.out.println("\n");
        if (tam >= 1) {
            for (i = 0; i < tam; i++)
                System.out.println("\n vet[" + i + "]= " + vet[i]);
        } else
            System.out.println("\n fila vazia");
    }

    //**************************************
    static void enfileirar(int[] vet, int elem) {
        if (tam == tam_max) {
            System.out.println("\n fila cheia");
        } else {
            vet[tam] = elem;
            tam++;
        }
    }

    //**************************************
    static int desenfileirar(int[] vet) {
        int i, elem = -1;
        if (tam >= 1) {
            elem = vet[0];
            tam--;
            for (i = 0; i < tam; i++) {
                vet[i] = vet[i + 1];
            }
        }
        return elem;
    }
}