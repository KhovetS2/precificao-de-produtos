package modelo;

public enum UnidadeMedida{
        GRAMAS("g"),
        UNIDADE("unidade"),
        MILILITROS("mL");

        private final String unidadeMedida;

        UnidadeMedida(String unidadeMedida){
            this.unidadeMedida = unidadeMedida;
        }
        public String getUnidade(){
            return unidadeMedida;
        }
        
        
    }
