package modelo;



public class Receita {
    private int id;
    private String nomeReceita;
    private double rendimento;
    private UnidadeMedida unidadeMedidaRedimento;


    public Receita() {
    }

    public Receita(int id, String nomeReceita, double rendimento, UnidadeMedida unidadeMedidaRedimento) {
        this.id = id;
        this.nomeReceita = nomeReceita;
        this.rendimento = rendimento;
        this.unidadeMedidaRedimento = unidadeMedidaRedimento;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeReceita() {
        return this.nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public double getRendimento() {
        return this.rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public UnidadeMedida getUnidadeMedidaRedimento() {
        return this.unidadeMedidaRedimento;
    }

    public void setUnidadeMedidaRedimento(UnidadeMedida unidadeMedidaRedimento) {
        this.unidadeMedidaRedimento = unidadeMedidaRedimento;
    }

}
