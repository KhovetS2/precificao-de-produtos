package modelo;

public class Ingrediente {
    private int id;
    private String ingredienteNome;
    private UnidadeMedida unidadeMedida;
    private Double quantidadeEmbalagem;
    private Double preco;
    


    public Ingrediente() {
    }

    public Ingrediente(int id, String ingredienteNome, UnidadeMedida unidadeMedida, Double quantidadeEmbalagem, Double preco) {
        this.id = id;
        this.ingredienteNome = ingredienteNome;
        this.unidadeMedida = unidadeMedida;
        this.quantidadeEmbalagem = quantidadeEmbalagem;
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngredienteNome() {
        return this.ingredienteNome;
    }

    public void setIngredienteNome(String ingredienteNome) {
        this.ingredienteNome = ingredienteNome;
    }

    public UnidadeMedida getUnidadeMedida() {
        return this.unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Double getQuantidadeEmbalagem() {
        return this.quantidadeEmbalagem;
    }

    public void setQuantidadeEmbalagem(Double quantidadeEmbalagem) {
        this.quantidadeEmbalagem = quantidadeEmbalagem;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
   
}
