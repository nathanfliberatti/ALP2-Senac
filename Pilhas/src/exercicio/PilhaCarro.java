package exercicio;

public class PilhaCarro {

    private Carro[] pilha;
    private int top; // aponta para o índice do último elemento

    public PilhaCarro(int capacidade) {
        this.pilha = new Carro[capacidade];
        top = -1;
    }

    private boolean isFull() {
        return top == pilha.length;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private void push(Carro carro) {
        if (!isFull()) {
            pilha[++top] = carro;
        } else {
            System.out.println("Vagas cheias");
        }
    }

    private Carro pop() {
        if (!isEmpty()) {
            Carro carro = pilha[top];
            pilha[top--] = null;
            return carro;
        }
        return null;
    }

    private Carro peek() {
        if (!isEmpty()) {
            return pilha[top];
        }
        return null;
    }

    private int size() {
        return top + 1;
    }

}