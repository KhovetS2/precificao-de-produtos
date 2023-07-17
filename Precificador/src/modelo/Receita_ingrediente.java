package modelo;

public class Receita_ingrediente {
    private int receita_id;
    private int ingrediente_id;
    private double quantidadeIngrediente;


    public Receita_ingrediente() {
    }


    public Receita_ingrediente(int receita_id, int ingrediente_id, double quantidadeIngrediente) {
        this.receita_id = receita_id;
        this.ingrediente_id = ingrediente_id;
        this.quantidadeIngrediente = quantidadeIngrediente;
    }


    public int getReceita_id() {
        return this.receita_id;
    }

    public void setReceita_id(int receita_id) {
        this.receita_id = receita_id;
    }

    public int getIngrediente_id() {
        return this.ingrediente_id;
    }

    public void setIngrediente_id(int ingrediente_id) {
        this.ingrediente_id = ingrediente_id;
    }

    public double getQuantidadeIngrediente() {
        return this.quantidadeIngrediente;
    }

    public void setQuantidadeIngrediente(double quantidadeIngrediente) {
        this.quantidadeIngrediente = quantidadeIngrediente;
    }

}
