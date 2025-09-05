package exercicio;

public class Estacionamento{

    private PilhaCarro fila1 = new PilhaCarro(4);
    private PilhaCarro fila2 = new PilhaCarro(4);
    private PilhaCarro fila3 = new PilhaCarro(4);
    private int quantidade = 0;



    public void adicionarCarro(Carro carro) {
        if (quantidade < 4) {
            fila1.push(carro);
        } else if (quantidade < 8) {
            fila2.push(carro);
        } else if (quantidade < 12) {
            fila3.push(carro);
        } else {
            System.out.println("Estacionamento cheio!");
            return;
        }
        quantidade++;
    }

    public void removerCarroPorPlaca(String placa) {
        boolean encontrado = false;

        // tentar em cada fila
        encontrado = tentarRemover(fila1, placa);
        if (!encontrado) encontrado = tentarRemover(fila2, placa);
        if (!encontrado) encontrado = tentarRemover(fila3, placa);

        if (encontrado) {
            quantidade--;
            System.out.println("Carro de placa " + placa + " removido com sucesso!");
        } else {
            System.out.println("Carro de placa " + placa + " não encontrado.");
        }
    }

    private boolean tentarRemover(PilhaCarro fila, String placa) {
        PilhaCarro temporaria = new PilhaCarro(4);
        boolean removido = false;

        // desempilha até achar ou esvaziar
        while (!fila.isEmpty()) {
            Carro c = fila.pop();
            if (c.getPlaca().equalsIgnoreCase(placa)) {
                removido = true;
                break; // não volta esse carro
            } else {
                temporaria.push(c); // guarda temporariamente
            }
        }

        // reempilha os carros que foram retirados (na ordem original)
        while (!temporaria.isEmpty()) {
            fila.push(temporaria.pop());
        }

        return removido;
    }

    public void exibirEstacionamento() {
        System.out.println("\n=== Estacionamento ===");
        System.out.print("Fila 1: "); fila1.exibirPilha();
        System.out.print("Fila 2: "); fila2.exibirPilha();
        System.out.print("Fila 3: "); fila3.exibirPilha();
        System.out.println("======================");
    }

}

