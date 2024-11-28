package es.uvigo.dagss.recetas.entidades;

public enum EstadoReceta {
    PLANIFICADA ("PLANIFICADA"), 
    ANULADA      ("ANULADA"), 
    SERVIDA        ("SERVIDA");
    
    private final String etiqueta;

    private EstadoReceta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
   
    public String getEtiqueta() {
        return etiqueta;
    }
}
