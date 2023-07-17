package modelo;

public class Ingrediente {
    private int id;
    private String ingredienteNome;
    private UnidadeMedida unidadeMedida;
    

    public Ingrediente() {
    }

    public Ingrediente(int id, String ingredienteNome, UnidadeMedida unidadeMedida) {
        this.id = id;
        this.ingredienteNome = ingredienteNome;
        this.unidadeMedida = unidadeMedida;
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



   
}
