public class Exemplo2 {
    public Object[] pilha;
    public int posicaoPilha;

    public Exemplo2() {
        // indica que esta nula, vazia, pois posição um indica
        //que contém informação
        this.posicaoPilha = -1;
        // criando uma pilha com 10 posições
        this.pilha = new Object[10];
    }

    public static void main(String args[]) {
        Exemplo2 p = new Exemplo2();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
        while(p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }

    public boolean pilhaVazia() {
        //isEmpty
        if(this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if(this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {//top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {//pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {// push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
}