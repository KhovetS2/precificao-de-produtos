package modelo;

public class Conta {
    private int id;
    private String nomeConta;
    private double preco;


    public Conta() {
    }

    public Conta(int id, String nomeConta, double preco) {
        this.id = id;
        this.nomeConta = nomeConta;
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeConta() {
        return this.nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
