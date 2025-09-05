public class Exemplo1 {
    static int pilha[] = new int[10];
    static int pos = 0; // topo da pilha

    public static void main(String args[]) {
        System.out.println("\nColoca dados na pilha!");
        push(4);
        System.out.println("\nValor adicionado na pilha: " + 4);
        push(9);
        System.out.println("\nValor adicionado na pilha: " + 9);
        push(3);
        System.out.println("\nValor adicionado na pilha: " + 3);
        System.out.println("\n\nTamanho da pilha " + size());
        System.out.println("\nPegando dado da pilha: " + pop());
        System.out.println("\nPegando dado da pilha: " + pop());
        System.out.println("\nPegando dado da pilha: " + pop());
        System.out.println("\n\nTamanho da pilha " + size());
    }

    static void push(int valor) {
        pilha[pos] = valor; /* Empilha um novo elemento no topo da pilha.
                            Repare que não é verificada a capacidade máxima da pilha.*/
        pos++; // Atualiza o topo da pilha
    }

    static int pop() {
        /* Retorna o elemento do topo da pilha. Não é verificado o final da pilha. */
        return (pilha[--pos]);
    }

    static int size() {
        return pos; /* retorna o topo da pilha */
    }

    static int stacktop() /* retorna o elemento do topo da pilha sem desempilhar */ {
        return pilha[pos];
    }
}