package exercicio;

public class PilhaCarro {

    private Carro[] pilha;
    private int top; // aponta para o índice do último elemento

    public PilhaCarro(int capacidade) {
        this.pilha = new Carro[capacidade];
        top = -1;
    }

    public boolean isFull() {
        return top == pilha.length;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Carro carro) {
        if (!isFull()) {
            pilha[++top] = carro;
        } else {
            System.out.println("Vagas cheias");
        }
    }

    public Carro pop() {
        if (!isEmpty()) {
            Carro carro = pilha[top];
            pilha[top--] = null;
            return carro;
        }
        return null;
    }

    public Carro peek() {
        if (!isEmpty()) {
            return pilha[top];
        }
        return null;
    }

    public int size() {
        return top + 1;
    }

    public void exibirPilha() {
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] != null) {
                System.out.print(pilha[i] + " ");
            } else {
                System.out.print("[vazio] ");
            }
        }
        System.out.println();
    }

}