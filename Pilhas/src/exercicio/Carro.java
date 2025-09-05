package exercicio;

public class Carro {

    private String placa;
    private String cor;
    private int ano;
    private String modelo;

    public Carro(String placa, String cor, int ano, String modelo) {
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
