package Exemplo4;

public class Exemplo4 {
    public static void main(String[] args) {
        String[] names = {
                "Mark", "Berg", "John", "Beni", "Jebb", "June",
                "Mary", "Karl", "Fred", "Hall", "Troy", "Joan"
        };
        FilaSimples stack = new FilaSimples(10);
        System.out.println("Pilha de " + stack.getCapacity() + " posições criada: " + stack);
        System.out.println();
        System.out.println("Preenchendo a pilha:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("\tInserindo o nome \"" + names[i] + "\":\t");
            if (stack.push(names[i]) == null)
                System.out.println("PILHA CHEIA!!! impossível inserir...");
            else
                System.out.println(stack + ". " + (stack.getCapacity() - stack.getSize()) + " posições restantes.");
        }
        System.out.println();
        System.out.println("Removendo 5 elementos da pilha:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("\t" + i + "a. remoção: \"" + stack.pop() + "\".");
            System.out.println(" A pilha agora esta assim: " + stack);
        }
        System.out.println();
        System.out.println("O atual nome no topo da pilha é \"" + stack.peek() + "\".\n");
        System.out.println(stack);
        System.out.println();
        stack.clear();
        System.out.println("Limpando a pilha: " + stack);
        System.out.println();
        System.out.print("Consigo tirar mais algo da pilha? ");
        System.out.println(stack.pop() == null ? "Não consigo..." : "Consigo sim!");
    }
}