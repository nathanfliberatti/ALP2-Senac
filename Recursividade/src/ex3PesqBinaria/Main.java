package ex3PesqBinaria;

public class Main {

    public static void main(String[] args) {

        Main pesquisarNomes = new Main();

        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 20);
        Pessoa felipe = new Pessoa("Felipe", 24);
        Pessoa patricia = new Pessoa("Patricia", 23);
        Pessoa rafael = new Pessoa("Rafael", 20);

        Pessoa[] pessoas = {ana, carla, felipe, patricia, rafael};

        int inicio = pesquisarNomes.pesquisar('A', pessoas);
        int fim = pesquisarNomes.pesquisar('F', pessoas);
        while(inicio >= 0 && inicio <= fim) {
            System.out.println(pessoas[inicio].getNome());
            inicio++;
        }
    }

    public int pesquisar(char letra, Pessoa[] pessoas) {
        int inicio = 0;
        int meio = 0;
        int fim = pessoas.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (pessoas[meio].getNome().charAt(0) == letra) {
                return meio;
            } else if (pessoas[meio].getNome().charAt(0) < letra) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return fim;
    }

}